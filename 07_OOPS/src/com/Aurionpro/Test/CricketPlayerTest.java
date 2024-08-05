package com.Aurionpro.Test;

import java.util.Scanner;

import com.Aurionpro.Model.Book;
import com.Aurionpro.Model.CricketPlayer;

public class CricketPlayerTest {

	public static void getMaximumAveragePlayer(CricketPlayer[] cricketplayers) {
		CricketPlayer maxAverage = cricketplayers[0];
		for (int i = 0; i < cricketplayers.length; i++) {
			if (cricketplayers[i].calculateAverage() > maxAverage.calculateAverage()) {
				maxAverage = cricketplayers[i];
			}
		}
		 System.out.println("Maximum Average Player is:- \n" + " " +
		 maxAverage.getPlayerId() + " "
		 + maxAverage.getPlayerName() + " " + maxAverage.getNumberOfMatches() + " " +
		 maxAverage.getRuns() + " "
		 + maxAverage.getWickets());
//		System.out.println("Maximum Average Player is:- \n" + maxAverage.getPlayerName());
	}

	public static void sortPlayersByAverage(CricketPlayer[] cricketplayers) {

		for (int i = 0; i < cricketplayers.length - 1; i++) {
			for (int j = 0; j < cricketplayers.length - i - 1; j++) {
				if (cricketplayers[j].calculateAverage() > cricketplayers[j + 1].calculateAverage()) {
					CricketPlayer temp = cricketplayers[j];
					cricketplayers[j] = cricketplayers[j + 1];
					cricketplayers[j + 1] = temp;
				}

			}
		}
		for (int i = 0; i < cricketplayers.length; i++) {
			System.out.println(cricketplayers[i].getPlayerName());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		CricketPlayer[] players = new CricketPlayer[2];

		for (int i = 0; i < players.length; i++) {
			System.out.println("Enter the Player id");
			int playerId = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Player name");
			String name = sc.nextLine();
			System.out.println("Enter No of Matches");
			int noOfMatches = sc.nextInt();
			System.out.println("Enter Total Runs");
			int runs = sc.nextInt();
			System.out.println("Enter total wickets");
			int wickets = sc.nextInt();
			CricketPlayer newplayer = new CricketPlayer(playerId, name, noOfMatches, runs, wickets);
			players[i] = newplayer;
		}

		System.out.println("Cricket Player Stats are :");
		for (int i = 0; i < players.length; i++) {
			players[i].display();
		}
		getMaximumAveragePlayer(players);
		System.out.println("Ascending Order of the Player's Average's are :");
		CricketPlayerTest.sortPlayersByAverage(players);

	}

}
