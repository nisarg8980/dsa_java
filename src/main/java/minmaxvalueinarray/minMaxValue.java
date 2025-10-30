package minmaxvalueinarray;
import java.util.Scanner;

public class minMaxValue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt(); // fixed size

        int[] numbers = new int[n]; // create array

        // input elements
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // print elements
        System.out.println("You entered:");
        for (int num : numbers) {
            System.out.println(num);
        }

        max(numbers);
        min(numbers);
        
    }

    static void max (int[] arr){
        int maxVal = arr[0];
        for (int i = 0; i <arr.length;i++){
            if (arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        System.out.println("Print Max value of array "+ maxVal);
    }

    static void min (int[] arr){
        int minValu = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < minValu){
                minValu = arr[i];
            }
        }
        System.out.println("Print Min Vlaue of array " + minValu);
    }
}
