package parsing;

import drawing.Builder;
import drawing.MyPanel;

import javax.swing.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        final int width = 800;
        final int height = 1000;

        Reader reader = new Reader();
        Builder builder = new Builder(width, height);
        CodeAnalysator analysator = new CodeAnalysator(builder);

        analysator.analyzeAll(reader.getList());

        JFrame frame = new JFrame("AutoBuilder");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyPanel panel = new MyPanel(analysator.getBuilder());

        frame.add(panel);
        frame.setSize(width, height);
        frame.setVisible(true);
    }
}
