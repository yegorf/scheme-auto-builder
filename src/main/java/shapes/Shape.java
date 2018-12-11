package shapes;

import java.awt.*;

public abstract class Shape {
    protected int x;
    protected int y;
    protected int height;
    protected int width;
    protected String text;

    public Shape() {

    }
    public Shape(String text) {
        this.text = text;
    }

    public abstract void draw(Graphics graphics);

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
