package sortingalgorithms;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 3, 1, 6, 2};

        for(int i=1;i<arr.length;i++){
         int curr = arr[i];
         int j=i-1;

         while(j>=0 && arr[j]>curr){
             arr[j+1]=arr[j];
             j--;
         }
         arr[j+1]=curr;
        }
        Arrays.stream(arr).forEach(x-> System.out.println(x));
    }
}
