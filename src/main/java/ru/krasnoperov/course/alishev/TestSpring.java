package ru.krasnoperov.course.alishev;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestBean testBean = context.getBean("testBean", TestBean.class);
        TestBean testBean2 = context.getBean("testBean", TestBean.class);

        System.out.println(testBean.getName());
        testBean.setName("Егор");
        System.out.println(testBean.getName());


        System.out.println(testBean2.getName());
        testBean.setName("Вадим");
        System.out.println(testBean2.getName());

        System.out.println(testBean.getName());

        context.close();

        testBean.setName("Вадим2");
        System.out.println(testBean2.getName());
        System.out.println(testBean.getName());
    }
}
