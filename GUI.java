import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GUI extends Frame{
	private JTextField txt1,txt2,txt3,txt4;
	private JLabel label1,label2,label3,label4;
	private JButton button1,button2,button3,button4,button5;
	JTextField [] Text = new JTextField[4];
	JLabel [] label = new JLabel[4];
	private int i;
public GUI(){
	/*txt1=new JTextField(10);
	txt2=new JTextField(10);
	txt3=new JTextField(10);
	txt4=new JTextField(10);*/
	
	label[0]=new JLabel("first name");
	label[1]=new JLabel("last name");
	label[2]=new JLabel("username");
	label[3]=new JLabel("password");
	button1=new JButton("turn in");
	button2=new JButton("2");
	button3=new JButton("3");
	button4=new JButton("4");
	button5=new JButton("5");
	String [] s1	=	{"FlowLayout","BorderLayout","GridLayout"};
	
	String s5=(String)JOptionPane.showInputDialog(null,"select the month","type",JOptionPane.QUESTION_MESSAGE,null,s1,s1[2]);
	switch(s5){
	case "FlowLayout":
		setLayout(new FlowLayout());
		for(int i=0;i<=3;i++){
			
		add(label[i]);	
		Text[i] = new JTextField(8);
		add(Text[i]);}
		add(button1);
		
		break;
	case"BorderLayout":
		setLayout(new BorderLayout());
		add(button1,BorderLayout.CENTER);
		add(button2,BorderLayout.EAST);
		add(button3,BorderLayout.WEST);
		add(button4,BorderLayout.NORTH);
		add(button5,BorderLayout.SOUTH);
		break;
	case"GridLayout":
		setLayout(new GridLayout(5,2));
		for(int i=0;i<=3;i++){
			
			add(label[i]);	
			Text[i] = new JTextField(8);
			add(Text[i]);}
		add(button1);
		break;
	}
	setVisible(true);
	setSize(new Dimension(500,500));
}
}