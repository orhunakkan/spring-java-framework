package com.example.Spring03CoreDI;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor // constructor injection
public class Java {

    OfficeHours officeHours;

    // constructor injection
    // @Autowired
    // public Java(OfficeHours officeHours) {
    // this.officeHours = officeHours;
    // }

    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours: " + (20 + officeHours.getHours()));
    }
}
