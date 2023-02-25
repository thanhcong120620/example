package TestGradle.APILayer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {


		/*
		 * Url from landing page to cusLottery
		 * */
		@GetMapping("/")
		public String viewCusHistoryIndex(Model model) {

			model.addAttribute("msg","Hello world");		

			return "test";
	    }

}
