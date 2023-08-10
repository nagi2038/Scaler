package com.nagi.module11.i32executorcallable.mergesort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSort implements Callable<List<Integer>>{

    List<Integer> numberToSort;

    public MergeSort(List<Integer> List){
        this.numberToSort = List;
        

    }

    @Override
    public List<Integer> call() throws Exception {
        System.out.println("Array List " +this.numberToSort+ " Thread : "+ Thread.currentThread().getName());
        if(this.numberToSort.size() <= 1){
            return this.numberToSort;
        }
        int mid = this.numberToSort.size()/2;
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for(int i = 0; i<mid ; i++){
            left.add(this.numberToSort.get(i));
        }
        for(int i = mid ; i < this.numberToSort.size(); i++){
            right.add(this.numberToSort.get(i));
        }

        ExecutorService service = Executors.newFixedThreadPool(2);

        MergeSort leftArr = new MergeSort(left);
        MergeSort rightArr = new MergeSort(right);

        Future<List<Integer>> futureLeft = service.submit(leftArr);
        Future<List<Integer>> futureRight = service.submit(rightArr);

        left = futureLeft.get();
        right = futureRight.get();

        int leftsize = left.size();
        int rightsize = right.size();

        int i = 0 , j = 0;

        List<Integer> mergedArray = new ArrayList<>();

        while (i < leftsize && j < rightsize){

            if (left.get(i) < right.get(j)){
                mergedArray.add(left.get(i));
                i ++;
            }
            else{
                mergedArray.add(right.get(j));
                j++;
            }

        }
        while(i < leftsize){
            mergedArray.add(left.get(i));
            i++;
        }

        while(j < rightsize){
            mergedArray.add(right.get(j));
            j++;
        }
        service.shutdown();
        return mergedArray;


    }
    
}
