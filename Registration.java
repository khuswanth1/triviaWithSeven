package triviaWithSeven;

import java.util.Scanner;

public class Registration {
	Scanner sc = new Scanner(System.in);
	public String[] players;
	public void register(int noOfPlayers) {
		players = new String[noOfPlayers];
		System.out.print("Input Player(s) Names:");
		for(int i=0;i<noOfPlayers;i++) {
			players[i] = sc.nextLine();
		}
	}
}
