package awt_2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;

public class Main extends Frame {

    private JButton MyButton = null;
    private Button exitButton = null;

    private JButton getMyButton() {
        if (MyButton == null) {
            MyButton = new JButton();
            MyButton.setPreferredSize(new Dimension(34, 20));
            MyButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println("actionPerformed()");
                }
            });
        }
        return MyButton;
    }

    private Button getExitButton() {
        if (exitButton == null) {
            exitButton = new Button();
            exitButton.setLabel("Exit");
            exitButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });
        }
        return exitButton;
    }
    public static void main(String[] args) {
        Main frame = new Main("test AWT + SWING");
        frame.setVisible(true);
    }
    public Main(String owner) {
        super(owner);
        initialize();
    }
    private void initialize() {
        this.setSize(300, 200);
        this.setLocationByPlatform(true);
        this.add(getMyButton(), BorderLayout.NORTH);
        this.add(getExitButton(), BorderLayout.SOUTH);
    }
}