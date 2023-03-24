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
		for(int i=0;i<5;i++) {
			
			System.out.println("Guess any letter in the word");
			
			String guess = s.nextLine();
			for(int x=0;x<List.length;x++) {
				if(guess.equals(List[x])) {
					TotalRight++;
				}else {
					TotalWrong++;
				}
				}
			System.out.println("You got "+TotalRight+" letters right!");
			System.out.println(Stickfigure(TotalWrong));
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
			return";_;";
		}else if(Total==2) {
			return";_;"+"\n"+" |"+"\n"+" |";
		}
		return"";
	}
}
