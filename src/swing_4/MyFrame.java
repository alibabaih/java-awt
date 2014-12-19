package swing_4;

import javax.swing.*;
import java.awt.*;

public class MyFrame {

    private swing_4.Graphic graphic1;

    private void initComponents() {
        graphic1 = new Graphic();


    }

    public MyFrame() {
        initComponents();
    }

    public static void main(String[] args) {
        //create and display the form
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MyFrame();//.setVisible(true);
            }
        });

    }

    public void setData(Graphic data) {
    }

    public void getData(Graphic data) {
    }

    public boolean isModified(Graphic data) {
        return false;
    }
}
