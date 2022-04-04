package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;




public class MenuGUI extends JPanel {
	//JFrame frame;
	protected JPanel panel, panel2, headerPanel, appetizerPanel, entreePanel, appetizerItems, entreeItems, drinkPanel, dessertPanel, drinkItems, dessertItems;
	protected JTextField searchTF;
	protected JButton login, home, cart;
	
	protected ArrayList<JButton> appetizerButtons, entreeButtons, dessertButtons, drinkButtons;
	
	protected JScrollBar rightSB;
	protected JLabel appetizerJL, entreeJL, descriptionJL, drinkJL, dessertJL;
	
	private String defaultDescription = "Click on an item to view its description or add it to your cart. Make sure to sign in or create an account!";
	
	public MenuGUI() {
		
		Dimension menuItemSize = new Dimension(200,130), categoryDim = new Dimension(1000,1000);
		
		
		headerPanel = new JPanel();
		headerPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		headerPanel.setLayout(new GridLayout(1, 4));
		headerPanel.setBackground(Color.LIGHT_GRAY);
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(5,1));
		panel.setPreferredSize(new Dimension(0,1000));
		panel.setBackground(Color.WHITE);
		
		appetizerPanel = new JPanel();
		appetizerPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 1, 20));
		appetizerPanel.setLayout(new BorderLayout());
		appetizerPanel.setBackground(Color.LIGHT_GRAY);
		appetizerPanel.setPreferredSize(categoryDim);
		
		entreePanel = new JPanel();
		entreePanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 1, 20));
		entreePanel.setLayout(new BorderLayout());
		entreePanel.setBackground(Color.LIGHT_GRAY);
		
		dessertPanel = new JPanel();
		dessertPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 1, 20));
		dessertPanel.setLayout(new BorderLayout());
		dessertPanel.setBackground(Color.LIGHT_GRAY);
		
		drinkPanel = new JPanel();
		drinkPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 1, 20));
		drinkPanel.setLayout(new BorderLayout());
		drinkPanel.setBackground(Color.LIGHT_GRAY);
		
		panel2 = new JPanel();
		panel2.setBorder(BorderFactory.createEmptyBorder(5, 30, 30, 30));
		panel2.setPreferredSize(new Dimension(100, 100));
		panel2.setLayout(new BorderLayout());
		panel2.setBackground(Color.WHITE);
		
		appetizerItems = new JPanel();
		entreeItems = new JPanel();
		drinkItems = new JPanel();
		dessertItems = new JPanel();
		
		
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
		
		
		//FIX THIS TO IMPORT MENUITEMS
		appetizerButtons = new ArrayList<JButton>();
		entreeButtons = new ArrayList<JButton>();
		dessertButtons = new ArrayList<JButton>();
		drinkButtons = new ArrayList<JButton>();
		
		for(int i = 0; i<Main.menu.appetizerArray.size(); i++) {
			ImageIcon imgIcon = new ImageIcon(Main.menu.appetizerArray.get(i).getPicPath());
			Image toImg = imgIcon.getImage();
			Image resizedImg = toImg.getScaledInstance(100, 100, Image.SCALE_DEFAULT);
			appetizerButtons.add(new JButton(Main.menu.appetizerArray.get(i).getName(), new ImageIcon(resizedImg)));
			appetizerButtons.get(i).setPreferredSize(menuItemSize);
			appetizerButtons.get(i).addActionListener(new ItemListener());
			appetizerButtons.get(i).setVerticalTextPosition(SwingConstants.BOTTOM);
			appetizerButtons.get(i).setHorizontalTextPosition(SwingConstants.CENTER);
		}
		
		for(int i=0; i<Main.menu.entreeArray.size(); i++) {
			ImageIcon imgIcon = new ImageIcon(Main.menu.entreeArray.get(i).getPicPath());
			Image toImg = imgIcon.getImage();
			Image resizedImg = toImg.getScaledInstance(100, 100, Image.SCALE_DEFAULT);
			entreeButtons.add(new JButton(Main.menu.entreeArray.get(i).getName() ,new ImageIcon(resizedImg)));
			entreeButtons.get(i).setPreferredSize(menuItemSize);
			entreeButtons.get(i).addActionListener(new ItemListener());
			entreeButtons.get(i).setVerticalTextPosition(SwingConstants.BOTTOM);
			entreeButtons.get(i).setHorizontalTextPosition(SwingConstants.CENTER);
			
		}
		
		for(int i=0; i<Main.menu.dessertArray.size(); i++) {
			ImageIcon imgIcon = new ImageIcon(Main.menu.dessertArray.get(i).getPicPath());
			Image toImg = imgIcon.getImage();
			Image resizedImg = toImg.getScaledInstance(100, 100, Image.SCALE_DEFAULT);
			dessertButtons.add(new JButton(Main.menu.dessertArray.get(i).getName() ,new ImageIcon(resizedImg)));
			dessertButtons.get(i).setPreferredSize(menuItemSize);
			dessertButtons.get(i).addActionListener(new ItemListener());
			dessertButtons.get(i).setVerticalTextPosition(SwingConstants.BOTTOM);
			dessertButtons.get(i).setHorizontalTextPosition(SwingConstants.CENTER);
			
		}
		
		for(int i=0; i<Main.menu.drinkArray.size(); i++) {
			ImageIcon imgIcon = new ImageIcon(Main.menu.drinkArray.get(i).getPicPath());
			Image toImg = imgIcon.getImage();
			Image resizedImg = toImg.getScaledInstance(100, 100, Image.SCALE_DEFAULT);
			drinkButtons.add(new JButton(Main.menu.drinkArray.get(i).getName() ,new ImageIcon(resizedImg)));
			drinkButtons.get(i).setPreferredSize(menuItemSize);
			drinkButtons.get(i).addActionListener(new ItemListener());
			drinkButtons.get(i).setVerticalTextPosition(SwingConstants.BOTTOM);
			drinkButtons.get(i).setHorizontalTextPosition(SwingConstants.CENTER);
			
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
		
		dessertJL = new JLabel("Desserts", SwingConstants.LEFT);
		dessertJL .setForeground(Color.black);
		dessertJL .setFont(new Font(Font.SERIF, Font.BOLD, 20));
		
		drinkJL = new JLabel("Drinks", SwingConstants.LEFT);
		drinkJL .setForeground(Color.black);
		drinkJL .setFont(new Font(Font.SERIF, Font.BOLD, 20));
		
		descriptionJL = new JLabel(defaultDescription, SwingConstants.CENTER);
		descriptionJL .setForeground(Color.black);
		descriptionJL .setFont(new Font(Font.SERIF , Font.PLAIN, 20));
		
		//-------------------------------------
		// JScrollBar
		//------------------------------------
		
		
		//-------------------------------------
		// populate menu items panels
		//-------------------------------------
		for(int i=0; i<appetizerButtons.size(); i++) {
			appetizerItems.add(appetizerButtons.get(i));
		}
		
		for(int i=0; i<entreeButtons.size(); i++) {
			entreeItems.add(entreeButtons.get(i));
		}
		
		for(int i=0; i<drinkButtons.size(); i++) {
			drinkItems.add(drinkButtons.get(i));
		}

		for(int i=0; i<dessertButtons.size(); i++) {
			dessertItems.add(dessertButtons.get(i));
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
		
		dessertPanel.add(dessertJL, BorderLayout.NORTH);		
		dessertPanel.add(new JScrollPane(dessertItems), BorderLayout.CENTER);
		
		drinkPanel.add(drinkJL, BorderLayout.NORTH);		
		drinkPanel.add(new JScrollPane(drinkItems), BorderLayout.CENTER);
		
		panel.add(appetizerPanel);
		panel.add(entreePanel);
		panel.add(dessertPanel);
		panel.add(drinkPanel);
		
		panel2.add(descriptionJL, BorderLayout.CENTER);
		
		searchTF.setEnabled(false);
		

		
		//-------------------------------------
		// add layout, and panels to frame
		//-------------------------------------
	//	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//	frame.setPreferredSize(new Dimension(1100, 600));
		setLayout(new BorderLayout());
		add(headerPanel, "North");
		add(new JScrollPane(panel), "Center");
		add(panel2, "South");
	//	frame.pack();
	//	frame.setVisible(true);
		
	}
	
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			
			//used for debug purposes:
			if(event.getSource() == home) {
				System.out.println("accounts in list: " + Main.accounts.users.size());
				for(int i=0; i<Main.accounts.users.size(); i++) {
					System.out.println(Main.accounts.users.get(i).getUsername());
				}
			}
			
			//Navigation buttons
			if(event.getSource() == login) {
				
				//sign in button
				if(Main.cust == null) Main.switchView("SignInGUI"); //sign in if nobody is signed in
				else Main.signOut(); //else sign out
			}
			if(event.getSource() == cart) Main.switchView("CartGUI");
		}
	}
		
		private class ItemListener implements ActionListener{
			@Override
			
			public void actionPerformed(ActionEvent event) {			
				int[] indexArr = new int[4];
				
				indexArr[0] = entreeButtons.indexOf(event.getSource());
				indexArr[1] = appetizerButtons.indexOf(event.getSource());
				indexArr[2] = dessertButtons.indexOf(event.getSource());; // for dessert
				indexArr[3] = drinkButtons.indexOf(event.getSource());; //for drinks
				
				//look for maximum index and use this to determine type of item selected
				int itemType = 0, index = indexArr[0];
				String itemTypeString = "null";
				
				for(int i=1; i<indexArr.length; i++) {
					if(indexArr[i] > index) {
						itemType = i;
						index = indexArr[i];
					}
				}
				
				switch(itemType){
				case 0:
					itemTypeString = "entree";
					break;
				case 1:
					itemTypeString = "appetizer";
					break;
				case 2:
					itemTypeString = "dessert";
					break;
				case 3:
					itemTypeString = "drink";
					break;
				default:
					return;
				}
				System.out.println(itemTypeString + " Item " + index + " Clicked");
				Main.itemWindow = new MenuItemGUI(itemTypeString, index);
				Main.itemWindow.pack();
				//frame.setEnabled(false);
				Main.itemWindow.setVisible(true);
				while(Main.itemWindow.isVisible()) {} //wait until itemWindow closes to re-enable
				//frame.setEnabled(true);
				//frame.toFront();
				
			}
	}
	
		public void updateLogin() {
			if(Main.cust == null) {
				descriptionJL.setText(defaultDescription);
				login.setText("Sign In/Register");
			}
			else {
				descriptionJL.setText("Welcome, " + Main.cust.contactInfo.firstName + "!");
				login.setText("Sign Out");
			}
		}
	
}
