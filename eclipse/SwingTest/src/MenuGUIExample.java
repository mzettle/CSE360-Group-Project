import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MenuGUIExample {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Menu Home");
		
		JPanel panel, panel2, headerPanel, appetizerPanel, entreePanel;
		JTextField searchTF;
		JButton login, home, cart;
		JScrollBar rightSB, appetizerSB, entreeSB;
		JLabel appetizerJL, entreeJL, descriptionJL;
	
		//-------------------------------------
		// JPanel
		//-------------------------------------
		headerPanel = new JPanel();
		headerPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		headerPanel.setLayout(new GridLayout(1, 4));
		headerPanel.setBackground(Color.LIGHT_GRAY);
	
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(2, 1, 10, 10));
		panel.setBackground(Color.WHITE);
		
		appetizerPanel = new JPanel();
		appetizerPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 1, 20));
		appetizerPanel.setLayout(new BorderLayout());
		appetizerPanel.setBackground(Color.LIGHT_GRAY);
		
		entreePanel = new JPanel();
		entreePanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 1, 20));
		entreePanel.setLayout(new BorderLayout());
		entreePanel.setBackground(Color.LIGHT_GRAY);
		
		panel2 = new JPanel();
		panel2.setBorder(BorderFactory.createEmptyBorder(5, 30, 30, 30));
		panel2.setPreferredSize(new Dimension(100, 100));
		panel2.setLayout(new BorderLayout());
		panel2.setBackground(Color.WHITE);
		
		//-------------------------------------
		// JTextField
		//-------------------------------------
		searchTF = new JTextField(SwingConstants.CENTER);
		searchTF.setPreferredSize(new Dimension(40, 40));
		
		//-------------------------------------
		// JButton
		//-------------------------------------
		home = new JButton("Home");
		home.setBorderPainted(true);
		home.addActionListener(new ButtonListener());
				
		login = new JButton("Sign In/Register");
		login.setBorderPainted(true);
		login.addActionListener(new ButtonListener());
		
		cart = new JButton("Place Order");
		cart.setBorderPainted(true);
		cart.addActionListener(new ButtonListener());
		
		//-------------------------------------
		// JLabel
		//-------------------------------------
		appetizerJL = new JLabel("Appetizers", SwingConstants.LEFT);
		appetizerJL.setForeground(Color.black);
		appetizerJL.setFont(new Font(Font.SERIF, Font.BOLD, 20));
		
		entreeJL = new JLabel("Entrées", SwingConstants.LEFT);
		entreeJL .setForeground(Color.black);
		entreeJL .setFont(new Font(Font.SERIF, Font.BOLD, 20));
		
		String description = "Click on an item to view its description or add it to your cart.﻿ Make sure to sign in or create an account!";
		
		descriptionJL = new JLabel(description, SwingConstants.CENTER);
		descriptionJL .setForeground(Color.black);
		descriptionJL .setFont(new Font(Font.SERIF , Font.PLAIN, 20));
		
		//-------------------------------------
		// JScrollBar
		//-------------------------------------
		rightSB = new JScrollBar();
		rightSB.setPreferredSize(new Dimension(20, 0));
		
		appetizerSB = new JScrollBar(JScrollBar.HORIZONTAL, 30, 20, 0, 500);
		
		entreeSB = new JScrollBar(JScrollBar.HORIZONTAL, 30, 20, 0, 500);
		
		//-------------------------------------
		// add to panels				
		//-------------------------------------
		headerPanel.add(home);
		headerPanel.add(searchTF);
		headerPanel.add(login);
		headerPanel.add(cart);
		
		appetizerPanel.add(appetizerJL, BorderLayout.NORTH);
		appetizerPanel.add(appetizerSB, BorderLayout.SOUTH);
		
		entreePanel.add(entreeJL, BorderLayout.NORTH);		
		entreePanel.add(entreeSB, BorderLayout.SOUTH);
		
		panel.add(appetizerPanel);
		panel.add(entreePanel);
		
		panel2.add(descriptionJL, BorderLayout.CENTER);
		
		//-------------------------------------
		// add layout, and panels to frame
		//-------------------------------------
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(1100, 600));
		frame.add(rightSB, "East");
		frame.add(headerPanel, "North");
		frame.add(panel, "Center");
		frame.add(panel2, "South");
		frame.pack();
		frame.setVisible(true);
	
	}
	
	public static class ButtonListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == home) {
				//go to menu home screen?
			}
			
			else if(e.getSource() == login) {
				//go to login/register
			}
			
			else if(e.getSource() == cart) {
				//go to cart window
			
			}
		}
	}
}