package by.epam.lis.arr;
//Составить программу, которая в массиве A[N] находит второе по величине число
//   (вывести на печать число, которое меньше максимального элемента массива, но больше
//    всех других элементов).
public class Main4 {
    public static void main (String []args){
        int arr[] = new int[]{5,7,12,20,9,40,45};
        int max = arr[0];
        int max2 = arr[0];
        for(int i = 0;i<arr.length;i++){
       if(arr[i]>max){
           max = arr[i];
       }
       for (int k = 0;k<arr.length;k++) {
           if(arr[k]>max2 && arr[k]<max){
           max2 = arr[k];
       }
       }
        }
        System.out.println(max2);
    }
}
