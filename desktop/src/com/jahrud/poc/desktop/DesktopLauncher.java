package com.jahrud.poc.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.jahrud.poc.POCEngine;

public class DesktopLauncher {

	private static double scale = 0.75;

	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.title = POCEngine.title + " - " + POCEngine.version;
		config.useGL30 = false;
		config.width = (int)(1920 * scale);
		config.height = (int)(1080 * scale);
		config.fullscreen = false;

		new LwjglApplication(new POCEngine(), config);
	}
}
