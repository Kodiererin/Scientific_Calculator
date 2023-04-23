import java.awt.BorderLayout;
import java.awt.FlowLayout;

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
	
	
	JavaFrame(){
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
		
		setLayout(new BorderLayout());
		add(zero , RIGHT_ALIGNMENT);
		add(one , RIGHT_ALIGNMENT);
		add(two);
		add(three);
		add(four);
		add(five);
		add(six);
		add(seven);
		add(eight);
		add(nine);
		
	}
	
	
}
