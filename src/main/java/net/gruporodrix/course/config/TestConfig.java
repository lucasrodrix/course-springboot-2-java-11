package net.gruporodrix.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import net.gruporodrix.course.entities.User;
import net.gruporodrix.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Renata Rodrix", "renata@rodrix.net", "11984637467", "lucas2206");
		User u2 = new User(null, "Lucas Rodrix", "lucas@rodrix.net", "12981243248", "renata@0502");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
	
}
