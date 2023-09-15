package sortingalgorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 3, 1, 6, 2};
        for(int k=0;k<arr.length-1;k++){
            for(int i = 0; i < arr.length - k-1; i++) {
                if(arr[i]>arr[i+1]){
                    int temp= arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }

        }

        Arrays.stream(arr).forEach(x-> System.out.println(x));

    }
}
