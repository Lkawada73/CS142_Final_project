
import java.util.Random;
import java.util.Scanner;
///made by William,Lance and Megan
public class Final_Project {
	public static void main(String[]args) {
		//Inital dialoge
		System.out.println("A diffused light shines upon this poor malcontent.");
		wait(2500);
		System.out.println("\n"+"The cacophany of digital sound eminates these walls.");
		wait(2500);
		System.out.println("\n"+"The startled Edgar hurridly dressed and rushed into a world of gloomy clouds...");
		wait(2500);
		System.out.println("\n"+"His legs were burning hotter than his cpu along the way. Edgar had recognized a short cut through an alley way, "+"\n"+"not to dissimilar to the one that created the dark knight ");
		wait(2500);
		System.out.println("\n"+"Through the shadows an advasary appeared and said");
		System.out.println("\n"+"Hey Kid I challenge you to a simple game of Rock Paper Scissors(Alleyway Man)");
		wait(2500);
		System.out.println("\n"+"If you beat me three times I will allow you to advance(Alleyway Man)");
		wait(2500);
		//Rock Paper scissors contributed by Megan and Lance
        String validResponses = "ROCKPAPERSCISSORS";
        Scanner s = new Scanner(System.in);
        Random r = new Random();
       boolean play  = true;
       
        int wins = 0;
        int losses = 0;
        while (play==true){
            String userPlay = getInput(s, "enter rock, paper, or scissors if you wish to advance boy(Alleyway Man)");
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

            if(wins<2) {
            	play=true;
            }else if(wins>2) {
            	play=false;
            }
            

        }
		//some more sections of dialogue
        System.out.println("\n"+"You may now advance boy Edgar.(Alleyway Man)");
        wait(2500);
        System.out.println("\n"+"Edgar has reached the first checkpoint!");
        wait(2500);
        System.out.println("\n"+"Coming off the previous win Edgar rushes head on to our next opponent ");
        wait(2500);
        System.out.println("\n"+"YOUNG ONE I challenge you to a bet of roulette only if you win you may advance(Alleyway Man2)");
        System.out.println("\n"+"Do you accept my terms?(Please do not enter YES or NO)");
        wait(2500);
        System.out.println("\n"+"... I do(Edgar)");
        wait(200);
        //roulette section of the game thanks to Megan
        System.out.println("Now Young one chose your own version of doom! (Alleyway Man2)");
        wait(2500);
        System.out.println("you could do a game of evens and odds(Alleyway Man 2)");
        wait(2500);
        System.out.println("or bet on a single number");
        System.out.println();
        System.out.println("again which do you choose number 1 for evens and odds or 2 for a specific number ");
        s = new Scanner(System.in);
        r=new Random();
        play=true;
		//A loop that continues if you lose
        while(play==true) {
        	int option = s.nextInt();
            //the game of roulette was contributed by Megan
            if (option == 1){
                System.out.println("Which do you choose for evens and odds? pick 0 for evens and 1 for odds: ");
                int evenOdd = s.nextInt();
                int randNum = r.nextInt(30);
                System.out.println("It landed on " + randNum + "!");
                if (randNum % 2 == evenOdd){
                    System.out.println("You win! Congratulations");
                    play=false;
                    break;
                }else{
                    System.out.println("You lost. Better luck next time.");
                    System.out.println("again which do you choose number 1 for evens and odds or 2 for a specific number ");
                    play=true;
                }
            }else if (option == 2){
                System.out.println("What number between 0 - 20 would you like to bet on?");
                int num = s.nextInt();
                int randNum = r.nextInt(20);
                System.out.println("It landed on " + randNum + "!");
                if (num == randNum){
                    System.out.println("Congratulations! You win");
                    play=false;
                    break;
                }else{
                    System.out.println("Better luck next time");
                    System.out.println("again which do you choose number 1 for evens and odds or 2 for a specific number ");
                    play=true;
                }
            }
        }
       System.out.println("\n"+"You Have reached the second checkpoint!");
        wait(2500);
        System.out.println("\n"+"Finally a light shown at the end of the alley");
        wait(2500);
        System.out.println("\n"+"The sounds of class mates chatter eminating softly in the background");
        wait(2500);
        System.out.println("\n"+"Elation filled his body thinking he may indeed make it to class");
        wait(2500);
        System.out.println("\n"+"SMACK");
        wait(2500);
        System.out.println("\n"+"So you defeated my underlings haven't you?(Final boss)");
        wait(2500);
        System.out.println("\n"+"Yes I have now can I please get past you so I can make it to school!(Edgar)");
        wait(2500);
        System.out.println("\n"+"You will not find me as easily defeated as the others(Final boss)");
        wait(2500);
        System.out.println("\n"+"Ok what game is it now.(Edgar)");
        wait(2500);
        System.out.println("\n"+"You will have to best me at hangman in order to make it to school(Final Boss)");
        wait(2500);
        System.out.println("\n"+"Alright fine.(Edgar)");
        wait(200);
        //Hangman was done by Lance and William
       
        s = new Scanner(System.in);
        r = new Random();
		
        
		
		String[] plugInList= {};
		int cNum=r.nextInt(3);
		String[] lance= {"l","a","n","c","e"};
		String[] dance= {"d","a","n","c","e"};
		String[] eagle= {"e","a","g","l","e"};
		if(cNum==0) {
			plugInList=lance;
		}else if(cNum==1) {
			plugInList=dance;
		}else if(cNum==2) {
			plugInList=eagle;
		}
		
		//Dialouge depending on if you win or lose.
        if(HangMan(plugInList,s).equals("You Won")) {
        	System.out.println("\n"+"...How... HOW DID YOU DO IT");
    		wait(2500);
    		System.out.println("\n"+"I am The Edgar");
    		wait(2500);
    		System.out.println("\n"+"Congradgulations, you've successfully defeated all your advasaries and made it to school!");
        }else {
        	System.out.println("Well my friend you will simply not make it to class good luck restarting your whole adventure");
        }
      
        
        	
        
		
			
			
		
		
        
		
		
	}
	//The hangman method explained in our report
	public static String HangMan(String[]List,Scanner s) {
		 int TotalWrong=0;
		 int TotalRight=0;
		 String[]doneList= {"","","","",""} ;
		 boolean Feedback=false;
		 boolean playH=true;
		while(playH==true) {
			//made by Lance and William
			System.out.println("Guess any letter that makes up the word in my head(Lower case letters only)");
			
			String guess = s.nextLine();
			for(int x=0;x<List.length;x++) {
				if(guess.equals(List[x])&&!guess.equals(doneList[x])) {
					TotalRight++;
					Feedback=true;
					doneList[x]=List[x];
				}
				}
			
			if(Feedback==false) {
				System.out.println("That letter is simply not on the word");
				TotalWrong++;
				System.out.println(Stickfigure(TotalWrong));
			}else if(Feedback==true) {
				
				System.out.println(Stickfigure(TotalWrong));
				Feedback=false;
			}
			System.out.println("You got "+TotalRight+" letters out of five right!");
			System.out.println(Stickfigure(TotalWrong));
			if(TotalWrong==6) {
				System.out.println("You Lost!");
				playH=true;
				break;
			}
			 if(TotalRight==List.length) {
				 System.out.println("You Won!");
				 playH=false;
				 return"You Won";
				 
			 }
			 
			 }
		
		return"You Lost";
	}
	//A Wait method to avoid redundant code
	public static void wait(int num) {
		try {
			Thread.sleep(num);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	//An input method that capitalises every input thanks to Megan
	public static String getInput(Scanner s, String prompt ){
        System.out.println(prompt);
        String input = s.next();
        //make the input case insensitive
        input = input.toUpperCase();
        return input;
    }
	//The method that defines the rules for Rock Paper Scissors
	 public static String determineWinner(String user, String comp){
	        if (user.equals(comp)){
	            System.out.println("Its a tie!");
	            return "tie";
	        }else if ((user.equals("ROCK") && comp.equals("PAPER")) || (user.equals("PAPER") && comp.equals("SCISSORS")) || user.equals("SCISSORS") && comp.equals("ROCK")){
	            System.out.println("Computer wins!");
	            return "computer";
	        }else if ((user.equals("PAPER") && comp.equals("ROCK")) || (user.equals("SCISSORS") && comp.equals("PAPER"))|| (user.equals("ROCK") && comp.equals("SCISSORS"))){
	            System.out.println("User wins!");
	            return "user";
	        }else{
	            System.out.println("Uh oh something went wrong");
	            return "";
	        }

	    }
	//Makes a stick figure depending on the amount of times you have failed.
	 public static String Stickfigure(int Total) {
			if(Total==1) {
				return" O";
			}else if(Total==2) {
				return" O"+"\n"+" |";
			}else if(Total==3) {
				return" O"+"\n"+"/|";
			}else if(Total==4) {
				return" O"+"\n"+"/|"+")";
			}else if(Total==5) {
				return" O"+"\n"+"/|"+")"+"\n"+"/";
			}else if(Total==6) {
				return" O"+"\n"+"/|"+")"+"\n"+"/"+" )";
			}
			return"";
		}
}
