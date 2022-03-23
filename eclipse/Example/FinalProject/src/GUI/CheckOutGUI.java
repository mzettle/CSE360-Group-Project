//Assignment: Programming Project - Final Project
//Name: Robyn Edsitty
//Date 4 / 26 / 21
//Lecture: M W 4:30 - 5:45 pm
//Time: 92 hours
//Description: This is the checkout window. This window will display their order and total in a statement. The user will have the option to logout, back, or checkout.

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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CheckOutGUI extends JPanel{

	protected JLabel header, itemL, quantityL;
	protected JButton backB, checkoutB, logoutB;
	protected JFrame frame;
	protected JPanel panel, panel2, headerPanel;
	protected JTextField searchTF;
	protected JTextArea confirmationTA;
	protected String confirmationStr;
	
	public CheckOutGUI() {
		
		JFrame frame = new JFrame("Check Out");
		
		//-------------------------------------
		// new JPanels
		//-------------------------------------
		headerPanel = new JPanel();
		headerPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
		headerPanel.setLayout(new GridLayout(1, 1));
		headerPanel.setBackground(Color.LIGHT_GRAY);
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
		panel.setLayout(new GridLayout(1, 1));
		panel.setBackground(Color.GRAY);
		
		panel2 = new JPanel();
		panel2.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
		panel2.setLayout(new GridLayout(1, 1));
		panel2.setBackground(Color.GRAY);
		
		//-------------------------------------
		// new JLabels
		//-------------------------------------
		header = new JLabel("Check Out", SwingConstants.CENTER);
		header.setForeground(Color.black);
		header.setFont(new Font("Time", Font.BOLD, 40));
		
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
		
		logoutB = new JButton("Logout");
		logoutB.setBackground(Color.LIGHT_GRAY);
		logoutB.setBorderPainted(true);
		logoutB.setFont(new Font("Time", Font.BOLD, 25));
		logoutB.addActionListener(new ButtonListener());
		
		//-------------------------------------
		// new JTextAreas
		//-------------------------------------
		confirmationTA = new JTextArea(20,20);
		confirmationTA.setEditable(false);
		confirmationTA.setBackground(Color.LIGHT_GRAY);
		confirmationStr = "Your order for " + "___" + " items ($" + "___" + ") was completed successfully. \nOrder: ";
		confirmationTA.setText(confirmationStr);
		confirmationTA.setFont(new Font("Time", Font.BOLD, 20));
		
		//-------------------------------------
		// add to panels
		//-------------------------------------
		headerPanel.add(header);
		panel.add(confirmationTA);
		panel2.add(logoutB);
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
		frame.pack();
		frame.setVisible(true);
	}// end CheckOutGUI()
	
private class ButtonListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub
			
			//-------------------------------------
			// if user pressed logout, will go back to the login Window
			//-------------------------------------
			if(event.getSource() == logoutB) {
				LoginGUI LoginGUIWindow = new LoginGUI();
				LoginGUIWindow.LoginGUIwindow();
			}// end if
			
			//-------------------------------------
			// if user pressed back, will go back to the shopping Window
			//-------------------------------------
			else if(event.getSource() == backB) {
				ShoppingPageGUI ShoppingPageGUIWindow = new ShoppingPageGUI();
				ShoppingPageGUIWindow.ShoppingPageGUIwindow();
			}// end if else
			
			//-------------------------------------
			// if user pressed checkout, will go to the Completed Order Window
			//-------------------------------------
			else if(event.getSource() == checkoutB) {
				CompletedOrderGUI CompletedOrderGUIWindow = new CompletedOrderGUI();
				CompletedOrderGUIWindow.CompletedOrderGUIwindow();
			}// end if else
		}// end actionPerformed
	}// end ButtonListener

	public static void CheckOutGUIwindow() {
		new CheckOutGUI();
	}// end CheckOutGUIwindow
}//end CheckOutGUI
