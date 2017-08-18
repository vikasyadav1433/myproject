package www.vikas.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import www.vikas.model.Customer;
import www.vikas.model.CustomerOrder;
import www.vikas.model.CustomerOrderHistory;
import www.vikas.model.Product;
import www.vikas.model.ProductReview;
import www.vikas.model.TempReview;
import www.vikas.service.CustomerOrderServiceInt;
import www.vikas.service.CustomerServiceInt;
import www.vikas.service.ProductServiceInt;

@Controller
public class CustomerOrderController {
	@Autowired
	private ProductServiceInt productService;

	@Autowired 
	private CustomerServiceInt customerService;
	
	@Autowired
	private CustomerOrderServiceInt customerOrderService;
	
	@RequestMapping("/order/{cartId}")
	public String displayCheckOut(@PathVariable("cartId")String cartId){
		System.out.println("\nCartid in checkout : " + cartId);
		return "redirect:/checkout?cartId="+cartId;
	}
	
	@RequestMapping("/reqDisplayOrderHistory")
	public String displayOrderHistory(@RequestParam("custid")String customerid, Model m){
		Customer customer = customerService.getCustomerByID(customerid);
		List <CustomerOrder> orders = customerOrderService.custOrders(customer.getCustomerid());
		m.addAttribute("orders", orders);
		return "displayOrders";
	}
	
	@RequestMapping("/reqReviewProductPage/{orderhistoryid}")
	public String displayProductRevPage(@PathVariable String orderhistoryid,Model m){		
		CustomerOrderHistory ordhistory = customerOrderService.getCustomerOrderHistoryByOrderHistoryId(orderhistoryid);
		Product prd = productService.getProductById(ordhistory.getProductid());			
		TempReview temp = new TempReview();				
		m.addAttribute("product", prd);
		m.addAttribute("ordhistroy",ordhistory);
		m.addAttribute("reviewobject",temp);
		return "productReviewPage";
	}
	
	@RequestMapping("/reqAddProductRating/{ordhistid}")
	public String rateProduct(@ModelAttribute("reviewobject")TempReview tempreview,@PathVariable("ordhistid")String ordhistid,HttpSession hsession){
		ProductReview productrev = new ProductReview();
		Customer customer = (Customer)hsession.getAttribute("customerprofile");
		productrev.setCustomerid(customer.getCustomerid());
		CustomerOrderHistory history = customerOrderService.getCustomerOrderHistoryByOrderHistoryId(ordhistid);
		productrev.setOrderhistoryid(ordhistid);
		//prdrev.setCustomerorderhistoryid(ordhistid);
		productrev.setRating(tempreview.getRating());
		productrev.setComments(tempreview.getComment());
		productrev.setProductid(history.getProductid());
		//prdrev.setComments("ok");
		customerOrderService.addProductReview(productrev);
/*		history.setComments(tempreview.getComment());
		history.setRating(tempreview.getRating());
		history.setReviewgiven(true);
		customerOrderService.updateOrderHistory(history);*/
		float rtng = customerOrderService.getRating(history.getProductid());
		System.out.println("\nRating : " + rtng);
		Product prd = productService.getProductById(history.getProductid());
		prd.setRating(rtng);
		//prd.setNoitemssold(customerOrderService.getNoOfItemsSold(history.getProductid()));
		prd.setNoreviews(customerOrderService.getNoOfReviews(history.getProductid()));		
		productService.updateProduct(prd);		
		return "redirect:/reqDisplayOrderHistory?custid="+customer.getCustomerid();
	}
	
}
