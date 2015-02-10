import java.awt.Label;

import javax.swing.JFrame;


public class View 
{

	public View()
	{
		//Make the new GUI
		JFrame GUI = new JFrame();
		
		//Basic GUI stuff
		GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GUI.setSize(500,500);
		GUI.setVisible(true);
		
		//Title
		GUI.setTitle("Dating App");
		Label info = new Label("Put in your age...");
		GUI.add(info);
		
	}
}
