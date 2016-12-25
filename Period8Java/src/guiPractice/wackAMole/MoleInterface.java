package guiPractice.wackAMole;

import guiPractice.components.Action;
import guiPractice.components.Clickable;
import guiPractice.components.ClickableGraphic;
import guiPractice.components.Visible;

public interface MoleInterface extends Clickable {

	


	public void setAppearanceTime(double d);

	public double getAppearanceTime();
	
	public void setAction(Action a);

}
