//1. zadacha 1
// import java.util.Scanner;
//
//public class PushZero
//{
//    static void pushZerosToBeginning(int arr[], int n)
//    {
//        int j = n - 1;
//
//        for(int i = n -1 ; i >= 0; i--){
//            if(arr[i] != 0){
//                arr[j] = arr[i];
//                j--;
//            }
//        }
//
//        while(j >= 0){
//            arr[j] = 0;
//            j--;
//        }
//
//        System.out.println("Transformiranata niza e:");
//        for(int i = 0 ; i < n ; i++){
//            System.out.print(arr[i] + " ");
//        }
//    }
//
//    public static void main (String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int niza[] = new int[1000];
//
//        for(int i = 0; i < n; i++){
//            niza[i] = sc.nextInt();
//        }
//
//        pushZerosToBeginning(niza, n);
//    }
//}
//zadacha 2.
//import java.util.Scanner;
//
//public class ReverseWord {
//
//    public static void printReversed(String word) {
//        char[] arr = word.toCharArray();
//        int left = 0, right = arr.length - 1;
//
//        while (left < right) {
//            char tmp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = tmp;
//            left++;
//            right--;
//        }
//
//        System.out.println(arr);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//
//        String words = "";
//        for (int i = 0; i < n; i++) {
//            words = sc.next();
//            printReversed(words);
//        }
//
//    }
//}

//zadaca 3.


