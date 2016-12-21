package guiPractice.components;

public class ClickableGraphic extends Graphic implements Clickable {
	
	private Action action;
	
	public ClickableGraphic(int x, int y, String imageLocation) {
		super(x, y, imageLocation);
		// TODO Auto-generated constructor stub
	}

	public ClickableGraphic(int x, int y, double scale, String imageLocation) {
		super(x, y, scale, imageLocation);
		// TODO Auto-generated constructor stub
	}

	public ClickableGraphic(int x, int y, int w, int h, String imageLocation) {
		super(x, y, w, h, imageLocation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isHovered(int x, int y) {
		// TODO Auto-generated method stub
		return ((getX() < x) && (x < (getX() + getWidth())) &&
				(getY() < y) && (y < (getY() + getHeight())));
	}
	
	public void setAction(Action a) {
		this.action = a;
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		if (action != null) {
			action.act();
		}
	}

}
