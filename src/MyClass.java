import java.lang.Math;
import java.util.Scanner;

public class MyClass {
    public void printMessage(String msg){
        System.out.println(msg);
    }

    public void guessMyNumber(){
        int myRand = (int)(Math.random() * 10 + 1);
        Scanner myScanner = new Scanner(System.in);
        if(myScanner.nextInt() == myRand){
            System.out.println("Congrats! You win!!");
        } else {
            System.out.println("You have 3 more tries!");
            for (int i = 0 ; i < 3 ; i ++){
                System.out.print("Please enter a number between 0 and 10: ");
                if (myRand == myScanner.nextInt()){
                    System.out.println("Congrats! You win!!");
                    break;
                }
                else{
                    System.out.println("Try agian");

                    continue;
                }
            }
            System.out.println("Random number was: " + myRand);
            System.out.println("Game Over!!");
        }
    }
}



