// GUI VERSION OF ROCK PAPER SCISSOR

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

enum Selection {ROCK, PAPER, SCISSOR}

class A1 extends JFrame
{
	Container c;
	JLabel lblmsg;
	JRadioButton rbRock, rbPaper, rbScissor;
	JButton btnSubmit;
	
	A1()
	{
		c = getContentPane();
		c.setLayout(null);
		
		Font f = new Font("Arial", Font.BOLD, 17);
		
		lblmsg = new JLabel("Please select any one option");
		rbRock = new JRadioButton("Rock", true);
		rbPaper = new JRadioButton("Paper");
		rbScissor = new JRadioButton("Scissor");
		btnSubmit = new JButton("Submit");
		
		lblmsg.setFont(f);
		rbRock.setFont(f);
		rbPaper.setFont(f);
		rbScissor.setFont(f);
		btnSubmit.setFont(f);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rbRock);
		bg.add(rbPaper);
		bg.add(rbScissor);
		
		lblmsg.setBounds(10, 10, 400, 20);
		rbRock.setBounds(10, 50, 200, 20);
		rbPaper.setBounds(10, 100, 200, 20);
		rbScissor.setBounds(10, 150, 200, 20);
		btnSubmit.setBounds(100, 200, 150, 35);
		
		c.add(lblmsg);
		c.add(rbRock);
		c.add(rbPaper);
		c.add(rbScissor);
		c.add(btnSubmit);
		
		ActionListener a1 = (ae) ->
		{
			Selection comp, user;
			
			//computer choice
			int r = (int)(Math.random() * 3);
			if (r == 0)			comp = Selection.ROCK;
			else if (r == 1)	comp = Selection.PAPER;
			else 				comp = Selection.SCISSOR;
			
			//user choice
			
			if (rbRock.isSelected())		user = Selection.ROCK;
			else if (rbPaper.isSelected())	user = Selection.PAPER;
			else 							user = Selection.SCISSOR;
			
			System.out.println(user + " " + comp);
			String msg = "\nuser = " + user + " computer= " + comp;
			
			// code to decide the winner
			if (comp == Selection.ROCK && user == Selection.ROCK)
				JOptionPane.showMessageDialog(c, "ITS A TIE" + msg);
			else if (comp == Selection.PAPER && user == Selection.PAPER)
				JOptionPane.showMessageDialog(c,"ITS A TIE" + msg);
			else if (comp == Selection.SCISSOR && user == Selection.SCISSOR)
				JOptionPane.showMessageDialog(c,"ITS A TIE" + msg);
			
			else if (comp == Selection.ROCK && user == Selection.SCISSOR)
				JOptionPane.showMessageDialog(c,"COMPUTER WINS" + msg);
			else if (comp == Selection.PAPER && user == Selection.ROCK)
				JOptionPane.showMessageDialog(c,"COMPUTER WINS" + msg);
			else if (comp == Selection.SCISSOR && user == Selection.PAPER)
				JOptionPane.showMessageDialog(c,"COMPUTER WINS" + msg);
			
			else if (user == Selection.ROCK && comp == Selection.SCISSOR)
				JOptionPane.showMessageDialog(c,"USER WINS" + msg);
			else if (user == Selection.PAPER && comp == Selection.ROCK)
				JOptionPane.showMessageDialog(c,"USER WINS" + msg);
			else if (user == Selection.SCISSOR && comp == Selection.PAPER)
				JOptionPane.showMessageDialog(c,"USER WINS" + msg);
		};
		btnSubmit.addActionListener(a1);
		
		setTitle("Rock Paper Scissor Game");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}
}

class Game_GUI
{
	public static void main(String args[])
	{
		A1 a = new A1();
	}
}