package productapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

	@RequestMapping("/addProduct")
	public ModelAndView addProduct(ModelAndView m, ModelAttribute product) {
		return m;
	}

}
