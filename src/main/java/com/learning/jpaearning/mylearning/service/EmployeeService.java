package com.learning.jpaearning.mylearning.service;

import com.learning.jpaearning.mylearning.entity.Employee;
import com.learning.jpaearning.mylearning.entity.Department;
import com.learning.jpaearning.mylearning.model.EmployeeRequest;
import com.learning.jpaearning.mylearning.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EmployeeService implements IEmploymentService{
    @Autowired
    EmployeeRepository employeeRepository;
    public Employee addEmployee(EmployeeRequest employeeRequest) {
        Employee employee = new Employee();
        Department department = new Department();
        employee.setFirstName(employeeRequest.getFirstName());
        employee.setEmail(employeeRequest.getEmail());
        employee.setSalary(employeeRequest.getSalary());
        employee.setLastName(employeeRequest.getLastName());
        department.setDeptName(employeeRequest.getDepartment().getDeptName());
        employee.setDepartment(department);
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getEmployee(String firstName, String lastName) {
        return employeeRepository.findByFirstNameAndLastName(firstName, lastName);
    }
}
