package shapes;

import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.font.TextLayout;
import java.awt.geom.AffineTransform;

public class Rectangle extends Shape {

    public Rectangle(String text) {
        super(text);
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.drawRect(x, y, width, height);
        graphics.drawString(text, x+width/3, y+height/2);
    }

}
