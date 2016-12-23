package guiPractice.whackAMole;

import guiPractice.components.Action;
import guiPractice.components.ClickableGraphic;
import guiPractice.components.Graphic;

public class Mole extends ClickableGraphic implements MoleInterface {

	public Mole(int x, int y, String imageLocation) {
		super(x, y, imageLocation);
		// TODO Auto-generated constructor stub
	}

	private double appearanceTime;

	

	@Override
	public boolean isHovered(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

	@Override
	public void act() {
		// TODO Auto-generated method stub

	}

	@Override
	public double getAppearanceTime() {
		// TODO Auto-generated method stub
		return appearanceTime;
	}

	@Override
	public void setAction(Action action) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setAppearanceTime(double d) {
		// TODO Auto-generated method stub
		this.appearanceTime = d;
	}

}
