package com.wetin.AudioToText;

/**
 * @version 1.0.1
 * @Author: wei tin
 */
//以下是基于JAVA Swing实现的800*600的窗体：

/*

import javax.swing.*;
import java.awt.*;

public class UI extends JFrame {
    UI() {
        initUI();
    }

    private void initUI() {
        setPreferredSize(new Dimension(900, 600));
        setTitle("My Window");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // 第一排三个文本框
        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.setPreferredSize(new Dimension(880, 50));
        //panel1.setBounds(20,50,880,50);
        JLabel label1 = new JLabel("Text1: ");
        JTextField textField1 = new JTextField(20);
        JLabel label2 = new JLabel("Text2: ");
        JTextField textField2 = new JTextField(20);
        JLabel label3 = new JLabel("Text3: ");
        JTextField textField3 = new JTextField(20);
        panel1.add(label1);
        panel1.add(textField1);
        panel1.add(label2);
        panel1.add(textField2);
        panel1.add(label3);
        panel1.add(textField3);

        // 第二排三个单选框
        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        panel2.setPreferredSize(new Dimension(900, 50));
        JRadioButton radioButton1 = new JRadioButton("Option1");
        JRadioButton radioButton2 = new JRadioButton("Option2");
        JRadioButton radioButton3 = new JRadioButton("Option3");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);
        panel2.add(radioButton1);
        panel2.add(radioButton2);
        panel2.add(radioButton3);

        // 第三排一个文本框，两个按钮
        JPanel panel3 = new JPanel();
        panel3.setLayout(new FlowLayout());
        panel3.setPreferredSize(new Dimension(900, 50));
        JLabel label4 = new JLabel("Text4: ");
        JTextField textField4 = new JTextField(40);
        JButton button1 = new JButton("Button1");
        JButton button2 = new JButton("Button2");
        panel3.add(label4);
        panel3.add(textField4);
        panel3.add(button1);
        panel3.add(button2);

        // 下面是一个不可写的文本域
        JTextArea textArea = new JTextArea();
        //textArea.setEditable(false);
        textArea.setPreferredSize(new Dimension(900, 450));

        // 把所有的面板组合到一起
        JPanel contentPane = new JPanel();
        contentPane.setLayout(new GridLayout(4, 1));
        contentPane.add(panel1);
        contentPane.add(panel2);
        contentPane.add(panel3);
        contentPane.add(textArea);

        setContentPane(contentPane);
        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setVisible(true);
    }
}*/
