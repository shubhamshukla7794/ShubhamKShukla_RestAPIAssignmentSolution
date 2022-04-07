package com.greatlearning.employeemanagement.controller;

import com.greatlearning.employeemanagement.entity.Employee;
import com.greatlearning.employeemanagement.entity.Role;
import com.greatlearning.employeemanagement.entity.User;
import com.greatlearning.employeemanagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/user")
    public User saveUser(@RequestBody User user) {
        return employeeService.saveUser(user);
    }

    @PostMapping("/role")
    public Role saveRole(@RequestBody Role role) {
        return employeeService.saveRole(role);
    }

    @GetMapping("/employees")
    public List<Employee> findAllEmployees() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Collection<? extends GrantedAuthority> currentPrincipalName = authentication.getAuthorities();
        System.out.println(currentPrincipalName);
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

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return employee;
    }

    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId) {
        employeeService.deleteEmployeeById(employeeId);
        return "Employee details with id - " + employeeId + " deleted";
    }

    @GetMapping("/employees/search/{firstName}")
    public List<Employee> searchEmployeesByFirstName(@PathVariable String firstName) {
        return employeeService.searchEmployeeByFirstName(firstName);
    }

    @GetMapping("/employees/sort")
    public List<Employee> sortEmployeesInOrder(@RequestParam("order") String order) {
        return employeeService.sortEmployeeByOrder(order);
    }

}
