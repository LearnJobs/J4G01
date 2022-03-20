import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Calculator extends JFrame
{
	JPanel pa=new JPanel();
	JTextField tb=new JTextField("0");
	JButton[] bt=new JButton[20];
	int cv;
	String ob=null;
	boolean task=false;
	public Calculator()
	{
		super("Calculator");
		setSize(400,450);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		addTextBox();
		setVisible(true);
    }
	private void addTextBox()
	{
		tb.setBounds(20,20,350,45);
		add(tb);
		tb.setHorizontalAlignment(JTextField.RIGHT);
		tb.setFont(new Font("arial",Font.BOLD,20));
		tb.setEditable(false);
		tb.setBackground(Color.white);
		tb.setBorder(BorderFactory.createLineBorder(Color.black));
		addButtons();	
	}
	private void addButtons()
	{
		pa.setBounds(20,90,350,300);
		add(pa);
		pa.setLayout(new GridLayout(5,4,5,15));
		Font font=new Font("arial",Font.PLAIN,20);
		String[]str= {"Back","CE","C","%","7","8","9","/","4","5","6","*","1","2","3","-","0",".","=","+"};
		CalListener listener=new CalListener();
		for(int i=0;i<20;i++)
		{
			bt[i]=new JButton(str[i]);
			bt[i].addActionListener(listener);
			bt[i].setFont(font);
			if(i==3||i==7||i==11||i==15||i==18||i==19)
				bt[i].setForeground(Color.red);
			else
				bt[i].setForeground(Color.blue);
			pa.add(bt[i]);
		}
	}
    class CalListener implements ActionListener
	{
		public void actionPerformed(ActionEvent evt) 
		{
			JButton bb=(JButton)evt.getSource();
			String v1=bb.getText();
			String v2=tb.getText();
			if(v1.equals("+")||v1.equals("-")||v1.equals("*")||v1.equals("/"))
			{
				cv=Integer.parseInt(v2);
				ob=v1;
				task=true;
			}
			if(v1.equals("0")||v1.equals("1")||v1.equals("2")||v1.equals("3")||v1.equals("4")||v1.equals("5")||v1.equals("6")||v1.equals("7")||v1.equals("8")||v1.equals("9"))
			{
				if(v2.equals("0")|| task)
				{
					tb.setText(v1);
					task=false;
				}
				else
				{
					tb.setText(v2+v1);
				}
			}
			if(bb==bt[18])//=button
			{
				cal();
			}
			if(bb==bt[2])//c button
			{
				task=false;
				ob=null;
				cv=0;
				tb.setText("0");				
			}
		}
		private void cal()
		{
			if(ob.equals("+"))
			{
				int res=cv+Integer.parseInt(tb.getText());
				tb.setText(String.valueOf(res));
			}
			else if(ob.equals("*"))
			{
				int res=cv*Integer.parseInt(tb.getText());
				tb.setText(String.valueOf(res));
			}
			else if(ob.equals("-"))
			{
				int res=cv-Integer.parseInt(tb.getText());
				tb.setText(String.valueOf(res));
			}
			else if(ob.equals("/"))
			{
		    	int res=cv/Integer.parseInt(tb.getText());
				tb.setText(String.valueOf(res));
			}
	    }
	}
	public static void main(String[] args) 
	{
		new Calculator();		
	}
}