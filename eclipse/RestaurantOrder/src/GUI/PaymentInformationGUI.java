package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;

public class PaymentInformationGUI extends JPanel {

	protected JFrame frame = new JFrame("PaymentInformation");
	
	protected JPanel headerPanel, panel1, panel2;
	protected JLabel billingJL, cardJL, fnameJL, lnameJL, addressJL, cityJL, stateJL, zipJL, 
						cardNameJL, cardNumJL, expMJL, expYJL, cvvJL;
	protected JButton loginHeader, home, cart, saveJB, backJB;
	protected JTextField fnameTF, lnameTF, addressTF, cityTF, zipTF, 
						cardNameTF, cardNumTF, cvvTF;
	protected JComboBox stateCB, expMCB, expYCB;
	
	public PaymentInformationGUI() {
		
		Color  gray   = new Color(222, 222,  222);
		
		headerPanel = new JPanel();
		headerPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		headerPanel.setLayout(new GridLayout(1, 4));
		headerPanel.setBackground(Color.LIGHT_GRAY);
		
		panel1 = new JPanel();
		panel1.setBorder(BorderFactory.createEmptyBorder(60, 170, 60, 170));
		panel1.setLayout(new GridLayout(14, 2, 30, 30));
		panel1.setBackground(gray);
		
		panel2 = new JPanel();
		panel2.setBorder(BorderFactory.createEmptyBorder(20, 220, 20, 220));
		panel2.setLayout(new GridLayout(1, 2, 10, 10));	
		panel2.setBackground(gray);
		
		//-------------------------------------
		// JLabel
		//-------------------------------------
		billingJL = new JLabel("Billing Information", SwingConstants.LEFT);
		billingJL.setForeground(Color.BLACK);
		billingJL.setFont(new Font(Font.SERIF, Font.PLAIN, 30));
		billingJL.setPreferredSize(new Dimension(5,5));
		
		cardJL = new JLabel("Credit Card Information", SwingConstants.LEFT);
		cardJL.setForeground(Color.BLACK);
		cardJL.setFont(new Font(Font.SERIF, Font.PLAIN, 30));
		cardJL.setPreferredSize(new Dimension(5,5));
		
		fnameJL = new JLabel("First Name", SwingConstants.CENTER);
		fnameJL.setForeground(Color.BLACK);
		fnameJL.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
		
		lnameJL = new JLabel("Last Name", SwingConstants.CENTER);
		lnameJL.setForeground(Color.BLACK);
		lnameJL.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
		
		addressJL = new JLabel("Billing Address", SwingConstants.CENTER);
		addressJL.setForeground(Color.BLACK);
		addressJL.setFont(new Font(Font.SERIF, Font.PLAIN, 20));

		cityJL = new JLabel("City", SwingConstants.CENTER);
		cityJL.setForeground(Color.BLACK);
		cityJL.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
		
		stateJL = new JLabel("State", SwingConstants.CENTER);
		stateJL.setForeground(Color.BLACK);
		stateJL.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
		
		zipJL = new JLabel("Zip Code", SwingConstants.CENTER);
		zipJL.setForeground(Color.BLACK);
		zipJL.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
		
		cardNameJL = new JLabel("Card Holder Name", SwingConstants.CENTER);
		cardNameJL.setForeground(Color.BLACK);
		cardNameJL.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
		
		cardNumJL = new JLabel("Card Number", SwingConstants.CENTER);
		cardNumJL.setForeground(Color.BLACK);
		cardNumJL.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
		
		expMJL = new JLabel("Exp Month", SwingConstants.CENTER);
		expMJL.setForeground(Color.BLACK);
		expMJL.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
		
		expYJL = new JLabel("Exp Year", SwingConstants.CENTER);
		expYJL.setForeground(Color.BLACK);
		expYJL.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
		
		cvvJL = new JLabel("CVV", SwingConstants.CENTER);
		cvvJL.setForeground(Color.BLACK);
		cvvJL.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
		
		//-------------------------------------
		// new JTextFields
		//-------------------------------------
		//add focus listener?
		fnameTF = new JTextField(SwingConstants.CENTER);
		fnameTF.setForeground(Color.GRAY);
		fnameTF.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
		
		lnameTF = new JTextField(SwingConstants.CENTER);
		lnameTF.setForeground(Color.GRAY);
		lnameTF.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
		
		addressTF = new JTextField(SwingConstants.CENTER);
		addressTF.setForeground(Color.GRAY);
		addressTF.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
		
		cityTF = new JTextField(SwingConstants.CENTER);
		cityTF.setForeground(Color.GRAY);
		cityTF.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
		
		zipTF = new JTextField(SwingConstants.CENTER);
		zipTF.setForeground(Color.GRAY);
		zipTF.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
		
		cardNameTF = new JTextField(SwingConstants.CENTER);
		cardNameTF.setForeground(Color.GRAY);
		cardNameTF.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
		
		cardNumTF = new JTextField(SwingConstants.CENTER);
		cardNumTF.setForeground(Color.GRAY);
		cardNumTF.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
		
		cvvTF = new JTextField(SwingConstants.CENTER);
		cvvTF.setForeground(Color.GRAY);
		cvvTF.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
		
		//-------------------------------------
		// Combo Box
		//-------------------------------------
		
		
		String[] states = {"Alaska", "Alabama", "Arkansas", "American Samoa", "Arizona", 
				"California", "Colorado", "Connecticut", "District of Columbia", "Delaware", 
				"Florida", "Georgia", "Guam", "Hawaii", "Iowa", "Idaho", "Illinois", "Indiana", 
				"Kansas", "Kentucky", "Louisiana", "Massachusetts", "Maryland", "Maine", "Michigan", 
				"Minnesota", "Missouri", "Mississippi", "Montana", "North Carolina", "North Dakota", 
				"Nebraska", "New Hampshire", "New Jersey", "New Mexico", "Nevada", "New York", "Ohio", 
				"Oklahoma", "Oregon", "Pennsylvania", "Puerto Rico", "Rhode Island", "South Carolina", 
				"South Dakota", "Tennessee", "Texas", "Utah", "Virginia", "Virgin Islands", "Vermont", 
				"Washington", "Wisconsin", "West Virginia", "Wyoming"};
		stateCB = new JComboBox(states);
		stateCB.setEditable(false);
		
		String[] month = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
		expMCB = new JComboBox(month);
		
		String[] year = {"2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", 
				"2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", 
				"2040", "2041"};
		expYCB = new JComboBox(year);
		
		//-------------------------------------
		// JButton
		//-------------------------------------
		home = new JButton("Home");
		home.setBorderPainted(true);
		home.setPreferredSize(new Dimension(40, 40));
		//	home.addActionListener(new ButtonListener());
				
		loginHeader = new JButton("Sign In/Register");
		loginHeader .setBorderPainted(true);
		loginHeader .setPreferredSize(new Dimension(40, 40));
		//loginHeader.addActionListener(new ButtonListener());
		
		cart = new JButton("Place Order");
		cart.setBorderPainted(true);
		cart.setPreferredSize(new Dimension(40, 40));
		//	cart.addActionListener(new ButtonListener());
		
		saveJB = new JButton("Save Payment");
		saveJB.setBorderPainted(true);
		saveJB.setPreferredSize(new Dimension(40, 40));
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
		
		panel1.add(billingJL);
		panel1.add(new JLabel(""));
		panel1.add(fnameJL);
		panel1.add(fnameTF);
		panel1.add(lnameJL);
		panel1.add(lnameTF);
		panel1.add(addressJL);
		panel1.add(addressTF);
		panel1.add(cityJL);
		panel1.add(cityTF);
		panel1.add(stateJL);
		panel1.add(stateCB);
		panel1.add(zipJL);
		panel1.add(zipTF);
		panel1.add(new JLabel(""));
		panel1.add(new JLabel(""));
		panel1.add(cardJL);
		panel1.add(new JLabel(""));
		panel1.add(cardNameJL);
		panel1.add(cardNameTF);
		panel1.add(cardNumJL);
		panel1.add(cardNumTF);
		panel1.add(expMJL);
		panel1.add(expMCB);
		panel1.add(expYJL);
		panel1.add(expYCB);
		panel1.add(cvvJL);
		panel1.add(cvvTF);
		panel2.add(saveJB);
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
		public void actionPerformed(ActionEvent evt) {
			
		}
	}
	
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent evt) {
			
		}
	}
	public static void main(String []args) {
		new PaymentInformationGUI();
		
	}
}