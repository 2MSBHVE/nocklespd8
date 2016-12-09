package gui.sampleGames;

import gui.*;

public class TheBlankScreenGame extends GUIApplication {

	@Override
	protected void initScreen() {
		Screen s = new BlankScreen(getWidth(), getHeight());
		setScreen(s);
	}

	public static void main(String[] args) {
		new TheBlankScreenGame();
	}

}
