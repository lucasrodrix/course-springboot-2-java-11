package net.gruporodrix.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import net.gruporodrix.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
