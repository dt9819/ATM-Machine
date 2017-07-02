import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


@SuppressWarnings("serial")
public class Mainwindow extends JFrame{
	TextArea textArea = new TextArea();
		
	public Mainwindow() {
		super("ATM Machine");
		setResizable(false);
		getContentPane().setBackground(new Color(240, 255, 240));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 100, 662, 600);
		this.getContentPane().setLayout(null);
		
		JLabel lblNewLabel1 = new JLabel("Main Window");
		lblNewLabel1.setForeground(new Color(255, 0, 0));
		lblNewLabel1.setBackground(new Color(255, 0, 0));
		lblNewLabel1.setFont(new Font("Century Gothic", Font.BOLD, 40));
		lblNewLabel1.setBounds(201, 33, 321, 52);
		getContentPane().add(lblNewLabel1);
		
		JLabel lblNewLabel2 = new JLabel("Select the option from below: ");
		lblNewLabel2.setForeground(new Color(255, 0, 0));
		lblNewLabel2.setBackground(new Color(255, 0, 0));
		lblNewLabel2.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblNewLabel2.setBounds(230, 65, 321, 52);
		getContentPane().add(lblNewLabel2);
		
		//Update Personal Details Button Function
				JButton btnUpdatepinfo = new JButton("Edit Personal Info");
				btnUpdatepinfo.setBackground(new Color(117, 116, 116));
				btnUpdatepinfo.setForeground(new Color(255, 255, 255));
				btnUpdatepinfo.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					    UpdateInfo upinfo=new UpdateInfo();
					    setVisible(false);
					    upinfo.setVisible(true);
					}
				});
				btnUpdatepinfo.setFont(new Font("Century Gothic", Font.BOLD, 15));
				btnUpdatepinfo.setBounds(0, 130, 180, 50);
				getContentPane().add(btnUpdatepinfo);
		
		//Check Balance Button Function
				JButton btnchkbal = new JButton("Check Balance");
				btnchkbal.setBackground(new Color(117, 116, 116));
				btnchkbal.setForeground(new Color(255, 255, 255));
				btnchkbal.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						CheckBalance chkbal=new CheckBalance();
					    setVisible(false);
					    chkbal.setVisible(true);
					}
				});
				btnchkbal.setFont(new Font("Century Gothic", Font.BOLD, 15));
				btnchkbal.setBounds(0, 180, 180, 50);
				getContentPane().add(btnchkbal);
				
		//Transfer Button Function
				JButton btntransfer = new JButton("Transfer Amount");
				btntransfer.setBackground(new Color(117, 116, 116));
				btntransfer.setForeground(new Color(255, 255, 255));
				btntransfer.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						TransferAmount transferamt=new TransferAmount();
					    setVisible(false);
					    transferamt.setVisible(true);
				
					}
				});
				btntransfer.setFont(new Font("Century Gothic", Font.BOLD, 15));
				btntransfer.setBounds(0, 230, 180, 50);
				getContentPane().add(btntransfer);
				
				
		//Cash Withdraw Button Function
				JButton btnwithdraw = new JButton("Cash Withdraw");
				btnwithdraw.setBackground(new Color(117, 116, 116));
				btnwithdraw.setForeground(new Color(255, 255, 255));
				btnwithdraw.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						CashWithdraw cashwith=new CashWithdraw();
					    setVisible(false);
					    cashwith.setVisible(true);
				
					}
				});
				btnwithdraw.setFont(new Font("Century Gothic", Font.BOLD, 15));
				btnwithdraw.setBounds(0, 280, 180, 50);
				getContentPane().add(btnwithdraw);
				
		//Update Pin Button Function
				JButton btnpin = new JButton("Update Pin");
				btnpin.setBackground(new Color(117, 116, 116));
				btnpin.setForeground(new Color(255, 255, 255));
				btnpin.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						PinUpdate updpin=new PinUpdate();
					    setVisible(false);
					    updpin.setVisible(true);
				
					}
				});
				btnpin.setFont(new Font("Century Gothic", Font.BOLD, 15));
				btnpin.setBounds(0, 330, 180, 50);
				getContentPane().add(btnpin);
				
		//Request Service Button Function
				JButton btnservice = new JButton("Request Service");
				btnservice.setBackground(new Color(117, 116, 116));
				btnservice.setForeground(new Color(255, 255, 255));
				btnservice.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						ServiceRequest reqservice=new ServiceRequest();
					    setVisible(false);
					    reqservice.setVisible(true);
				
					}
				});
				btnservice.setFont(new Font("Century Gothic", Font.BOLD, 15));
				btnservice.setBounds(0, 380, 180, 50);
				getContentPane().add(btnservice);
		
		//Textarea Information
				textArea.setEditable(false);
				//textArea.setEnabled(false);
				textArea.setText(input1);
				textArea.setFont(new Font("Arial", Font.PLAIN, 12));
				textArea.setForeground(Color.BLACK);
				textArea.setBounds(250, 130, 385, 300);
				getContentPane().add(textArea);
				textArea.setBackground(new Color(255, 255, 255));	
				
		
		JLabel lblNewLabel3 = new JLabel("Developed by Deepak Tyagi");
		lblNewLabel3.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel3.setBounds(50, 478, 321, 32);
		getContentPane().add(lblNewLabel3);
		
		JLabel lblNewLabel4 = new JLabel("Blogger at 'http://www.engineerslyf.blogspot.com'");
		lblNewLabel4.setFont(new Font("Century Gothic", Font.BOLD, 10));
		lblNewLabel4.setBounds(50, 490, 321, 32);
		getContentPane().add(lblNewLabel4);
		
		JLabel lblNewLabel5 = new JLabel("Linkedin: www.linkedin.com/in/deepak-tyagi");
		lblNewLabel5.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblNewLabel5.setBounds(330, 478, 321, 32);
		getContentPane().add(lblNewLabel5);
		
		JLabel lblNewLabel6 = new JLabel("Github:  https://github.com/dt9819/");
		lblNewLabel6.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblNewLabel6.setBounds(330, 490, 321, 32);
		getContentPane().add(lblNewLabel6);
		
		
	}
	
	String input1="Security tips: "
			+ "\n1. Do not reveal passwords over phone/email etc. to any person \nincluding Bank."
			+ "\n2. Change your password & Pin regularly. Keep your password a \ncombination of alphabets, special characters and numbers."
			+ "\n3. Don't Click on website links/attachments in un-known/ \nsuspicious emails. These links may take you to replica of bank's\n website and ask for keying in your user-id and password(s)."
			+ "\n4. In case of doubt,reconfirm the PNB's website by double clicking\nthe 'padlock' symbol/icon in address bar to ensure the site is \nrunning in secure mode BEFORE you input any confidential/ \nsensitive information."
			+ "\n5. Clicking on the 'padlock' symbol/icon and on server certification\n symbol will display details of the server certification in the favour\n of Bank."
			+ "\n6. To ensure safe and genuine login,always enter bank's website\n either through www.netbank.com"
			+ "\n7. In case there is any call, please confirm that call is from the\n authorized person of the bank."
			+ "\n8. Our bank does not ask for details of your account/pin/password.\n Therefore any one pretending to be asking you information from\n the bank/technical team may be fraudulent entities, so please \nbeware. You should know how to operate net transactions and if\n you are not familiar you may refrain from doing so. You may seek\n bank's guidance in this regard. Bank is not resposible for online\n transaction going wrong. We shall also not be responsible for\n wrong transactions and wanton disclosure of details by you.\n Viewing option and transactions option on the net are different.\n You may exercise your option diligently.";
	
}
