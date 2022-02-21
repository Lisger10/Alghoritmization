package by.epam.list.sort;
// Даны две последовательности
//	a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm
// 	Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей.
// 	Примечание. Дополнительный массив не использовать.
import java.util.Arrays;

public class Main1 {
    public static void main (String []args){
        int arr1[]= new int[]{1,2,3,4,5};
        int arr2[]= new int[]{2,4,6,8};
        int arr3[]= new int[arr1.length+arr2.length];
        int j=0;
        for (int i=0;i<arr1.length;i++){
            arr3[j++] = arr1[i];
        }
        for (int i=0;i<arr2.length;i++){
            arr3[j++] = arr2[i];
        }
        Arrays.sort(arr3);
        for(int elem:arr3){
            System.out.print(elem + " ");
        }

    }
}
