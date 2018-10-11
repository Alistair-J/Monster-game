package com.gdxtemplate.game;

//Data about player

public class Player {

	private static int PlayerX = 10;
	private static int PlayerY = 10;
	
	public int GetPlayerX() {

		return PlayerX;
	}
	
	public int GetPlayerY() {

		return PlayerY;
	}

	public void SetPlayerX(int a) {

		PlayerX = a;
		
	}

	public void SetPlayerY(int a) {

		PlayerY = a;
	}
	
}
