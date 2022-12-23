package ru.krasnoperov.course.alishev;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class RapMusic implements Music{

    public StyleMusic getStyle(){
        return StyleMusic.RAP;
    }
    @Override
    public List<String> getSong() {
        List<String> list = new ArrayList<>();
        list.add("Buster Rofls - Ганста рэп");
        list.add("1:14 - P-A-R-A-D-O-X");
        list.add("Rap Niggas - Nipsey Hussle");
        return list;
    }
}
