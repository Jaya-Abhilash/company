package com.company.nestdigitalapp.controller;

import com.company.nestdigitalapp.Dao.EmployeeDao;
import com.company.nestdigitalapp.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class CompanyController {
    @Autowired
    private EmployeeDao dao;


    @PostMapping(path = "/addEmployee", consumes = "application/json", produces = "application/json")
    public HashMap<String, String> AddEmployee(@RequestBody Employee e) {
        dao.save(e);
        HashMap<String, String> map = new HashMap<>();
        map.put("status", "sucess");
        return map;
    }

    @PostMapping(path = "/search", consumes = "application/json", produces = "application/json")
    public List SearchEmployee(@RequestBody Employee e) {
        String name = e.getEmpName();
        System.out.println(name);
        return (List<Employee>) dao.SearchEmployee(e.getEmpName());
    }

@GetMapping(path = "/view", consumes = "application/json", produces = "application/json")
public List<Employee> viewEmployee() {
    return (List<Employee>) dao.findAll();
}
}













