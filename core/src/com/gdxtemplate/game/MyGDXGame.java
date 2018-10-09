package com.gdxtemplate.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class MyGDXGame extends ApplicationAdapter {

	ShapeRenderer sr;

	@Override
	public void create() {
		sr = new ShapeRenderer();
		
		
	}
	
	@Override
	public void render() {
		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		Grid level = new Grid();
		level.init(sr, move());
		
		
		
	}

	@Override
	public void dispose() {

	}
	public char move() {
		char input = 0;
		
		if (Gdx.input.isKeyJustPressed(Keys.W)) { //Takes Key 'W' to use in render cycle
			input = 'W';

		}
		if (Gdx.input.isKeyJustPressed(Keys.A)) { //Takes Key 'A' to use in render cycle
			input = 'A';

		}
		if (Gdx.input.isKeyJustPressed(Keys.S)) { //Takes Key 'S' to use in render cycle
			input = 'S';

		}
		if (Gdx.input.isKeyJustPressed(Keys.D)) { //Takes Key 'D' to use in render cycle
			input = 'D';
		}
		
		return input;

	}

}
