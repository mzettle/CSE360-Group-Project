package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;

public class CartGUI extends JPanel {

	protected JFrame frame = new JFrame("Cart");
	
	protected JPanel headerPanel, panel1, panel2, panel3;
	protected JLabel headerJL, reviewJL, subtotalJL;
	protected JButton loginHeader, home, cart, returnJB, checkoutJB;
	
	public CartGUI() {
		
		Color  gray   = new Color(222, 222,  222);
		
		headerPanel = new JPanel();
		headerPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		headerPanel.setLayout(new GridLayout(1, 4));
		headerPanel.setBackground(Color.LIGHT_GRAY);
		
		panel1 = new JPanel();
		panel1.setBorder(BorderFactory.createEmptyBorder(0, 220, 0, 220));
		panel1.setLayout(new GridLayout(3, 1, 0, 0));
		panel1.setBackground(gray);
		
		panel2 = new JPanel();
		panel2.setBorder(BorderFactory.createEmptyBorder(20, 220, 20, 220));
		panel2.setLayout(new GridLayout(1, 2, 10, 10));	
		panel2.setBackground(gray);
		
		panel3 = new JPanel();
		panel3.setBorder(BorderFactory.createEmptyBorder(60, 220, 60, 260));
		panel3.setLayout(new GridLayout(4, 8, 40, 40));
		panel3.setBackground(gray);
		
		//-------------------------------------
		// JLabel
		//-------------------------------------
		headerJL = new JLabel("Account Information", SwingConstants.CENTER);
		headerJL.setForeground(Color.BLACK);
		headerJL.setFont(new Font(Font.SERIF, Font.BOLD, 30));
		headerJL.setPreferredSize(new Dimension(5,5));
		
		reviewJL = new JLabel("Review Your Order", SwingConstants.CENTER);
		reviewJL.setForeground(Color.BLACK);
		reviewJL.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
		
		String subtotal = "Subtotal : $";
		subtotalJL = new JLabel(subtotal, SwingConstants.CENTER);
		subtotalJL.setForeground(Color.BLACK);
		subtotalJL.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
		
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
		
		returnJB = new JButton("Update Profile");
		returnJB.setBorderPainted(true);
		returnJB.setPreferredSize(new Dimension(40, 40));
		//	editContactJB.addActionListener(new ButtonListener());
		
		checkoutJB = new JButton("Back");
		checkoutJB.setBorderPainted(true);
		checkoutJB.setPreferredSize(new Dimension(40, 40));
		//	editPaymentJB.addActionListener(new ButtonListener());
		
		//-------------------------------------
		// add to panels				
		//-------------------------------------
		headerPanel.add(home);
		headerPanel.add(loginHeader);
		headerPanel.add(cart);
		
		
	
		panel1.add(reviewJL);
		JScrollPane scrollPane = new JScrollPane(panel3);
		panel1.add(scrollPane);
		panel1.add(subtotalJL);
		
		panel2.add(returnJB);
		panel2.add(checkoutJB);
		
		//-------------------------------------
		// add layout, and panels to frame
		//-------------------------------------
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(1100, 600));
		frame.add(headerPanel, "North");
		frame.add(panel1, "Center");
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
		new CartGUI();
		
	}
}