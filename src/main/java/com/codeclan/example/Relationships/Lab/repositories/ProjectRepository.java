package com.codeclan.example.Relationships.Lab.repositories;

import com.codeclan.example.Relationships.Lab.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
