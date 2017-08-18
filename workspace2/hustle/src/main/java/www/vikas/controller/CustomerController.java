package www.vikas.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import www.vikas.model.BillingAddress;
import www.vikas.model.Cart;
import www.vikas.model.Customer;
import www.vikas.model.CustomerOrder;
import www.vikas.model.ShippingAddress;
import www.vikas.model.UserDetails;
import www.vikas.model.Vw_Cust_Rating;
import www.vikas.model.Vw_Prod_Supp_Xps;
import www.vikas.service.CustomerOrderServiceInt;
import www.vikas.service.CustomerServiceInt;
import www.vikas.service.UserDetailsServiceInt;

@Controller
public class CustomerController {

	@Autowired
	private CustomerServiceInt customerService;

	@Autowired
	private UserDetailsServiceInt userDetailsService;

	@Autowired
	private CustomerOrderServiceInt customerOrderService;
	
	@RequestMapping("/reqLogout")
	public String logout(HttpSession hsession, Model m) {
		hsession.invalidate();
		String logoutmessage = "Logged out succcessfully.\nThanks for visiting our site...";
		m.addAttribute("message", logoutmessage);
		return "newhome";
	}

	@RequestMapping("/reqLoginPage")
	public String loginPage(UserDetails userDetails, Model m) {
		m.addAttribute("userObject", new UserDetails());
		return "loginpage";
	}

	@RequestMapping("/reqSignupPage")
	public String displaySignupForm(Model m) {
		UserDetails userDetails = new UserDetails();
		ShippingAddress shippingAddress = new ShippingAddress();
		Customer customer = new Customer();
		customer.setUserDetails(userDetails);
		customer.setShippingAddress(shippingAddress);
		m.addAttribute("customer", customer);
		return "signuppage";
	}

	@RequestMapping("/reqSendSignupData")
	public String sendSignUpData(@ModelAttribute("customer") Customer customer, Model m) {

		customer.setEnabled(true);// we are hardcoding as a pogrammer
		customer.getUserDetails().setRole("ROLE_USER");
		customer.getUserDetails().setEnabled(true);

		BillingAddress billingAddress = new BillingAddress();
		billingAddress.setHouseno(customer.getShippingAddress().getHouseno());
		billingAddress.setStreet(customer.getShippingAddress().getStreet());
		billingAddress.setArea(customer.getShippingAddress().getArea());
		billingAddress.setCity(customer.getShippingAddress().getCity());
		billingAddress.setState(customer.getShippingAddress().getState());
		billingAddress.setCountry(customer.getShippingAddress().getCountry());
		billingAddress.setPincode(customer.getShippingAddress().getPincode());

		Cart cart = new Cart();

		customer.setBillingAddress(billingAddress);
		customer.setCart(cart);

		String userid = customerService.addCustomer(customer);
		String message = "Signup is successfull.\nNew User id : " + userid;
		m.addAttribute("signupmsg", message);
		m.addAttribute("userObject", new UserDetails());
		return "loginpage";
	}

	@RequestMapping("/reqLoginCheck")
	public String loginCheckk(HttpSession hsession, @ModelAttribute("userObject") UserDetails userDetails, Model m) {

		UserDetails temp = userDetailsService.loginCheck(userDetails);
		System.out.println(temp);
		if (temp == null) {// if authentication failed
			String message = "Login failed..,\nTry again...";
			m.addAttribute("userObject", new UserDetails());
			m.addAttribute("errormsg", message);
			return "loginpage";
		} else if (temp.getRole().equals("ROLE_USER")) {
			// m.addAttribute("username",temp.getUsername());
			List<Vw_Prod_Supp_Xps> productsuser = customerService.getProductsForUser();
			hsession.setAttribute("customerprofile", customerService.getCustomerByUserId(temp.getUserid()));
			// m.addAttribute("userid",temp.getUserid());
			m.addAttribute("productsuser", productsuser);
			System.out.println("data in controller :" + productsuser);
			return "userHomePage";
		} else { // this is for admin
			// m.addAttribute("username",temp.getUsername());
			hsession.setAttribute("adminprofile", customerService.getCustomerByUserId(temp.getUserid()));
			m.addAttribute("userid", temp.getUserid());
			return "adminHomePage";
		}

	}

	@RequestMapping("/reqDisplayProductsUser")
	public String displayProductsUser(HttpSession hsession,Model m){	
		Customer oldcust = (Customer)hsession.getAttribute("customerprofile");
		Customer newcust = customerService.getCustomerByID(oldcust.getCustomerid());
		hsession.setAttribute("customerprofile", newcust);
		List <Vw_Prod_Supp_Xps> productsuser = customerService.getProductsForUser();
		m.addAttribute("productsuser", productsuser);
		return "userHomePage";
	}
	
	@RequestMapping("/reqProductAllSuppliers")
	public String getProductsAllSuppliers(@RequestParam("pid") String pid, Model m) {
		List<Vw_Prod_Supp_Xps> allSupProd = customerService.getAllSuppProd(pid);

		List<Vw_Cust_Rating> revdata = customerOrderService.getCommentsForProduct(allSupProd.get(0).getProductid());
		
		m.addAttribute("allSupProd", allSupProd);
		m.addAttribute("revdata", revdata);
		return "productsAllSuppliers";
	}
}
