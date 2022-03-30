import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;


public class SwingTest extends JPanel {

	MenuList menu;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame();//creating instance of JFrame  
        
		JButton b=new JButton("click");//creating instance of JButton  
		b.setBounds(130,100,100, 40);//x axis, y axis, width, height  
		          
		f.add(b);//adding button in JFrame  
		          
		f.setSize(400,500);//400 width and 500 height  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible  
		
		//robyn
	}
	
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			menu.readFile(new File("test.tsv"));
		}
	}

}
