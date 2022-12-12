package com.company.nestdigitalapp.controller;

import com.company.nestdigitalapp.Dao.SecurityDao;
import com.company.nestdigitalapp.model.Employee;
import com.company.nestdigitalapp.model.Security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class Securitycontroller {
    @Autowired
    private SecurityDao dao;

    @PostMapping(path = "/addSecurity", consumes = "application/json", produces = "application/json")
    public HashMap<String, String> AddSecurity(@RequestBody Security s) {
        dao.save(s);
        HashMap<String, String> map = new HashMap<>();
        map.put("status", "sucess");
        return map;
    }

    @PostMapping(path ="/SearchSecurity", consumes = "application/json",produces = "application/json")
public List SearchSecurity(@RequestBody Security s){
        String name = s.getName();
        System.out.println(name);
        return (List<Security>)dao.SearchSecurity(s.getName());
    }

@GetMapping(path = "/viewsecurity")
public List<Security> viewEmployee() {
    return (List<Security>) dao.findAll();
}
}
