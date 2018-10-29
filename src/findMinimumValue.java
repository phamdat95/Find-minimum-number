import java.util.Scanner;

public class findMinimumValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Array with size one: ");
        for (int i = 0; i < size; i++){
            arr[i] = (int) Math.floor(Math.random()*100);
        }
        for (int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        int min = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] < min) {
                min = arr[i];
                index = index + 1;
            }
        }
        System.out.println("\nThe smallest value in the array is: " + min + ", at position: " + index);
    }
}
