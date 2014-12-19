package awt_1;

import java.awt.*;
import java.awt.event.*;

public class MyFrame extends Frame implements MouseMotionListener{
    public MyFrame(String title) {
        super(title);
        //try to listen user-events
        //anonymous class
        this.addWindowListener(
                new WindowAdapter() {
                        @Override
                        public void windowClosing(WindowEvent e) {
                            //super.windowClosing(e);
                            System.out.println(Thread.currentThread().getName());
                            System.exit(0);
                    }
                }
        );

        //this.add(new Button("Hello"));
        this.add("West", new Button("Hello"));
        this.add("South", new Button("Hello"));
        this.addMouseMotionListener(this);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println(e.getX() + " " + e.getY());
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
//4:07
