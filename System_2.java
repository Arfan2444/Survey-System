package src;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;

public class System_2 implements ChangeListener, ActionListener, KeyListener, ItemListener {
    JFrame frame2 = new JFrame();
    JPanel panel4 = new JPanel();
    JPanel panel5 = new JPanel();
    JRadioButton radioButton1;
    JRadioButton radioButton2;
    JRadioButton radioButton3;
    JRadioButton radioButton4;
    ButtonGroup buttonGroup = new ButtonGroup();
    JRadioButton radioButton5;
    JLabel label9 = new JLabel();
    JLabel label10 = new JLabel();
    JLabel label11 = new JLabel();
    JLabel label12 = new JLabel();
    JLabel label13 = new JLabel();
    JLabel label14 = new JLabel();
    JLabel label15 = new JLabel();
    JSlider slider1 = new JSlider(0, 100, 50);
    JTextArea textArea = new JTextArea();
    Checkbox checkbox1 = new Checkbox("packaging");
    Checkbox checkbox2 = new Checkbox("delivery");
    Checkbox checkbox3 = new Checkbox("product reliability");
    Checkbox checkbox4 = new Checkbox("product cost");
    Checkbox checkbox5 = new Checkbox("discounts");
    String rating[] = {"1star", "2star", "3star", "4star", "5star"};
    static String choice1;
    static String choice2;
    static String choice3;
    static String choice4 = "not lacking";
    static String choice5 = "not lacking";
    static String choice6 = "not lacking";
    static String choice7 = "not lacking";
    static String choice8 = "not lacking";
    static String choice9 ;
    JButton button = new JButton();
    JComboBox comboBox = new JComboBox(rating);

    System_2() {
        ImageIcon image = new ImageIcon("src/test.png");

        Border border = BorderFactory.createLineBorder(Color.DARK_GRAY, 5);
        panel4.setLayout(null);
        panel4.setBounds(0, 3, 620, 680);
        panel4.setOpaque(true);
        panel4.setBackground(Color.BLUE);
        panel4.setBorder(border);

        radioButton1 = new JRadioButton("Fantastic");
        radioButton2 = new JRadioButton("Good");
        radioButton3 = new JRadioButton("Average");
        radioButton4 = new JRadioButton("Could do better");
        radioButton5 = new JRadioButton("Extremely worse");

        radioButton1.setBounds(30, 90, 90, 30);
        radioButton2.setBounds(120, 90, 70, 30);
        radioButton3.setBounds(190, 90, 90, 30);
        radioButton4.setBounds(280, 90, 120, 30);
        radioButton5.setBounds(400, 90, 130, 30);

        radioButton1.setBackground(Color.BLUE);
        radioButton2.setBackground(Color.BLUE);
        radioButton3.setBackground(Color.BLUE);
        radioButton4.setBackground(Color.BLUE);
        radioButton5.setBackground(Color.BLUE);

        radioButton1.addActionListener(this);
        radioButton2.addActionListener(this);
        radioButton3.addActionListener(this);
        radioButton4.addActionListener(this);
        radioButton5.addActionListener(this);

        radioButton1.setFocusable(false);
        radioButton2.setFocusable(false);
        radioButton3.setFocusable(false);
        radioButton4.setFocusable(false);
        radioButton5.setFocusable(false);

        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);
        buttonGroup.add(radioButton4);
        buttonGroup.add(radioButton5);

        label9.setBounds(30, 60, 400, 30);
        label9.setText("Q1. What is the condition of product on arrival?");
        label9.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        label9.setBackground(Color.BLUE);
        label9.setOpaque(true);

        label10.setBounds(30, 150, 400, 30);
        label10.setText("Q2. How satisfied are you with our product?");
        label10.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        label10.setBackground(Color.BLUE);
        label10.setOpaque(true);

        label11.setBounds(220, 220, 190, 40);
        label11.setText("Default");
        label11.setFont(new Font("MV Boli", Font.PLAIN, 18));
        label11.setBackground(Color.BLUE);
        label11.setOpaque(true);

        slider1.setBounds(30, 180, 500, 40);
        slider1.setPreferredSize(new Dimension());
        slider1.setPaintTicks(true);
        slider1.setMinorTickSpacing(20);
        slider1.setFont(new Font("MV Boli", Font.PLAIN, 16));
        slider1.setPaintLabels(true);
        slider1.setFocusable(false);
        slider1.addChangeListener(this);
        slider1.setBackground(Color.BLUE);

        label12.setBounds(30, 270, 450, 30);
        label12.setText("Q3. What improvement would you suggest for our product?");
        label12.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        label12.setBackground(Color.BLUE);
        label12.setOpaque(true);

        textArea.setBounds(70, 310, 400, 150);
        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        textArea.setBackground(Color.LIGHT_GRAY);
        textArea.setText("Enter your opinion here.");
        textArea.setForeground(Color.BLUE);
        textArea.setBorder(border);
        textArea.addKeyListener(this);

        label13.setBounds(30, 480, 450, 30);
        label13.setText("Q4. On Which Field do you want us to improve :");
        label13.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        label13.setBackground(Color.BLUE);
        label13.setOpaque(true);

