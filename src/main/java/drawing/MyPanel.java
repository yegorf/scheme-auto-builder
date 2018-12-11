package drawing;

import shapes.Shape;
import javax.swing.*;
import java.awt.*;


public class MyPanel extends JPanel {
    private Builder builder;

    public MyPanel(Builder builder) {
        this.builder = builder;
        builder.build();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.WHITE);


        for(Shape shape : builder.getList()) {
            shape.draw(g);
        }
    }
}
