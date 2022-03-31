package GUI;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import data.MenuList;

public class Main {
	
	public static MenuList menu = new MenuList();
	
	private static JFrame frame;
	private static JPanel panel; //panel for cardlayout
	private static CardLayout cards; //cardlayout manager
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu.readFile(new File("test.tsv"));

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
	}

}
