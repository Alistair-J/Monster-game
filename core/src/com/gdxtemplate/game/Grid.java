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
	//Random generator = new Random();
	
	public void init(Object sr) {
	//	GridX = generator.nextInt(5);
	//	GridY = generator.nextInt(5);
		
	//	GridX += 5;
	//	GridY += 5;
		
		GridX = 10;
		GridY = 10;
		
		for (int i = 0; i < GridY ; i++) {
			X =10;
			for (int j = 0; j < GridX ; j++) {
				((ShapeRenderer) sr).begin(ShapeType.Filled);
				((ShapeRenderer) sr).setColor(1, 1, 1, 1);
				((ShapeRenderer) sr).rect(X, Y, 50, 50);		
				((ShapeRenderer) sr).end();
				
				X+= 60;
			}
		Y += 60;
		}
		
	}

}