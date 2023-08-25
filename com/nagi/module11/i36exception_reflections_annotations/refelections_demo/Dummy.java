package com.nagi.module11.i36exception_reflections_annotations.refelections_demo;

import com.nagi.module11.i36exception_reflections_annotations.annotation_demo.ImportantClass;
import com.nagi.module11.i36exception_reflections_annotations.annotation_demo.UrgentMethod;

@ImportantClass
public class Dummy {

    private int age; 
    public Dummy(int age, String name) {
        this.age = age;
        this.name = name;
    }

    /*
    dont make setter unlesss require becase these are private.
    */
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void print(){
        System.out.println(name + "   -  "+ age);
    }

    @UrgentMethod
    public static void iamPublicstaticMethod(){
        System.out.println("I'm a public static method.");
    }

    @UrgentMethod(times = 3)
    private static void iamprivatestaticMethod(){
        
        System.out.println("I'm not access able outside the class");
    }
    
}
