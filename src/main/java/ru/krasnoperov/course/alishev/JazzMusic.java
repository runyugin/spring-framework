package ru.krasnoperov.course.alishev;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class JazzMusic implements Music{

    public StyleMusic getStyle(){
        return StyleMusic.JAZZ;
    }
    @Override
    public List<String> getSong() {
        List<String> list = new ArrayList<>();
        list.add("Армстронг - Радуга");
        list.add("Ray Charles - Hit the Road Jack");
        list.add("Frank Sinatra - I've Got You Under My Skinа");
        return list;
    }
}
