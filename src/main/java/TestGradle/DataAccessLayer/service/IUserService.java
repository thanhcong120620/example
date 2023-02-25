package TestGradle.DataAccessLayer.service;

import TestGradle.BusinessLogicLayer.entity.User;

public interface IUserService {
	User getUserById(long id);
}
