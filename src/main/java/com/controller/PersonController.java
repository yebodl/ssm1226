package com.controller;

import com.pojo.Person;
import com.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class PersonController {
    @Autowired
    private PersonService ps;

    @GetMapping("/one")
    public Person getOne(Integer pid){
        return ps.getOne(pid);
    }

    @GetMapping("/one/{pid}")
    public Person getOne2(@PathVariable("pid") Integer pid){
        return ps.getOne(pid);
    }


    @GetMapping("/all")
   public List<Person> all(){
        return ps.getAll();
   }

   @PostMapping("/save")
   public int save(@RequestBody Person person){
        return ps.save(person);
   }

    @PutMapping("/update")
    public int update(@RequestBody Person person){
        return ps.update(person);
    }

    @DeleteMapping("/delete/{pid}")
    public int delete(@PathVariable("pid")Integer pid){
        return ps.delete(pid);
    }

}
