package www.vikas.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import www.vikas.model.Product;
import www.vikas.service.ProductServiceInt;

@Controller
public class ProductController {
	@Autowired
	private ProductServiceInt productService;

	@RequestMapping("/reqProductForm")
	public String displayProductForm(Model m, HttpSession hsession) {
		m.addAttribute("productObject", new Product());
		return "addProductForm";
	}

	@RequestMapping("/reqSendProductData")
	public String addProduct(@ModelAttribute("productObject") Product product, HttpSession hsession, Model m) {
		product.setIsproductavailable(true);
		productService.addProduct(product);
		String productmessage = "Product added successfully...";
		m.addAttribute("productmessage", productmessage);
		List<Product> allproducts = productService.getAllProducts();
		m.addAttribute("allproducts", allproducts);
		return "displayProdcutsAdmin";
	}

	@RequestMapping("/reqDisplayProdcutsAdmin")
	public String displayProductsAdmin(HttpSession hsession, Model m) {
		List<Product> allproducts = productService.getAllProducts();
		m.addAttribute("allproducts", allproducts);
		return "displayProdcutsAdmin";
	}

	@RequestMapping("/reqDeleteProductAdmin")
	public String deleteProductAdmin(@RequestParam("pid") String productid, HttpSession hsession, Model m) {
		productService.deleteProduct(productid);
		String productmessage = "Product deleted successfully....";
		m.addAttribute("productmessage", productmessage);
		List<Product> allproducts = productService.getAllProducts();
		m.addAttribute("allproducts", allproducts);
		return "displayProdcutsAdmin";
	}

	@RequestMapping("/reqEditProductPageAdmin")
	public String editProductPageAdmin(@RequestParam("pid") String productid, HttpSession hsession, Model m) {
		Product product = productService.getProductById(productid);
		m.addAttribute("product", product);
		return "productEditAdmin";
	}

	@RequestMapping("/reqSendUpdatedProductToDB")
	public String updateProductToDB(@ModelAttribute("productObject") Product product, HttpSession hsession, Model m) {
		productService.updateProduct(product);
		String productmessage = "Product edited successfully....";
		m.addAttribute("productmessage", productmessage);
		List<Product> allproducts = productService.getAllProducts();
		m.addAttribute("allproducts", allproducts);
		return "displayProdcutsAdmin";
	}
}
