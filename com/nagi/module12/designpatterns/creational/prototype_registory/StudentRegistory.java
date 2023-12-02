package com.nagi.module12.designpatterns.creational.prototype_registory;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistory {

    private static StudentRegistory stdrig;

    private Map<String, Student>  map = new HashMap<>();

    private StudentRegistory(){
    }

    public  static StudentRegistory  getInstance(){

        if (stdrig == null){
            synchronized(StudentRegistory.class){
                if (stdrig == null){
                    stdrig = new StudentRegistory();
                }
            }
        }
        return stdrig;
    }
    
    public void registor(String key , Student std){
        this.map.put(key, std);
    }

    public Student get(String key) throws Exception{

        if (map.containsKey(key)){
            return this.map.get(key);
        }
        else{
            throw new Exception(key + " key is not present in registory");
        }
        

    }
}
