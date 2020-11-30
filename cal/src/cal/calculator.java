package cal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculator {

	private JFrame frame;
	private JTextField txtdisplay;
	double firstnum,secondnum;
	String Operations;
	double result;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 391, 330);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
	
		
		txtdisplay = new JTextField();
		txtdisplay.setBounds(10, 20, 345, 38);
		frame.getContentPane().add(txtdisplay);
		txtdisplay.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String iNum=txtdisplay.getText()+btn7.getText();
				txtdisplay.setText(iNum);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn7.setBounds(10, 87, 61, 38);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String iNum=txtdisplay.getText()+btn8.getText();
				txtdisplay.setText(iNum);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn8.setBounds(81, 87, 61, 38);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String iNum=txtdisplay.getText()+btn9.getText();
				txtdisplay.setText(iNum);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn9.setBounds(152, 87, 61, 38);
		frame.getContentPane().add(btn9);
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				firstnum=Double.parseDouble(txtdisplay.getText());
				txtdisplay.setText("");
				Operations="/";
			}
		});
		btndiv.setFont(new Font("Tahoma", Font.BOLD, 13));
		btndiv.setBounds(223, 87, 61, 38);
		frame.getContentPane().add(btndiv);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String iNum=txtdisplay.getText()+btn4.getText();
				txtdisplay.setText(iNum);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn4.setBounds(10, 135, 61, 38);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String iNum=txtdisplay.getText()+btn5.getText();
				txtdisplay.setText(iNum);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn5.setBounds(81, 135, 61, 38);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String iNum=txtdisplay.getText()+btn6.getText();
				txtdisplay.setText(iNum);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn6.setBounds(152, 135, 61, 38);
		frame.getContentPane().add(btn6);
		
		JButton btnmul = new JButton("*");
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				firstnum=Double.parseDouble(txtdisplay.getText());
				txtdisplay.setText("");
				Operations="*";
			}
		});
		btnmul.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnmul.setBounds(223, 135, 61, 38);
		frame.getContentPane().add(btnmul);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String iNum=txtdisplay.getText()+btn1.getText();
				txtdisplay.setText(iNum);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn1.setBounds(10, 183, 61, 38);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String iNum=txtdisplay.getText()+btn2.getText();
				txtdisplay.setText(iNum);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn2.setBounds(81, 183, 61, 38);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String iNum=txtdisplay.getText()+btn3.getText();
				txtdisplay.setText(iNum);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn3.setBounds(152, 183, 61, 38);
		frame.getContentPane().add(btn3);
		
		JButton btnsubtract = new JButton("-");
		btnsubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				firstnum=Double.parseDouble(txtdisplay.getText());
				txtdisplay.setText("");
				Operations="-";
			}
		});
		btnsubtract.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnsubtract.setBounds(223, 183, 61, 38);
		frame.getContentPane().add(btnsubtract);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String iNum=txtdisplay.getText()+btn0.getText();
				txtdisplay.setText(iNum);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn0.setBounds(10, 231, 132, 38);
		frame.getContentPane().add(btn0);
		
		JButton btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{

				if(! txtdisplay.getText().contains("."))
				{
					txtdisplay.setText(txtdisplay.getText()+btndot.getText()); 
				}
			}
		});
		btndot.setFont(new Font("Tahoma", Font.BOLD, 13));
		btndot.setBounds(152, 231, 61, 38);
		frame.getContentPane().add(btndot);
		
		JButton btnadd = new JButton("+");
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				firstnum=Double.parseDouble(txtdisplay.getText());
				txtdisplay.setText("");
				Operations="+";
			}
		});
		btnadd.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnadd.setBounds(223, 231, 61, 38);
		frame.getContentPane().add(btnadd);
		
		JButton btneql = new JButton("=");
		btneql.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				{
					String answer;
					secondnum=Double.parseDouble(txtdisplay.getText());
					if(Operations=="+")
					{
					result=firstnum+secondnum;
					answer=String.format("%.1f", result);
					txtdisplay.setText(answer);
					}
					else if(Operations=="-")
					{
					result=firstnum-secondnum;
					answer=String.format("%.1f", result);
					txtdisplay.setText(answer);
					}
					else if(Operations=="*")
					{
					result=firstnum*secondnum;
					answer=String.format("%.1f", result);
					txtdisplay.setText(answer);
					}
					else if(Operations=="/")
					{
					result= (firstnum / secondnum);
					answer=String.format("%.2f", result);
					txtdisplay.setText(answer);
					}

				}
			}
		});
		btneql.setFont(new Font("Tahoma", Font.BOLD, 13));
		btneql.setBounds(294, 183, 61, 86);
		frame.getContentPane().add(btneql);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				txtdisplay.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnC.setBounds(294, 135, 61, 38);
		frame.getContentPane().add(btnC);
		
		JButton btnCE = new JButton("CE");
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				double ops =Double.parseDouble(String.valueOf(txtdisplay.getText()));
				ops=ops * (-1);
				txtdisplay.setText(String.valueOf(ops));
			}
		});
		btnCE.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCE.setBounds(294, 87, 61, 38);
		frame.getContentPane().add(btnCE);
		
		txtdisplay = new JTextField();
		txtdisplay.setBounds(10, 32, 345, 28);
		frame.getContentPane().add(txtdisplay);
		txtdisplay.setColumns(10);
	}
}
