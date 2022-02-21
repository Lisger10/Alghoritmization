package by.epam.lis.arr;
//Два простых числа называются «близнецами», если они отличаются друг от друга на 2
//    (например, 41 и 43). Найти и напечатать все пары «близнецов» из отрезка [n,2n], где
//    n - заданное натуральное число больше 2. Для решения задачи использовать декомпозицию.
import java.util.Scanner;

public class Main12 {
    public static void main (String []args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Vvedite chislo >2: ");
        int k = sc.nextInt();
        int z = k*2;
        pairsOfNumbs(k,z);
    }
    public static void pairsOfNumbs(int k,int z){
        for(int i =k;i<=z-2;i++){
            System.out.println(i+" и " + (i+2) + ";");
        }
    }

}
