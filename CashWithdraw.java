import java.awt.Color;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class CashWithdraw extends JFrame{
	public CashWithdraw(){
		setResizable(false);
		getContentPane().setBackground(new Color(240, 255, 240));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 100, 662, 600);
		this.getContentPane().setLayout(null);
	}

}

