package by.epam.lis.arr;

public class Main13 {
    public static void main (String []args) {

        isArmstrong(10);
    }
        public static void isArmstrong ( int n){
            int z = n;
            double k = 0;
            int sum = 0;
            while (n > 0) {
                k = Math.pow((n % 10), 3);
                n = n / 10;
                sum += k;
            }
            if (z == sum) {
                System.out.println("Da");
            } else {
                System.out.println("Ne chislo Arms");
            }
        }
    }


