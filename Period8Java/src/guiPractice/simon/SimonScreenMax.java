package guiPractice.simon;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import guiPractice.components.Action;
import guiPractice.components.Button;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;
import guiPractice.userInterfaces.ClickableScreen;

public class SimonScreenMax extends ClickableScreen implements Runnable {

	public TextLabel txtlbl;
	public ButtonInterfaceMax[] btnIntArr;
	public ProgressInterfaceMax progInt;
	public ArrayList<MoveInterfaceMax> mvInts;
	public int roundNumber;
	public boolean takingUserInput;
	
	public int sequenceIndex;
	public int lastSelectedButton;
	
	public SimonScreenMax(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
		Thread app = new Thread(this);
		app.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		addButtons();
		progress = getProgress();
		txtlbl = new TextLabel(130,230,300,40,"Let's play Simon!");
		sequence = new ArrayList<MoveInterfaceMax>();
		//add 2 moves to start
		lastSelectedButton = -1;
		sequence.add(randomMove());
		sequence.add(randomMove());
		roundNumber = 0;
		viewObjects.add(progress);
		viewObjects.add(txtlbl);

	}

	private void addButtons() {
		int numButtons = 5;
		btnIntArr = new ButtonInterfaceMax[numButtons];
		for (int i = 0; i < btnIntArr.length; i++) {
			btnIntArr[i] = getAButton();
			
		}
	}

}
