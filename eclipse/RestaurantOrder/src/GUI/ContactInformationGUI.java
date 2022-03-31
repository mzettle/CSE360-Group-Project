package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;

public class ContactInformationGUI extends JPanel {

	protected JFrame frame = new JFrame("Your Account");
	
	protected JPanel headerPanel, panel1, panel2;
	protected JLabel headerJL, fnameJL, lnameJL, phoneJL, emailJL;
	protected JButton loginHeader, home, cart, updateJB, backJB;
	protected JTextField fnameTF, lnameTF, phoneTF, emailTF;
	
	public ContactInformationGUI() {
		
		Color  gray   = new Color(222, 222,  222);
		
		headerPanel = new JPanel();
		headerPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		headerPanel.setLayout(new GridLayout(1, 4));
		headerPanel.setBackground(Color.LIGHT_GRAY);
		
		panel1 = new JPanel();
		panel1.setBorder(BorderFactory.createEmptyBorder(60, 220, 60, 260));
		panel1.setLayout(new GridLayout(4, 2, 40, 40));
		panel1.setBackground(gray);
		
		panel2 = new JPanel();
		panel2.setBorder(BorderFactory.createEmptyBorder(20, 220, 20, 220));
		panel2.setLayout(new GridLayout(1, 2, 10, 10));	
		panel2.setBackground(gray);
		
		//-------------------------------------
		// JLabel
		//-------------------------------------
		headerJL = new JLabel("Account Information", SwingConstants.CENTER);
		headerJL.setForeground(Color.BLACK);
		headerJL.setFont(new Font(Font.SERIF, Font.BOLD, 30));
		headerJL.setPreferredSize(new Dimension(5,5));
		
		fnameJL = new JLabel("First Name", SwingConstants.CENTER);
		fnameJL.setForeground(Color.BLACK);
		fnameJL.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
		
		lnameJL = new JLabel("Last Name", SwingConstants.CENTER);
		lnameJL.setForeground(Color.BLACK);
		lnameJL.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
		
		phoneJL = new JLabel("Phone Number", SwingConstants.CENTER);
		phoneJL.setForeground(Color.BLACK);
		phoneJL.setFont(new Font(Font.SERIF, Font.PLAIN, 20));

		emailJL = new JLabel("Email", SwingConstants.CENTER);
		emailJL.setForeground(Color.BLACK);
		emailJL.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
		
		//-------------------------------------
		// new JTextFields
		//-------------------------------------
		//add focus listener?
		fnameTF = new JTextField(SwingConstants.CENTER);
		fnameTF.setForeground(Color.GRAY);
		fnameTF.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
		//fnameTF.addActionListener(new TextFieldListener());
		
		lnameTF = new JTextField(SwingConstants.CENTER);
		lnameTF.setForeground(Color.GRAY);
		lnameTF.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
		//lnameTF.addActionListener(new TextFieldListener());
		
		phoneTF = new JTextField(SwingConstants.CENTER);
		phoneTF.setForeground(Color.GRAY);
		phoneTF.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
		//phoneTF.addActionListener(new TextFieldListener());
		
		emailTF = new JTextField(SwingConstants.CENTER);
		emailTF.setForeground(Color.GRAY);
		emailTF.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
		//emailTF.addActionListener(new TextFieldListener());
		
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
		
		updateJB = new JButton("Update Profile");
		updateJB.setBorderPainted(true);
		updateJB.setPreferredSize(new Dimension(40, 40));
		//	editContactJB.addActionListener(new ButtonListener());
		
		backJB = new JButton("Back");
		backJB.setBorderPainted(true);
		backJB.setPreferredSize(new Dimension(40, 40));
		//	editPaymentJB.addActionListener(new ButtonListener());
		
		//-------------------------------------
		// add to panels				
		//-------------------------------------
		
		headerPanel.add(home);
		headerPanel.add(loginHeader);
		headerPanel.add(cart);
		
		panel1.add(fnameJL);
		panel1.add(fnameTF);
		
		panel1.add(lnameJL);
		panel1.add(lnameTF);
		panel1.add(phoneJL);
		panel1.add(phoneTF);
		panel1.add(emailJL);
		panel1.add(emailTF);
		
		panel2.add(updateJB);
		panel2.add(backJB);
		
		JScrollPane scrollPane = new JScrollPane(panel1);
		
		//-------------------------------------
		// add layout, and panels to frame
		//-------------------------------------
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(1100, 600));
		frame.add(headerPanel, "North");
		frame.add(scrollPane, "Center");
		frame.add(panel2, "South");
		frame.pack();
		frame.setVisible(true);
	}
	
	private class TextFieldListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event) {
			
		}
	}
	
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			if(event.getSource() == loginHeader) Main.switchView("SignInGUI");
			if(event.getSource() == cart) Main.switchView("CartGUI");
			if(event.getSource() == home)Main.switchView("MenuGUI");	
		}
	}
	
}