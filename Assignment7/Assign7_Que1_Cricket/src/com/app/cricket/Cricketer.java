package com.app.cricket;

import java.util.Scanner;

public class Cricketer extends Player implements Batter, Bowler {

	@Override
	public int getWickets() {
		// TODO Auto-generated method stub
		return noOfWickets;
	}

	@Override
	public int getRuns() {
		// TODO Auto-generated method stub
		return noOfRuns;
	}

	@Override
	public void accept(Scanner sc) {
		// TODO Auto-generated method stub
		super.accept(sc);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
