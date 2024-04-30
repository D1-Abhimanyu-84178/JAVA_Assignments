package com.app.cricket;

import java.util.Scanner;

public class Player {

	int id;
	String name;
	int age;
	int matchesPlayed;
	int noOfRuns;
	int noOfWickets;
	
    public Player() {
    	
    }
    public Player(int id, String name, int age, int matchesPlayed, int noOfRuns, int noOfWickets) {
    	this.id = id;
    	this.name = name;
    	this.age = age;
    	this.matchesPlayed = matchesPlayed;
    	this.noOfRuns = noOfRuns;
    	this.noOfWickets = noOfWickets;
    }
    
    public void accept(Scanner sc) {
    	System.out.println("Enter player id: ");
    	id = sc.nextInt();
    	System.out.println("Enter player name: ");
    	name = sc.next();
    	System.out.println("Enter player age: ");
    	age = sc.nextInt();
    	System.out.println("Enter player No Matches Played : ");
    	matchesPlayed = sc.nextInt();
    	System.out.println("Enter No of Runs of Player : ");
    	noOfRuns = sc.nextInt();
    	System.out.println("Enter no of Wickets of Player : ");
    	noOfWickets = sc.nextInt();
    }
    
   
	@Override
	public String toString() {
		return "[id = " + id + ", name = " + name + ", age = " + age + ", matchesPlayed = " + matchesPlayed
				+ ", noOfRuns = " + noOfRuns + ", noOfWickets = " + noOfWickets + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMatchesPlayed() {
		return matchesPlayed;
	}
	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}
	
	
}
