package org.hunger.saviour.portal.user.service;

import org.hunger.saviour.portal.user.service.dtos.RsaKeyConfigurationProperties;
import org.hunger.saviour.portal.user.service.entities.RoleEntity;
import org.hunger.saviour.portal.user.service.entities.UserEntity;
import org.hunger.saviour.portal.user.service.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

@SpringBootApplication
@EnableConfigurationProperties(RsaKeyConfigurationProperties.class)
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner initializeUser(UserRepository userRepository, BCryptPasswordEncoder passwordEncoder){
//		return args -> {
//			UserEntity user = new UserEntity();
//			user.setUsername("prapti");
//			user.setPassword(passwordEncoder.encode("prapti"));
//			user.setRoles(List.of(new RoleEntity("ADMIN")));
//			userRepository.save(user);
//		};
//	}
}
