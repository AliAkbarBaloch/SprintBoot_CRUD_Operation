package com.example.springboot;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.springboot.model.Employee;
import com.example.springboot.repository.EmployeeRepository;

@SpringBootTest
class SpringbootCrudApplicationTests {

	@Autowired
	EmployeeRepository eRepo;
	@Test
	public void contextLoads() {
		Employee e=new Employee();
		e.setFirstName("AliTest");
		e.setLastName("AkbarTest");
		e.setEmail("alibaloch3871test@gmail.com");
		eRepo.save(e);
		assertNotNull(eRepo.findById(e.getId()).get());
		
	}

}
