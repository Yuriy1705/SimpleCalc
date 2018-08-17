package res.calculator.nes;

import java.awt.Font;


import javax.swing.*;

public class VisualPart extends JPanel {
    private JButton[] numbers = new JButton[10];
    private Font font = new Font("SanSerif", Font.BOLD, 20);
    private Font font2 = new Font("SanSerif", Font.ROMAN_BASELINE, 10);
    private JTextField out = new JTextField();
    private JTextField out2 = new JTextField();
    private JButton[] cliner = new JButton[1];
    private JButton []plus = new JButton[1];
    private JButton []minus = new JButton[1];
    private JButton[] multiply = new JButton[1];
    private JButton[] divide = new JButton[1];
    private JButton []equ = new JButton[1];
    private JButton []plusminus = new JButton[1];
    private JButton[] sqr = new JButton[1];
    private JButton[] root = new JButton[1];
    private JButton[] point = new JButton[1];

    public VisualPart() {
        setLayout(null);
        setFocusable(true);
        grabFocus();

        plusminus[0] = new JButton("+-");
        plusminus[0].setBounds(10, 290, 60, 60);
        plusminus[0].setFont(font);
        add(plusminus[0]);

        plus[0] = new JButton("+");
        plus[0].setBounds(220, 80, 60, 60);
        plus[0].setFont(font);
        add(plus[0]);

        minus[0] = new JButton("-");
        minus[0].setBounds(220, 150, 60, 60);
        minus[0].setFont(font);
        add(minus[0]);

        multiply[0] = new JButton("*");
        multiply[0].setBounds(220, 220, 60, 60);
        multiply[0].setFont(font);
        add(multiply[0]);

        divide[0] = new JButton("/");
        divide[0].setBounds(220, 290, 60, 60);
        divide[0].setFont(font);
        add(divide[0]);

        equ[0] = new JButton("=");
        equ[0].setBounds(290, 290, 60, 60);
        equ[0].setFont(font);
        add(equ[0]);

        cliner[0] = new JButton("c");
        cliner[0].setBounds(290, 80, 60, 60);
        cliner[0].setFont(font);
        add(cliner[0]);

        sqr[0] = new JButton("sq");
        sqr[0].setBounds(290, 150, 60, 60);
        sqr[0].setFont(font);
        add(sqr[0]);

        root[0] = new JButton("rt");
        root[0].setBounds(290, 220, 60, 60);
        root[0].setFont(font);
        add(root[0]);

        point[0] = new JButton(".");
        point[0].setBounds(150, 290, 60, 60);
        point[0].setFont(font);
        add(point[0]);


        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                numbers[y * 3 + x + 1] = new JButton((y * 3 + x + 1) + "");
                numbers[y * 3 + x + 1].setBounds(x * (60 + 10) + 10, y * (60 + 10) + 80, 60, 60);
                numbers[y * 3 + x + 1].setFont(font);
                add(numbers[y * 3 + x + 1]);
            }
        }
        numbers[0] = new JButton("0");
        numbers[0].setBounds(80, 290, 60, 60);
        numbers[0].setFont(font);
        add(numbers[0]);

        out.setBounds(10, 30, 340, 40);
        out.setFont(font);
        out.setEditable(false);
        add(out);

        out2.setBounds(10, 10, 340, 20);
        out2.setFont(font2);
        out2.setEditable(false);
        add(out2);

        new LogicPart(out,out2, numbers, cliner, plus, minus, multiply, divide, equ, plusminus, sqr, root, point);

    }
}
