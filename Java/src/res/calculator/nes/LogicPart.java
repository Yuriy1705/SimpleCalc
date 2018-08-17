package res.calculator.nes;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LogicPart {
    private double lastNumber = 0;
    private double currentNumber = 0;
    private String operation = " ";

    public LogicPart(JTextField out, JTextField out2, JButton[] numbers, JButton[] cliner, JButton[] plus, JButton[] minus,
                     JButton[] multiply, JButton[] divide, JButton[] equ, JButton[] plusminus, JButton[] sqr,
                     JButton[] root, JButton[] point) {

        ActionListener listener = (ActionEvent e) -> {
            JButton b = (JButton) e.getSource();
            if (operation.compareTo("=") == 0) {
                operation = " ";
            }
            out.setText(out.getText() + b.getText());


        };

        for (JButton b : numbers) {
            b.addActionListener(listener);
        }
        cliner[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cliner[0] = (JButton) e.getSource();
                out.setText(" ");
                out2.setText(" ");
                lastNumber = 0;
                currentNumber = 0;
                operation = " ";
            }
        });

        plusminus[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                plusminus[0] = (JButton) e.getSource();
                double d = emt(out.getText());
                d *= -1;
                out.setText(d + "");
            }
        });

        point[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                point[0] = (JButton) e.getSource();
                if (testpound(out.getText())) {
                    out.setText(out.getText() + point[0].getText());
                } else {
                    out.setText(out.getText());
                }
            }
        });

        plus[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                plus[0] = (JButton) e.getSource();
                currentNumber = emt(out.getText());
                request();
                operation = plus[0].getText();
                out.setText(" ");
                out2.setText(lastNumber + "");
            }
        });

        minus[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                minus[0] = (JButton) e.getSource();
                currentNumber = emt(out.getText());
                request();
                operation = minus[0].getText();
                out.setText(" ");
                out2.setText(lastNumber + "");
            }
        });

        multiply[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                multiply[0] = (JButton) e.getSource();
                currentNumber = emt(out.getText());
                request();
                operation = multiply[0].getText();
                out.setText(" ");
                out2.setText(lastNumber + "");
            }
        });

        divide[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                divide[0] = (JButton) e.getSource();
                currentNumber = emt(out.getText());
                request();
                operation = divide[0].getText();
                out.setText(" ");
                out2.setText(lastNumber + "");
            }
        });

        equ[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                equ[0] = (JButton) e.getSource();
                currentNumber = emt(out.getText());
                request();
                //operation = equ[0].getText();
                out.setText(" ");
                out2.setText(lastNumber + "");
            }
        });

        sqr[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sqr[0] = (JButton) e.getSource();
                currentNumber = emt(out.getText());
                operation = sqr[0].getText();
                request();
                out.setText(" ");
                out2.setText(lastNumber + "");
            }
        });

        root[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                root[0] = (JButton) e.getSource();
                currentNumber = emt(out.getText());
                operation = root[0].getText();
                request();
                out.setText(" ");
                out2.setText(lastNumber + "");
            }
        });


    }

    public void request() {
        if (this.operation.compareTo(" ") == 0) {
            lastNumber = currentNumber;
            currentNumber = 0;
        } else if (this.operation.compareTo("+") == 0) {
            lastNumber += currentNumber;
        } else if (this.operation.compareTo("-") == 0) {
            lastNumber -= currentNumber;
        } else if (this.operation.compareTo("*") == 0) {
            lastNumber *= currentNumber;
        } else if (this.operation.compareTo("/") == 0) {
            lastNumber /= currentNumber;
        } else if (this.operation.compareTo("sq") == 0) {
           lastNumber = Math.pow(currentNumber, 2);
           this.operation= " ";
        } else if (this.operation.compareTo("rt") == 0) {
            lastNumber = Math.sqrt(currentNumber);
            this.operation= " ";
        } else if (this.operation.compareTo("=") == 0) {
            lastNumber = currentNumber;
            currentNumber = 0;
        }
    }

    public double emt(String str) {
        if (str != null && !str.trim().isEmpty()) {
            return Double.parseDouble(str);
        } else {
            return 0;
        }
    }

    public boolean testpound(String srt) {
        char[] test = srt.toCharArray();
        for (int i = 0; i < test.length; i++) {
            if (test[i] == '.') {
                return false;
            }
        }
        return true;
    }
}
