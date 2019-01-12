import java.util.*;


public class Main {

    public static void main(String[] args) {
        //System.out.println("Our first Java Application!!");
        MyClass obj1 = new MyClass();
        obj1.printMessage("Hello Mahmoud!");

        System.out.print("\nPlease enter an integer value: ");

        Scanner myScanner = new Scanner(System.in);
        obj1.guessMyNumber();



    }
}
