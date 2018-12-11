package shapes;

import java.awt.*;

public class IfBlock extends Shape {

    public IfBlock(String text) {
        super(text);
    }

    public void draw(Graphics graphics) {
        graphics.drawLine(x, y+height/2, x+width/2, y);
        graphics.drawLine(x+width/2, y, x+width, y+height/2);
        graphics.drawLine(x+width, y+height/2, x+width/2, y+height);
        graphics.drawLine(x+width/2, y+height, x, y+height/2);


        graphics.drawString(text, x+width/3, y+height/2);
    }
}
