package com.nagi.module12.designpatterns.creational.builderpattern.studentbuildermutable;

import java.io.IOException;

public class Student {

    private  String name , univeristy, email;
    private  int age;
    private  double marks;

    private Student(Builder builder){
        this.name = builder.getName();
        this.univeristy = builder.getUniveristy();
        this.email = builder.getEmail();
        this.age = builder.getAge();
        this.marks = builder.getMarks();

    }

    public static Builder getBuilder(){
        return new Builder();
    }
    


    public String getName() {
        return name;
    }

    public String getUniveristy() {
        return univeristy;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public double getMarks() {
        return marks;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setUniveristy(String univeristy) {
        this.univeristy = univeristy;
    }

    public void setEmail(String email) throws IOException {
        if (validateEmail(email))
        this.email = email;
        else
        throw new IOException("Not a valid email");
    }

    public void setAge(int age) throws IOException{
        if (validateage(age))
        this.age = age;
        else
        throw new IOException("Not a valid age");
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    private static boolean validateage(int age){
        if (age < 15)
        return false;
        else
        return true;
    }

    private static boolean validateEmail(String email){
        if (email.length() < 6){
            return false;
        }
        else{
            return true;
        }
    }



    static class Builder{

        private String name , univeristy, email;
        private int age;
        private double marks;

        public Builder(){}

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setUniveristy(String univeristy) {
            this.univeristy = univeristy;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setMarks(double marks) {
            this.marks = marks;
            return this;
        }

        public String getName() {
            return name;
        }

        public String getUniveristy() {
            return univeristy;
        }

        public String getEmail() {
            return email;
        }

        public int getAge() {
            return age;
        }

        public double getMarks() {
            return marks;
        };

        public Student build() throws IOException{
            if (!Student.validateage(this.age)){
                throw new IOException("Not a valid age.");

            }

            if (!Student.validateEmail(email)){
                throw new IOException("Not a valid email.");
            }

            return new Student(this);

            
        }
        

    }
    
}
