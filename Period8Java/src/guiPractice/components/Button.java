package guiPractice.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Button extends TextLabel {

	private Color color;
	private Action action;
	
	public Button(int x, int y, int w, int h, String text, Color color, Action action) {
		super(x, y, w, h, text);
		this.color = color;
		this.action = action;
		update();
	}
	
	public void update(Graphics2D g) {
		g = clear();
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(color);
		int arcWidth  = 30;
		int arcHeight = 30;
		g.drawRoundRect(0, 0, getWidth(), getHeight(), arcWidth, arcHeight);
		g.fillRoundRect(0, 0, getWidth(), getHeight(), arcWidth, arcHeight);
		if(getText() != null){
			g.setColor(Color.white);
			g.setFont(new Font(getFont(), Font.PLAIN, getSize()));
			g.drawString(getText(), 4, getHeight()-5);
		}
	}

}
