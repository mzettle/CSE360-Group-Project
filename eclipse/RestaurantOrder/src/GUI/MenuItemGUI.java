package GUI;
import java.awt.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
	
public class MenuItemGUI extends JPanel  {
	
	public MenuItemGUI() {
		
		JFrame frame = new JFrame("Menu Home");
		
		JPanel headerPanel, panel, panel2;
		JLabel headerJL, descriptionJL, ingredientsJL, condimentsJL, qtyJL;
		JButton addToCartJB;
		JTextArea descriptionTA,ingredientsTA;
		JSpinner qtyJS;
		JCheckBox condiment1CB, condiment2CB;
		
		
		
		//
		//-------------------------------------
		// JPanel
		//-------------------------------------
		headerPanel = new JPanel();
		headerPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		headerPanel.setLayout(new GridLayout(1, 3));
		headerPanel.setBackground(Color.LIGHT_GRAY);
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
		panel.setLayout(new GridLayout(7, 1));
		panel.setBackground(Color.LIGHT_GRAY);
		
		panel2 = new JPanel();
		panel2.setBorder(BorderFactory.createEmptyBorder(10, 40, 10, 40));
		panel2.setPreferredSize(new Dimension(60, 60));
		
		//GridLayout(row, column)
		panel2.setLayout(new GridLayout(1, 3));
		panel2.setBackground(Color.LIGHT_GRAY);
		
		//-------------------------------------
		// new JLabels
		//-------------------------------------
		headerJL = new JLabel("Food Name", SwingConstants.CENTER);
		headerJL.setForeground(Color.black);
		headerJL.setFont(new Font("Time", Font.BOLD, 10));
		
		descriptionJL = new JLabel("Description", SwingConstants.LEFT);
		descriptionJL.setForeground(Color.black);
		descriptionJL.setFont(new Font("Time", Font.BOLD, 10));
		
		ingredientsJL = new JLabel("Ingredients", SwingConstants.LEFT);
		ingredientsJL.setForeground(Color.black);
		ingredientsJL.setFont(new Font("Time", Font.BOLD, 10));
		
		condimentsJL = new JLabel("condiments", SwingConstants.LEFT);
		condimentsJL.setForeground(Color.black);
		condimentsJL.setFont(new Font("Time", Font.BOLD, 10));
		
		qtyJL = new JLabel("QTY:", SwingConstants.RIGHT);
		qtyJL.setFont(new Font("Time", Font.BOLD, 10));
		
		//-------------------------------------
		// new JTextArea
		//-------------------------------------
		descriptionTA = new JTextArea(20,20);
		descriptionTA.setEditable(false);
		descriptionTA.setBackground(Color.LIGHT_GRAY);
		descriptionTA.setFont(new Font("Time", Font.BOLD, 10));
		
		ingredientsTA = new JTextArea(20,20);
		ingredientsTA.setEditable(false);
		ingredientsTA.setBackground(Color.LIGHT_GRAY);
		ingredientsTA.setFont(new Font("Time", Font.BOLD, 10));
		
		//-------------------------------------
		// JButton
		//-------------------------------------
		addToCartJB = new JButton("Add to Cart");
		addToCartJB.setBorderPainted(true);
		
		//-------------------------------------
		// JButton
		//-------------------------------------
		qtyJS = new JSpinner();
		
		//-------------------------------------
		// JCheckBox
		//------------------------------------_
		condiment1CB = new JCheckBox("Ranch");
		condiment2CB = new JCheckBox("BBQ");
		
		//-------------------------------------
		// add to panels				
		//-------------------------------------
		headerPanel.add(headerJL);
		panel.add(descriptionJL);
		panel.add(descriptionTA);
		panel.add(ingredientsJL);
		panel.add(ingredientsTA);
		panel.add(condimentsJL);
		panel.add(condiment1CB);
		panel.add(condiment2CB);
		panel2.add(addToCartJB);
		panel2.add(qtyJL);
		panel2.add(qtyJS);
		
		//-------------------------------------
		// add to frame				
		//-------------------------------------
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(500, 300));
		frame.add(headerPanel, "North");
		frame.add(panel, "Center");
		frame.add(panel2, "South");
		frame.pack();
		frame.setVisible(true);
	}
/*
	public static void MenuItemGUI() {
		new MenuItemGUI();
	}
*/
}

