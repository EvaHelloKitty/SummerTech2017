import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Snowman extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Snowman();
	}
	public Snowman(){
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300,100,600,800);
		JPanel panel= new JPanel(){
			public void paint (Graphics g){
				g.setColor(Color.WHITE);
				//top 
				g.fillOval(250, 60, 150, 150);
				//middle
				g.fillOval(225, 190, 200, 200);
				//bottom
				g.fillOval(200, 340, 250, 250);
				g.setColor(Color.BLACK);
				//g.drawLine(325, 50, 325, 700);
				//eye1
				g.fillOval(280, 110, 20, 20);
				//eye2
				g.fillOval(350, 110, 20, 20);
				//button 1
				g.fillOval(315, 280, 20, 20);
				//button 2
				g.fillOval(315, 455, 20, 20);
				g.fillRect(285, 10, 80, 60);
				g.fillOval(265, 65, 120, 20);
				g.setColor(Color.ORANGE);
				int[] xPoints ={325,325,420};
				int[] yPoints ={125,135,130};
				g.fillPolygon(xPoints, yPoints, 3);
			}
		};
		add(panel);
		
	}

}
