package com.codeclan.example.Relationships.Lab.repositories;

import com.codeclan.example.Relationships.Lab.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
