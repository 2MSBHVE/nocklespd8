package guiPractice.whackAMole;

import java.util.ArrayList;
import java.util.List;

import guiPractice.components.Action;
import guiPractice.components.ClickableScreen;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;

public class WhackAMoleScreen extends ClickableScreen implements Runnable {

	
	private ArrayList<MoleInterface> moles;
	private PlayerInterface player;
	private TextLabel label;
	private TextLabel timeLabel;
	private double timeLeft;;

	public WhackAMoleScreen(int width, int height) {
		super(width, height);
		timeLeft = 30.0;
		Thread play = new Thread(this);
		play.start();
	}

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		moles = new ArrayList<MoleInterface>();
		player = getAPlayer();
		label = new TextLabel(((getWidth()/2) - 60), ((getHeight()/2) - 30), 120, 60, "Ready...");
		timeLabel = new TextLabel(((getWidth()/2) - 60), 50, 120, 60, "");
		viewObjects.add(label);
		viewObjects.add(player);
		viewObjects.add(timeLabel);
		
	}
	
	/**
	 *to implement later, after Character Team implements PlayerInterface
	 */
	private PlayerInterface getAPlayer() {
		return null;
	}

	/**
	 *to implement later, after EnemyTeam implements MoleInterface
	 */
	private MoleInterface getAMole() {
		return null;
	}
	
	public void changeText(String s){
		try {
			Thread.sleep(500);
			label.setText(s);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void update() {
		super.update();
	}
	
	public void run(){
		changeText("Set...");
		changeText("Go!");
		changeText("");
		timeLabel.setText(""+timeLeft);
		while (timeLeft > 0) {
//			10 FPS
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
			timeLeft -= 0.1;
			timeLabel.setText(""+(int)(timeLeft*10)/(10.0));

			/**
			 *moles have timers, disappear at 0
			 */

			
			
		}
	}
	
	public void addNewMoles(){
//		probability of mole appearing depends on time left
		
		double probability = 0.2 + (0.1 * (30.0 - timeLeft))/30;
		if (Math.random() < probability) {
			MoleInterface mole = getAMole();
			mole.setAppearanceTime((int) (500 + (Math.random() * 2000)));
			mole.setAction(new Action() {
				
				
				public void act() {
					player.increaseScore(1);
//					remove mole from viewObjects
					remove(mole);
//					remove mole from "database"
					moles.remove(mole);
				}
			});
//			add mole to visible
			addObject(mole);
//			add mole to mole list
			moles.add(mole);
			
		}
	}
	
	public void disappearMoles() {
		for (int i = 0; i < moles.size(); i++) {
			MoleInterface m = moles.get(i);
			m.setAppearanceTime(m.getAppearanceTime() - 100);
			if (m.getAppearanceTime() <= 0) {
//				remove from viewObjects
				remove(m);
//				remove it from our mole database
				moles.remove(i);
				i--;
			}
		}
	}

	

	

}
