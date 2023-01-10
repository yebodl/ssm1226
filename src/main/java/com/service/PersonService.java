package com.service;

import com.pojo.Person;

import java.util.List;

public interface PersonService {
    public Person getOne(Integer pid);
    public List<Person> getAll();
    public int save(Person person);
    public int update(Person person);
    public int delete(Integer pid);
}
