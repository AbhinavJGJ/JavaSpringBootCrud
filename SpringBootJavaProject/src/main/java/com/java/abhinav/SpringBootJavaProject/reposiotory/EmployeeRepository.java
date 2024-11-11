package com.java.abhinav.SpringBootJavaProject.reposiotory;

import com.java.abhinav.SpringBootJavaProject.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
