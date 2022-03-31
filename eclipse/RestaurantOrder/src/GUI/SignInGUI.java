package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.*;

import javax.swing.*;

//import GUI.LoginGUI.ButtonListener;

public class SignInGUI extends JPanel {
	
	protected JPanel headerPanel, panel1, panel2;
	protected JLabel headerJL, unJL, pwJL;
	protected JButton loginHeader, home, cart,login, register;
	protected JTextField unTF, pwTF;
	protected String username, password;
	
	public SignInGUI() {
		
		Color gray = new Color(222, 222,  222);
		
		headerPanel = new JPanel();
		headerPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		headerPanel.setLayout(new GridLayout(1, 4));
		headerPanel.setBackground(Color.LIGHT_GRAY);
		
		panel1 = new JPanel();
		panel1.setBorder(BorderFactory.createEmptyBorder(20, 220, 25, 220));
		panel1.setLayout(new GridLayout(5, 1, 10, 10));	
		panel1.setBackground(gray);
		
		panel2 = new JPanel();
		panel2.setBorder(BorderFactory.createEmptyBorder(25, 200, 70, 200));
		panel2.setLayout(new GridLayout(1, 2, 10, 10));	
		panel2.setBackground(gray);
		
		//-------------------------------------
		// JLabel
		//-------------------------------------
		headerJL = new JLabel("Sign In", SwingConstants.CENTER);
		headerJL.setForeground(Color.BLACK);
		headerJL.setFont(new Font(Font.SERIF, Font.BOLD, 30));
		
		unJL = new JLabel("Username", SwingConstants.CENTER);
		unJL.setForeground(Color.BLACK);
		unJL.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
		
		pwJL = new JLabel("Password", SwingConstants.CENTER);
		pwJL.setForeground(Color.BLACK);
		pwJL.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
		
		//-------------------------------------
		// new JTextFields
		//-------------------------------------
		//add focus listener?
		unTF = new JTextField(SwingConstants.CENTER);
		unTF.setForeground(Color.GRAY);
		unTF.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
		unTF.addActionListener(new TextFieldListener());
		
		pwTF = new JTextField(SwingConstants.CENTER);
		pwTF.setForeground(Color.GRAY);
		pwTF.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
		pwTF.addActionListener(new TextFieldListener());
		
		//-------------------------------------
		// JButton
		//-------------------------------------
		home = new JButton("Home");
		home.setBorderPainted(true);
		home.setPreferredSize(new Dimension(40, 40));
		home.addActionListener(new ButtonListener());
				
		loginHeader = new JButton("Sign In/Register");
		loginHeader .setBorderPainted(true);
		loginHeader .setPreferredSize(new Dimension(40, 40));
		loginHeader.addActionListener(new ButtonListener());
		
		cart = new JButton("Place Order");
		cart.setBorderPainted(true);
		cart.setPreferredSize(new Dimension(40, 40));
		cart.addActionListener(new ButtonListener());
		
		login = new JButton("Login");
		login.setBorderPainted(true);
		login.setPreferredSize(new Dimension(50, 50));
		login.addActionListener(new ButtonListener());
		
		register = new JButton("Register");
		register.setBorderPainted(true);
		register.setPreferredSize(new Dimension(50, 50));
	//	register.addActionListener(new ButtonListener());
		
		//-------------------------------------
		// add to panels				
		//-------------------------------------
		headerPanel.add(home);
		headerPanel.add(loginHeader);
		headerPanel.add(cart);
		
		panel1.add(headerJL);
		panel1.add(unJL);
		panel1.add(unTF);
		panel1.add(pwJL);
		panel1.add(pwTF);
		
		panel2.add(login);
		panel2.add(register);
		
		//-------------------------------------
		// add layout, and panels to frame
		//-------------------------------------

		setLayout(new BorderLayout());
		add(headerPanel, "North");
		add(panel1, "Center");
		add(panel2, "South");
	}
	
	private class TextFieldListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent evt) {
			if(evt.getSource() == unTF) {
			   username = unTF.getText();
			   System.out.println(username);
			}
			else if(evt.getSource() == pwTF) {
			   password = pwTF.getText();
			   System.out.println(password);
			}
		}
	}
	
	private class ButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event) {
			if(event.getSource() == loginHeader) Main.switchView("SignInGUI");
			if(event.getSource() == cart) Main.switchView("CartGUI");
			if(event.getSource() == home)Main.switchView("MenuGUI");
			

		}
	}

}

