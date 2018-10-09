//Importing Packages
package com.gdxtemplate.game;

//Importing utilities
//import java.util.Random;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;



public class Grid {
	
	private int GridX, GridY; //Creating the x and y values of the grid (e.g a 2x2 grid)
	private int Y = 10;
	private int X = 10;
	public static int PlayerX = 10;
	public static int PlayerY = 10;
	//Random generator = new Random();
	
	public void init(ShapeRenderer sr, char Direction) {
	//	GridX = generator.nextInt(5);
	//	GridY = generator.nextInt(5);
		
	//	GridX += 5;
	//	GridY += 5;
		
		GridX = 10;
		GridY = 10;
		
		
		for (int i = 0; i < GridY ; i++) {
			X = 10;
			for (int j = 0; j < GridX ; j++) {
				sr.begin(ShapeType.Filled);
				sr.setColor(1, 1, 1, 1);
				sr.rect(X, Y, 50, 50);
				sr.end();
				
				X+= 60;
			}
		Y += 60;
		}
		
		if (Direction == 'W') {
			PlayerY += 60;
		}
		if (Direction == 'A') {
			PlayerX -= 60;
		}
		if (Direction == 'S') {
			PlayerY -= 60;
		}
		if (Direction == 'D') {
			PlayerX += 60;
		}
		
		((ShapeRenderer) sr).begin(ShapeType.Filled);
		((ShapeRenderer) sr).setColor(1, 0, 0, 1);
		((ShapeRenderer) sr).rect(PlayerX, PlayerY, 50, 50);		
		((ShapeRenderer) sr).end();
		
	}

}