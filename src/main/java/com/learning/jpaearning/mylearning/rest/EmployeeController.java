package com.learning.jpaearning.mylearning.rest;

import com.learning.jpaearning.mylearning.entity.Employee;
import com.learning.jpaearning.mylearning.model.EmployeeRequest;
import com.learning.jpaearning.mylearning.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public ResponseEntity<Employee> addEmployee(@RequestBody EmployeeRequest employeeRequest) {
        Employee employee = employeeService.addEmployee(employeeRequest);
        return new ResponseEntity<>(employee, HttpStatus.CREATED);
    }

    @GetMapping("/getEmployee")
    public ResponseEntity<List<Employee>> getEmployee(@RequestParam String firstName, @RequestParam String lastName) {
        List<Employee> employees = employeeService.getEmployee(firstName, lastName);
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }
}
