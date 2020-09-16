package com.packt.datastructuresandalg.lesson2.activity.selectionsort;

public class SelectionSort {

    public void sort(int[] array) {
        for(int i = 0; i < array.length - 1; i++){
            int indexOfMin= i;
            for(int j = i; j < array.length; j++){
                if(array[j] < array[indexOfMin]){
                    indexOfMin = j;
                }
            }
            swap(array, indexOfMin, i);
        }
    }

    private void swap(int[] numbers, int j, int k) {
        int temp = numbers[j];
        numbers[j] = numbers[k];
        numbers[k] = temp;
    }
}
