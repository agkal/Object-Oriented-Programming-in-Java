package modernSnaake;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;


public class ModernSnake extends JPanel implements KeyListener, ActionListener {

	private ImageIcon titleImg;
	private JLabel label;

	private int SnakeSize =2;
	
	private int highest = 0;
	private int score = 0;
	private int tempscore;
	private int[] snakeSizeX = new int[750];
	private int[] SnakeSizeY = new int[750];
	
	
	private boolean moveLeft = false;
	private boolean moveRight = false;
	private boolean moveUp = false;
	private boolean moveDown = false;
	
	private Timer timer;
	private int delay = 40;
	
	private ImageIcon rightSide;
	private ImageIcon leftSide;
	private ImageIcon upperSide;
	private ImageIcon downSide;
	
	private ImageIcon food;
	private ImageIcon food1;
	private ImageIcon food2;
	private ImageIcon bgImage;
	private ImageIcon snakeimage;
	private ImageIcon Length_Snake;
	private ImageIcon foodImg;
	private ImageIcon snake;
	
	private int turns =0;
	
	
	private int foodXpos[]={ 25,50,75,100,125,150,175,200,225,250,275,300,
			325,350,375,400,425,450,475,400,425,450,475,400,
			425,450,475,500,525,550,575,600,625,650,675,700,725,750,775,700,725,750,775,800,825,850
	}; 

	private int foodYpos[]={75,100,125,150,175,200,225,250,275,300,
			325,350,375,400,425,450,475,400,425,450,475,400,
			425,450,475,500,525,550,575,600,625
	};
	
	private Random random = new Random();
	
	private int X_cor = random.nextInt(34);
	
	private int Y_cor = random.nextInt(23);
	
	private int X_cor1 = random.nextInt(34);
	
	private int Y_cor1 = random.nextInt(23);
	
	private int X_cor2 = random.nextInt(34);
	
	private int Y_cor2 = random.nextInt(23);
	
	public ModernSnake(){
		
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		
		timer = new Timer(delay, this);
		timer.start();
		
		
	}
	
