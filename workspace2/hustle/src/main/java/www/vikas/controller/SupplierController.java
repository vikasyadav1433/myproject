package www.vikas.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import www.vikas.model.Supplier;
import www.vikas.service.SupplierServiceInt;

@Controller
public class SupplierController {

	@Autowired
	private SupplierServiceInt supplierService;

	@RequestMapping("/reqDisplaySuppliers")
	public String displaySuppliers(Model m, HttpSession hsession) {
		List<Supplier> suppliers = supplierService.getAllSuppliers();
		m.addAttribute("allsuppliers", suppliers);
		return "displaySuppliers";
	}

	@RequestMapping("/reqAddSupplierForm")
	public String addSupplierForm(Model m) {
		m.addAttribute("supplier", new Supplier());
		return "addSupplierForm";
	}

	@RequestMapping("/reqSendSupplierData")
	public String addSupplierToDB(@ModelAttribute("supplier") Supplier supplier, Model m, HttpSession hsession) {
		supplier.setIssupplieravailable(true);
		supplierService.addSupplier(supplier);
		String message = "Supplier added successfully....";
		m.addAttribute("suppliermessage", message);
		List<Supplier> suppliers = supplierService.getAllSuppliers();
		m.addAttribute("allsuppliers", suppliers);
		return "displaySuppliers";
	}

	@RequestMapping("/reqDeleteSupplierAdmin")
	public String deleteProductAdmin(@RequestParam("sid") String supplierid, Model m, HttpSession hsession) {
		supplierService.deleteSupplier(supplierid);
		String message = "Supplier deleted successfully....";
		m.addAttribute("suppliermessage", message);
		List<Supplier> suppliers = supplierService.getAllSuppliers();
		m.addAttribute("allsuppliers", suppliers);
		return "displaySuppliers";
	}

	@RequestMapping("/reqEditSupplierPageAdmin")
	public String editSupplierPage(@RequestParam("sid") String supplierid, Model m, HttpSession hsession) {
		Supplier supplier = supplierService.getSupplierById(supplierid);
		m.addAttribute("supplier", supplier);
		return "supplierEditAdmin";
	}

	@RequestMapping("/reqSendUpdatedSupplierToDB")
	public String editSupplierToDb(@ModelAttribute("supplier") Supplier supplier, Model m, HttpSession hsession) {
		supplierService.editSupplier(supplier);
		String message = "Supplier edited successfully....";
		m.addAttribute("suppliermessage", message);
		List<Supplier> suppliers = supplierService.getAllSuppliers();
		m.addAttribute("allsuppliers", suppliers);
		return "displaySuppliers";
	}

}
