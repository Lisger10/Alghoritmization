package by.epam.lis.arr;
//Задан массив D. Определить следующие суммы:
//   D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
//   Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных
//   элементов массива с номерами от k до m.
import java.util.Scanner;

public class Main7 {
    public static void main(String []args) {
        int arr[] = new int[]{1, 3, 5, 7, 5, 8, 9, 10};
        Scanner sc = new Scanner(System.in);
        System.out.println("Vvedite k: ");
        int k =sc.nextInt();
        System.out.println("Vvedite m: ");
        int m = sc.nextInt();
        int summ = sumOfElem(arr,k,m);
        System.out.println(summ);
    }

    public static int sumOfElem(int[] arr, int k, int m) {
        int sum = 0;
        for (int i = k; i <= m; i++) {
             sum += arr[i];}
            return sum;
        }
    }


