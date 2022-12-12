package com.company.nestdigitalapp.Dao;

import com.company.nestdigitalapp.model.Employee;
import com.company.nestdigitalapp.model.Security;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SecurityDao extends CrudRepository<Security,Integer> {
@Query(value = "SELECT `id`, `adress`, `name`, `password`, `username` FROM `securits` WHERE `name` LIKE %:name%", nativeQuery = true)
List<Security> SearchSecurity(@Param("name") String name);
}
