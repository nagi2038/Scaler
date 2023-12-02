package com.nagi.module12.designpatterns.creational.builderpattern.studentbuilderimmutable;

import java.io.IOException;

public class Student {

    private final String name , univeristy, email;
    private final int age;
    private final double marks;

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
            if (this.age < 15){
                throw new IOException("Not a valid age.");

            }

            if (this.email.length() < 6){
                throw new IOException("Not a valid email.");
            }

            return new Student(this);

            
        }
        

    }
    
}
