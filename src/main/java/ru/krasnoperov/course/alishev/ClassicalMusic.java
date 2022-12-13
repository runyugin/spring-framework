package ru.krasnoperov.course.alishev;

public class ClassicalMusic implements Music{

    public void doMyInit(){
        System.out.println("Start doMyInit");
    }
    public void doMyDestropy(){
        System.out.println("Start doMyDestropy");
    }

    private ClassicalMusic() {
    }

    public static ClassicalMusic getNewClassicalMusic(){
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Sonata #";
    }
}
