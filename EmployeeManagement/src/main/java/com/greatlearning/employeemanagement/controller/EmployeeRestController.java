package com.greatlearning.employeemanagement.controller;

import com.greatlearning.employeemanagement.entity.Employee;
import com.greatlearning.employeemanagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> findAllEmployees() {
        return employeeService.findAllEmployees();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId) {
        return employeeService.findEmployeeById(employeeId);
    }

    @PostMapping("/employees")
    public Employee saveEmployee(@RequestBody Employee employee) {
        employee.setId(0);
        employeeService.saveEmployee(employee);
        return employee;
    }

    @PutMapping("/employees/{employeeId}")
    public Employee updateEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return employee;
    }

    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId) {
        employeeService.deleteEmployeeById(employeeId);
        return "Employee details with id - " + employeeId + " deleted";
    }

//    @GetMapping("/employees/search/{firstName}")
//    public List<Employee> searchEmployeesByFirstName(@PathVariable String firstName) {
//        return employeeService.searchEmployeeByFirstName(firstName);
//    }

//    @GetMapping("/employees/sort/{order}")
//    public List<Employee> sortEmployeesInOrder(@PathVariable String order) {
//        return employeeService.sortEmployeeByOrder(order);
//    }

    @GetMapping("/employees/search")
    public List<Employee> searchEmployeesByFirstName(@RequestParam("firstName") String firstName) {
        return employeeService.searchEmployeeByFirstName(firstName);
    }

    @GetMapping("/employees/sort")
    public List<Employee> sortEmployeesInOrder(@RequestParam("order") String order) {
        return employeeService.sortEmployeeByOrder(order);
    }

}
