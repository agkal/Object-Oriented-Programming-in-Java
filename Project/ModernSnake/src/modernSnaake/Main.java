package modernSnaake;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JRootPane;
import javax.swing.border.Border;

public class Main {

	public static void main(String[] args){
		
		JFrame frame = new JFrame("Snake Game");
		ModernSnake runSnake = new ModernSnake();
		
		
		frame.setBounds(201,15,910,700);
		frame.setBackground(Color.darkGray);

		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		
		
		frame.add(runSnake);
		}
}