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
    @GetMapping("/api/employees")
    public List<Employee> getEmployees () {
        return employeeService.fetch();
    }
    @GetMapping("/api/employee/{id}")
    public Employee getEmployee (@PathVariable Long id) throws EmployeeNotFound {
        return employeeService.get(id);
    }
    @PostMapping("/api/employee")
    public Employee createEmployee (@RequestBody Employee employee) {
        return employeeService.create(employee);
    }
    @PutMapping("/api/employee/{id}")
    public Employee updateEmployee (@PathVariable Long id, @RequestBody Employee employee) {
        return employeeService.update(id, employee);
    }
    @DeleteMapping("/api/employee/{id}")
    public Employee deleteEmployee (@PathVariable Long id) throws EmployeeNotFound {
        return employeeService.delete(id);
    }

    // Static resources

    @GetMapping("/employees")
    public String deleteEmployee () {
        try {
            File file = ResourceUtils.getFile( "classpath:static/index.html");
            return file.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
