package ru.krasnoperov.course.alishev;

public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Перемен";
    }
    public void doMyInit(){
        System.out.println("Start doMyInit");
    }
    public void doMyDestropy(){
        System.out.println("Start doMyDestropy");
    }
}
