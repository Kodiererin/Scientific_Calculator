import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JavaFrame extends JFrame {
    JButton zero;
    JButton one;
    JButton two;
    JButton three;
    JButton four;
    JButton five;
    JButton six;
    JButton seven;
    JButton eight;
    JButton nine;

    JLabel display;

    JavaFrame() {
        super("Scientific Calculator");
        GridBagLayout gb = new GridBagLayout();
        setLayout(gb);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 4;
        display = new JLabel("Hello World");
        gb.setConstraints(display, gbc);
        add(display);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        one = new JButton("1");
        gb.setConstraints(one, gbc);
        add(one);

        gbc.gridx = 1;
        two = new JButton("2");
        gb.setConstraints(two, gbc);
        add(two);

        gbc.gridx = 2;
        three = new JButton("3");
        gb.setConstraints(three, gbc);
        add(three);

        gbc.gridx = 3;
        four = new JButton("4");
        gb.setConstraints(four, gbc);
        add(four);

        gbc.gridx = 0;
        gbc.gridy = 2;
        five = new JButton("5");
        gb.setConstraints(five, gbc);
        add(five);

        gbc.gridx = 1;
        six = new JButton("6");
        gb.setConstraints(six, gbc);
        add(six);

        gbc.gridx = 2;
        seven = new JButton("7");
        gb.setConstraints(seven, gbc);
        add(seven);

        gbc.gridx = 3;
        eight = new JButton("8");
        gb.setConstraints(eight, gbc);
        add(eight);

        gbc.gridx = 0;
        gbc.gridy = 3;
        nine = new JButton("9");
        gb.setConstraints(nine, gbc);
        add(nine);

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        zero = new JButton("0");
        gb.setConstraints(zero, gbc);
        add(zero);
    }

    public static void main(String[] args) {
        JavaFrame frame = new JavaFrame();
        frame.setSize(400, 700);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
