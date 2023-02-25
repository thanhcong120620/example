package TestGradle.DataAccessLayer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import TestGradle.BusinessLogicLayer.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
