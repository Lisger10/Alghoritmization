package by.epam.list.sort;
//Сортировка выбором. Дана последовательность чисел a1 >= a2 >= an. Требуется переставить элементы
//    так, чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается
//    наибольший элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная
//    со второго, эта процедура повторяется. Написать алгоритм сортировки выбором.

public class Main2 {
    public static void main(String[] args) {

        int [] arr = {1, 12, 3, 8, 4, 5, 7, 6, 9};
        int temp = 0;
        for (int k = 0; k < arr.length; k++) {
            for (int l = k + 1; l < arr.length; l++) {
                if (arr[k] < arr[l]) {
                    temp = arr[l];
                    arr[l] = arr[k];
                    arr[k] = temp;
                }
            }
        }
        System.out.print("result is: ");
        for (int element : arr){
            System.out.print( element + " ");
        }
    }
}