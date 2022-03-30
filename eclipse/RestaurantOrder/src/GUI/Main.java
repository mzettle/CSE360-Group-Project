package GUI;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import data.MenuList;

public class Main {
	
	public static MenuList menu = new MenuList();
	
	private static JFrame frame;
	private static JPanel panel;
	private static CardLayout cards;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu.readFile(new File("test.tsv"));

		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(1100, 600));
		
		cards = new CardLayout();
		panel = new JPanel();
		panel.setLayout(cards);
		
		
		panel.add(new MenuGUI(), "MenuGUI");
		panel.add(new SignInGUI(), "SignInGUI");
		
		
		cards.show(panel, "MenuGUI");
		
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void switchView(String name) {
		cards.show(panel,  name);
	}

}
