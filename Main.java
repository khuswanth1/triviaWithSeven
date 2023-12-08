package triviaWithSeven;

import java.util.Scanner;

public class Main {
	
	public static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		boolean playAgain = true;
		System.out.println("****Trivia With Seven****");
		System.out.print("No.of.Players: ");
		int noOfPlayers = sc.nextInt();
		
		Registration registerObj = new Registration();
		registerObj.register(noOfPlayers);
	
		while(playAgain) {
			System.out.println("Choose the Domain");
			System.out.println("1.General Knowledge\t2.Politics\n3.Technologies\t\t4.Sports\n5.Entertainment\t\t6.Programming\n7.Science");
			int choice = sc.nextInt();
			switch(choice) {
			case 1 :
				GeneralKnowledge gkObj = new GeneralKnowledge(noOfPlayers);
				gkObj.quiz(registerObj);
				break;
			case 2 :
				Politics politicsObj = new Politics(noOfPlayers);
				politicsObj.quiz(registerObj);
				break;
			case 3 :
				Technology techObj = new Technology(noOfPlayers);
				techObj.quiz(registerObj);
				break;
			case 4 :
				Sports sportObj = new Sports(noOfPlayers);
				sportObj.quiz(registerObj);
				break;
			case 5 :
				Entertainment entertainmentObj = new Entertainment(noOfPlayers);
				entertainmentObj.quiz(registerObj);
				break;
			case 6 :
				Programming programmingObj = new Programming(noOfPlayers);
				programmingObj.quiz(registerObj);
				break;
			case 7 :
				Science scienceObj = new Science(noOfPlayers);
				scienceObj.quiz(registerObj);
				break;
			default : System.out.println("Sorry!! You Choose an InValid Option:");
			}
			playAgain = false;
		}

	}

}
