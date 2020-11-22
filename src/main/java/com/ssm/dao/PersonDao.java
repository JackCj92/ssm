package com.ssm.dao;

import com.ssm.entity.Person;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonDao {
    /*
     * 查询所有
     * @return
     */
    List<Person> queryAll();
}
