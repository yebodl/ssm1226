package com.mapper;

import com.pojo.Person;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonMapper {
    public Person getOne(Integer pid);
    public List<Person> getAll();
    public int save(Person person);
    public int update(Person person);
    public int delete(Integer pid);

}
