package springmvc2;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import Utility.Calculator;
import pojo.FormData;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String sayHello(Model model) {
		model.addAttribute("id", 498);
		model.addAttribute("name", "Adarsh");
		return "home";
	}
	
	@RequestMapping("/home2")
	public ModelAndView home2(ModelAndView m) {
		m.addObject("id", 498);
		m.addObject("name", "Adarsh");
		m.setViewName("home");
		return m;
	}
	
	@RequestMapping("/calculate")
	public ModelAndView calculator(ModelAndView m, @RequestParam("num1") String num1, @RequestParam("num2") String num2, @RequestParam("op") String op) {
		Calculator c = new Calculator(num1,num2,op);
		int res = c.calculate(num1, num2, op);
		System.out.println(num1 +" "+num2+" "+op);
		System.out.println(res);
		m.addObject("res",res);
		m.setViewName("calculatorView");
		return m;
	}
	
	@RequestMapping(path="/processForm", method=RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public ModelAndView calculator1(ModelAndView m, @ModelAttribute FormData formdata) {
		Calculator c = new Calculator();
		System.out.println(formdata.getNum1());
		int res = c.calculate(formdata.getNum1(), formdata.getNum2(), formdata.getOp());
		System.out.println(res);
		m.addObject("res",res);
		m.setViewName("calculatorView");
		return m;
	}
	
	@RequestMapping("/calculator")
	public ModelAndView calculator1(ModelAndView m) {
		m.setViewName("CalculatorFormView");
		return m;
	}
}
