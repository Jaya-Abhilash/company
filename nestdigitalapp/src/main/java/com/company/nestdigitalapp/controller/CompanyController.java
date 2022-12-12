package com.company.nestdigitalapp.controller;

import com.company.nestdigitalapp.Dao.EmployeeDao;
import com.company.nestdigitalapp.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class CompanyController {
    @Autowired
    private EmployeeDao dao;



    @PostMapping(path ="/addEmployee", consumes = "application/json", produces = "application/json")
    public HashMap<String, String> AddEmployee(@RequestBody Employee e) {
        dao.save(e);
        HashMap<String, String> map = new HashMap<>();
        map.put("status", "sucess");
        return map;
    }


}



