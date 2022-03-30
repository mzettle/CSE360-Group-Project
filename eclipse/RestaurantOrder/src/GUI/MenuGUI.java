package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class MenuGUI extends JPanel {
	JFrame frame;
	protected JPanel panel, panel2, headerPanel, appetizerPanel, entreePanel, appetizerItems, entreeItems;
	protected JTextField searchTF;
	protected JButton login, home, cart;
	
	protected ArrayList<JButton> appetizerButtons, entreeButtons;
	
	protected JScrollBar rightSB;
	protected JLabel appetizerJL, entreeJL, descriptionJL;
	
	public MenuGUI() {
		
		Dimension menuItemSize = new Dimension(100,100);
		
		frame = new JFrame("Menu Home");
		
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
		
		appetizerItems = new JPanel();
		entreeItems = new JPanel();
		
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
	//	home.addActionListener(new ButtonListener());
				
		login = new JButton("Sign In/Register");
		login.setBorderPainted(true);
	//	login.addActionListener(new ButtonListener());
		
		cart = new JButton("Place Order");
		cart.setBorderPainted(true);
	//	cart.addActionListener(new ButtonListener());
		
		
		//FIX THIS TO IMPORT MENUITEMS
		appetizerButtons = new ArrayList<JButton>();
		entreeButtons = new ArrayList<JButton>();
		
		for(int i = 0; i<Main.menu.appetizerArray.size(); i++) {
			appetizerButtons.add(new JButton(new ImageIcon(Main.menu.appetizerArray.get(i).getPicPath())));
			appetizerButtons.get(i).setPreferredSize(menuItemSize);
			appetizerButtons.get(i).addActionListener(new AppetizerItemListener());
		}
		
		for(int i=0; i<Main.menu.entreeArray.size(); i++) {
			entreeButtons.add(new JButton(new ImageIcon(Main.menu.entreeArray.get(i).getPicPath())));
			entreeButtons.get(i).setPreferredSize(menuItemSize);
			entreeButtons.get(i).addActionListener(new EntreeItemListener());
		}
		
		//-------------------------------------
		// JLabel
		//-------------------------------------
		appetizerJL = new JLabel("Appetizers", SwingConstants.LEFT);
		appetizerJL.setForeground(Color.black);
		appetizerJL.setFont(new Font(Font.SERIF, Font.BOLD, 20));
		
		entreeJL = new JLabel("Entrées", SwingConstants.LEFT);
		entreeJL .setForeground(Color.black);
		entreeJL .setFont(new Font(Font.SERIF, Font.BOLD, 20));
		
		String description = "Click on an item to view its description or add it to your cart. Make sure to sign in or create an account!";
		
		descriptionJL = new JLabel(description, SwingConstants.CENTER);
		descriptionJL .setForeground(Color.black);
		descriptionJL .setFont(new Font(Font.SERIF , Font.PLAIN, 20));
		
		//-------------------------------------
		// JScrollBar
		//-------------------------------------
		rightSB = new JScrollBar();
		rightSB.setPreferredSize(new Dimension(20, 0));
		
		
		//-------------------------------------
		// populate menu items panels
		//-------------------------------------
		for(int i=0; i<appetizerButtons.size(); i++) {
			appetizerItems.add(appetizerButtons.get(i));
		}
		
		for(int i=0; i<entreeButtons.size(); i++) {
			entreeItems.add(entreeButtons.get(i));
		}
		
		
		//-------------------------------------
		// add to panels				
		//-------------------------------------
		headerPanel.add(home);
		headerPanel.add(searchTF);
		headerPanel.add(login);
		headerPanel.add(cart);
		
		appetizerPanel.add(appetizerJL, BorderLayout.NORTH);
		appetizerPanel.add(new JScrollPane(appetizerItems), BorderLayout.CENTER);
		
		entreePanel.add(entreeJL, BorderLayout.NORTH);		
		entreePanel.add(new JScrollPane(entreeItems), BorderLayout.CENTER);
		
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
	
	private class AppetizerItemListener implements ActionListener{
		@Override
		
		public void actionPerformed(ActionEvent event) {			
			int index = appetizerButtons.indexOf(event.getSource());
			System.out.println("Appetizer Item " + index + " Clicked");
			JDialog itemWindow = new MenuItemGUI("appetizer", index);
			itemWindow.pack();
			frame.setEnabled(false);
			itemWindow.setVisible(true);
			frame.setEnabled(true);
			frame.toFront();
		}
	}
	
	private class EntreeItemListener implements ActionListener{
		@Override
		
		public void actionPerformed(ActionEvent event) {			
			int index = entreeButtons.indexOf(event.getSource());
			System.out.println("Entree Item " + index + " Clicked");
			JDialog itemWindow = new MenuItemGUI("entree", index);
			itemWindow.pack();
			frame.setEnabled(false);
			itemWindow.setVisible(true);
			frame.setEnabled(true);
			frame.toFront();
			
		}
	}
	
	
}
