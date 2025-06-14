package Exam;


import java.util.Objects;
import java.util.Scanner;

public class ReadWrite {


    private Scanner scanner = new Scanner(System.in);


    public String read() {
        return scanner.nextLine();
    }

    /**
     * hämtar och skriver ut antalet tecken
     * @param counter
     */
    public void writeCharacters(Counter counter) {
        System.out.println("you typed a total of " + counter.getCharacters() + " characters");
    }

    /**
     * hämtar och skriver ut antalet rader
     * @param counter
     */
    public void writeRows(Counter counter) {
        System.out.println("you have typed messages over " + counter.getRows() + " rows");
    }

    /**
     * hämtar och skriver ut antalet ord
     * @param counter
     */
    public void writeWords(Counter counter) {
        System.out.println("a total of " + counter.getWordsAmount() + " words have been typed");
    }

    /**
     * hämtar och skriver ut det längsta ordet
     * @param counter
     */
    public void writeLongestWord(Counter counter) {
        System.out.println("the longest word was \"" + counter.getLongestWord() + "\", congratulations!");
    }
}

/*
    Counter count = new Counter();

    String entry = "";


        while(!Objects.equals(entry,"stop"))

    {
        entry = sc.nextLine();
        count.addRow();
        count.addChars(entry);

    }
        count.charSum();
        System.out.println("You have typed a total of "+count.getCharacters()+" characters over "+count.getRows()+" row(s)");

}



*/