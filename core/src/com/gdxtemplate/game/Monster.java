package com.gdxtemplate.game;

public class Monster {
	
	private static int MonsterX = 370;
	private static int MonsterY = 370;
	private static String State = "Sleeping";
	
	public int GetMonsterX() {

		return MonsterX;
	}
	
	public int GetMonsterY() {

		return MonsterY;
	}
	
	public String GetMonsterState() {
		
		return State;
		
	}

	public void SetMonsterX(int a) {

		MonsterX = a;
		
	}

	public void SetMonsterY(int a) {

		MonsterY = a;
		
	}
	
	public void SetMonsterState(String b) {
		
		State = b;

	}

}
