package com.greatlearning.employeemanagement.service;

import com.greatlearning.employeemanagement.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> findAllEmployees();

    public Employee findEmployeeById(int id);

    public void saveEmployee(Employee employee);

    public void deleteEmployeeById(int id);

    public List<Employee> searchEmployeeByFirstName(String firstName);

    public List<Employee> sortEmployeeByOrder(String order);

}
