package ru.krasnoperov.course.alishev;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class ClassicalMusic implements Music{

    public StyleMusic getStyle(){
        return StyleMusic.CLASSIC;
    }


    public static ClassicalMusic getNewClassicalMusic(){
        return new ClassicalMusic();
    }

    @Override
    public List<String> getSong() {
        List<String> list = new ArrayList<>();
        list.add("Andrey Doinikov - Времена года, соч. 8, Концерт No. 1 ми мажор, RV 269");
        list.add("Gnessin Virtuosi Chamber Orchestra - Концерт No. 2 ля минор для гобоя с оркестром, Op. 39: III. Allegro");
        list.add("Misha Fomin - Соната для фортепиано No. 14 до-диез минор, соч. 27 No. 2 ");
        return list;
    }
}
