package com.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private Integer pid;
    private String pname;
    private String birth;
    private String sex;
    private String job;
    private String address;
    private String tel;
}
