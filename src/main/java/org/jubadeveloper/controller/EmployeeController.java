package org.jubadeveloper.controller;

import org.springframework.util.ResourceUtils;
import org.jubadeveloper.entitie.Employee;
import org.jubadeveloper.service.EmployeeService;
import org.jubadeveloper.service.error.EmployeeNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.HTML;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired EmployeeService employeeService;
    @GetMapping("/employees")
    public List<Employee> getEmployees () {
        return employeeService.fetch();
    }
    @GetMapping("/employee/{id}")
    public Employee getEmployee (@PathVariable Long id) throws EmployeeNotFound {
        return employeeService.get(id);
    }
    @PostMapping("/employee")
    public Employee createEmployee (@RequestBody Employee employee) {
        return employeeService.create(employee);
    }
    @PutMapping("/employee/{id}")
    public Employee updateEmployee (@PathVariable Long id, @RequestBody Employee employee) {
        return employeeService.update(id, employee);
    }
    @DeleteMapping("/employee/{id}")
    public Employee deleteEmployee (@PathVariable Long id) throws EmployeeNotFound {
        return employeeService.delete(id);
    }
}
