package org.emp.springbootbackend;

import org.emp.springbootbackend.model.Employee;
import org.emp.springbootbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner{

	public static void main(String[] args) { SpringApplication.run(SpringbootBackendApplication.class, args);
	}
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void run(String... args) throws Exception {
//		Employee employee = new Employee();
//		employee.setFirstName("Ramesh");
//		employee.setLastName("Kumar");
//		employee.setEmailId("ramesh@gmail.com");
//		employeeRepository.save(employee);
//		
//		
//		Employee employee1 = new Employee();
//		employee1.setFirstName("Suresh");
//		employee1.setLastName("Kumar");
//		employee1.setEmailId("suresh@gmail.com");
//		employeeRepository.save(employee1);
		}
}
