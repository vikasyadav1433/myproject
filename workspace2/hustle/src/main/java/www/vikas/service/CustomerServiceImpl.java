package www.vikas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import www.vikas.dao.CustomerDAOInt;
import www.vikas.model.Customer;
import www.vikas.model.Vw_Prod_Supp_Xps;

@Service
public class CustomerServiceImpl implements CustomerServiceInt {

	@Autowired
	private CustomerDAOInt customerDao;
	
	public String addCustomer(Customer cust) {		
		return customerDao.addCustomer(cust);
	}

	public Customer getCustomerByUserId(String uid) {		
		return customerDao.getCustomerByUserId(uid);
	}

	public List<Vw_Prod_Supp_Xps> getProductsForUser() {
		return customerDao.getProductsForUser();
	}
	public List<Vw_Prod_Supp_Xps> getAllSuppProd(String pid) {		
		return customerDao.getAllSuppProd(pid);
	}

	public Customer getCustomerByID(String custid) {
		return customerDao.getCustomerByID(custid);
	}
}