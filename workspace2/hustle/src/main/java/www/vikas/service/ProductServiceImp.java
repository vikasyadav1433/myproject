package www.vikas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import www.vikas.dao.ProductDAOInt;
import www.vikas.model.Product;

@Service
public class ProductServiceImp implements ProductServiceInt {

	@Autowired
	private ProductDAOInt productDao;
	
	public void addProduct(Product prd) {
		productDao.addProduct(prd);
	}

	public List<Product> getAllProducts() {		
		return productDao.getAllProducts();
	}
	public void deleteProduct(String pid) {
		productDao.deleteProduct(pid);
	}

	public void updateProduct(Product prd) {
		productDao.updateProduct(prd);
	}

	public Product getProductById(String pid) {		
		return productDao.getProductById(pid);
	}

}