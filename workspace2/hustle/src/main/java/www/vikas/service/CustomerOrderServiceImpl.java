package www.vikas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import www.vikas.dao.CustomerOrderDAOInt;
import www.vikas.model.CustomerOrder;
import www.vikas.model.CustomerOrderHistory;
import www.vikas.model.ProductReview;
import www.vikas.model.Vw_Cust_Rating;



@Service
public class CustomerOrderServiceImpl implements CustomerOrderServiceInt {

	@Autowired
	private CustomerOrderDAOInt customerOrderDao;
	
	public List<CustomerOrder> custOrders(String custid) {		
		return customerOrderDao.custOrders(custid);
	}

	public void addProductReview(ProductReview pr) {
		customerOrderDao.addProductReview(pr);		
	}

	public float getRating(String productid) {		
		return customerOrderDao.getRating(productid);
	}

	public CustomerOrderHistory getCustomerOrderHistoryByOrderHistoryId(String ordhistid) {		
		return customerOrderDao.getCustomerOrderHistoryByOrderHistoryId(ordhistid);
	}

	public int getNoOfReviews(String productid) {		
		return customerOrderDao.getNoOfReviews(productid);
	}

	public int getNoOfItemsSold(String productid) {		
		return customerOrderDao.getNoOfItemsSold(productid);
	}

	public List<Vw_Cust_Rating> getCommentsForProduct(String productid) {		
		return customerOrderDao.getCommentsForProduct(productid);
	}

	public void updateOrderHistory(CustomerOrderHistory coh) {
		// TODO Auto-generated method stub
		
	}

	
	
}
