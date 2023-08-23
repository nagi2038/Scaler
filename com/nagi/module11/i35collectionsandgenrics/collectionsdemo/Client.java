package com.nagi.module11.i35collectionsandgenrics.collectionsdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(12);
        l.add(3);

        List<Integer> ar = Arrays.asList(1,2,-5,4,5,6);
        // ar.add(5); // CHECK WHY I'M GETTING ERROR.
        Collections.sort(ar);
        System.out.println(ar);
    }
}
