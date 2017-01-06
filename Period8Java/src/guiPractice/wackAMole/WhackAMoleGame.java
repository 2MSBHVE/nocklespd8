package guiPractice.wackAMole;

import guiPractice.GUIApplication;

public class WhackAMoleGame extends GUIApplication {

	public WhackAMoleGame(int width, int height) {
		super();
	}

	@Override
	public void initScreen() {
		WhackAMoleScreen wams = new WhackAMoleScreen(getWidth(), getHeight());
		setScreen(wams);
				
	}

	public static void main(String[] args) {
		WhackAMoleGame game = new WhackAMoleGame(600, 500);
		Thread app = new Thread(game);
		app.start();
	}

}
