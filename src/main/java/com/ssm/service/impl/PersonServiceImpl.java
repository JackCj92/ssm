package com.ssm.service.impl;

import com.ssm.dao.PersonDao;
import com.ssm.entity.Person;
import com.ssm.service.PersonService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("PersonService")
@Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED,timeout = 1000)
public class PersonServiceImpl implements PersonService {

    private final PersonDao personDao;
    //基于构造函数的依赖注入
    public PersonServiceImpl(PersonDao personDao) {
        this.personDao = personDao;
    }

    @Override
    public List<Person> findAll() {
        return personDao.queryAll();
    }
}
