//Assignment: Programming Project - Final Project
//Name: Robyn Edsitty
//Date 4 / 26 / 21
//Lecture: M W 4:30 - 5:45 pm
//Time: 92 hours
//Description: This is the Login window. The user will have to enter in their username and password and hit the login button, or if they do not have an account there is a button to create one.

package GUI;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class LoginGUI extends JPanel {
	
	protected JLabel userName, password, header;
	protected JButton create, login;
	protected JTextField uName, pWord;
	protected JFrame frame;
	protected JPanel panel, panel2, headerPanel;
	
	public LoginGUI() {
		
		JFrame frame = new JFrame("Order");
		
		//-------------------------------------
		// new JPanels
		//-------------------------------------
		headerPanel = new JPanel();
		headerPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
		headerPanel.setLayout(new GridLayout(1, 1));
		headerPanel.setBackground(Color.LIGHT_GRAY);
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
		panel.setLayout(new GridLayout(4, 1));
		panel.setBackground(Color.GRAY);
		
		panel2 = new JPanel();
		panel2.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
		panel2.setLayout(new GridLayout(0, 2));
		panel2.setBackground(Color.GRAY);
		
		
		//-------------------------------------
		// new JLabels
		//-------------------------------------
		header = new JLabel("Login", SwingConstants.CENTER);
		header.setForeground(Color.black);
		header.setFont(new Font("Time", Font.BOLD, 40));
		
		userName = new JLabel("Username: ", SwingConstants.CENTER);
		userName.setForeground(Color.black);
		userName.setFont(new Font("Time", Font.BOLD, 25));
		
		password = new JLabel("Password: ", SwingConstants.CENTER);
		password.setForeground(Color.black);
		password.setFont(new Font("Time", Font.BOLD, 25));
		
		//-------------------------------------
		// new JTextFields
		//-------------------------------------
		uName = new JTextField(SwingConstants.CENTER);
		pWord = new JTextField(SwingConstants.CENTER);
		
		
		//-------------------------------------
		// new JButtons
		//-------------------------------------
		login = new JButton("login");
		login.setBorderPainted(true);
		login.setFont(new Font("Time", Font.BOLD, 25));
		login.addActionListener(new ButtonListener());
		
		create = new JButton("create");
		create.setBorderPainted(true);
		create.setFont(new Font("Time", Font.BOLD, 25));
		create.addActionListener(new ButtonListener());
		
		
		//-------------------------------------
		// add to panels
		//-------------------------------------
		panel.add(userName);
		panel.add(uName);
		panel.add(password);
		panel.add(pWord);
		panel2.add(create);
		panel2.add(login);
		headerPanel.add(header);
		
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
	}// end LoginGUI
	
	private class ButtonListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub
			
			//-------------------------------------
			// if user pressed create button, will go to createAcountWindow
			//-------------------------------------
			if(event.getSource() == create) {
				CreateAccountGUI createAccountWindow = new CreateAccountGUI();
				CreateAccountGUI.CreateAccountGUIwindow();
			}// end if
			
			//-------------------------------------
			// if user pressed login button, will go to shopping page
			//-------------------------------------
			else if(event.getSource() == login) {
				ShoppingPageGUI ShoppingPageGUIwindow = new ShoppingPageGUI();
				ShoppingPageGUIwindow.ShoppingPageGUIwindow();
			}// end if else 
		}// end actionPreformed
	}// end ButtonListener

	public void LoginGUIwindow() {
		new LoginGUI();
	}// end LoginGUIwindow
	
}//end class LoginGUI