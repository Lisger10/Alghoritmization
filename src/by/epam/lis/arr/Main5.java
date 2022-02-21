package by.epam.lis.arr;
//Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
import java.util.Scanner;

public class Main5 {
    public static void main (String []args){
        System.out.println("Введите три числа: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = NOD(a,b);
        int g = NOD(k,c);
        System.out.println(g);
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
}
