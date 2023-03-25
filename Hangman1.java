import java.util.Random;
import java.util.Scanner;
public class Hangman1 {
	public static void main(String[] args) {
		
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
		 String[]doneList= {"","","","",""} ;
		 boolean Feedback=false;
		 boolean playH=true;
		while(playH==true) {
			//made by Lance and William
			System.out.println("Guess any letter that makes up the word in my head");
			
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
