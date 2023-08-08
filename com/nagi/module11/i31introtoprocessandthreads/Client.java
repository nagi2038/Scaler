package com.nagi.module11.i31introtoprocessandthreads;

public class Client {
    public static void main(String[] args) {
        System.out.println(Student.uniName);

        Student student = new Student();
        student.printName();
        student.printNameFancy();
        // student.printUniNameStatic(); // NOTE : UNCOMMENT IT
        Student.printUniNameStatic();
        student.printUnitNameFancy();
    }
}

class Student{
    public static String uniName = "Scaler";
    public String name = "Nagi";
    public int id;

    public void printName(){
        System.out.println(this.name);
    }

    public void printNameFancy(){
        System.out.println("****"+this.name+"****"); // name refer to class attribute
        /*
         * we are accessing instance method inside instance method
         * 
         * NOTE : Try access instance method in staic method
         */
        this.printName(); // OR we can writ it as printName
    }

    public static void printUniNameStatic(){
        // this.printName()    
        // NOTE : we can't call instance method inside static method
        /*
         * QUESTION : Can we call static method inside instance method:?
         */

        System.out.println(Student.uniName);
    }

    public void printUnitNameFancy(){
        System.out.print("Insdie instance method calling static mehtod : ");
        // this.printUniNameStatic(); // NOTE : UNCOMMENT IT , able to access static method in instance methd with warning
        System.out.println();
    }

    


}