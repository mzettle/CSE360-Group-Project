package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;
import data.Account;
import data.Customer;

public class ConfirmationGUI extends JPanel {
	

	protected JButton loginHeader, home, cart;
	
	public ConfirmationGUI() {
		
		JPanel headerPanel, panel1, panel2;
		JLabel confirmationJL, customerNumJL, timeJL;
		
		Color gray = new Color(222, 222,  222);
		
		headerPanel = new JPanel();
		headerPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		headerPanel.setLayout(new GridLayout(1, 4));
		headerPanel.setBackground(Color.LIGHT_GRAY);
		
		panel1 = new JPanel();
		panel1.setBorder(BorderFactory.createEmptyBorder(20, 220, 25, 220));
		panel1.setLayout(new GridLayout(4, 1, 5, 5));	
		panel1.setBackground(gray);
		
		panel2 = new JPanel();
		panel2.setBorder(BorderFactory.createEmptyBorder(25, 200, 70, 200));
		panel2.setLayout(new GridLayout(1, 2, 10, 10));	
		panel2.setBackground(gray);
		
		//-------------------------------------
		// JLabel
		//-------------------------------------
		confirmationJL = new JLabel("Confirmed", SwingConstants.CENTER);
		confirmationJL.setForeground(Color.BLACK);
		confirmationJL.setFont(new Font(Font.SERIF, Font.BOLD, 30));
		
		Random rand = new Random();
		int num = rand.nextInt(20) + 1;
		String customerNum = "Customer #" + Integer.toString(num);
		customerNumJL = new JLabel(customerNum, SwingConstants.CENTER);
		customerNumJL.setForeground(Color.BLACK);
		customerNumJL.setFont(new Font(Font.SERIF, Font.BOLD, 30));
		
		int randTime = rand.nextInt(35) + 10;
		String time = "Expected Completion Time:   " + Integer.toString(randTime) + " minutes";
		timeJL = new JLabel(time, SwingConstants.CENTER);
		timeJL.setForeground(Color.BLACK);
		timeJL.setFont(new Font(Font.SERIF, Font.PLAIN, 25));
		
		//-------------------------------------
		// JButton
		//-------------------------------------
		home = new JButton("Home");
		home.setBorderPainted(true);
		home.setPreferredSize(new Dimension(50, 50));
		home.addActionListener(new ButtonListener());
				
		cart = new JButton("Place Order");
		cart.setBorderPainted(true);
		cart.setPreferredSize(new Dimension(40, 40));
		cart.addActionListener(new ButtonListener());
		
		loginHeader = new JButton("Sign In/Register");
		loginHeader .setBorderPainted(true);
		loginHeader .setPreferredSize(new Dimension(40, 40));
		loginHeader.addActionListener(new ButtonListener());
		
		//-------------------------------------
		// add to panels				
		//-------------------------------------
		JLabel pic = new JLabel(new ImageIcon("check.jpg"));
		  
		headerPanel.add(loginHeader);
		headerPanel.add(cart);
		
		panel1.add(confirmationJL);
		panel1.add(pic);
		panel1.add(customerNumJL);
		panel1.add(timeJL);
		
		panel2.add(home);
		
		//-------------------------------------
		// add layout, and panels to frame
		//-------------------------------------
		setLayout(new BorderLayout());
		add(headerPanel, "North");
		add(panel1, "Center");
		add(panel2, "South");
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


