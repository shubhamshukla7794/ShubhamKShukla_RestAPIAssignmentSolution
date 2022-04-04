package com.greatlearning.employeemanagement.dao;

import com.greatlearning.employeemanagement.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    public final static String searchFirstName = "SELECT * FROM EMPLOYEE WHERE LOWER(FIRST_NAME) LIKE LOWER('%:firstName%')";
    @Query("SELECT e FROM Employee e WHERE LOWER(e.firstName) LIKE %:firstName%")
    List<Employee> findEmployeeByFirstName(@Param("firstName") String firstName);
//    List<Employee> findByFirstNameContainingIgnoreCase(String firstName);

    List<Employee> findAllByOrderByFirstNameAsc();

    List<Employee> findAllByOrderByFirstNameDesc();
}
