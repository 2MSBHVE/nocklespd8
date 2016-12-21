package guiPractice.sampleGames;

import guiPractice.GUIApplication;

public class ClickGraphicsGame extends GUIApplication{

	public static GraphicsClickScreen clickScreen;
	public static ClickGraphicsGame game;
	
	
	public static void main(String[] args) {
		game = new ClickGraphicsGame();
		Thread app = new Thread(game);
		app.start();
	}

	@Override
	protected void initScreen() {
		clickScreen = new GraphicsClickScreen(getWidth(), getHeight());
		setScreen(clickScreen);
	}
}
