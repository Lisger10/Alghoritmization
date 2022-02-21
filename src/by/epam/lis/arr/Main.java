package by.epam.lis.arr;
// написать методы нок и нод

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите два числа: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int z = mult(a,b);
        System.out.println(z);
        int k = NOD(a,b);
        System.out.println(k);
        int m = del(z,k);
        System.out.println(m);

    }

    public static int mult(int x, int y){
        return x*y;
    }

    public static int NOD(int x,int y){
        while ( x!=0 && y!=0 ){
            if(x>y){
                x = x%y;
            }
            else{
                y= y%x;
            }
        }
        return x+y;
    }

    public static int del(int x,int y){
            return x / y;
        }
}
