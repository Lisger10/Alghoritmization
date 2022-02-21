package by.epam.lis.arr;
//Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
//треугольника
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Введите a");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
       double c = height(a);
        System.out.println(c);
       double square = SixTriangleSquare(a,c);
        System.out.println(square);

    }

    public static double SixTriangleSquare(double a, double h){
        return 6*0.5*a*h;
    }
    public static double height(double a){
        double c = Math.sqrt(Math.pow(a,2)-Math.pow(a*0.5,2));
        return c;
    }
}

