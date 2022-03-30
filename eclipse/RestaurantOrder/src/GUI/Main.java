package GUI;

import java.io.File;

import data.MenuList;

public class Main {
	
	public static MenuList menu = new MenuList();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu.readFile(new File("test.tsv"));
		MenuGUI MainMenu = new MenuGUI();
		
	}

}
