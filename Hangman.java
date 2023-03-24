import java.util.Random;
import java.util.Scanner;
public class Hangman1 {
	public static void main(String[] args) {
		System.out.println("Welcome to Hangman");
		Scanner s = new Scanner(System.in);
		Random r = new Random();
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
		HangMan(plugInList,s);

		
		

		}
	public static String HangMan(String[]List,Scanner s) {
		 int TotalWrong=0;
		 int TotalRight=0;
		 boolean Feedback=false;
		for(int i=0;i<8;i++) {
			
			System.out.println("Guess any letter in the word");
			
			String guess = s.nextLine();
			for(int x=0;x<List.length;x++) {
				if(guess.equals(List[x])) {
					TotalRight++;
					Feedback=true;
				}
				}
			if(Feedback==false) {
				System.out.println("That letter is not on the word");
				TotalWrong++;
				System.out.println(Stickfigure(TotalWrong));
			}else if(Feedback==true) {
				System.out.println("Keep going you got this");
				System.out.println(Stickfigure(TotalWrong));
				Feedback=false;
			}
			System.out.println("You got "+TotalRight+" letters right!");
			System.out.println(Stickfigure(TotalWrong));
			if(TotalWrong==6) {
				System.out.println("You Lost!");
			}
			 if(TotalRight==List.length) {
				 System.out.println("You Won!");
				 return"You Won";
			 }
			 }
		System.out.println("You Lost!");
		return"You Lost";
	}
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
			return" O"+"\n"+"/|"+")"+"\n"+"/"+" ]";
		}
		return"";
	}
}
