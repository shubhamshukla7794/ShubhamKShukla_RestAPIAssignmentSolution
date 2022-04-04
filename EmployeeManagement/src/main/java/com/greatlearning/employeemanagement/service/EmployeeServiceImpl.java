package com.greatlearning.employeemanagement.service;

import com.greatlearning.employeemanagement.dao.EmployeeRepository;
import com.greatlearning.employeemanagement.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findEmployeeById(int id) {

        Optional<Employee> employeeOptional = employeeRepository.findById(id);

        if (employeeOptional.isEmpty()) {
            throw new RuntimeException("Employee with id " + id + " not found");
        }

        Employee foundEmployee =  employeeOptional.get();
        return foundEmployee;
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployeeById(int id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> searchEmployeeByFirstName(String firstName) {
//        return employeeRepository.findByFirstNameContainingIgnoreCase(firstName);
        return employeeRepository.findEmployeeByFirstName(firstName.toLowerCase());
    }

    @Override
    public List<Employee> sortEmployeeByOrder(String order) {

        List<Employee> employees = null;

        if (order.toLowerCase().equals("asc")) {
            employees = employeeRepository.findAllByOrderByFirstNameAsc();
        } else if (order.toLowerCase().equals("desc")) {
            employees = employeeRepository.findAllByOrderByFirstNameDesc();
        } else {
            throw new RuntimeException("No proper order mentioned");
        }
        return employees;
    }
}
