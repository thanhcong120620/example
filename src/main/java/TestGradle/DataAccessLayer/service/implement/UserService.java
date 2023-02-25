package TestGradle.DataAccessLayer.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import TestGradle.BusinessLogicLayer.entity.User;
import TestGradle.DataAccessLayer.repository.UserRepository;
import TestGradle.DataAccessLayer.service.IUserService;


@Service
@Transactional
public class UserService implements IUserService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public User getUserById(long id) {
		User user = userRepository.findById(id).get();
		
		return user;
	}

}
