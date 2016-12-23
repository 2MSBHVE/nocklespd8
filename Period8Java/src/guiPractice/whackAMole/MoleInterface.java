package guiPractice.whackAMole;

import guiPractice.components.Action;
import guiPractice.components.Clickable;

public interface MoleInterface extends Clickable {

	double getAppearanceTime();

	void setAppearanceTime(double d);

	void setAction(Action action);

}
