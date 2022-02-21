package by.epam.list.sort;
//Заданы два одномерных массива с различным количеством элементов и натуральное число k.
//   Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого,
//   при этом не используя дополнительный массив.
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String []args){

        int [] mas1 = new int []{7,7,7,7,7};
        int [] mas2 = new int []{1,1,1,1,1};
        System.out.println("массив 1 \n"  + Arrays.toString(mas1));
        System.out.println("массив 2 \n"  +Arrays.toString(mas2));
        int[]arr = uniteArrays(mas1,mas2,3);
            System.out.println(Arrays.toString(arr));

    }

    public static int[] uniteArrays(int [] a1, int [] a2, int k)
    {
        int n1=a1.length;
        int n2=a2.length;
        int i,p;

        int res[]=new int[n1+n2];

        p=0;
        for (i=0; i<k;   i++) {
            res[p++]=a1[i];

        }
        for (i=0; i<n2; i++)   {
            res[p++]=a2[i];
        }
        for (i=k; i<n1; i++)   {
            res[p++]=a1[i];
        }

        return res;

    }
}

