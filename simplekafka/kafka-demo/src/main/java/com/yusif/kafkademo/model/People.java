package com.yusif.kafkademo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class People {

    private Long id;
    private String name;
    private String email;


    @Override
    public String toString() {
        return email;
    }
}
