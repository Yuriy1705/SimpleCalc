package res.calculator.nes;

import javax.swing.*;

public class StartPart {
    private JFrame window;

    public StartPart(){
        window = new JFrame("Calculator");
        window.setSize(367,397);
        window.add(new VisualPart());
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    public static void main(String[] args) {
	SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
            new StartPart();
        }
    });
    }
}
