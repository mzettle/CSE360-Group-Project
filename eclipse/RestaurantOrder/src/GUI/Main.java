package GUI;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;

import data.AccountDatabase;
import data.MenuList;

public class Main {
	
	public static MenuList menu;
	public static AccountDatabase accounts;
	public static boolean refresh = true;
	
	private static JFrame frame;
	private static JPanel panel; //panel for cardlayout
	private static CardLayout cards; //cardlayout manager
	public static MenuItemGUI itemWindow;
	public static AccountGUI accountGUI;
	public static PaymentInformationGUI paymentInfoGUI;
	public static ContactInformationGUI contactInfoGUI;
	private static CartGUI cartGUI;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu = new MenuList();
		accounts = new AccountDatabase();
		
		menu.readFile(new File("test.tsv"));
		accounts.readFile(new File("users.tsv"));
		
		//initialize main window frame
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(1100, 800));
		
		//initialize main panel with cardlayout
		cards = new CardLayout();
		panel = new JPanel();
		panel.setLayout(cards);
		
		
		//add all gui interfaces to the cardlayout
		panel.add(new MenuGUI(), "MenuGUI");
		panel.add(new SignInGUI(), "SignInGUI");
		cartGUI = new CartGUI();
		panel.add(cartGUI, "CartGUI");
		accountGUI = new AccountGUI();
		panel.add(accountGUI, "AccountGUI");
		contactInfoGUI = new ContactInformationGUI();
		panel.add(contactInfoGUI, "ContactInformationGUI");
		paymentInfoGUI = new PaymentInformationGUI();
		panel.add(paymentInfoGUI, "PaymentInformationGUI");
		panel.add(new RegisterGUI(), "RegisterGUI");
		
		//show MenuGUI first
		cards.show(panel, "MenuGUI");
		
		frame.setTitle("Menu Home");
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		refresh = false;
	}
	
	
	//function to easily change views using each interface's CardLayout name
	public static void switchView(String name) {
		cards.show(panel,  name);
		if(name == "CartGUI") cartGUI.updateCart();
	}

}
