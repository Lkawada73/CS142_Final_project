import java.util.Scanner;
import java.util.Random;

public class rockPaperScissors {

    public static void main(String[] args){
        System.out.println("Welcome to Rock Paper Scissors");
        String validResponses = "ROCKPAPERSCISSORS";
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        boolean play  = true;
        int wins = 0;
        int losses = 0;
        while (play){
            String userPlay = getInput(s, "Please enter rock, paper, or scissors");
            if (!validResponses.contains(userPlay)) {
                while (!validResponses.contains(userPlay)) {
                    System.out.println("Oops! That was not a valid response");
                    userPlay = getInput(s, "Please enter rock, paper, or scissors");
                }
            }

            int comp = r.nextInt(3);
            String compPlay = "";
            if (comp == 0){
                compPlay = "ROCK";
            }else if (comp == 1){
                compPlay = "PAPER";
            }else if (comp == 2){
                compPlay = "SCISSORS";
            }

            System.out.println("User: " + userPlay);
            System.out.println("Computer: " + compPlay);

            String result = determineWinner(userPlay, compPlay);
            

            if (result == "user"){
                wins ++;
            }else if (result == "computer"){
                losses ++;
            }

            String again = getInput(s, "Do you want to play again? Y for yes");
            again = again.toUpperCase();
            play = (again == "Y");

        }
        System.out.println("Thank you for playing!");
        System.out.println("Total wins: " + wins);
        System.out.println("Total losses: " + losses);
    }

    public static String getInput(Scanner s, String prompt ){
        System.out.println(prompt);
        String input = s.next();
        //make the input case insensitive
        input = input.toUpperCase();
        return input;
    }


    //Something is wrong with this method
    public static String determineWinner(String user, String comp){
        if (user == comp){
            System.out.println("Its a tie!");
            return "tie";
        }else if ((user == "ROCK" && comp == "PAPER") || (user == "PAPER" && comp == "SCISSORS") || (user == "SCISSORS" && comp == "ROC")){
            System.out.println("Computer wins!");
            return "computer";
        }else if ((user == "PAPER" && comp == "ROCK") || (user == "SCISSORS" && comp == "PAPER")|| (user == "ROCK" && comp == "SCISSORS")){
            System.out.println("User wins!");
            return "user";
        }else{
            System.out.println("Uh oh something went wrong");
            return "";
        }

    }




}
