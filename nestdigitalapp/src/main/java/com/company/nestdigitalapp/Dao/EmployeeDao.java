package com.company.nestdigitalapp.Dao;

import com.company.nestdigitalapp.model.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao  extends CrudRepository<Employee,Integer> {
    @Query(value = "SELECT `id`, `emp_designation`, `emp_name`, `emp_phone`, `password`, `username` FROM `employees` WHERE `emp_name` LIKE %:name%", nativeQuery = true)
    List<Employee> SearchEmployee(@Param("name") String name);
}