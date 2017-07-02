/* This is basic java application developed by DEEPAK TYAGI. 
 * This application is built in swing and also include database connectivity using MYSQL
 * This application perform basic operations of an ATM Machine.
 * So the operation involves transactions, pin update, profile info update, view balance, transfer amount.  */
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;   
   

@SuppressWarnings("serial")
public class Admin extends JFrame {
	private JTextField textField;
	private JPasswordField passwordField;
	
	public static void main(String[] args) {
		Admin admin =new Admin();
		admin.setVisible(true);	
		
	}
	
	public Admin() {
		super("ATM Machine");
		getContentPane().setBackground(new Color (211,211,211));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 150, 662, 477);
		this.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ATM Machine");
		lblNewLabel.setForeground(new Color(255, 51, 51));
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 30));
		lblNewLabel.setBounds(230, 34, 297, 52);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 255));
		textField.setFont(new Font("Century Gothic", Font.BOLD, 20));
		textField.setBounds(269, 134, 272, 34);
		getContentPane().add(textField);
		textField.setColumns(10);
		textField.setText(null);
		
		JLabel lblUserName = new JLabel("Card No ");
		lblUserName.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblUserName.setBounds(134, 134, 137, 32);
		getContentPane().add(lblUserName);
		
		JLabel lblPassword = new JLabel("Pin");
		lblPassword.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblPassword.setBounds(134, 206, 137, 32);
		getContentPane().add(lblPassword);
		
		//Register Button Function
		JButton btnRegister = new JButton("Next");
		btnRegister.setForeground(new Color(255, 255, 255));
		btnRegister.setBackground(new Color(96, 96, 96));
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().length()==0)  // Checking for empty field
				      JOptionPane.showMessageDialog(null, "Empty fields detected ! Please fill up all fields");
				else if(passwordField.getPassword().length==0)  // Checking for empty field
				      JOptionPane.showMessageDialog(null, "Empty fields detected ! Please fill up all fields");
				else{
				       String user = textField.getText();   // Collecting the input
				       char[] pass = passwordField.getPassword(); // Collecting the input
				       String pwd = String.copyValueOf(pass);  // converting from array to string
				if(validate_login(user,pwd)){
				      setVisible(false);
			          Mainwindow login=new Mainwindow();
				      login.setVisible(true);}
				else
				          JOptionPane.showMessageDialog(null, "Incorrect Login Credentials");
				          textField.setText("Enter Card No");
				          passwordField.setText(null);
				   }        
			}
			
			private boolean validate_login(String card_no,String pin_no) {
				   try{           
				       //Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
				       //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ATM_Machine","root","root"); 
					   Connection conn=connectionDB.mycon();
				       PreparedStatement pst = conn.prepareStatement("Select * from admin where card_no=? and pin_no=?");
				       pst.setString(1, card_no);
				       pst.setString(2, pin_no);
				       ResultSet rs = pst.executeQuery();                        
				       if(rs.next())            
				           return true;    
				       else
				           return false;            
				   }
				   catch(Exception e){
				       e.printStackTrace();
				       return false;
				   }       
				}
			
		});
		btnRegister.setFont(new Font("Century Gothic", Font.BOLD, 20));
		btnRegister.setBounds(156, 293, 146, 50);
		getContentPane().add(btnRegister);
		
		//Reset Button Function
		JButton btnReset = new JButton("Reset");
		btnReset.setForeground(new Color(255, 255, 255));
		btnReset.setBackground(new Color(96, 96, 96));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				passwordField.setText(null);
				textField.setText(null);
			}
		});
		btnReset.setFont(new Font("Century Gothic", Font.BOLD, 20));
		btnReset.setBounds(379, 293, 146, 50);
		getContentPane().add(btnReset);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(255, 255, 255));
		passwordField.setEchoChar('*');
		passwordField.setBounds(269, 195, 272, 40);
		getContentPane().add(passwordField);
	}
}
