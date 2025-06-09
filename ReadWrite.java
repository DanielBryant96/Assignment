package Exam;


import java.util.Objects;
import java.util.Scanner;

public class ReadWrite {

    private Scanner scanner = new Scanner(System.in);


    public String read() {
        return scanner.nextLine();
    }

    public void writeCharacters(Counter counter) {
        System.out.println("you typed a total of " + counter.getCharacters() + " characters");
    }

    public void writeRows(Counter counter) {
        System.out.println("you have typed messages over " + counter.getRows() + " rows");
    }

    public void writeWords(Counter counter) {
        System.out.println("a total of " + counter.getWordsAmount() + " words have been typed");
    }

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