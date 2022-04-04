package GUI;

import java.awt.*;
import static javax.swing.JOptionPane.showMessageDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class AdminGUI extends JPanel {
	
	protected JPanel headerPanel, panel1, panel2, panel3;
	protected JLabel headerJL, reviewJL, subtotalJL;
	protected JButton loginHeader, home, cart, returnJB, checkoutJB, deleteJB;
	
	protected JTable cartItems;
	DefaultTableModel tableModel;
	
	protected String columns[] = {"Type", "Name", "Description", "Picture Path", "Price"};
	
	public AdminGUI() {
		
		Color  gray   = new Color(222, 222,  222);
		
		headerPanel = new JPanel();
		headerPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		headerPanel.setLayout(new GridLayout(1, 4));
		headerPanel.setBackground(Color.LIGHT_GRAY);
		
		panel1 = new JPanel();
		panel1.setBorder(BorderFactory.createEmptyBorder(15, 100, 20, 100));
		panel1.setLayout(new BorderLayout());
		//panel1.setLayout(new GridLayout(3, 1, 0, 0));
		panel1.setBackground(gray);
		
		
		panel2 = new JPanel();
		panel2.setBorder(BorderFactory.createEmptyBorder(25, 200, 70, 200));
		panel2.setLayout(new GridLayout(1, 3, 10, 10));	
		panel2.setBackground(gray);
		//panel2 = new JPanel();
		//panel2.setBorder(BorderFactory.createEmptyBorder(20, 220, 20, 220));
	//	panel2.setLayout(new GridLayout(1, 2, 10, 10));	
		//panel2.setBackground(gray);
		
		panel3 = new JPanel();
		panel3.setBorder(BorderFactory.createEmptyBorder(60, 220, 60, 260));
		panel3.setLayout(new GridLayout(4, 9, 10, 10));
		panel3.setBackground(gray);
		
		//-------------------------------------
		// JLabel
		//-------------------------------------
		headerJL = new JLabel("Account Information", SwingConstants.CENTER);
		headerJL.setForeground(Color.BLACK);
		headerJL.setFont(new Font(Font.SERIF, Font.BOLD, 30));
		headerJL.setPreferredSize(new Dimension(5,5));
		
		reviewJL = new JLabel("Admin Editor", SwingConstants.CENTER);
		reviewJL.setForeground(Color.BLACK);
		reviewJL.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
		
		reviewJL.setPreferredSize(new Dimension(50,80));
		
		String subtotal = "Subtotal : $";
		subtotalJL = new JLabel(subtotal, SwingConstants.CENTER);
		subtotalJL.setForeground(Color.BLACK);
		subtotalJL.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
		subtotalJL.setPreferredSize(new Dimension(50,80));
		
		
		//-------------------------------------
		// JButton
		//-------------------------------------
		home = new JButton("Home");
		home.setBorderPainted(true);
		home.setPreferredSize(new Dimension(40, 40));
		home.addActionListener(new ButtonListener());
				
		loginHeader = new JButton("Sign In/Register");
		loginHeader .setBorderPainted(true);
		loginHeader .setPreferredSize(new Dimension(40, 40));
		loginHeader.addActionListener(new ButtonListener());
		
		cart = new JButton("Place Order");
		cart.setBorderPainted(true);
		cart.setPreferredSize(new Dimension(40, 40));
		cart.addActionListener(new ButtonListener());
		
		returnJB = new JButton("Sign Out");
		returnJB.setBorderPainted(true);
		returnJB.setPreferredSize(new Dimension(50, 50));
		returnJB.addActionListener(new ButtonListener());
		
		checkoutJB = new JButton("Add Row");
		checkoutJB.setBorderPainted(true);
		checkoutJB.setPreferredSize(new Dimension(50, 50));
		checkoutJB.addActionListener(new ButtonListener());
		
		deleteJB = new JButton("Delete Selected");
		deleteJB.setBorderPainted(true);
		deleteJB.setPreferredSize(new Dimension(50, 50));
		deleteJB.addActionListener(new ButtonListener());
		
		//-------------------------------------
		//JTable
		//-------------------------------------
		
		tableModel = new DefaultTableModel(columns, 0);
		cartItems = new JTable(tableModel);
		cartItems.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		//-------------------------------------
		// add to panels				
		//-------------------------------------
		
		headerPanel.add(home);
		headerPanel.add(loginHeader);
		headerPanel.add(cart);
		
		panel1.add(reviewJL, "North");
		//JScrollPane scrollPane = new JScrollPane(panel3);
	//	panel1.add(scrollPane);
		panel1.add(new JScrollPane(cartItems), "Center");
		panel1.add(subtotalJL, "South");
		
		panel2.add(returnJB);
		panel2.add(deleteJB);
		panel2.add(checkoutJB);
		
		//-------------------------------------
		// add layout, and panels to frame
		//-------------------------------------
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(1100, 600));
	//	add(headerPanel, "North");
		add(panel1, "Center");
		add(panel2, "South");
		
	}
	
	private class TextFieldListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event) {
			
		}
	}
	
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			if(event.getSource() == cart) Main.switchView("CartGUI");
			if(event.getSource() == home || event.getSource() == returnJB) {
				Main.signOut();
				Main.switchView("MenuGUI");
				outputMenu();
				Main.close();
			}
			

			if(event.getSource() == checkoutJB) {
				tableModel.setRowCount(cartItems.getRowCount() + 1);
			}
			if(event.getSource() == deleteJB) {
				tableModel.removeRow(cartItems.getSelectedRow());
			}
		}
		
		
	}
	

	public void updateGUI() {
		try {
			BufferedReader TSVReader = new BufferedReader(new FileReader("menu.tsv"));
			
			String line = null;
			String[] row;
			
			while((line = TSVReader.readLine()) != null) {
				row = line.split("\t");
				
				tableModel.addRow(row);
			}
			
			TSVReader.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void outputMenu() {
		try {
			BufferedWriter TSVWriter = new BufferedWriter(new FileWriter("menu.tsv"));
		
			String line, cell;
		
			for(int i=0; i<tableModel.getRowCount(); i++) {
				line = "";
				for(int j=0; j<tableModel.getColumnCount(); j++) {
					
					if(tableModel.getValueAt(i, j).toString() != null) {
						cell = tableModel.getValueAt(i, j).toString();
					}
					else {
						cell = "";
					}
					
					line += tableModel.getValueAt(i, j).toString() + "\t";
				}
				TSVWriter.write(line + "\n");
			}
			TSVWriter.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}