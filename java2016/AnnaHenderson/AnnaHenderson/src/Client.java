import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

public class Client implements ActionListener, Runnable, WindowListener
{
	UIWindow window = null;
	BufferedReader reader;
	PrintWriter writer;
	Socket socket;
	public static void main(String[] args) throws UnknownHostException, IOException  
	{
		new Client();
	}

	public Client() throws UnknownHostException, IOException
	{
		socket = new Socket("10.200.156.130",1528);
		reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		writer = new PrintWriter(socket.getOutputStream(), true);
		String username = JOptionPane.showInputDialog("What is your username?");
		writer.println(username);
		window = new UIWindow(username, this, this);
		(new Thread(this)).start();
	}
	public void actionPerformed(ActionEvent arg0) 
	{
		writer.println(window.showText());
	}

	@Override
	public void run() 
	{
		try 
		{	
			String line = "";
			while(line!=null&&!socket.isClosed())
			{
				try
				{
					line = reader.readLine();
					String username = reader.readLine();
					window.addOutsideText(line, username);
				}
				catch(SocketException e)
				{
					break;
				}
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		System.exit(0);
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		try {
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {

	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}
}
