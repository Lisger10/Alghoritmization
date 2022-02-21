package by.epam.lis.arr;
//Написать метод(методы) ДЛЯ нахождения наибольшего общего Делителя четырех натуральных ЧИСЭЛ.
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Введите два числа: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int firstM = mult(a,b);
        int firstN = NOD(a,b);
        System.out.println(firstN);
        int c = sc.nextInt();
        int d = sc.nextInt();
        int secondM = mult(c,d);
        int secondN = NOD(c,d);
        System.out.println(secondN);
        int e = sc.nextInt();
        int f = sc.nextInt();
        int thirdM = mult(e,f);
        int thirdN= NOD(e,f);
        System.out.println(thirdN);


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
