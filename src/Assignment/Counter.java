package Assignment;

import java.util.Arrays;
import java.util.Comparator;

public class Counter {

    private int theSigns;
    private int theRows;
    private int theWords;

    private String theLongestWord;


    private boolean truth;

    public Counter() {
        theSigns = 0;
        theRows = 0;
        theWords = 0;
        truth = true;
        theLongestWord = "";
    }

    public void counttheSigns() {
    }

    public void counttheRows() {
    }

    public int getRowCount() {
        return theRows;
    }

    public void setText(String input1) {
        if (!input1.equals("stop") || input1.equals("Stop")) {
            theRows = theRows + 1;
            theSigns = theSigns + input1.length();
            String[] Words = input1.split(" ");
            theWords = theWords + Words.length;
            for (int i=0; i < Words.length; i++) {
                if (Words[i].length() > theLongestWord.length()) {
                    theLongestWord = Words[i];
                }
            }


        } else {
            truth = false;
        }

    }


    public int getSignCount() {
        return theSigns;
    }

    public int getWordCount() {
        return theWords;
    }

    public boolean running() {
        return truth;
    }

    public String gettheLongestWord() {
        return theLongestWord;
    }


}


