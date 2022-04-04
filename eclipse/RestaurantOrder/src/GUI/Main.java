package GUI;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;
import static javax.swing.JOptionPane.showMessageDialog;

import data.AccountDatabase;
import data.Customer;
import data.MenuList;

public class Main {
	
	public static MenuList menu;
	public static AccountDatabase accounts;
	public static Customer cust = null;
	
	private static JFrame frame;
	private static JPanel panel; //panel for cardlayout
	private static CardLayout cards; //cardlayout manager
	public static MenuItemGUI itemWindow;
	public static AccountGUI accountGUI;
	public static PaymentInformationGUI paymentInfoGUI;
	public static PaymentInformationGUI checkoutPaymentGUI;
	public static ContactInformationGUI contactInfoGUI;
	private static CartGUI cartGUI;
	private static MenuGUI menuGUI;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu = new MenuList();
		accounts = new AccountDatabase();
		
		menu.readFile(new File("menu.tsv"));
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
		menuGUI = new MenuGUI();
		panel.add(menuGUI, "MenuGUI");
		panel.add(new SignInGUI(), "SignInGUI");
		cartGUI = new CartGUI();
		panel.add(cartGUI, "CartGUI");
		accountGUI = new AccountGUI();
		panel.add(accountGUI, "AccountGUI");
		contactInfoGUI = new ContactInformationGUI();
		panel.add(contactInfoGUI, "ContactInformationGUI");
		paymentInfoGUI = new PaymentInformationGUI(false);
		panel.add(paymentInfoGUI, "PaymentInformationGUI");
		checkoutPaymentGUI = new PaymentInformationGUI(true);
		panel.add(checkoutPaymentGUI, "CheckoutPaymentGUI");
		panel.add(new RegisterGUI(), "RegisterGUI");
		
		//show MenuGUI first
		cards.show(panel, "MenuGUI");
		
		frame.setTitle("Menu Home");
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}
	
	
	//function to easily change views using each interface's CardLayout name
	public static void switchView(String name) {
		cards.show(panel,  name);
		if(name == "CartGUI") cartGUI.updateCart();
		if(name == "MenuGUI") menuGUI.updateLogin();
	}
	
	public static void signOut() {
		cust = null;
		switchView("MenuGUI");
		showMessageDialog(null, "You have sucessfully signed out!");
	}

}
