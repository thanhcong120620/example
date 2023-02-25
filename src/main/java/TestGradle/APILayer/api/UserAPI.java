package TestGradle.APILayer.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import TestGradle.BusinessLogicLayer.entity.User;
import TestGradle.DataAccessLayer.service.IUserService;

@RestController
public class UserAPI {
	
	@Autowired
	private IUserService userService;
	
	@GetMapping(value = "/api/userTest")
 	public User viewHomeUserPage(Model model, @RequestBody User dto) {
 		User user = userService.getUserById(dto.getId());

		System.out.println(user.toString());
 		
 	 return user;  
 	}

}
