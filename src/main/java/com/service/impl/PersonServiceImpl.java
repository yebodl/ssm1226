package com.service.impl;

import com.mapper.PersonMapper;
import com.pojo.Person;
import com.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapper pm;


    @Override
    public Person getOne(Integer pid) {
        return pm.getOne(pid);
    }

    @Override
    public List<Person> getAll() {
        return pm.getAll();
    }

    @Override
    public int save(Person person) {
        return pm.save(person);
    }

    @Override
    public int update(Person person) {
        return pm.update(person);
    }

    @Override
    public int delete(Integer pid) {
        return pm.delete(pid);
    }
}
