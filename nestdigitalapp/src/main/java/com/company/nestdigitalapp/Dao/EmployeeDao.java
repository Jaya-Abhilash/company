package com.company.nestdigitalapp.Dao;

import com.company.nestdigitalapp.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao  extends CrudRepository<Employee,Integer> {
}
