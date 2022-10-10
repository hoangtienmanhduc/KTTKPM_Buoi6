package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
//	@Autowired
//	EmployeeRepository repository;
//	private void insertEmployee(EmployeeRepository repository){
//		Employee employee = Employee.builder().firstName("Hoang Tien").lastName("Manh Duc").email("Duc@gmail.com").build();
//		repository.save(employee);
//	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
