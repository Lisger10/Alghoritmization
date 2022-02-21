package by.epam.lis.arr;
// Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр
import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vvedite a:");
        int a = sc.nextInt();
        System.out.println("Vvedite b");
        int b = sc.nextInt();
        int firstLength = amountOfNumbers(a);
        System.out.println(firstLength);
        int secondLength = amountOfNumbers(b);
        System.out.println(secondLength);
        biggestNumber(firstLength,secondLength);
    }
    public static int amountOfNumbers(int n) {
        int k = 0;
        while (n > 0) {
            n = n / 10;
            k++;
        }
        return k;
    }
    public static void biggestNumber (int k,int m){
        if(k>m){
            System.out.println("Длина первого числа больше");
        }
        else {
            System.out.println("Длина второго числа больше");
        }
    }
}
