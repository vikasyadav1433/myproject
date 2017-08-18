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
import www.vikas.model.Supplier;
import www.vikas.model.XMAP_Product_Supplier;
import www.vikas.service.ProductServiceInt;
import www.vikas.service.SupplierServiceInt;
import www.vikas.service.XpsServiceInt;
            
@Controller
public class XpsController {

	@Autowired
	private XpsServiceInt xpsService;

	@Autowired
	private ProductServiceInt productService;

	@Autowired
	private SupplierServiceInt supplierService;

	@RequestMapping("/reqDisplayXps")
	public String displaySuppliers(Model m, HttpSession hsession) {
		List<XMAP_Product_Supplier> data = xpsService.getAllXps();
		m.addAttribute("xpsdata", data);
		return "displayXps";
	}

	@RequestMapping("/reqAddProdSuppForm")
	public String addSupplierForm(Model m, HttpSession hsession) {
		List<Product> productdata = productService.getAllProducts();
		List<Supplier> supplierdata = supplierService.getAllSuppliers();
		m.addAttribute("products", productdata);
		m.addAttribute("suppliers", supplierdata);
		m.addAttribute("prodsuppObject", new XMAP_Product_Supplier());
		return "addProdSupp";
	}

	@RequestMapping("/reqAddProdSuppDataToDb")
	public String addProdSuppToDb(@ModelAttribute("prodsuppObject") XMAP_Product_Supplier xps, Model m,
			HttpSession hsession) {
		xps.setIsproductsupplieravailable(true);
		xpsService.addxps(xps);
		String xpsmessage = "XPS Record added successfully...";
		m.addAttribute("xpsmessage", xpsmessage);
		List<XMAP_Product_Supplier> data = xpsService.getAllXps();
		m.addAttribute("xpsdata", data);
		return "displayXps";
	}

	@RequestMapping("/reqDeleteXps")
	public String deleteXps(@RequestParam("psid") String psid, Model m, HttpSession hsession) {
		xpsService.deleteXps(psid);
		String xpsmessage = "XPS Record deleted successfully...";
		m.addAttribute("xpsmessage", xpsmessage);
		List<XMAP_Product_Supplier> data = xpsService.getAllXps();
		m.addAttribute("xpsdata", data);
		return "displayXps";
	}

}
