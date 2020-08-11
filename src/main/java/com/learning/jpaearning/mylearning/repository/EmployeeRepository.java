package com.learning.jpaearning.mylearning.repository;

import com.learning.jpaearning.mylearning.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByFirstNameAndLastName(String firstName, String lastName);
}
