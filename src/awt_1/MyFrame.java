package awt_1;

import java.awt.*;
import java.awt.event.*;

public class MyFrame extends Frame{
    public MyFrame(String title) {
        super(title);
        //try to listen user-events
        //anonymous class
        this.addWindowListener(
                new WindowAdapter() {
                        @Override
                        public void windowClosing(WindowEvent e) {
                            //super.windowClosing(e);
                            System.exit(0);
                    }
                }
        );
    }
}
