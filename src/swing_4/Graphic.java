package swing_4;

import javax.swing.*;
import java.awt.*;

public class Graphic extends JComponent {

    private int graphicType;

    public int getGraphicType() {
        return graphicType;
    }

    public void setGraphicType(int graphicType) {
        this.graphicType = graphicType;
        repaint();
    }

    @Override
    protected void printComponent(Graphics g) {
        super.printComponent(g);
        System.out.println("I am a graphic");
        g.drawString(getName(), getHeight()/10, getWidth()/2);
    }

    public Graphic() {
        setName("Test name");
    }

}
//2:25
