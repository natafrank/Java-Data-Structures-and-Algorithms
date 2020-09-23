package com.packt.datastructuresandalg.lesson2.activity.mergesort;

public class MergeSort {

    private void merge(int[] array, int start, int middle, int end) {
        int i = start;
        int j = middle + 1;
        int[] arrayTemp = new int[end - start + 1];
        for(int k = 0; k < arrayTemp.length; k++){
            if(i <= middle && (j > end || array[i] <= array[j])){
                arrayTemp[k] = array[i];
                i++;
            }
            else{
                arrayTemp[k] = array[j];
                j++;
            }
        }

        System.arraycopy(arrayTemp, 0, array, start, arrayTemp.length);
    }

    private void mergeSort(int[] array, int start, int end) {
        if(start < end){
            int midPoint = (end + start) / 2;
            mergeSort(array, start, midPoint);
            mergeSort(array, midPoint + 1, end);
            merge(array, start, midPoint, end);
        }
    }

    public void mergeSort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }
}

//    merge(array, start, middle, end)
//          i = start
//          j = middle + 1
//          arrayTemp = initArrayOfSize(end - start + 1)
//          for (k = 0 until end-start)
//              if (i <= middle && (j > end || array[i] <= array[j]))
//                  arrayTemp[k] = array[i]
//                  i++
//              else
//                  arrayTemp[k] = array[j]
//                  j++
//          copyArray(arrayTemp, array, start)

//    The pseudocode for the merging is shown in the following code snippet. In this code,
//        the copyArray() function simply takes in a source array as a first argument and copies
//        it to the target array, that is, the second argument.
//        It makes use of the start variable as a pointer, indicating where to place the
//        first element of the source array onto the target one.

//    In the merging part of the merge sort, we create a temporary array which is of size equal to the size of two array parts together.
//        We then do a single pass on this array, filling the temporary array one item at a time by picking the smallest item between
//        the two input lists (represented by the start, middle, and end pointers). After picking an item from one of the lists,
//        we advance the pointer of that list and repeat until the merge is complete