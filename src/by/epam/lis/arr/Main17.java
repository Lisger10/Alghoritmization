package by.epam.lis.arr;
// Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
//    Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать
//    декомпозицию.
import java.util.Scanner;

public class Main17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int subtrahend=whatToSubtract(a);
        int result = howMuchToSubstract(a,subtrahend);
        System.out.println(subtrahend);
        System.out.println(result);
    }
   public static int whatToSubtract(int a){
        int sum=0;
        int k=0;
        while (a>0){
             k = a%10;
             a=a/10;
             sum+=k;
        }
        return sum;
   }
   public static int howMuchToSubstract(int a, int sub){
        int k = a-sub;
        int amount = 1;
        while (k>0){
            k-=sub;
            amount++;
        }
        return amount;
   }
}
