package guiPractice.sampleGames;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import guiPractice.GUIApplication;

public class MouseFollower extends GUIApplication implements MouseListener, MouseMotionListener {

	private CoordinateScreen coordScreen;
	public static MouseFollower game;
	public static Assn3Screen myScreen;
	
	public static void main (String[] args){
		game = new MouseFollower();
		Thread app = new Thread(game);
		app.start();
	}
	@Override
	protected void initScreen() {
		myScreen = new Assn3Screen(500, 500);
		coordScreen = new CoordinateScreen(getWidth(), getHeight());
//		setScreen(coordScreen);
		setScreen(myScreen);
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
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