        checkbox1.setBounds(30, 520, 90, 40);
        checkbox2.setBounds(125, 520, 70, 40);
        checkbox3.setBounds(210, 520, 135, 40);
        checkbox4.setBounds(360, 520, 100, 40);
        checkbox5.setBounds(470, 520, 100, 40);

        checkbox1.addItemListener(this);
        checkbox2.addItemListener(this);
        checkbox3.addItemListener(this);
        checkbox4.addItemListener(this);
        checkbox5.addItemListener(this);

        checkbox1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        checkbox2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        checkbox3.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        checkbox4.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        checkbox5.setFont(new Font("Times New Roman", Font.PLAIN, 16));

        checkbox1.setFocusable(false);
        checkbox2.setFocusable(false);
        checkbox3.setFocusable(false);
        checkbox4.setFocusable(false);
        checkbox5.setFocusable(false);

        label14.setBounds(30, 580, 450, 30);
        label14.setText("Q5. On a scale 1 to 5 how satisfied are u with the product:");
        label14.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        label14.setBackground(Color.BLUE);
        label14.setOpaque(true);

        label15.setBounds(220,20, 150,40);
        label15.setText("Survey System");
        label15.setForeground(Color.BLACK);
        label15.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        label15.setBackground(Color.BLUE);
        label15.setOpaque(true);

        comboBox.setBounds(150, 610, 80, 20);
        comboBox.addActionListener(this);

        button.setText("Submit");
        button.setBounds(250, 640, 100, 30);
        button.addActionListener(this);
        button.setFocusable(false);

        panel5.setLayout(null);
        panel5.setBackground(Color.pink);
        panel5.setBounds(625, 5, 175, 675);
        panel5.setOpaque(true);
        panel5.setBorder(border);

        panel4.add(radioButton1);
        panel4.add(radioButton2);
        panel4.add(radioButton3);
        panel4.add(radioButton4);
        panel4.add(radioButton5);
        panel4.add(label9);
        panel4.add(label10);
        panel4.add(slider1);
        panel4.add(label11);
        panel4.add(label12);
        panel4.add(textArea);
        panel4.add(label13);
        panel4.add(checkbox1);
        panel4.add(checkbox2);
        panel4.add(checkbox3);
        panel4.add(checkbox4);
        panel4.add(checkbox5);
        panel4.add(label14);
        panel4.add(comboBox);
        panel4.add(button);
        panel4.add(label15);



        frame2.setTitle("Online System Survey");
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setSize(820, 720);
        frame2.setIconImage(image.getImage());
        frame2.setVisible(true);
        frame2.setLayout(null);
        frame2.setResizable(false);
        frame2.setLocationRelativeTo(null);
        frame2.add(panel4);
        frame2.add(panel5);
    }


    @Override
    public void stateChanged(ChangeEvent e) {
        if (e.getSource() == slider1) {
            int value = slider1.getValue();
            if ((value >= 0) && (value <= 25)) {
                label11.setText("Barley Working.");
                choice2 = "Bad";
            }
            if ((value > 25) && (value <= 50)) {
                label11.setText("Mehh?");
                choice2 = "Okay";
            }
            if ((value > 50) && (value <= 75)) {
                label11.setText("Works Like a charm!");
                choice2 = "Good";
            }
            if ((value > 75) && (value <= 100)) {
                label11.setText("Goat product!!");
                choice2 = "Perfection";
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent g) {
        if (g.getSource() == radioButton1) {
            choice1 = "100%";
        }
        if (g.getSource() == radioButton2) {
            choice1 = "75%";
        }
        if (g.getSource() == radioButton3) {
            choice1 = "50%";
        }
        if (g.getSource() == radioButton4) {
            choice1 = "25%";
        }
        if (g.getSource() == radioButton5) {
            choice1 = "0";
        }
        if (g.getSource() == comboBox) {
            int selected_index = comboBox.getSelectedIndex();
            choice9 = String.valueOf(comboBox.getItemAt(selected_index));
        }
        if (g.getSource() == button) {
            new Connection_2();
            JOptionPane.showMessageDialog(null, "Your Response is Recorded Successfully.");
            frame2.dispose();
        }
    }

    @Override
    public void keyTyped(KeyEvent f) {
        if (f.getSource() == textArea) {
            choice3 = textArea.getText();
        }
    }

    @Override
    public void keyPressed(KeyEvent h) {
        if (h.getSource() == textArea) {
            choice3 = textArea.getText();
        }
    }

    @Override
    public void keyReleased(KeyEvent j) {
        if (j.getSource() == textArea) {
            choice3 = textArea.getText();
        }
    }

    @Override
    public void itemStateChanged(ItemEvent k) {
        if (k.getSource() == checkbox1) {
            choice4 = "lacking";
        }
        if (k.getSource() == checkbox2) {
            choice5 = "lacking";
        }
        if (k.getSource() == checkbox3) {
            choice6 = "lacking";
        }
        if (k.getSource() == checkbox4) {
            choice7 = "lacking";
        }
        if (k.getSource() == checkbox5) {
            choice8 = "lacking";
        }
    }
}
