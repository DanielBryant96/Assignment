package Exam;

import java.util.ArrayList;

public class Counter {


    ArrayList<String> charList = new ArrayList<>();

    /**
     * lägger till en string i arraylistan om den inte är "stop"
     * @param input
     * @return false om frasen är "stop"
     */
    public boolean addString(String input) {
        if (!input.equals("stop")) {
            charList.add(input);
            return true;
        }
        return false;
    }

    /**
     * ränkar antalet strings i arraylistan
     * @return mängden strings
     */
    public int getRows() {
        return charList.size();
    }

    /**
     * Skapar int för att kunna räkna mängden tecken. Genomför iterationsloop av arraylistan och adderar inten utifrån antalet tecken
     * @return antalet tecken
     */
    public int getCharacters() {
        int characters = 0;

        for (String str : charList) {
            characters += str.length();
        }
        return characters;
    }

    /**
     * Skapar vakant string för längsta ord. En for-eachloop för arraylistan som delas upp genom tecken som mellanslag
     * i den nya arrayen läser den genom det uppdelade strinsen och uppdaterar den nyskapade stringen med det längsta ordet
     * @return längsta ordet
     */
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

    /**
     * räknar antalet ord genom for-eachloop, följt av uppdelade strings via mellanslag som dderar antalet ord
     * @return antalet ord
     */
    public int getWordsAmount() {
        int wordcount = 0;
        for (String sentence : charList) {

            String[] words = sentence.split("\\s+");
            wordcount += words.length;
        }
        return wordcount;
    }


}
