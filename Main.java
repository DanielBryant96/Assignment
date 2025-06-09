package Exam;

import java.util.Objects;

public class Main {


    public static void main(String[] args) {
        ReadWrite readWrite = new ReadWrite();
        Counter counter = new Counter();


        while(true){
            if(!counter.addString(readWrite.read())){
                break;
            }
        }
        readWrite.writeCharacters(counter);
        readWrite.writeRows(counter);
        readWrite.writeWords(counter);
        readWrite.writeLongestWord(counter);

    }
}

