package guiPractice.sampleGames;

import java.awt.Color;
import java.awt.Window;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.Action;
import guiPractice.components.Button;
import guiPractice.components.Graphic;
import guiPractice.components.TextArea;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;

public class CoordinateScreen extends Screen implements MouseMotionListener, MouseListener {

	private TextLabel label;
	private TextArea paragraph;
	private Button myButton;
	
	
	public CoordinateScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		
		label = new TextLabel(40,45,760,40,"Sample Text");
		paragraph = new TextArea(40,85,760,500,
				"This is a whole paragraph. Notice how "
				+ "as the paragraph gets to the edge"
				+ " of the page, a new line is created.");
		
		myButton = new Button(40,50,100,30,"Button",new Color(0,76,153), new Action(){
			public void act(){
				//code for action will be in here.
				MouseFollower.game.setScreen(MouseFollower.myScreen);
			}
		});
		
		
//		Graphic picture = new Graphic(50, 50, "resources/sampleImages/dude.jpg");
		Graphic picture = new Graphic(50, 50,.5, "resources/sampleImages/dude.jpg");
		viewObjects.add(picture);
		viewObjects.add(label);
		viewObjects.add(paragraph);
		viewObjects.add(myButton);
		
		
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	int buffer = 50;
	@Override
	public void mouseMoved(MouseEvent m) {
		String out = "Mouse at " + m.getX() + ", " + m.getY();
		if (m.getX() < buffer || m.getY() < buffer) {
			out = out.concat(" gettin too far to the edge boi!");
		}
		label.setText(out);
//		System.out.println(Window.WIDTH);
	}
	
	public MouseMotionListener getMouseMotionListener() {
		return this;
	}
	
	public MouseListener getMouseListener() {
		return this;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}