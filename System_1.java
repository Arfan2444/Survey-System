package src;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class System_1 implements ActionListener{
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    JLabel label5;
    JLabel label6;
    JLabel label7;
    JLabel label8;
    JTextField tf1 = new JTextField();
    ;
    JPasswordField tf2 = new JPasswordField();
    JButton b1;
    JPanel panel1;
    JPanel panel2;
    JPanel panel3;
    JButton b2;
    JButton b3;
    JButton b4;
    static String user_input1;
    static String user_input2;
    ImageIcon img3 = new ImageIcon("src/show.png");
    int i = 0;

    JFrame frame = new JFrame();
    System_1() {

        Border border = BorderFactory.createLineBorder(Color.DARK_GRAY, 5);
        ImageIcon image = new ImageIcon("src/test.png");

        panel1 = new JPanel();
        panel1.setBounds(0, 120, 570, 510);
        panel1.setBackground(new Color(123, 50, 250));
        panel1.setLayout(null);

        panel2 = new JPanel();
        panel2.setBounds(0, 0, 570, 115);
        panel2.setBackground(new Color(255, 0, 127));
        panel2.setLayout(null);

        panel3 = new JPanel();
        panel3.setBounds(575, 0, 235, 620);
        panel3.setBackground(Color.BLUE);
        panel3.setLayout(null);
        panel3.setBorder(border);

        tf1.setText("");
        tf1.setBackground(Color.black);
        tf1.setForeground(Color.RED);
        tf1.setBounds(230, 150, 230, 35);
        tf1.setFont(new Font("Georgia", Font.BOLD, 15));

        tf2.setBackground(Color.BLACK);
        tf2.setForeground(Color.RED);
        tf2.setFont(new Font("Georgia", Font.BOLD, 15));
        tf2.setEchoChar('\u0000');
        tf2.setBounds(230, 250, 230, 35);

        b1 = new JButton();
        b1.setBounds(480, 250, 35, 35);
        b1.setBackground(new Color(123, 50, 250));
        b1.setIcon(img3);
        b1.setOpaque(true);
        b1.addActionListener(this);

        label1 = new JLabel();
        label1.setText("Welcome To Online Survey System.");
        label1.setBounds(120, 50, 380, 50);
        label1.setFont(new Font("Comic Sans", Font.PLAIN, 23));

        label2 = new JLabel();
        label2.setBounds(120, 143, 100, 40);
        label2.setText("Username :");
        label2.setForeground(Color.BLACK);
        label2.setFont(new Font("Times New Roman", Font.ITALIC, 18));

        label3 = new JLabel();
        label3.setBounds(40, 243, 195, 40);
        label3.setText("Registered Product-id :");
        label3.setForeground(Color.BLACK);
        label3.setFont(new Font("Times New Roman", Font.ITALIC, 18));

        panel1.add(tf1);
        panel1.add(tf2);
        panel1.add(b1);
        panel1.add(label2);
        panel1.add(label3);
        panel1.setBorder(border);

        ImageIcon img = new ImageIcon("src/alternate1.png");

        label4 = new JLabel();
        label4.setBounds(30, 10, 110, 100);
        label4.setIcon(img);
        label4.setOpaque(true);
        label4.setBackground(new Color(255, 0, 127));

        label5 = new JLabel();
        label5.setBounds(170, 10, 380, 90);
        label5.setText("Welcome To Online Survey System");
        label5.setFont(new Font("Comic sans", Font.BOLD, 22));
        label5.setOpaque(true);
        label5.setBackground(new Color(255, 0, 127));

        label6 = new JLabel();
        label6.setBounds(30, 20, 500, 30);
        label6.setFont(new Font("Arial Black", Font.ITALIC, 16));
        label6.setText("The Result of a business is a Satisfied customer!");

        label7 = new JLabel();
        label7.setBounds(110, 40, 500, 30);
        label7.setFont(new Font("Arial Black", Font.PLAIN, 13));
        label7.setText("- Peter Ducker,Father of Management Thinking");

        ImageIcon img2 = new ImageIcon("src/online-survey.png");

        label8 = new JLabel();
        label8.setIcon(img2);
        label8.setBounds(50, 150, 150, 200);

        panel1.add(label6);
        panel1.add(label7);

        panel2.add(label4);
        panel2.add(label5);
        panel2.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        panel2.setBorder(border);

        b2 = new JButton();
        b2.setText("About us");
        b2.setBounds(10, 380, 90, 30);
        b2.setFocusable(false);
        b2.setBackground(Color.BLUE);
        b2.setBorder(border);

        b3 = new JButton();
        b3.setText("Why choose us");
        b3.setBounds(110, 380, 120, 30);
        b3.setFocusable(false);
        b3.setBackground(Color.BLUE);
        b3.setBorder(border);

        b4 = new JButton();
        b4.setText("Submit");
        b4.setBounds(230, 350, 90, 30);
        b4.setFocusable(false);
        b4.setBackground(new Color(123, 50, 250));
        b4.setBorder(border);
        b4.addActionListener(this);

        panel1.add(b4);

        panel3.add(label8);
        panel3.add(b2);
        panel3.add(b3);

        frame.setTitle("Online Survey System.");
        frame.setSize(820, 620);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setIconImage(image.getImage());
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
    }

    public static void main(String[] args) {
        System_1 obj1 = new System_1();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b4){
            user_input1 = tf1.getText();
            user_input2 = tf2.getText();
            Connection_1 obj = new Connection_1();
        }

    }
}
