import java.util.Scanner;
import java.util.Random;

public class roulette {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Welcome to Roulette! You have 2 different betting options: ");
        System.out.println("1. Betting on odds or evens");
        System.out.println("2. Betting on a specific number");
        System.out.println();
        System.out.println("Which option would you like to choose? Enter 1 or 2: ");

        int option = s.nextInt();

        if (option == 1){
            System.out.println("Would you like to pick evens or odds? Enter 0 for evens and 1 for odds: ");
            int evenOdd = s.nextInt();
            int randNum = r.nextInt(30);
            System.out.println("It landed on " + randNum + "!");
            if (randNum % 2 == evenOdd){
                System.out.println("You win! Congratulations");
            }else{
                System.out.println("You lost. Better luck next time.");
            }
        }else if (option == 2){
            System.out.println("What number between 0 - 20 would you like to bet on?");
            int num = s.nextInt();
            int randNum = r.nextInt(20);
            System.out.println("It landed on " + randNum + "!");
            if (num == randNum){
                System.out.println("Congratulations! You win");
            }else{
                System.out.println("Better luck next time");
            }
        }


    }

}
