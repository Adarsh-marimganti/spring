package springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home() {
		return "home";
	}

	@RequestMapping("/help")
	public String help() {
		System.out.println("inside controller");
		return "home";
	}

}
