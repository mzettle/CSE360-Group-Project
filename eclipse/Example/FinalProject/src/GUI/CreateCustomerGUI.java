//Assignment: Programming Project - Final Project
//Name: Robyn Edsitty
//Date 4 / 26 / 21
//Lecture: M W 4:30 - 5:45 pm
//Time: 92 hours
//Description: This is the create customer window. This will have the user enter in their username, password, first name, last name, email, and address. They have the option to press create, or back.

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
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CreateCustomerGUI extends JPanel  {
	
	protected static JLabel userName, password, header, fname, lname, email, address;
	protected static JButton back, create;
	protected static JTextField uName, pWord, fnameTF,lnameTF, emailTF, addressTF;
	protected static JFrame frame;
	protected static JPanel panel, panel2, headerPanel;
	
	public static void CreateCustomerGUI() {
		JFrame frame = new JFrame("Create Customer");
		
		//-------------------------------------
		// new JPanels
		//-------------------------------------
		headerPanel = new JPanel();
		headerPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
		headerPanel.setLayout(new GridLayout(1, 1));
		headerPanel.setBackground(Color.LIGHT_GRAY);
	
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
		panel.setLayout(new GridLayout(6, 2));
		panel.setBackground(Color.GRAY);
		
		panel2 = new JPanel();
		panel2.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
		panel2.setLayout(new GridLayout(1, 2));
		panel2.setBackground(Color.GRAY);
		
		//-------------------------------------
		// new JLabelss
		//-------------------------------------
		header = new JLabel("Create Customer", SwingConstants.CENTER);
		header.setForeground(Color.black);
		header.setFont(new Font("Time", Font.BOLD, 40));
		
		userName = new JLabel("Username: ", SwingConstants.CENTER);
		userName.setForeground(Color.black);
		userName.setFont(new Font("Time", Font.BOLD, 25));
		
		password = new JLabel("Password: ", SwingConstants.CENTER);
		password.setForeground(Color.black);
		password.setFont(new Font("Time", Font.BOLD, 25));
		
		fname = new JLabel("First Name: ", SwingConstants.CENTER);
		fname.setForeground(Color.black);
		fname.setFont(new Font("Time", Font.BOLD, 25));
		
		lname = new JLabel("Last Name: ", SwingConstants.CENTER);
		lname.setForeground(Color.black);
		lname.setFont(new Font("Time", Font.BOLD, 25));
		
		email = new JLabel("Email: ", SwingConstants.CENTER);
		email.setForeground(Color.black);
		email.setFont(new Font("Time", Font.BOLD, 25));
		
		address = new JLabel("Address: ", SwingConstants.CENTER);
		address.setForeground(Color.black);
		address.setFont(new Font("Time", Font.BOLD, 25));
		
		//-------------------------------------
		// new JButtonss
		//-------------------------------------
		back = new JButton("Back");
		back.setBackground(Color.LIGHT_GRAY);
		back.setBorderPainted(true);
		back.setFont(new Font("Time", Font.BOLD, 25));
		back.addActionListener(new ButtonListener());
		
		create = new JButton("Create");
		create.setBackground(Color.LIGHT_GRAY);
		create.setBorderPainted(true);
		create.setFont(new Font("Time", Font.BOLD, 25));
		create.addActionListener(new ButtonListener());
		
		//-------------------------------------
		// new TextFields
		//-------------------------------------
		uName = new JTextField(SwingConstants.CENTER);
		pWord = new JTextField(SwingConstants.CENTER);
		fnameTF = new JTextField(SwingConstants.CENTER);
		lnameTF = new JTextField(SwingConstants.CENTER);
		emailTF = new JTextField(SwingConstants.CENTER);
		addressTF = new JTextField(SwingConstants.CENTER);
		
		//-------------------------------------
		// add to panels
		//-------------------------------------
		panel.add(userName);
		panel.add(uName);
		panel.add(password);
		panel.add(pWord);
		panel.add(fname);
		panel.add(fnameTF);
		panel.add(lname);
		panel.add(lnameTF);
		panel.add(email);
		panel.add(emailTF);
		panel.add(address);
		panel.add(addressTF);
		headerPanel.add(header);
		panel2.add(back);
		panel2.add(create);
		
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
	}// end CreateCustomerGUI()

	public static class ButtonListener implements ActionListener {
	
		@Override
		public void actionPerformed(ActionEvent e) {
			
			//-------------------------------------
			// if user pressed back, will go back to the create account Window
			//-------------------------------------
			if(e.getSource() == back) {
				CreateAccountGUI CreateAccountGUIWindow = new CreateAccountGUI();
				CreateAccountGUIWindow.CreateAccountGUIwindow();
			}// end if
			
			//-------------------------------------
			// if user pressed create, will go to shopping Window
			//-------------------------------------
			else if(e.getSource() == create) {
				ShoppingPageGUI ShoppingPageGUIwindow = new ShoppingPageGUI();
				ShoppingPageGUIwindow.ShoppingPageGUIwindow();
			}// end else
		}// end actionPerformed(ActionEvent e)
	}//end class uttonListener
} // end class createCustomerGUI 
