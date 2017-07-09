package Lasttry;


import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class UIWindow extends JFrame
{
	String username;
	JTextArea textlog = new JTextArea(20, 40);
	JTextField commandBox = new JTextField(40);
	JButton enter = new JButton("Enter");
	JScrollPane scrollPane = new JScrollPane(textlog);
	public UIWindow(String usernameC, ActionListener aListener, WindowListener wListener)
	{
		username = usernameC;
		enter.addActionListener(aListener);
		addWindowListener(wListener);
		textlog.setEditable(false);
		setTitle("SummerTech Plays Pokemon");
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();	
		c.fill = GridBagConstraints.HORIZONTAL;

		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 2;
		panel.add(scrollPane, c);

		c.weightx = 0.8;
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 1;
		panel.add(commandBox, c);

		c.weightx = 0.1;
		c.gridx = 1;
		c.gridy = 1;
		panel.add(enter, c);
		add(panel);
		pack();
		pack();
		textlog.setLineWrap(true);
		textlog.setWrapStyleWord(true);
	}

	public String showText()
	{
		String command = commandBox.getText();		
		if(!command.equals(""))
		{
			textlog.setText(textlog.getText()+"\n"+username+": "+command);
			commandBox.setText("");
		}
		return command;
	}

	public String getUsername()
	{
		return username;
	}
	
	public void addOutsideText(String t, String username)
	{
		textlog.setText(textlog.getText()+"\n"+username+": "+t);
	}
}
