package by.epam.lis.arr;
//Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его
//   площади, если угол между сторонами длиной X и Y — прямой.
import java.util.Scanner;

public class Main8{
    public static void  main (String []args){
        Scanner sc = new Scanner(System.in);
        double X = sc.nextDouble();
        double Y = sc.nextDouble();
        double Z = sc.nextDouble();
        double res = square(X,Y,Z);
    }
    public static double square(double x, double y, double z){
        return 0.5 * x * (y+z);
    }
}
