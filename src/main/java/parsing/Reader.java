package parsing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Reader {
    private ArrayList<String> list = new ArrayList();
    private String name = "textCode\\sample.txt";

    public Reader() throws IOException {
        readText(name);
        printText();
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void readText(String name) throws IOException {
        String line;
        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader(name));

        while((line = reader.readLine()) != null) {
            list.add(line);
        }
    }

    public void printText() {
        for(String s : list) {
            System.out.println(s);
        }
    }
}
