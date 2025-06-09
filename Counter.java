package Exam;

import java.util.ArrayList;

public class Counter {


    ArrayList<String> charList = new ArrayList<>();

    public boolean addString(String input) {
        if (!input.equals("stop")) {
            charList.add(input);
            return true;
        }
        return false;
    }

    public int getRows() {
        return charList.size();
    }

    public int getCharacters() {
        int characters = 0;

        for (String str : charList) {
            characters += str.length();
        }
        return characters;
    }

    public String getLongestWord() {
        String longestWord = "";

        for (String sentence : charList) {

            String[] words = sentence.split("\\s+");

            for (String word : words) {

                if (word.length() > longestWord.length()) {

                    longestWord = word;
                }
            }
        }
        return longestWord;
    }

    public int getWordsAmount() {
        int wordcount = 0;
        for (String sentence : charList) {

            String[] words = sentence.split("\\s+");
            wordcount += words.length;
        }
        return wordcount;
    }


}
