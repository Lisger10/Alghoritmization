package by.epam.lis.arr;
//Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
//    являются цифры числа N.
import java.util.Scanner;

public class Main9 {
    public static void  main (String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] array = arrCreating(n);

            System.out.print("array is: ");

            for (int elem : array) {
                System.out.print(elem + " ");
            }
        }

        private static int [] arrCreating(int n) {
            int num = n;
            int m = 0;
            int res = 0;

            while (num > 0) {
                num /= 10;
                m++;
            }

            int [] arr = new int [m];

            for (int i = 0; i < arr.length; i++) {
                res = n % 10;
                n = n /10;

                arr[arr.length - 1 - i] = res;
            }

            return arr;
        }
    }
