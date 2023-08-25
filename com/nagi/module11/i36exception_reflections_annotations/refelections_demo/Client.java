package com.nagi.module11.i36exception_reflections_annotations.refelections_demo;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.nagi.module11.i36exception_reflections_annotations.annotation_demo.ImportantClass;
import com.nagi.module11.i36exception_reflections_annotations.annotation_demo.UrgentMethod;

public class Client {

    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        Dummy dummy = new Dummy(20, "nagi");
        Field[] declaredFields = dummy.getClass().getDeclaredFields();
        /*
         * Fields are attributes.
         * 
         */
        for(Field field : declaredFields){
            System.out.println("Field Name " + field.getName());
            if(field.getName().equals("age")){
                field.setAccessible(true); // makinig it public from private
                System.out.println(field.get(dummy));
                
            }
            /*
             * note : we made this field private 
             * but still we are able to access the variable names
             */
        }
        
        /*
        Method[] declaredMethods = dummy.getClass().getDeclaredMethods();

        for(Method method : declaredMethods){
            System.out.println("Methods are : "+method.getName());
            if(method.getName().equals("iamprivatestaticMethod")){
                method.setAccessible(true);
                method.invoke(declaredMethods);
            }
            /*
             * I'm able access private method of the class 
             
        }
        

        ImportantClass annotation = Dummy.class.getAnnotation(ImportantClass.class);

        if (annotation != null){
            System.out.println("This class have annotations");
        }
        else{
            System.out.println("This class doesn't have annotations.");
        }
        */
    

        Method[] declaredMethods2 = Dummy.class.getDeclaredMethods();
        for (Method method : declaredMethods2) {
            
            UrgentMethod annotation2 = method.getAnnotation(UrgentMethod.class);
            if(annotation2 != null){
                method.setAccessible(true);
                method.invoke(null);  
                System.out.println(annotation2.times() + " times can be run");
            }
        }
    }   
}
