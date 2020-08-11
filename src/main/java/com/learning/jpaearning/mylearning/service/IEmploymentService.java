package com.learning.jpaearning.mylearning.service;

import com.learning.jpaearning.mylearning.entity.Employee;
import com.learning.jpaearning.mylearning.model.EmployeeRequest;

import java.util.List;

public interface IEmploymentService {
    public Employee addEmployee(EmployeeRequest employee);
    public List<Employee> getEmployee(String firstName, String lastName);
}
