package guiPractice.simon;

import guiPractice.GUIApplication;


public class SimonGameMax extends GUIApplication {

	public SimonGameMax(int width, int height) {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initScreen() {
		SimonScreenMax wams = new SimonScreenMax(getWidth(), getHeight());
		setScreen(wams);
	}

	public static void main(String[] args) {
		SimonGameMax game = new SimonGameMax(600, 500);
		Thread app = new Thread(game);
		app.start();
	}

}
