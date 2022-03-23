//Assignment: Programming Project - Final Project
//Name: Robyn Edsitty
//Date 4 / 26 / 21
//Lecture: M W 4:30 - 5:45 pm
//Time: 92 hours
//Description: This is the shopping page window. This window will allow the user to search items and select a quantity and add items to their cart. The text area will allow the user to see what is in their cart.

package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ShoppingPageGUI extends JPanel {

	protected JLabel header, itemL, quantityL;
	protected JButton addB, backB, checkoutB, searchB;
	protected JFrame frame;
	protected JPanel panel, panel2, headerPanel, panel3;
	protected JTextField searchTF;
	protected JTextArea itemListTA, itemTA;
	protected String quantityS[];
	protected JComboBox quantityCB;
	
	public ShoppingPageGUI() {
		JFrame frame = new JFrame("Shopping Page");
		
		//-------------------------------------
		// new JPanels
		//-------------------------------------
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
		panel.setLayout(new GridLayout(1, 1));
		panel.setBackground(Color.GRAY);
		
		panel2 = new JPanel();
		panel2.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
		panel2.setLayout(new GridLayout(1, 1));
		panel2.setBackground(Color.GRAY);
		
		panel3 = new JPanel();
		panel3.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panel3.setLayout(new GridLayout(6, 1));
		panel3.setBackground(Color.GRAY);
		
		headerPanel = new JPanel();
		headerPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
		headerPanel.setLayout(new GridLayout(1, 1));
		headerPanel.setBackground(Color.LIGHT_GRAY);
		
		//-------------------------------------
		// new JLabels
		//-------------------------------------
		header = new JLabel("Shopping Page", SwingConstants.CENTER);
		header.setForeground(Color.black);
		header.setFont(new Font("Time", Font.BOLD, 40));
		
		quantityL = new JLabel("Quantity:", SwingConstants.CENTER);
		quantityL.setForeground(Color.black);
		quantityL.setFont(new Font("Time", Font.BOLD, 25));
		
		//-------------------------------------
		// new JButtons
		//-------------------------------------
		backB = new JButton("Back");
		backB.setBackground(Color.LIGHT_GRAY);
		backB.setBorderPainted(true);
		backB.setFont(new Font("Time", Font.BOLD, 25));
		backB.addActionListener(new ButtonListener());
		
		checkoutB = new JButton("Checkout");
		checkoutB.setBackground(Color.LIGHT_GRAY);
		checkoutB.setBorderPainted(true);
		checkoutB.setFont(new Font("Time", Font.BOLD, 25));
		checkoutB.addActionListener(new ButtonListener());
		
		searchB = new JButton("Search");
		searchB.setBackground(Color.LIGHT_GRAY);
		searchB.setBorderPainted(true);
		searchB.setFont(new Font("Time", Font.BOLD, 25));
		searchB.addActionListener(new ButtonListener());
		
		addB = new JButton("Add Item");
		addB.setBackground(Color.LIGHT_GRAY);
		addB.setBorderPainted(true);
		addB.setFont(new Font("Time", Font.BOLD, 25));
		addB.addActionListener(new ButtonListener());
		
		//-------------------------------------
		// new JTextAreas
		//-------------------------------------
		itemListTA = new JTextArea(20,20);
		itemListTA.setEditable(false);
		itemListTA.setBackground(Color.LIGHT_GRAY);
		
		itemTA = new JTextArea(20,20);
		itemTA.setEditable(false);
		
		//-------------------------------------
		// new JComboBoxs
		//-------------------------------------
		String quantityS[] = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
		quantityCB = new JComboBox(quantityS);
		
		//-------------------------------------
		// new JTextField
		//-------------------------------------
		searchTF = new JTextField(SwingConstants.CENTER);
		
		//-------------------------------------
		// add to panels
		//-------------------------------------
		headerPanel.add(header);
		panel3.add(searchTF);
		panel3.add(searchB);
		panel3.add(itemTA);
		panel3.add(quantityL);
		panel3.add(quantityCB);
		panel3.add(addB);
		panel.add(itemListTA);
		panel2.add(backB);
		panel2.add(checkoutB);
		
		//-------------------------------------
		// add layout, and panels to frame
		//-------------------------------------
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(1000, 600));
		frame.add(headerPanel, "North");
		frame.add(panel, "Center");
		frame.add(panel2, "South");
		frame.add(panel3, "West");
		frame.pack();
		frame.setVisible(true);
		
	}//end ShoppingPageGUI()
	
	private class ButtonListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub

			//-------------------------------------
			// if user pressed back, will go back to the login Window
			//-------------------------------------
			if(event.getSource() == backB) {
				LoginGUI LoginGUIWindow = new LoginGUI();
				LoginGUIWindow.LoginGUIwindow();
			}// end if

			//-------------------------------------
			// if user pressed checkout, will go to the checkout Window
			//-------------------------------------
			else if(event.getSource() == checkoutB) {
				CheckOutGUI CheckOutGUIWindow = new CheckOutGUI();
				CheckOutGUIWindow.CheckOutGUIwindow();
			}// end else if
		}// end actionPerformed
	}//end class ButtonListener
	public static void ShoppingPageGUIwindow() {
		new ShoppingPageGUI();
	}// end ShoppingPageGUIwindow
}// end ShoppingPageGUI
