//Assignment: Programming Project - Final Project
//Name: Robyn Edsitty
//Date 4 / 26 / 21
//Lecture: M W 4:30 - 5:45 pm
//Time: 92 hours
//Description: This is the completed order window. This will display the successfully completed order statement, and a review of every thing in their order. The user can now logout. 

package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class CompletedOrderGUI extends JPanel {

	protected JLabel header, completedOrderStatement;
	protected JButton logoutB;
	protected JFrame frame;
	protected JPanel panel, panel2, headerPanel;
	protected JTextField searchTF;
	protected JTextArea confirmationTA;
	protected String confirmationStr;
	
	public CompletedOrderGUI() {
		
		JFrame frame = new JFrame("Completed Order");
		
		//-------------------------------------
		// new JPanels
		//-------------------------------------
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
		panel.setLayout(new GridLayout(2, 1));
		panel.setBackground(Color.GRAY);
		
		panel2 = new JPanel();
		panel2.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
		panel2.setLayout(new GridLayout(1, 1));
		panel2.setBackground(Color.GRAY);
		
		headerPanel = new JPanel();
		headerPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
		headerPanel.setLayout(new GridLayout(1, 1));
		headerPanel.setBackground(Color.LIGHT_GRAY);
		
		//-------------------------------------
		// new JLabels
		//-------------------------------------
		header = new JLabel("Completed Order", SwingConstants.CENTER);
		header.setForeground(Color.black);
		header.setFont(new Font("Time", Font.BOLD, 40));
		
		confirmationStr = "Your order for " + "___" + " items ($" + "___" + ") was completed successfully.";
		completedOrderStatement = new JLabel(confirmationStr);
		completedOrderStatement.setForeground(Color.black);
		completedOrderStatement.setFont(new Font("Time", Font.BOLD, 20));
		
		//-------------------------------------
		// new JButtons
		//-------------------------------------
		logoutB = new JButton("Logout");
		logoutB.setBackground(Color.LIGHT_GRAY);
		logoutB.setBorderPainted(true);
		logoutB.setFont(new Font("Time", Font.BOLD, 25));
		logoutB.addActionListener(new ButtonListener());
		
		//-------------------------------------
		// new JTextArea
		//-------------------------------------
		confirmationTA = new JTextArea(20,20);
		confirmationTA.setEditable(false);
		confirmationTA.setBackground(Color.LIGHT_GRAY);
		confirmationTA.setFont(new Font("Time", Font.BOLD, 20));
		
		//-------------------------------------
		// add to panels
		//-------------------------------------
		headerPanel.add(header);
		panel.add(completedOrderStatement);
		panel2.add(logoutB);
		panel.add(confirmationTA);
		
		//-------------------------------------
		// add layout, and panels to frame
		//-------------------------------------
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(1000, 600));
		frame.add(headerPanel, "North");
		frame.add(panel, "Center");
		frame.add(panel2, "South");
		frame.pack();
		frame.setVisible(true);
	}// end CompletedOrderGUI()
	
	private class ButtonListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub
			
			//-------------------------------------
			// if user pressed logout, will go back to the login Window
			//-------------------------------------
			if(event.getSource() == logoutB) {
				LoginGUI LoginGUIWindow = new LoginGUI();
				LoginGUIWindow.LoginGUIwindow();
			}// end if
		}// end actionPerformed
	}// end ButtonListener
	
	public static void CompletedOrderGUIwindow() {
		new CompletedOrderGUI();
	}// end CompletedOrderGUIwindow
}// CompletedOrderGUI
