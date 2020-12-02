package com.company.model;

import com.company.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Mentor {

    private String firsName;
    private String lastName;
    private int age;
    private Gender gender;
}
