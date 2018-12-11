package shapes;

import java.awt.*;

public class Ellipse extends Shape {
    public Ellipse(String text) {
        super(text);
    }

    public void draw(Graphics graphics) {
        graphics.drawOval(x, y, width, height);
        graphics.drawString(text, x+width/3, y+height/2);
    }
}
