package guiPractice;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import guiPractice.components.Visible;

public abstract class Screen {

	private int width;
	private int height;
	private ArrayList<Visible> viewObjects; 
	protected BufferedImage image;

	public Screen(int width, int height) {
		viewObjects = new ArrayList<Visible>();
		this.width = width;
		this.height = height;
		initObjects(viewObjects);
		initImage();
	}

	public abstract void initObjects(ArrayList<Visible> viewObjects);

	private void initImage() {
		image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		update();
	}

	public void update() {
		//this is where you draw stuff
		Graphics2D g = image.createGraphics();
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(Color.white);
		g.fillRect(0, 0, image.getWidth(), image.getHeight());
		g.setColor(Color.black);
		//draw all visible components
		for (Visible v: viewObjects){
			g.drawImage(v.getImage(), v.getX(), v.getY(), null);
		}
		/*g.setFont(new Font("Helvetica", Font.PLAIN, 20));
		g.drawString("Hello", 40, 80);
		g.drawOval(0, 40, 120, 80);
		g.drawRect(20, 120, 80, 110);
		g.drawLine(100, 120, 110, 200);
		
		g.setColor(Color.green);
		for(int i = 0; i < image.getWidth(); i+=4){
			int length = (int) (8 + Math.random()*5);
			g.drawLine(i, 230, i, 238);
		}*/
	}
	
	public BufferedImage getImage(){
		return image;
	}

	public MouseListener getMouseListener() {
		// TODO Auto-generated method stub
		return null;
	}

	public MouseMotionListener getMouseMotionListener() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * Remove a visible from the screen
	 * @param v
	 */
	public void remove(Visible v) {
		/**
		 * ArrayList notes
		 * While this method is very simple, do not underestimate
		 * the trickiness of removing items in an ArrayList. 
		 * It causes indices to change:
		 * 
		 * Example: Suppose you have an ArrayList<Integer>
		 * and you want to remove all values >5
		 * THIS IS BAD:
		 * 
		 * 	for(int i = 0; i < list.size(); i++) {
		 * 		if(list.get(i) > 5){
		 * 			list.remove(i);
		 * 		}
		 * 	}
		 * 
		 * suppose you have (4, 5, 6, 7)
		 * The first integer to be removed is 6, at index 2
		 * since it gets removed, 7 moves from index 3 to 2.
		 * the list is now different.
		 * Also, where the for loop believes 7 is is now out of bounds
		 * 
		 * TO CORRECT THIS: decrease i when removing an item 
		 * to compensate for the change:
		 * 	for(int i = 0; i < list.size(); i++) {
		 * 		if(list.get(i) > 5){
		 * 			list.remove(i);
		 * 			i--;
		 * 		}
		 * 	}
		 */
		
		viewObjects.remove(v);
		
		/**
		 * this removes the object that has the same
		 * identity as v, not an object equal to v
		 * */
	}
	
	public void moveToFront(Visible v) {
		if (viewObjects.contains(v)) {
			viewObjects.remove(v);
			viewObjects.add(v);
		}
	}
	
	public void moveToBack(Visible v) {
		if (viewObjects.contains(v)) {
			viewObjects.remove(v);
			viewObjects.add(0, v);
//			moves all objects with index => 0 into the what the fuck am i even typing just so Illham can get a good photo of me come on illham dont fail me now im just typeing in order to appear still so that illham can take the photo ILLHAM TAKE THE DAMN PHOTO SO I CAN COPY NOCKLES CODE DAMMIT ILLHAM lmao i say that a lot but seriously illham take the photo already just take the photo i am holding still for the pphoto and not moving my head like a crazed jackrabbit fuck fuc fuck fuck fuck fcufk fuck fuck fuck fcukf ufuck fuck fuck fuck fuck fuck fillham take the photo already i want to copy the code GDI ILLHAM TAKE THE PHOTO YOURE JUST STANDING THERE JUST LEARN TO USE YOUR CAMERA AND TAHE THE FUCKING PHOTO DMAIIT FUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUCK
//			moves all obkect into ut in the end, the story is always the same. just a small townn boy trying to get aheadj int sdkfjed  sfja jcthe world and succeeding in posing for photos as though he was actually worjing on computer science in nockles classILLHAM TAKE THE PHOTO FOR FUCKS SAKE ILLHAM YOU ARE SO LUCKY i already knew how to do this. otherwise i would be moving my head around so much that it would pain you to see the blur in the photos 
		}
	}


}