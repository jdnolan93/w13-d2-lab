package com.codeclan.example.Relationships.Lab;

import com.codeclan.example.Relationships.Lab.models.Department;
import com.codeclan.example.Relationships.Lab.models.Employee;
import com.codeclan.example.Relationships.Lab.models.Project;
import com.codeclan.example.Relationships.Lab.repositories.DepartmentRepository;
import com.codeclan.example.Relationships.Lab.repositories.EmployeeRepository;
import com.codeclan.example.Relationships.Lab.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class RelationshipsLabApplicationTests {

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createDepartmentAndEmployee(){
		Department department = new Department("Catering");
		departmentRepository.save(department);

		Employee employee1 = new Employee("Tim", "Cook", 111, department);
		employeeRepository.save(employee1);

		Employee employee2 = new Employee("Rita", "Baker", 222, department);
		employeeRepository.save(employee2);
	}

	@Test
	public void addEmployeesAndProjects(){
		Department department = new Department("Catering");
		departmentRepository.save(department);

		Employee employee1 = new Employee("Tim", "Cook", 111, department);
		employeeRepository.save(employee1);

		Employee employee2 = new Employee("Rita", "Baker", 222, department);
		employeeRepository.save(employee2);

		Project project = new Project("CodeClan Graduation", 1);
		projectRepository.save(project);

		project.addEmployee(employee2);
		projectRepository.save(project);
	}

}
