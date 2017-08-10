package www.vikas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

	/*
	 * @RequestMapping(value={"/","reqHome"}) public String displayHome(){
	 * 
	 * return "newhome"; }
	 */

	@RequestMapping("/")
	public String displayHome() {

		return "newhome";
	}
}