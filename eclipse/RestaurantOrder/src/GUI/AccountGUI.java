package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;

public class AccountGUI extends JPanel {

	protected JFrame frame = new JFrame("Your Account");
	
	protected JPanel headerPanel, panel1;
	protected JLabel headerJL, contactJL, contactInfoJL, paymentJL, paymentInforJL;
	protected JButton loginHeader, home,cart, contactInfo, paymentInfo;
	protected JTextField unTF, pwTF;
	protected String contact, payment;
	
	public AccountGUI() {

Dimension signInSize = new Dimension(100,100);
		
/*
		headerPanel = new JPanel();
		headerPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		headerPanel.setLayout(new GridLayout(1, 4));
		headerPanel.setBackground(Color.LIGHT_GRAY);
		
		panel1 = new JPanel();
		panel1.setBorder(BorderFactory.createEmptyBorder(20, 220, 100, 220));
		panel1.setLayout(new GridLayout(3, 1, 10, 20));	
		panel1.setBackground(Color.LIGHT_GRAY);
		
		//-------------------------------------
		// JLabel
		//-------------------------------------
		headerJL = new JLabel("Your Account", SwingConstants.CENTER);
		headerJL.setForeground(Color.BLACK);
		headerJL.setFont(new Font(Font.SERIF, Font.BOLD, 30));
		
		//-------------------------------------
		// JButton
		//-------------------------------------
		home = new JButton("Home");
		home.setBorderPainted(true);
		home.setPreferredSize(new Dimension(40, 40));
	//	home.addActionListener(new actionPerformed());
				
		loginHeader = new JButton("Sign In/Register");
		loginHeader .setBorderPainted(true);
		loginHeader .setPreferredSize(new Dimension(40, 40));
	//	loginHeader.addActionListener(new actionPerformed());
		
		cart = new JButton("Place Order");
		cart.setBorderPainted(true);
		cart.setPreferredSize(new Dimension(40, 40));
	//	cart.addActionListener(new actionPerformed());
		
		contactInfo = new JButton("Contact Information");
		contactInfo.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
		contactInfo.setBorderPainted(true);
		contactInfo.setPreferredSize(new Dimension(50, 50));
	//	contactInfo.addActionListener(new actionPerformed());
		
		paymentInfo = new JButton("Payment Information");
		paymentInfo.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
		paymentInfo.setBorderPainted(true);
		paymentInfo.setPreferredSize(new Dimension(50, 50));
	//	register.addActionListener(new actionPerformed());
		
		//-------------------------------------
		// add to panels				
		//-------------------------------------
		headerPanel.add(home);
		headerPanel.add(loginHeader);
		headerPanel.add(cart);
		
		panel1.add(headerJL);
		panel1.add(contactInfo);
		panel1.add(paymentInfo);
		*/
		
		headerPanel = new JPanel();
		headerPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		headerPanel.setLayout(new GridLayout(1, 4));
		headerPanel.setBackground(Color.LIGHT_GRAY);
		
		panel1 = new JPanel();
		panel1.setBorder(BorderFactory.createEmptyBorder(0, 220, 100, 220));
		panel1.setLayout(new GridLayout(7, 1, 10, 20));	
		panel1.setBackground(Color.LIGHT_GRAY);
		
		//-------------------------------------
		// JLabel
		//-------------------------------------
		headerJL = new JLabel("Your Account", SwingConstants.CENTER);
		headerJL.setForeground(Color.BLACK);
		headerJL.setFont(new Font(Font.SERIF, Font.BOLD, 30));
		
		contactJL = new JLabel("Contact Information", SwingConstants.LEFT);
		contactJL.setForeground(Color.BLACK);
		contactJL.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
		
		contact = "";
		contactInfoJL = new JLabel(contact);
		contactInfoJL.setForeground(Color.black);
		contactInfoJL.setFont(new Font("Time", Font.PLAIN, 20));
		
		paymentJL = new JLabel("Payment Information", SwingConstants.LEFT);
		paymentJL.setForeground(Color.BLACK);
		paymentJL.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
		
		
		
		//-------------------------------------
		// JButton
		//-------------------------------------
		home = new JButton("Home");
		home.setBorderPainted(true);
		home.setPreferredSize(new Dimension(40, 40));
		//	home.addActionListener(new actionPerformed());
				
		loginHeader = new JButton("Sign In/Register");
		loginHeader .setBorderPainted(true);
		loginHeader .setPreferredSize(new Dimension(40, 40));
		//	loginHeader.addActionListener(new actionPerformed());
		
		cart = new JButton("Place Order");
		cart.setBorderPainted(true);
		cart.setPreferredSize(new Dimension(40, 40));
		//	cart.addActionListener(new actionPerformed());
		
		
		//-------------------------------------
		// add to panels				
		//-------------------------------------
		headerPanel.add(home);
		headerPanel.add(loginHeader);
		headerPanel.add(cart);
		
		panel1.add(headerJL);
		panel1.add(contactJL);
		panel1.add(contactInfoJL);
		panel1.add(paymentJL);

		//-------------------------------------
		// add layout, and panels to frame
		//-------------------------------------
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(1100, 600));
		frame.add(headerPanel, "North");
		frame.add(panel1, "Center");
		frame.pack();
		frame.setVisible(true);
	}
	
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent evt) {
			
		}
	}
	
	public static void main(String []args ) {
		new AccountGUI();
		
	}
}