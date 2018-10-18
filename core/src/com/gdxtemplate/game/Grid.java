//Importing Packages
package com.gdxtemplate.game;

//Importing utilities

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;



public class Grid {
	
	private int GridX = 10; //Creating the x and y values of the grid (e.g a 2x2 grid)
	private int GridY = 10;
	private int Y = 10;
	private int X = 10;
	private int A = 10;
	private int B = 10;
	
	Player UsePlayer = new Player();
	Treasure UseTreasure = new Treasure();
	Monster UseMonster = new Monster();
	
	public void init(ShapeRenderer sr, char Direction) {
	
		
		for (int i = 0; i < GridY ; i++) {
			
			X = 10;
			
			for (int j = 0; j < GridX ; j++) {
					sr.begin(ShapeType.Filled);
					sr.setColor(1, 1, 1, 1);
					sr.rect(X, Y, 50, 50);
					sr.end();
				
				X += 60;
				
			}
			
		Y += 60;
		
		}
		
		if (Direction == 'W') {
			
			B = UsePlayer.GetPlayerY();
			A = B + 60;
			UsePlayer.SetPlayerY(A);
			
		}
		
		if (Direction == 'A') {
			
			B = UsePlayer.GetPlayerX();
			A = B - 60;
			UsePlayer.SetPlayerX(A);
			
		}
		
		if (Direction == 'S') {
			B = UsePlayer.GetPlayerY();
			A = B - 60;
			UsePlayer.SetPlayerY(A);
		}
		
		if (Direction == 'D') {
			
			B = UsePlayer.GetPlayerX();
			A = B + 60;
			UsePlayer.SetPlayerX(A);
			
		}
		
		if (UseTreasure.GetGoldX() == UsePlayer.GetPlayerX() && UseTreasure.GetGoldY() == UsePlayer.GetPlayerY()) {
			
			UseTreasure.SetCollected(1);
			
		}
		
		else {
			
			if (UseTreasure.GetCollected() != 1) {
				sr.begin(ShapeType.Filled);
				sr.setColor(1,1,0,0);
				sr.rect(UseTreasure.GetGoldX(), UseTreasure.GetGoldY(), 50, 50);		
				sr.end();
				
			}
		}
		
		sr.begin(ShapeType.Filled);
		sr.setColor(1, 0, 0, 1);
		sr.rect(UsePlayer.GetPlayerX(), UsePlayer.GetPlayerY(), 50, 50);		
		sr.end();
		
		
		sr.begin(ShapeType.Filled);
		sr.setColor(1, 0, 1, 0);
		sr.rect(UseMonster.GetMonsterX(), UseMonster.GetMonsterY(), 50, 50);		
		sr.end();
		
		if (UseMonster.GetMonsterState() == "Sleeping") {
			
			if (UsePlayer.GetPlayerX() - UseMonster.GetMonsterX() <= 150 && UsePlayer.GetPlayerX() - UseMonster.GetMonsterX() >= -150 && UsePlayer.GetPlayerY() - UseMonster.GetMonsterY() <= 150 && UsePlayer.GetPlayerY() - UseMonster.GetMonsterY() >= -150) {
				UseMonster.SetMonsterState("Awake");
				
			}
		}
		
		if(UseMonster.GetMonsterState() == "Awake") {
			if(UsePlayer.GetPlayerX() > UseMonster.GetMonsterX() && UseMonster.GetMonsterX() - UsePlayer.GetPlayerX() < UseMonster.GetMonsterY() - UsePlayer.GetPlayerY()) {
				UseMonster.SetMonsterX(UseMonster.GetMonsterX() + 60);
			}
			if(UsePlayer.GetPlayerX() < UseMonster.GetMonsterX() && UsePlayer.GetPlayerX() - UseMonster.GetMonsterX() < UsePlayer.GetPlayerY() - UseMonster.GetMonsterY()) {					UseMonster.SetMonsterX(UseMonster.GetMonsterX() - 60);
			}
			if(UsePlayer.GetPlayerY() > UseMonster.GetMonsterY() && UseMonster.GetMonsterY() - UsePlayer.GetPlayerY() < UseMonster.GetMonsterX() - UsePlayer.GetPlayerX()) {
				UseMonster.SetMonsterY(UseMonster.GetMonsterY() + 60);
			}
			if(UsePlayer.GetPlayerY() < UseMonster.GetMonsterY() && UsePlayer.GetPlayerY() - UseMonster.GetMonsterY() < UsePlayer.GetPlayerX() - UseMonster.GetMonsterX()) {
				UseMonster.SetMonsterY(UseMonster.GetMonsterY() - 60);
			}
		}
		
		
		if (UsePlayer.GetPlayerX() == UseMonster.GetMonsterX() && UsePlayer.GetPlayerY() == UseMonster.GetMonsterY()) {
			
			System.out.println("Game over!");
			System.exit(0);
		}
		
	}

}