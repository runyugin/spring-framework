package ru.krasnoperov.course.alishev;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class RockMusic implements Music{

    public StyleMusic getStyle(){
        return StyleMusic.ROCK;
    }
    @Override
    public List<String> getSong() {
        List<String> list = new ArrayList<>();
        list.add("Roxanne - The Police");
        list.add("Рубль - Русский рок");
        list.add("Рок-н-ролл - Аквариум");
        return list;
    }
    public void doMyInit(){
        System.out.println("Start doMyInit");
    }
    public void doMyDestropy(){
        System.out.println("Start doMyDestropy");
    }
}
