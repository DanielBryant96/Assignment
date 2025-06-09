package Exam;


import java.util.Objects;
import java.util.Scanner;

public class ReadWrite {


    public static void main(String[] args) {
        Counter count = new Counter();
        Scanner sc = new Scanner(System.in);
        String entry = "";


        while (!Objects.equals(entry, "stop")) {
            entry = sc.nextLine();
            count.addRow();
            count.addChars(entry);

        }
        count.charSum();
        System.out.println("You have typed a total of " + count.getCharacters() + " characters over " + count.getRows() + " row(s)");


    }


}
