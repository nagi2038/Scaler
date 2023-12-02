package com.nagi.module12.designpatterns.creational.prototype_registory;

public class ClientStudent {

    public static void main(String[] args) {
        
        System.out.println("Started ");

        // creating student obj
        Student std = new Student(23, "nagireddy", "sample@123.com", 13);

        // storing created Studen obj in registory
        System.out.println("registoring Student Obj ");
        StudentRegistory stdreg = StudentRegistory.getInstance();
        System.out.println("Std  hashcode : " + std.hashCode());
        stdreg.registor("std", std);

        // making clone of Student Obj
        Student std2 = null;
        try{
            std2 = std.clone(stdreg.get("std"));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        // System.out.println("Debug");
        System.out.println("std2 hashCode : "+ std2.hashCode());

        // creating IntelegentStudent Obj
        Student intstd = new IntelegentStudetn(23 , "nagi", "email", 23 , 34.5);
        stdreg.registor("intstd", intstd);
        Student intstd1 = null;
        try {
            intstd1 = intstd.clone(stdreg.get("intstd1"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Intstd hashCode : "+ intstd.hashCode());
        System.out.println("Intstd1 hashCode : "+intstd1.hashCode());
    }
    
}
