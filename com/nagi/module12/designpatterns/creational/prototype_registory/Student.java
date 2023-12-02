package com.nagi.module12.designpatterns.creational.prototype_registory;


public class Student implements StudentInterface{

    private int age;
    private String name;
    private String email;
    private int rollNo;


    public Student(int age, String name , String email , int rollNo){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        this.age = age;
        this.name = name;
        this.email = email;
        this.rollNo = rollNo;
    }

    public Student(Student std){
        this.age = std.age;
        this.name = std.name;
        this.email = std.email;
        this.rollNo = std.rollNo;
    }

    @Override
    public Student clone(Student std) {
        return new Student(std);
    }


    
}
