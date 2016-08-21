package lendi.exam;
import java.awt.FlowLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.CheckboxGroup;
import java.awt.Checkbox;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class donate extends JFrame implements ActionListener {
	JLabel name,age,year,branch,address,gender,colname,bldgrp;
	JTextField n,a,y,b,clg,bgrp;
	JButton submit;
	CheckboxGroup ln;
	TextArea ad;
	public donate()
	{	
		setContentPane(new JLabel(new ImageIcon("C:\\Users\\Public\\Pictures\\Sample Pictures\\img3.jpg")));
		name = new JLabel("Name:");
		add(name);
		n = new JTextField(10);
		add(n);
		age = new JLabel("Age:");
		add(age);
		a = new JTextField(3);
		add(a);
		gender = new JLabel("Gender:");
		add(gender);
		ln = new CheckboxGroup();
		Checkbox male=new Checkbox("Male",ln,true);
		Checkbox female=new Checkbox("Female",ln,true);
		add(male);
		add(female);
		year = new JLabel("Year:");
		add(year);
		y = new JTextField(3);
		add(y);
		branch = new JLabel("Branch:");
		add(branch);
		b = new JTextField(10);
		add(b);
		bldgrp = new JLabel("Blood Group:");
		add(bldgrp);
		bgrp = new JTextField(10);
		add(bgrp);
		colname = new JLabel("College Name:");
		add(colname);
		clg = new JTextField(10);
		add(clg);
		address = new JLabel("Address:");
		add(address);
		ad = new TextArea(5,30);
		add(ad);
		submit = new JButton("Submit");
		add(submit);
		submit.addActionListener(this);
	}
		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==submit)
			{
				String sname=n.getText().toString();
				String age=a.getText().toString();
				String gender = ln.getSelectedCheckbox().getLabel().toString();	
				String year = y.getText().toString();
				String branch = b.getText().toString();
				String coleg = clg.getText().toString();
				String grp = bgrp.getText().toString();
				String addr = ad.getText().toString();	
				try {		
						Class.forName("oracle.jdbc.driver.OracleDriver");
						Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ravi", "ravi");
						PreparedStatement ps = con.prepareStatement("insert into blood values(?,?,?,?,?,?,?,?)");
						ps.setString(1, sname);
						ps.setString(2, age);
						ps.setString(3, gender);
						ps.setString(4, year);
						ps.setString(5, branch);
						ps.setString(6, coleg);
						ps.setString(7, grp);
						ps.setString(8, addr);
						int data= ps.executeUpdate();
						if(data==1)
							JOptionPane.showMessageDialog(null, "Data Inserted");
						else
							JOptionPane.showMessageDialog(null, "Data not Inserted");
					} catch (Exception e) {		
						e.printStackTrace();
					}
					//repaint();
			}
		}
	public static void main(String[] args) {
		donate d=new donate();
		d.setSize(500,700);
		d.setVisible(true);	
		d.setLayout(new FlowLayout(FlowLayout.CENTER,10,100));
		//d.setBounds(300, 400, 300, 300);
		d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}