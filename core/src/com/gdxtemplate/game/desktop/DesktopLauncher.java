package com.gdxtemplate.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.gdxtemplate.game.MyGDXGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Monster Game";
		config.height = 610;
		config.width = 610;
		new LwjglApplication(new MyGDXGame(), config);
	}
}