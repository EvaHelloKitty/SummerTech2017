package Lasttry;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class graphicsPractice extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new graphicsPractice();
	}
	public graphicsPractice(){
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		JPanel panel=new JPanel(){
			public void paint(Graphics g){
				g.setColor(Color.CYAN);
				g.fillRect(100, 100, 300, 300);
				
			}
		};
		add(panel);
	}

}
