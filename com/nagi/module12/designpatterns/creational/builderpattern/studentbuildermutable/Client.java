package com.nagi.module12.designpatterns.creational.builderpattern.studentbuildermutable;

import java.io.IOException;

public class Client {
    public static void main(String[] args)  {
        
        Student std = null , std2= null;
        try {
            std = Student.getBuilder().setAge(12)
                                .setEmail("nagi2038@gmail.com")
                                .setMarks(45)
                                .setUniveristy("codenetra")
                                .build();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
             std2 = Student.getBuilder()
                                .setEmail("nagi2038@gmail.com")
                                .setAge(25)
                                .build();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // System.out.println("AGE befor modification " + std.getAge());
        // try {
        //     std.setAge(26);
        // } catch (IOException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }
        // System.out.println("AGE after modification " + std.getAge());

        // std.setEmail("na");


    }
}
