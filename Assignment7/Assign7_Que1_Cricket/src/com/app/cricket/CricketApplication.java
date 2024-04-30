package com.app.cricket;

import java.util.Scanner;

public class CricketApplication {

	private static int menu(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("0. EXIT");
		System.out.println("1. ADD PLAYER");
		System.out.println("2. DISPLAY TOTAL RUNS, WICKETS AND TOTAL MATCHES PLAYED BY ALL PLAYERS");
		System.out.println("3. DISPLAY ALL CRICKETERS");
		System.out.println("ENTER YOUR CHOICE: ");
		
		return sc.nextInt();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Player [] player = new Player[11];
		player[0] = new Cricketer();
		Player p1 = player[0];
		player[1] = new Cricketer();
		
		player[0].equals(p1){
			if(p1 instaceOf Cricketer) {
				
			}
		}
		int choice = 0;
		int totalRuns = 0;
		int totalWickets = 0;
		int totalMatchPlayedByAll = 0;
		int count = 0;
		do {
			switch (choice) {
			case 0:
				System.out.println("Exit From Application...");
				break;
			case 1:
				for(int i = 0; i<player.length; i++) {
					player[i] = new Cricketer();
					player[i].accept(sc);
					System.out.println("Player added...");
					count++;
					System.out.println("No of Playes in queue... " + count);
				}
				System.out.println("All Players added successfully...");
				break;
			case 2:
				for(int i = 0; i<player.length; i++) {
					Cricketer cricketer = (Cricketer)player[i];
					if(player[i]!= null) {
						totalRuns  = totalRuns + cricketer.getRuns();
						totalWickets = totalWickets + cricketer.getWickets();
						totalMatchPlayedByAll = totalMatchPlayedByAll + player[i].getMatchesPlayed();
						System.out.println("No of Matches played by "+ player[i].getName()+" are "+player[i].getMatchesPlayed());
					}
				}
				System.out.println("Total Runs of all Players are : "+ totalRuns);
				System.out.println("Total Wickets Taken by all players are: "+ totalWickets);
				System.out.println("Total Matche Played by all players : " + totalMatchPlayedByAll );
				break;
			case 3:count = 0;
				System.out.println("Players Info: ");
			    for (Player cricketer : player) {
			    	if(cricketer != null) {
			    		count++;
			    		System.out.println(count+"."+" Mr."+cricketer.getName());
			    		System.out.println(count+"."+cricketer.matchesPlayed);
			    	}
				}
				break;
			default:
				System.out.println("Invalid Choice...");
				break;
			}
		}while((choice = menu(sc))!=0);
	}





}
