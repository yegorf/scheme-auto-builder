package shapes;

import java.awt.*;

public class Line extends Shape {
    private int toX;
    private int toY;

    public Line(int x, int y, int toX, int toY) {
        this.x=x;
        this.y=y;
        this.toX=toX;
        this.toY=toY;
    }

    public void draw(Graphics graphics) {
        graphics.drawLine(x, y, toX, toY);
    }
}
