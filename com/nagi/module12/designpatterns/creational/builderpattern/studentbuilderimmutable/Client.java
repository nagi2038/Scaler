package com.nagi.module12.designpatterns.creational.builderpattern.studentbuilderimmutable;

import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException {
        
        Student std = Student.getBuilder().setAge(25)
                            .setEmail("nagi2038@gmail.com")
                            .setMarks(45)
                            .setUniveristy("codenetra")
                            .build();

        Student std2 = Student.getBuilder()
                            .setEmail("nagi2038@gmail.com")
                            .build();

    }
}
