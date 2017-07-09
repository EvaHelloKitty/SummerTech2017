import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PrettyTriangle extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PrettyTriangle();
	}
	public PrettyTriangle(){
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300,100,700,900);
		JPanel panel= new JPanel(){
			public void paint (Graphics g){
				g.setColor(Color.MAGENTA);
				g.fillPolygon(new int[]{254,508,762}, new int[]{508,254,508}, 3);
				g.setColor(Color.WHITE);
				recursion(g, new int[]{254,508,762}, new int[]{508,254,508});
			}
		};
		add(panel);
	}
	public void recursion (Graphics g, int[]xCoordinates, int[]yCoordinates){
		if(Math.abs(xCoordinates[0]-xCoordinates[1])<6){
			return;
		}
		g.fillPolygon(new int[]{(xCoordinates[0]+xCoordinates[1])/2, (xCoordinates[1]+xCoordinates[2])/2, (xCoordinates[2]+xCoordinates[0])/2}, new int[]{(yCoordinates[0]+yCoordinates[1])/2, (yCoordinates[1]+yCoordinates[2])/2, (yCoordinates[2]+yCoordinates[0])/2}, 3);
		/*Color c = new Color((int)(Math.random()*256.0),(int)(Math.random()*256.0),(int)(Math.random()*256.0));
		System.out.println(c.getBlue());
		g.setColor(c);*/
		recursion(g,(new int[]{xCoordinates[0],(xCoordinates[0]+xCoordinates[1])/2, (xCoordinates[2]+xCoordinates[0])/2}), new int[]{yCoordinates[0],(yCoordinates[0]+yCoordinates[1])/2, (yCoordinates[2]+yCoordinates[0])/2});
		recursion(g,(new int[]{xCoordinates[1],(xCoordinates[0]+xCoordinates[1])/2, (xCoordinates[2]+xCoordinates[1])/2}), new int[]{yCoordinates[1],(yCoordinates[0]+yCoordinates[1])/2, (yCoordinates[2]+yCoordinates[1])/2});
		recursion(g,(new int[]{xCoordinates[2],(xCoordinates[2]+xCoordinates[1])/2, (xCoordinates[2]+xCoordinates[0])/2}), new int[]{yCoordinates[2],(yCoordinates[2]+yCoordinates[1])/2, (yCoordinates[2]+yCoordinates[0])/2});
	}

}