package Exam;

import java.util.ArrayList;

public class Counter {

    private int rows = -1;
    private int characters = -4;
    ArrayList<String> charList = new ArrayList<>();


    public int getRows() {
        return rows;
    }

    public int getCharacters() {
        return characters;
    }

    public void addRow() {
        rows++;
    }

    public void addChars(String entry) {
        charList.add(entry);
    }

    public void charSum() {
        for (String str : charList) {
            characters += str.length();
        }
    }

}
