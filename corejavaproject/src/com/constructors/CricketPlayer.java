package com.constructors;

import java.util.Scanner;

public class CricketPlayer {
	
	String PlayerName;
	int MatchesPlayed;
	double TotalRuns;
	
	    CricketPlayer(int MatchesPlayed ,String PlayerName , double TotalRuns) {
		
		this.PlayerName = PlayerName;
		this.MatchesPlayed = MatchesPlayed;
		this.TotalRuns = TotalRuns;
		display();
		
	}
	
	void display() {
		
		double AverageRuns =(double) TotalRuns / MatchesPlayed;
		System.out.println("Player Name :"+PlayerName );
		System.out.println("Matches Played:"+ MatchesPlayed);
		System.out.println("Total Runs:"+ TotalRuns);
		System.out.println("Average Runs:"+AverageRuns);
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the palyer Name:");
		String PlayerName = sc.nextLine();
		System.out.println("Enter the Matches palyed:");
		int MatchesPlayed = sc.nextInt();
		System.out.println("Enter Total Runs:");
		double TotalRuns  = sc.nextDouble();
		CricketPlayer c = new CricketPlayer(MatchesPlayed, PlayerName,TotalRuns);
		
	
		
	}

}
