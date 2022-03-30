package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AccountGUI extends JPanel {

	protected JFrame frame = new JFrame("Your Account");
	
	protected JPanel headerPanel, panel1, panel2;
	protected JLabel headerJL, contactJL, contactInfoJL, paymentJL, paymentInforJL;
	protected JButton loginHeader, home, cart, contactInfo, paymentInfo, editContactJB, editPaymentJB;
	protected JTextField unTF, pwTF;
	protected String contact, payment;
	protected JTextArea contactTA, paymentTA;
	
	public AccountGUI() {
		Color  gray   = new Color(222, 222,  222);
		
		headerPanel = new JPanel();
		headerPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		headerPanel.setLayout(new GridLayout(1, 4));
		headerPanel.setBackground(Color.LIGHT_GRAY);
		
		panel1 = new JPanel();
		panel1.setBorder(BorderFactory.createEmptyBorder(20, 220, 100, 220));
		panel1.setLayout(new GridLayout(3, 1, 10, 20));	
		panel1.setBackground(gray);
		
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
		

		//-------------------------------------
		// add layout, and panels to frame
		//-------------------------------------
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(1100, 600));
		frame.add(headerPanel, "North");
		frame.add(panel1, "Center");
		//frame.add(panel2, "South");
		frame.pack();
		frame.setVisible(true);
	}
		
		
		/*Color  gray   = new Color(222, 222,  222);
		
		headerPanel = new JPanel();
		headerPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		headerPanel.setLayout(new GridLayout(1, 4));
		headerPanel.setBackground(Color.LIGHT_GRAY);
		
		panel1 = new JPanel();
		panel1.setBorder(BorderFactory.createEmptyBorder(0, 220, 0, 220));
		panel1.setLayout(new GridLayout(5, 1, 10, 10));	
		//panel1.setLayout(new FlowLayout().VERTICAL);
		panel1.setBackground(gray);
		
		panel2 = new JPanel();
		panel2.setBorder(BorderFactory.createEmptyBorder(20, 220, 20, 220));
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
		
		contactTA = new JTextArea(4, 4);
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
		//	home.addActionListener(new ButtonListener());
				
		loginHeader = new JButton("Sign In/Register");
		loginHeader .setBorderPainted(true);
		loginHeader .setPreferredSize(new Dimension(40, 40));
		//loginHeader.addActionListener(new ButtonListener());
		
		cart = new JButton("Place Order");
		cart.setBorderPainted(true);
		cart.setPreferredSize(new Dimension(40, 40));
		//	cart.addActionListener(new ButtonListener());
		
		editContactJB = new JButton("Edit Contact Info");
		editContactJB.setBorderPainted(true);
		editContactJB.setPreferredSize(new Dimension(40, 40));
		editContactJB.addActionListener(new ButtonListener());
		
		editPaymentJB = new JButton("Edit Payment Info");
		editPaymentJB.setBorderPainted(true);
		editPaymentJB.setPreferredSize(new Dimension(40, 40));
		//	editPaymentJB.addActionListener(new ButtonListener());
		
		//-------------------------------------
		// add to panels				
		//-------------------------------------
		
		headerPanel.add(home);
		headerPanel.add(loginHeader);
		headerPanel.add(cart);
		
		panel1.add(headerJL);
		panel1.add(contactJL);
		panel1.add(contactTA);
		//panel1.add(editContactJB);
		panel1.add(paymentJL);
		panel1.add(paymentTA);
		
		panel2.add(editContactJB);
		panel2.add(editPaymentJB);
		
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
	
	
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent evt) {
			if(evt.getSource()== editContactJB) {
				
				new ContactInformationGUI();
			}
		}
	}*/
	
}