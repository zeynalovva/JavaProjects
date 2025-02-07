package HW1;
import java.util.Random;
import java.util.Scanner;

public class numberGuesser {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        System.out.printf("Enter your name: ");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Let the game begin!");
        boolean flag = false;
        while(!flag) {
            System.out.printf("Enter a number between 1 and 100: ");
            int input = new Scanner(System.in).nextInt();
            if(input > number){
                System.out.println("Your number is too big. Please, try again.");
            }
            else if(input < number){
                System.out.println("Your number is too small. Please, try again.");
            }
            else{
                flag = true;
                System.out.printf("Congratulations, " + name + "!");
            }
        }
    }
}