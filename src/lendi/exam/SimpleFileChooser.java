package lendi.exam;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;




public class SimpleFileChooser extends JFrame {
	
	

		public SimpleFileChooser() {
			
				 super("File Chooser Test Frame");
				 setSize(600, 600);
				 setDefaultCloseOperation(EXIT_ON_CLOSE);	
				 Container c = getContentPane();
				 c.setLayout(new FlowLayout());
				 JButton openButton = new JButton("Open");
				 final JLabel statusbar = new JLabel("Output of your selection will go here");
				
				 // Create a file chooser that opens up as an Open dialog
				 openButton.addActionListener(new ActionListener() {
					 
				   public void actionPerformed(ActionEvent ae) {
					   
				     JFileChooser chooser = new JFileChooser();
				     chooser.setMultiSelectionEnabled(true);
				     int option = chooser.showOpenDialog(SimpleFileChooser.this);
				     if (option == JFileChooser.APPROVE_OPTION) 
				     {
				    	 File[] sf = chooser.getSelectedFiles();
				    	 String filelist = "nothing";
				    	 if (sf.length > 0) 
				    		 filelist = sf[0].getName();
				    	 for (int i = 1; i < sf.length; i++) 
				    	 {
				    		 filelist += ", " + sf[i].getName();
				    	 }
				    	 statusbar.setText("You chose " + filelist);
				     }
				     else 
				     {
				       statusbar.setText("You canceled.");
				     }
				   }
				 });
				
				 c.add(openButton);
				 c.add(statusbar);
				 
				 
				  JLabel headerLabel = new JLabel("", JLabel.CENTER);        
			      final JLabel statusLabel = new JLabel("",JLabel.CENTER);
			      
			      statusLabel.setSize(350,100);

			      JPanel controlPanel = new JPanel();
			      controlPanel.setLayout(new FlowLayout());

			      c.add(headerLabel);
			      c.add(statusLabel);
			      c.add(controlPanel);
			      final DefaultComboBoxModel<String> deptName = new DefaultComboBoxModel<String>();

			      deptName.addElement("CSE");
			      deptName.addElement("ECE");
			      deptName.addElement("EEE");
			      deptName.addElement("MECH");

			      final JComboBox<String> deptCombo = new JComboBox<String>(deptName);    
			      deptCombo.setSelectedIndex(0);

			      JScrollPane deptListScrollPane = new JScrollPane(deptCombo);    

			      JButton showButton = new JButton("Export");
			      controlPanel.add(deptListScrollPane);          
//			      controlPanel.add(showButton);
			      JLabel  namelabel= new JLabel("Enter Path to Save: ", JLabel.RIGHT);
			      final JTextField userText = new JTextField(20);
			      controlPanel.add(namelabel);
			      controlPanel.add(userText);
			      controlPanel.add(showButton);
		
		}
		
				

		public static void main(String args[]) {
			
				SimpleFileChooser sfc = new SimpleFileChooser();
		
				sfc.setVisible(true);
		}
}