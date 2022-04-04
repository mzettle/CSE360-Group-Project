package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import data.MenuList;

import javax.swing.*;
	
public class MenuItemGUI extends JDialog  {
	
	JPanel headerPanel, panel, panel2;
	JLabel headerJL, picLabel, descriptionJL, ingredientsJL, condimentsJL, qtyJL;
	JButton addToCartJB;
	JTextArea descriptionTA,ingredientsTA;
	JSpinner qtyJS;
	JCheckBox condiment1CB, condiment2CB;
	data.MenuItem item;
	
	public MenuItemGUI(String category, int index) {
		
		
		
		String itemName = "", itemDesc = "", itemPic = "";
		double itemPrice = -1.0;
		
		switch(category) {
		case "appetizer":	itemName = Main.menu.appetizerArray.get(index).getName();
							itemDesc = Main.menu.appetizerArray.get(index).getDesc();
							itemPic = Main.menu.appetizerArray.get(index).getPicPath();
							itemPrice = Main.menu.appetizerArray.get(index).getPrice();
							item = Main.menu.appetizerArray.get(index);
							break;
							
		case "entree":		itemName = Main.menu.entreeArray.get(index).getName();
							itemDesc = Main.menu.entreeArray.get(index).getDesc();
							itemPic = Main.menu.entreeArray.get(index).getPicPath();
							itemPrice = Main.menu.entreeArray.get(index).getPrice();
							item = Main.menu.entreeArray.get(index);
							break;
							
		case "dessert":		itemName = Main.menu.dessertArray.get(index).getName();
							itemDesc = Main.menu.dessertArray.get(index).getDesc();
							itemPic = Main.menu.dessertArray.get(index).getPicPath();
							itemPrice = Main.menu.dessertArray.get(index).getPrice();
							item = Main.menu.dessertArray.get(index);
							break;
							
		case "drink":		itemName = Main.menu.drinkArray.get(index).getName();
							itemDesc = Main.menu.drinkArray.get(index).getDesc();
							itemPic = Main.menu.drinkArray.get(index).getPicPath();
							itemPrice = Main.menu.drinkArray.get(index).getPrice();
							item = Main.menu.drinkArray.get(index);
							break;
							
		default:			return;
		
		}
		
		
		
		
		
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
		panel.setLayout(new GridLayout(5, 1));
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
		headerJL = new JLabel(itemName + " - $" + itemPrice, SwingConstants.CENTER);
		headerJL.setForeground(Color.black);
		headerJL.setFont(new Font("Time", Font.BOLD, 10));
		
		// picLabel = new JLabel(new ImageIcon(itemPic));
		// picLabel.setPreferredSize(new Dimension(100,100));
		// Utilizes resizing function from Image and converts back into ImageIcon to
		// initialize in JLabel
		ImageIcon imgIcon = new ImageIcon(itemPic);
		Image toImg = imgIcon.getImage();
		Image resizedImg = toImg.getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		picLabel = new JLabel(new ImageIcon(resizedImg));
		picLabel.setPreferredSize(new Dimension(100,100));
		
		descriptionJL = new JLabel("Description:", SwingConstants.LEFT);
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
		descriptionTA.setLineWrap(true);
		descriptionTA.setText(itemDesc);
		
		ingredientsTA = new JTextArea(20,20);
		ingredientsTA.setEditable(false);
		ingredientsTA.setBackground(Color.LIGHT_GRAY);
		ingredientsTA.setFont(new Font("Time", Font.BOLD, 10));
		
		//-------------------------------------
		// JButton
		//-------------------------------------
		addToCartJB = new JButton("Add to Cart");
		addToCartJB.setBorderPainted(true);
		addToCartJB.addActionListener(new ButtonListener());
		
		//-------------------------------------
		// JButton
		//-------------------------------------
		qtyJS = new JSpinner(new SpinnerNumberModel(1, 1, 100, 1));
		
		//-------------------------------------
		// JCheckBox
		//-------------------------------------
		condiment1CB = new JCheckBox("Ranch");
		condiment2CB = new JCheckBox("BBQ");
		
		//-------------------------------------
		// add to panels				
		//-------------------------------------
		headerPanel.add(new JLabel(itemName));
		headerPanel.add(new JLabel("---", SwingConstants.CENTER)); //center label for header
		headerPanel.add(new JLabel("$" + String.format("%.2f", itemPrice), SwingConstants.RIGHT));
		panel.add(picLabel);
		panel.add(descriptionJL);
		panel.add(descriptionTA);
		panel.add(ingredientsJL);
		panel.add(ingredientsTA);
//		panel.add(condimentsJL);
//		panel.add(condiment1CB);
//		panel.add(condiment2CB);
		panel2.add(addToCartJB);
		panel2.add(qtyJL);
		panel2.add(qtyJS);
		
		//-------------------------------------
		// add to frame				
		//-------------------------------------
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setPreferredSize(new Dimension(500, 800));
		add(headerPanel, "North");
		add(panel, "Center");
		add(panel2, "South");
		setModal(true);
		setName("Add Item to Cart");
	}
	
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			if(event.getSource() == addToCartJB) {
				int qty = (int) qtyJS.getValue();
				Main.menu.addToCart(item, qty);
				dispose();
			}
		}
	}
	
}

