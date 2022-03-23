//Assignment: Programming Project - Final Project
//Name: Robyn Edsitty
//Date 4 / 26 / 21
//Lecture: M W 4:30 - 5:45 pm
//Time: 92 hours
//Description: This is the create account window. This will have two buttons for user to create either customer or employee account.

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
import javax.swing.SwingConstants;

import GUI.LoginGUI;

public class CreateAccountGUI extends JPanel {

	protected JLabel header;
	protected JButton createCustomer, createEmployee, back;
	protected JFrame frame;
	protected JPanel panel, panel2, headerPanel;
	
	public CreateAccountGUI() {
		JFrame frame = new JFrame("Create Customer");
		
		//-------------------------------------
		// new JPanels
		//-------------------------------------
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
		panel.setLayout(new GridLayout(4, 1));
		panel.setBackground(Color.GRAY);
		
		panel2 = new JPanel();
		panel2.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
		panel2.setLayout(new GridLayout(1, 1));
		panel2.setBackground(Color.GRAY);
		
		headerPanel = new JPanel();
		headerPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
		headerPanel.setLayout(new GridLayout(1, 1));
		headerPanel.setBackground(Color.LIGHT_GRAY);
		
		//-------------------------------------
		// new JLabels
		//-------------------------------------
		header = new JLabel("Create Account", SwingConstants.CENTER);
		header.setForeground(Color.black);
		header.setFont(new Font("Time", Font.BOLD, 40));
		
		//-------------------------------------
		// new JButtons
		//-------------------------------------
		createCustomer = new JButton("Create Customer");
		createCustomer.setBackground(Color.LIGHT_GRAY);
		createCustomer.setBorderPainted(true);
		createCustomer.setFont(new Font("Time", Font.BOLD, 25));
		createCustomer.addActionListener(new ButtonListener());
		
		createEmployee = new JButton("Create Employee");
		createEmployee.setBackground(Color.LIGHT_GRAY);
		createEmployee.setBorderPainted(true);
		createEmployee.setFont(new Font("Time", Font.BOLD, 25));
		createEmployee.addActionListener(new ButtonListener());
		
		back = new JButton("Back");
		back.setBackground(Color.LIGHT_GRAY);
		back.setBorderPainted(true);
		back.setFont(new Font("Time", Font.BOLD, 25));
		back.addActionListener(new ButtonListener());
		
		//-------------------------------------
		// add to panels
		//-------------------------------------
		panel.setLayout(new GridLayout(2, 1));
		panel.add(createCustomer);
		panel.add(createEmployee);
		panel2.add(back);
		headerPanel.add(header);
		
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
		
		
	}// end CreateAccountGUI
	private class ButtonListener implements ActionListener {
			
			@Override
			public void actionPerformed(ActionEvent event) {
				// TODO Auto-generated method stub
				
				//-------------------------------------
				// if user pressed create customer, will go to create customer Window
				//-------------------------------------
				if(event.getSource() == createCustomer) {
					CreateCustomerGUI createCustomerWindow = new CreateCustomerGUI();
					createCustomerWindow.CreateCustomerGUI();
				}// end if
				
				//-------------------------------------
				// if user pressed create employee, will go to create employee Window
				//-------------------------------------
				else if(event.getSource() == createEmployee) {
					CreateEmployeeGUI createEmployeeWindow = new CreateEmployeeGUI();
					CreateEmployeeGUI.CreateEmployeeGUIwindow();
				}// end if else 
				
				//-------------------------------------
				// if user pressed back, will go back to login Window
				//-------------------------------------
				else if(event.getSource() == back) {
					LoginGUI LoginGUIWindow = new LoginGUI();
					LoginGUIWindow.LoginGUIwindow();
				}// end if else 
			}// end actionPreformed
		}// end ButtonListener
	
	public static void CreateAccountGUIwindow() {
		new CreateAccountGUI();
	}// end CreateAccountGUIwindow
}// end class CreateAccountGUI
