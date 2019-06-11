
import java.awt.Color;
import java.awt.Graphics;

public class Truck 
{
	public static void main(String[] args) 
	{
		DrawingPanel panel = new DrawingPanel(500, 500);

		panel.setBackground(Color.WHITE);
		Graphics g = panel.getGraphics();

		// recall the x and y indicate the upper left
		// corner of the rectangle or oval bounding box
		// draw the body
		g.setColor(Color.BLACK);
		g.fillRect(10, 30, 100, 50); // x, y, width, ht

		// draw the wheels
		g.setColor(Color.RED);
		g.fillOval(20, 70, 20, 20);
		g.fillOval(80, 70, 20, 20);

		// draw the window
		g.setColor(Color.CYAN);
		g.fillRect(80, 40, 30, 20);
	}	
}
