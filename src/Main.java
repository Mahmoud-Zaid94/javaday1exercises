import java.util.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        //System.out.println("Our first Java Application!!");
        MyClass obj1 = new MyClass();
//        obj1.printMessage("Hello Mahmoud!");

        //call guess my number game
//        obj1.guessMyNumber();
//
//        System.out.println();

        int arr[] = new int[5];

        System.out.println("Please enter 5 numbers:");
        for(int i=0; i < arr.length; i++){
            System.out.print(">>");
            arr[i] = myScanner.nextInt();
            System.out.println();
        }

        System.out.println("Input Array: " + Arrays.toString(arr));

        obj1.acceptAndReverse(arr);



    }
}
