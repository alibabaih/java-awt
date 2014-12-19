package awt_1;

import java.awt.*;

public class Line {

    int x0, y0, x1, y1;

    public Line(int x0, int y0, int x1, int y1) {
        this.x0 = x0;
        this.y0 = y0;
        this.x1 = x1;
        this.y0 = y0;
    }

    public void draw(Graphics graphics) {
        graphics.drawLine(x0, y0, x1, y1);
    }

}
