package com.amit.java9.reactive.processor;

import com.amit.java9.reactive.pubsub.Employee;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper = true)
public class FreeLancer extends Employee {

    private long id;

    public FreeLancer(String name, int age, long id){
        super(name, age);
        this.id = id;
    }

}
