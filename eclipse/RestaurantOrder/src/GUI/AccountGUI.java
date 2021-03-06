package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import data.Account;
import data.Customer;

public class AccountGUI extends JPanel {
	
	protected JButton home, contactInfo, paymentInfo;
	protected JTextArea contactTA, paymentTA;
	
	protected Customer cust;
	
	public AccountGUI() {
		
		JPanel headerPanel, panel1, panel2;
		JLabel headerJL, contactJL, paymentJL;
		String contact, payment;

		
		Color gray = new Color(222, 222,  222);
		
	
		headerPanel = new JPanel();
		//headerPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		headerPanel.setLayout(new GridLayout(1, 4));
		headerPanel.setBackground(Color.LIGHT_GRAY);

		panel1 = new JPanel();
		panel1.setBorder(BorderFactory.createEmptyBorder(20, 220, 10, 180));
		panel1.setLayout(new GridLayout(5, 1, 10, 20));
		panel1.setBackground(gray);

		panel2 = new JPanel();
		panel2.setBorder(BorderFactory.createEmptyBorder(25, 200, 70, 200));
		panel2.setLayout(new GridLayout(1, 2, 10, 10));	
		panel2.setBackground(gray);

		//-------------------------------------
		// JLabel
		//-------------------------------------
		headerJL = new JLabel("Your Account", SwingConstants.CENTER);
		headerJL.setForeground(Color.BLACK);
		headerJL.setFont(new Font(Font.SERIF, Font.BOLD, 30));
		headerJL.setPreferredSize(new Dimension(5,5));

		contactJL = new JLabel("Contact Information", SwingConstants.LEFT);
		contactJL.setForeground(Color.BLACK);
		contactJL.setFont(new Font(Font.SERIF, Font.PLAIN, 20));

		paymentJL = new JLabel("Payment Information", SwingConstants.LEFT);
		paymentJL.setForeground(Color.BLACK);
		paymentJL.setFont(new Font(Font.SERIF, Font.PLAIN, 20));

		//-------------------------------------
		// new JTextArea
		//-------------------------------------
		contact = "\tfname\n\tlastname\n\tphone\n\temail";
		payment = "\tccn\n\tfname\n\tlname";

		contactTA = new JTextArea(100, 100);
		contactTA.setEditable(false);
		contactTA.setText(contact);
		contactTA.setBackground(gray);
		contactTA.setFont(new Font("Time", Font.PLAIN, 15));

		paymentTA = new JTextArea(4, 4);
		paymentTA.setEditable(false);
		paymentTA .setText(payment);
		paymentTA .setBackground(gray);
		paymentTA .setFont(new Font("Time", Font.PLAIN, 15));

		//-------------------------------------
		// JButton
		//-------------------------------------
		home = new JButton("Home");
		home.setBorderPainted(true);
		home.setPreferredSize(new Dimension(40, 40));
		home.addActionListener(new ButtonListener());
		

		contactInfo = new JButton("Edit Contact Info");
		contactInfo.setBorderPainted(true);
		contactInfo.setPreferredSize(new Dimension(50, 50));
		contactInfo.addActionListener(new ButtonListener());

		paymentInfo = new JButton("Edit Payment Info");
		paymentInfo.setBorderPainted(true);
		paymentInfo.setPreferredSize(new Dimension(50, 50));
		paymentInfo.addActionListener(new ButtonListener());

		//-------------------------------------
		// add to panels				
		//-------------------------------------
		headerPanel.add(home);
		
		panel1.add(headerJL);
		panel1.add(contactJL);
		panel1.add(contactTA);
		panel1.add(paymentJL);
		panel1.add(paymentTA);

		panel2.add(contactInfo);
		panel2.add(paymentInfo);


		//-------------------------------------
		// add layout, and panels to frame
		//-------------------------------------
		setLayout(new BorderLayout());
	//	setPreferredSize(new Dimension(1100, 600));
		
		add(headerPanel, "North");
		add(panel1, "Center");
		add(panel2, "South");
	}
	
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			if(event.getSource() == home)Main.switchView("MenuGUI");
			
			if(event.getSource() == contactInfo) {
				Main.contactInfoGUI.updateInfo(cust);
				Main.switchView("ContactInformationGUI");
			}
			if(event.getSource() == paymentInfo) {
				Main.paymentInfoGUI.updateInfo(cust, false);
				Main.switchView("PaymentInformationGUI");
			}
		}
	}	
	
	public void UpdateInfo(Customer cust) {
		this.cust = cust;
		contactTA.setText("Name: " + cust.contactInfo.firstName + " " + cust.contactInfo.lastName +
				"\nPhone: " + cust.contactInfo.phoneNumber + "\nEmail: " + cust.contactInfo.emailAddress);
		paymentTA.setText("Name: " + cust.paymentInfo.firstName + " " + cust.paymentInfo.lastName +
				"\nLast 4 digits of Credit Card: " + cust.paymentInfo.ccNumber.substring(cust.paymentInfo.ccNumber.length() - 4) +
				" Expires: " + cust.paymentInfo.expMonth + "/" + cust.paymentInfo.expYear + 
				"\n Address: " + cust.paymentInfo.address + "\n\t" + cust.paymentInfo.city + ", " + cust.paymentInfo.state + " " + cust.paymentInfo.postalCode + " " + cust.paymentInfo.country);
	}
}
