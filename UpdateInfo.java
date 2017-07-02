import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class UpdateInfo extends JFrame{
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	public JTextField textField_3;
	public JTextField textField_4;
	public JTextField textField_5;
	public JTextField textField_6;
	public JTextField textField_7;
	/*Pattern pattern;
	Matcher matcher;
	static final String email="[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";*/
	
	public UpdateInfo(){
		setResizable(false);
		getContentPane().setBackground(new Color(240, 255, 240));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 0, 680, 730);
		this.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Personal information");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 30));
		lblNewLabel.setBounds(201, 33, 340, 52);
		getContentPane().add(lblNewLabel);
		
		JLabel lblAccno = new JLabel("Account No");
		lblAccno.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblAccno.setBounds(134, 134, 137, 32);
		getContentPane().add(lblAccno);
		
		textField = new JTextField();
		textField.setBackground(new Color(135, 206, 250));
		textField.setEditable(false);
		textField.setFont(new Font("Century Gothic", Font.BOLD, 20));
		textField.setBounds(269, 134, 272, 34);
		getContentPane().add(textField);
		textField.setColumns(10);
		textField.setText(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblName.setBounds(134, 198, 137, 32);
		getContentPane().add(lblName);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(135, 206, 250));
		textField_1.setEditable(false);
		textField_1.setText((String) null);
		textField_1.setFont(new Font("Century Gothic", Font.BOLD, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(269, 196, 272, 34);
		getContentPane().add(textField_1);
		
		JLabel lblEmailid = new JLabel("Email_ID");
		lblEmailid.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblEmailid.setBounds(134, 266, 137, 32);
		getContentPane().add(lblEmailid);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(135, 206, 250));
		textField_2.setText((String) null);
		textField_2.setFont(new Font("Century Gothic", Font.BOLD, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(269, 264, 175, 34);
		getContentPane().add(textField_2);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBackground(new Color(117, 116, 116));
		btnUpdate.setForeground(new Color(255, 255, 255));
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			    /*if (e.getSource() == btnUpdate){
	        	boolean b=valid();
	            } */
				
			}
		});
		btnUpdate.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btnUpdate.setBounds(445, 264, 100, 34);
		getContentPane().add(btnUpdate);
		
		JLabel lblState = new JLabel("State");
		lblState.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblState.setBounds(134, 333, 137, 32);
		getContentPane().add(lblState);
		
		textField_3 = new JTextField();
		textField_3.setBackground(new Color(135, 206, 250));
		textField_3.setEditable(false);
		textField_3.setText((String) null);
		textField_3.setFont(new Font("Century Gothic", Font.BOLD, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(269, 333, 272, 34);
		getContentPane().add(textField_3);
		
		JLabel lblAddL = new JLabel("Address");
		lblAddL.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblAddL.setBounds(134, 399, 137, 32);
		getContentPane().add(lblAddL);
		
		textField_4 = new JTextField();
		textField_4.setBackground(new Color(135, 206, 250));
		textField_4.setEditable(false);
		textField_4.setText((String) null);
		textField_4.setFont(new Font("Century Gothic", Font.BOLD, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(269, 397, 272, 34);
		getContentPane().add(textField_4);
		
		JLabel lblAadhaarNo = new JLabel("Aadhaar No");
		lblAadhaarNo.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblAadhaarNo.setBounds(134, 470, 137, 32);
		getContentPane().add(lblAadhaarNo);
		
		textField_5 = new JTextField();
		textField_5.setBackground(new Color(135, 206, 250));
		textField_5.setText((String) null);
		textField_5.setFont(new Font("Century Gothic", Font.BOLD, 20));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(269, 468, 272, 34);
		getContentPane().add(textField_5);
		
		JLabel lblMobileNo = new JLabel("Mobile No");
		lblMobileNo.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblMobileNo.setBounds(134, 541, 137, 32);
		getContentPane().add(lblMobileNo);
		
		textField_6 = new JTextField();
		textField_6.setBackground(new Color(135, 206, 250));
		textField_6.setText((String) null);
		textField_6.setFont(new Font("Century Gothic", Font.BOLD, 20));
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(269, 539, 272, 34);
		getContentPane().add(textField_6);
		
		JLabel lblpanno = new JLabel("PAN No");
		lblpanno.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblpanno.setBounds(134, 612, 137, 32);
		getContentPane().add(lblpanno);
		
		textField_7 = new JTextField();
		textField_7.setBackground(new Color(135, 206, 250));
		textField_7.setText((String) null);
		textField_7.setFont(new Font("Century Gothic", Font.BOLD, 20));
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(269, 610, 272, 34);
		getContentPane().add(textField_7);
	}

	/*public boolean valid(){
		if(!isValidEmail())
		{
			JOptionPane.showMessageDialog(null,"Please write your email id correctly","Error",JOptionPane.ERROR_MESSAGE);	
		    return false;
		}
		return false;
	}
	
	private boolean isValidEmail() {
		pattern=Pattern.compile(email);
		matcher=pattern.matcher(textField_2.getText().toString());
		return matcher.matches();
	}*/
}
