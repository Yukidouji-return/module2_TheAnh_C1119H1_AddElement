import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;

public class AddElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] myArray;
        int size;

        System.out.println("Please enter size of array: ");
        size = scanner.nextInt();
        myArray = new int[size];

        for (int count = 0; count < myArray.length; count++) {
            System.out.println("Please enter element " + count + ":");
            myArray[count] = scanner.nextInt();
        }

        System.out.println("Please insert index you want insert: ");
        int index = scanner.nextInt();
        boolean check;
        if (index <= 1 || index >= myArray.length - 1){
            check = false;
        }
        while(check = false) {
            System.out.println("Cant insert element in array ! ");
            System.out.println("Please insert index you want insert again: ");
            index = scanner.nextInt();
        }
        System.out.println("Please insert the element you want inset at index " + index + "!!");
        int value = scanner.nextInt();
        int[] array2 = Arrays.copyOf(myArray, size + 1);


        for (int count = 0; count < array2.length; count++) {
            if (count == index) {
                array2[count] = value;
            }
            System.out.print(array2[count]+",");
        }
    }
}

