package gui.sampleGames;

import gui.GUIApplication;

public class MouseFollower extends GUIApplication {

	private CoordinateScreen coordScreen;
	
	public MouseFollower() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		new MouseFollower();
	}
	
	@Override
	protected void initScreen() {
		coordScreen = new CoordinateScreen(getWidth(), getHeight());
	}

}
