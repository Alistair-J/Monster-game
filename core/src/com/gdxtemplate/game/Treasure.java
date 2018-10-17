package com.gdxtemplate.game;


public class Treasure {

	
	private static int GoldX = 70;
	private static int GoldY = 550;
	private static int Collected = 0;

	
	public int GetGoldX() {

		return GoldX;

	}
	
	public int GetGoldY() {

		return GoldY;

	}

	public void SetGoldX(int a) {

		GoldX = a;
		
	}

	public void SetGoldY(int a) {

		GoldY = a;

	}
	
	public int GetCollected() {

		return Collected;

	}

	public void SetCollected(int a) {

		Collected = a;
		
	}
	
}
