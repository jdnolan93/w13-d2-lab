package com.codeclan.example.Relationships.Lab.repositories;

import com.codeclan.example.Relationships.Lab.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
