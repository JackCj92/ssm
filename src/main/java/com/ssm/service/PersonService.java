package com.ssm.service;

import com.ssm.entity.Person;

import java.util.List;

public interface PersonService {

    /*
     * 加载全部的person
     * @return
     */
    List<Person> findAll();
}