	public void paint1(Graphics g){
		
		g.setColor(Color.white);
		
		g.draw3DRect(24, 10, 851,55,true);
		//draw title image
		titleImg = new ImageIcon("snaketitle_new.jpg");
		titleImg.paintIcon(this, g, 25, 11);
		

		
		//draw big rectangle for snake movement
		g.drawRect(25, 74, 852, 576);
		
	}
	public void paint(Graphics g){

		tempscore = score;
		
		if(tempscore>highest)
			highest = score;
		
		if(turns ==0){
			
			snakeSizeX[3]=275;
			snakeSizeX[2]=300;
			snakeSizeX[1]=325;
			snakeSizeX[0]=350;
			
			SnakeSizeY[3]=300;
			SnakeSizeY[2]=300;
			SnakeSizeY[1]=300;
			SnakeSizeY[0]=300;
			
			
		}


		paint1(g);
	
		
		//score
		g.setColor(Color.white);
		g.setFont(new Font("arial", Font.PLAIN,14));
		g.drawString("Score: "+score, 780, 30);
		//length of snake
		g.drawString("Length: "+SnakeSize, 50, 40);
		g.setFont(new Font("arial", Font.BOLD,14));
		g.drawString("Highest: "+highest, 780, 50);


		//resizing the background image
		ImageIcon imageIcon = new ImageIcon("bgImage2.jpg"); // load the image to a imageIcon
		Image image = imageIcon.getImage(); // transform it 
		Image newimg = image.getScaledInstance(850, 574,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		imageIcon = new ImageIcon(newimg);  // transform it back
		imageIcon.paintIcon(this, g, 27, 75);
		
		titleImg.setDescription("this is the title image");
		
		rightSide = new ImageIcon("rightSn.png");
		rightSide.paintIcon(this, g, snakeSizeX[0], SnakeSizeY[0]);
		
		for(int a=0;a<SnakeSize;a++){
			
			if(a==0 && moveRight){
				
			rightSide = new ImageIcon("rightSn.png");
			rightSide.paintIcon(this, g, snakeSizeX[a], SnakeSizeY[a]);
			
			}
			
			if(a==0 && moveLeft){
				
				leftSide = new ImageIcon("leftSn.png");
				leftSide.paintIcon(this, g, snakeSizeX[a], SnakeSizeY[a]);
				
				}
			
			if(a==0 && moveUp){
				
				upperSide = new ImageIcon("upSn.png");
				upperSide.paintIcon(this, g, snakeSizeX[a], SnakeSizeY[a]);
				
				}
			if(a==0 && moveDown){
				
				downSide = new ImageIcon("downSn.png");
				downSide.paintIcon(this, g, snakeSizeX[a], SnakeSizeY[a]);
				
				}
			
			if(a!=0){
				
				snakeimage = new ImageIcon("new.png");
				snakeimage.paintIcon(this, g, snakeSizeX[a], SnakeSizeY[a]);				
			}	
		}		
		//rectangle on center
		g.setColor(Color.getHSBColor(1.5f, 1.8f, 1.89f));
		g.fill3DRect(600,475 , 35, 25, true);
	
		g.setColor(Color.getHSBColor(195f, 0.8f, 1.09f));
		g.fill3DRect(600,375 , 35, 25, true);
			
		food = new ImageIcon("enemy.png");
		
		food1 =  new ImageIcon("food.png");
		food2 = new ImageIcon("food3.png");
		//displaying the bonus food
		if(SnakeSize%5==0){
		//food1 =  new ImageIcon("food.png");
		delay = 50;
		}


		
		
		//condition of collision of food and head
		if(foodXpos[X_cor]== snakeSizeX[0] && foodYpos[Y_cor]== SnakeSizeY[0])
		{
			score = score+10;
			SnakeSize++;
			X_cor = random.nextInt(34);
			Y_cor = random.nextInt(23);
			
			
		}
		//condition of collision for bonus
		if(foodXpos[X_cor1]== snakeSizeX[0] && foodYpos[Y_cor1]== SnakeSizeY[0])
		{
			score+= 50;
			SnakeSize++;
			X_cor1 = random.nextInt(34);
			Y_cor1 = random.nextInt(23);
			
			
		}
		
		//condition of collision 2nd food
		if(foodXpos[X_cor2]== snakeSizeX[0] && foodYpos[Y_cor2]== SnakeSizeY[0])
		{
			score+= 5;
			SnakeSize++;
			X_cor2 = random.nextInt(34);
			Y_cor2 = random.nextInt(23);
			
			
		}
		
		food2.paintIcon(this,g, foodXpos[X_cor2], foodYpos[Y_cor2]);
		
		if(SnakeSize>=20){
			food.paintIcon(this,g, foodXpos[X_cor], foodYpos[Y_cor]);
		}
		if(SnakeSize%5 ==0){
			//write here
			food1.paintIcon(this,g, foodXpos[X_cor1], foodYpos[Y_cor1]);
			
		}
		
		if(snakeSizeX[0]==600  && 475==SnakeSizeY[0] || snakeSizeX[0]==600  && 475==SnakeSizeY[0]){
			
			moveLeft =false;
			moveRight =false;
			moveUp = false;
			moveDown = false;
			
			Enddisplay(g);
			SnakeSize =2;
			score =0;
			
		}
			
if(snakeSizeX[0]==600  && 375==SnakeSizeY[0] || snakeSizeX[0]==600  && 375==SnakeSizeY[0]){
			
			moveLeft =false;
			moveRight =false;
			moveUp = false;
			moveDown = false;
			
			Enddisplay(g);
			SnakeSize =2;
			score =0;
			
		}
			
		for(int b=1;b<SnakeSize;b++){
			
		if(snakeSizeX[b]==snakeSizeX[0] && SnakeSizeY[b]==SnakeSizeY[0]){
			
			moveLeft =false;
			moveRight =false;
			moveUp = false;
			moveDown = false;
			Enddisplay(g);
			score=0;
			SnakeSize =2;			
		}	
			
		}
		g.dispose();
		
	}
	
	public void Enddisplay(Graphics g){
		paint1(g);
		
		g.setColor(Color.white);
		g.setFont(new Font("arial black", Font.BOLD,20));
		if(score==highest){
			
			g.drawString("congrats you have highest score..!! ", 220, 250);
		}
		g.setFont(new Font("arial", Font.BOLD,30));
		g.drawString("End Game! ", 250, 350);
		g.drawString("You Made: "+score, 300, 300);
		
		g.drawString("Press enter to restart ", 300, 400);
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		//enter for restart	
		if(e.getKeyCode() == KeyEvent.VK_ENTER){
			turns =0;
			
			score = 0;
			SnakeSize = 2;
			repaint();
			
		}		
		//moveRight key movement
		if((e.getKeyCode() == KeyEvent.VK_RIGHT) || (e.getKeyCode() == KeyEvent.VK_D)){
			turns++;
		
			 moveRight = true;
			 if(!moveLeft){
				 moveRight = true; 
				 
			 }
			 else{
				 moveRight =  false;
				 moveLeft = true;
			 }
			 
			 moveUp = false;
			 moveDown = false;
			
		}		
		//moveLeft key movement
		if((e.getKeyCode() == KeyEvent.VK_LEFT) || (e.getKeyCode() == KeyEvent.VK_A)){
			turns++;
		
			 moveLeft = true;
			 if(!moveRight){
				 moveLeft = true; 
				 
			 }
			 else{
				 moveRight =  true;
				 moveLeft = false;
			 }
			 
			 moveUp = false;
			 moveDown = false;
			
		}		
		//moveUp key movement
		if((e.getKeyCode() == KeyEvent.VK_UP) || (e.getKeyCode() == KeyEvent.VK_W)){
			turns++;
		
			 moveUp = true;
			 if(!moveDown){
				 moveUp = true; 
				 
			 }
			 else{
				 moveUp =  false;
				 moveDown = true;
			 }
			 
			 moveLeft = false;
			 moveRight  = false;
			
		}		
		//moveDown key movement
		if((e.getKeyCode() == KeyEvent.VK_DOWN) || (e.getKeyCode() == KeyEvent.VK_Z)){
			turns++;
		
			 moveDown = true;
			 if(!moveUp){
				 moveDown = true; 
				 
			 }
			 else{
				 moveDown =  false;
				 moveUp = true;
			 }
			 
			 moveLeft = false;
			 moveRight = false;
			
		}
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent E) {
		// TODO Auto-generated method stub
		timer.start();
		
		if(moveRight){
			
			for(int p = SnakeSize-1;p>=0;p--){
				
				//shifting the position of snake Y length
				SnakeSizeY[p+1] = SnakeSizeY[p];	
				
			}
			
	for(int p = SnakeSize;p>=0;p--)
	{
			//shifting the position of snake X length
				
		if(p==0){
		snakeSizeX[p] = snakeSizeX[p] +25;
		}	
		else{
			snakeSizeX[p] = snakeSizeX[p-1];
			
		}
		
		if(snakeSizeX[p] > 860){
			snakeSizeX[p] = 25;
		}
			
	}//end for loop
	repaint();	
	
		}// end moveRight
		if(moveLeft){
			
			for(int vari = SnakeSize-1;vari>=0;vari--){
				
				//shifting the position of snake Y length
				SnakeSizeY[vari+1] = SnakeSizeY[vari];	
				
			}
			
	for(int vari = SnakeSize;vari>=0;vari--)
	{
			//shifting the position of snake Y length
				
		if(vari==0){
		snakeSizeX[vari] = snakeSizeX[vari] -25;
		}	
		else{
			snakeSizeX[vari] = snakeSizeX[vari-1];
			
		}
		
		if(snakeSizeX[vari] < 25){
			snakeSizeX[vari] = 850;
		}
			
	}//end for loop
	repaint();	
	
		}//end moveLeft

		if(moveUp){
	for(int vari = SnakeSize-1;vari>=0;vari--){
				
				//shifting the position of snake X length
				snakeSizeX[vari+1] = snakeSizeX[vari];	
				
			}
			
	for(int vari = SnakeSize;vari>=0;vari--)
	{
			//shifting the position of snake Y length
				
		if(vari==0){
		SnakeSizeY[vari] = SnakeSizeY[vari] -25;
		}	
		else{
			SnakeSizeY[vari] = SnakeSizeY[vari-1];
			
		}
		
		if(SnakeSizeY[vari] < 75){
			SnakeSizeY[vari] = 625;
		}
			
	}//end for loop
	repaint();	
	
			
		}

		if(moveDown){
	for(int vari = SnakeSize-1;vari>=0;vari--){
				
				//shifting the position of snake X length
				snakeSizeX[vari+1] = snakeSizeX[vari];	
				
			}
			
	for(int vari = SnakeSize;vari>=0;vari--)
	{
			//shifting the position of snake Y length
				
		if(vari==0){
		SnakeSizeY[vari] = SnakeSizeY[vari] +25;
		}	
		else{
			SnakeSizeY[vari] = SnakeSizeY[vari-1];
					}		
		if(SnakeSizeY[vari] > 625){
			SnakeSizeY[vari] = 75;
		}
	}//end for loop
	repaint();		
		}
		
	}// end action perfrmed
		} //end class	