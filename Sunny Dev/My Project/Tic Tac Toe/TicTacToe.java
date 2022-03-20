import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.applet.*;
public class TicTacToe extends JFrame
{
	JLabel img=new JLabel(new ImageIcon(getClass().getResource("images/t2.jpg")));
	JPanel [] pa=new JPanel[3];
	JLabel msg=new JLabel("First player turn...");
	JButton [] bt=new JButton[9];
	JButton reset=new JButton("RESET");
	JButton quit=new JButton("QUIT");
	ImageIcon icon1=new ImageIcon(getClass().getResource("images/user1.png"));
	ImageIcon icon2=new ImageIcon(getClass().getResource("images/user2.png"));
	boolean firstPlayerTun=true,winnerFound=false;
	int count=0;
	AudioClip clip1=Applet.newAudioClip(getClass().getResource("sounds/intro.mid"));
	AudioClip clip2=Applet.newAudioClip(getClass().getResource("sounds/s3.wav"));
	AudioClip clip3=Applet.newAudioClip(getClass().getResource("sounds/s4.wav"));
	JCheckBox mute=new JCheckBox("Mute");
	public TicTacToe()
	{
		super("Tic Tac Toe");
		setSize(500,650);
		setResizable(false);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setLocationRelativeTo(null);
		add(img);
		addPanels();
		clip1.loop();
		setVisible(true);
	}
	private void addPanels()
	{
		img.setLayout(null);
		for(int i=0;i<3;i++)
		{
			pa[i]=new JPanel();
			img.add(pa[i]);
		}
		pa[0].setBounds(50,30,400,40);
		pa[1].setBounds(50,100,400,400);
		pa[2].setBounds(50,530,400,40);
		addInfo();
	}
	private void addInfo()
	{
		pa[0].add(msg);
		msg.setFont(new Font("elephant",Font.PLAIN,25));
		msg.setForeground(Color.blue);
		pa[2].add (reset);
		reset.addActionListener(new ResetListener());
		pa[2].add(quit);
		pa[2].add(mute);
		reset.setEnabled(false);
		pa[2].setOpaque(false);
		Font fo=new Font("arial",0,20);
		reset.setFont(fo);
		quit.setFont(fo);
		mute.setFont(fo);
		mute.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				if(mute.isSelected())
					clip1.stop();
				else
					clip1.loop();
			}
		});
		quit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				int ch=JOptionPane.showConfirmDialog(TicTacToe.this,"Are you sure to quit");
				if(ch==0)
					System.exit(0);
			}
		});
		addButtons();
	}
	private void addButtons()
	{
		pa[1].setLayout(new GridLayout(3,3));
		Border border=BorderFactory.createLineBorder(Color.red,2);
		TicListener listener=new TicListener();
		for(int i=0;i<9;i++)
		{
			bt[i]=new JButton();
			bt[i].addActionListener(listener);
			bt[i].setBackground(Color.yellow);
			bt[i].setBorder(border);
			pa[1].add(bt[i]);
		}
	}
	class TicListener implements ActionListener
	{
		public void actionPerformed(ActionEvent evt)
		{
			JButton bb=(JButton)evt.getSource();
			if(bb.getIcon()!=null || winnerFound)
			{
				clip3.play();
				return;
			}
			if(firstPlayerTun)
			{
				bb.setIcon(icon1);
				msg.setText("Second player turn...");
				msg.setForeground(Color.magenta);
				firstPlayerTun=false;
				findWinner(icon1);
			}
			clip2.play();
			count++;
			if(count==9 && !winnerFound)
			{
				msg.setText("Game over...");
				msg.setForeground(Color.red);
				JOptionPane.showConfirmDialog(TicTacToe.this,"It's ended into tie");
				reset.setEnabled(true);
			}
		}
		private void findWinner(ImageIcon icon)
		{
			if(bt[0].getIcon()==icon && bt[1].getIcon()==icon && bt[2].getIcon()==icon)
				announceWinner(icon,0,1,2);
			if(bt[3].getIcon()==icon && bt[4].getIcon()==icon && bt[5].getIcon()==icon)
				announceWinner(icon,3,4,5);
			if(bt[6].getIcon()==icon && bt[7].getIcon()==icon && bt[8].getIcon()==icon)
				announceWinner(icon,6,7,8);
			if(bt[0].getIcon()==icon && bt[3].getIcon()==icon && bt[6].getIcon()==icon)
				announceWinner(icon,0,3,6);
			if(bt[1].getIcon()==icon && bt[4].getIcon()==icon && bt[7].getIcon()==icon)
				announceWinner(icon,1,4,7);
			if(bt[2].getIcon()==icon && bt[5].getIcon()==icon && bt[8].getIcon()==icon)
				announceWinner(icon,2,5,8);
			if(bt[0].getIcon()==icon && bt[4].getIcon()==icon && bt[8].getIcon()==icon)
				announceWinner(icon,0,4,8);
			if(bt[2].getIcon()==icon && bt[4].getIcon()==icon && bt[6].getIcon()==icon)
				announceWinner(icon,2,4,6);
		}
	    public void announceWinner(ImageIcon icon, int i, int j, int k) 
	    {
	    	msg.setText("Game over...");
	    	msg.setForeground(Color.red);
	    	bt[i].setBackground(Color.lightGray);
	    	bt[j].setBackground(Color.lightGray);
	    	bt[k].setBackground(Color.lightGray);
	    	winnerFound=true;
	    	if(icon==icon1)
	    		JOptionPane.showConfirmDialog(TicTacToe.this,"First player won");
	    	else
	    		JOptionPane.showConfirmDialog(TicTacToe.this,"Second player won");
	    	reset.setEnabled(true);
	    }
	}
	class ResetListener implements ActionListener
	{
		public void actionPerformed(ActionEvent evt)
		{
			count=0;
			firstPlayerTun=true;
			msg.setText("first player turn...");
			msg.setForeground(Color.blue);
			winnerFound=false;
			for(JButton tt:bt)
			{
				tt.setIcon(null);
				tt.setBackground(Color.yellow);
            }
			reset.setEnabled(false);
		}
	}
	public static void main(String[] args)
	{
		new TicTacToe();
	}	
}