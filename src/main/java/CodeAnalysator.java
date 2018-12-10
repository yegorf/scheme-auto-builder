import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodeAnalysator {
    private String[] types = {
            "byte", "short", "int", "long",
            "char", "float", "double", "boolean"
    };

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
        }

        if (string.contains("if")) {
            text = string.split("[\\(\\)]")[1];
            System.out.println("Строка: " + string + " содержит if! Условие: " + text);
            if (string.contains("{")) {
                System.out.println("Иф открыт");
                ifOpened = true;
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
