package by.epam.list.sort;

import java.util.Arrays;

public class Main3 {
    public static void main(String []args){
   int[] arr = new int[]{10,7,18,5,7,23};
            for(int i = arr.length-1 ; i > 0 ; i--){
                for(int j = 0 ; j < i ; j++){
            if( arr[j] > arr[j+1] ){
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
        }
    }
        System.out.println(Arrays.toString(arr));
}
    }

