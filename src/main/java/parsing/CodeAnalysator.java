package parsing;

import drawing.Builder;
import shapes.IfBlock;
import shapes.Rectangle;
import shapes.Shape;

import java.util.ArrayList;

public class CodeAnalysator {

    private Builder builder;// = new Builder();

    private String[] types = {
            "byte", "short", "int", "long",
            "char", "float", "double", "boolean"
    };

    public CodeAnalysator(Builder builder) {
        this.builder = builder;
    }

    public Builder getBuilder() {
        return builder;
    }

    public void analyzeAll(ArrayList<String> list) {
        for (String s : list) {
            analyzeString(s);
        }
    }

    public void analyzeString(String string) {
        string = string.trim();
        boolean ifOpened = false;

        boolean containsType = containsDataType(string);
        String text = null;

        if(containsType) {
            System.out.println("Строка: " + string + " содержит простой тип!");
            builder.addShape(new Rectangle(string));
        }

        if (string.contains("if")) {
            text = string.split("[\\(\\)]")[1];
            System.out.println("Строка: " + string + " содержит if! Условие: " + text);
            if (string.contains("{")) {
                System.out.println("Иф открыт");
                ifOpened = true;

                builder.addShape(new IfBlock(text));
            } else {
                System.out.println("Ошибка! Пишите { в одной строке с иф!");
            }
        }

    }

    public boolean containsDataType(String string) {
        for(int i=0; i<types.length; i++) {
            if(string.contains(types[i])) {
                return true;
            }
        }
        return false;
    }
}
