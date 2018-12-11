package drawing;

import shapes.Ellipse;
import shapes.IfBlock;
import shapes.Line;
import shapes.Shape;

import java.util.ArrayList;

public class Builder {
    private ArrayList<Shape> list = new ArrayList<Shape>();
    private ArrayList<Line> lineList = new ArrayList<Line>();

    private int posx;
    private int posy;

    private int scrHieght;
    private int scrWidth;

    private int shapeH = 50;
    private int shapeW = 100;

    private int shapeTemp = 100;

    public Builder(int scrHieght, int scrWidth) {
        this.scrHieght = scrHieght;
        this.scrWidth = scrWidth;

        posx = scrWidth/2 - shapeW - shapeW/2;
        posy = 100;

        start();
    }

    public void start() {
        list.add(new Ellipse("Начало"));
    }

    public void end() {
        Ellipse ellipse = new Ellipse("Конец");
        ellipse.setHeight(shapeH);
        ellipse.setWidth(shapeW);
        ellipse.setX(posx);
        ellipse.setY(posy);
        list.add(ellipse);
    }

    public void build() {

        for(Shape shape : list) {
            shape.setHeight(shapeH);
            shape.setWidth(shapeW);

            shape.setX(posx);
            shape.setY(posy);

            if(!(shape instanceof IfBlock)) {
                lineList.add(new Line(posx + shapeW / 2, posy + shapeH, posx + shapeW / 2, posy + shapeTemp));
            }

            posy += shapeTemp;
        }
        end();

        for(Line line : lineList) {
            list.add(line);
        }
    }

    public void addShape(Shape shape) {
        list.add(shape);
        System.out.println("shape added");
    }

    public ArrayList<Shape> getList() {
        return list;
    }
}
