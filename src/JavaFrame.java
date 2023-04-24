import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class JavaFrame extends JFrame {
	javax.swing.JButton zero;
	javax.swing.JButton one;
	javax.swing.JButton two;
	javax.swing.JButton three;
	javax.swing.JButton four;
	javax.swing.JButton five;
	javax.swing.JButton six;
	javax.swing.JButton seven;
	javax.swing.JButton eight;
	javax.swing.JButton nine;
	
	javax.swing.JLabel display;
	
	
	
	JavaFrame(){
		super("Scientific Calculator");
		GridLayout gb = new GridLayout(8, 4);
//		GridBagConstraints gbc = new GridBagConstraints();
		setLayout(gb);
		
//		setMinimumSize(new Dimension(400,400));
		display = new javax.swing.JLabel("Hello World");
		
		zero = new javax.swing.JButton("0");
		one = new javax.swing.JButton("1");
		two = new javax.swing.JButton("2");
		three = new javax.swing.JButton("3");
		four = new javax.swing.JButton("4");
		five = new javax.swing.JButton("5");
		six = new javax.swing.JButton("6");
		seven = new javax.swing.JButton("7");
		eight = new javax.swing.JButton("8");
		nine = new javax.swing.JButton("9");
		
		
		
//		gbc.fill = gbc.HORIZONTAL;
//		add(zero,gbc);e 
//		add(one,gbc);
//		add(two , gbc);
//		
//		add(display);
		
		add(display);
		add(one);
		add(two);
		add(three);
		add(four);
		add(five);
		add(six);
		add(seven);
		add(eight);
		add(nine);
		add(zero);
		
	}
	public static void main(String[] args) {
		JavaFrame frame = new JavaFrame();
		frame.setSize(800,800);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
