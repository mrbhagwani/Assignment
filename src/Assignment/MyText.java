package Assignment;

import Assignment.Counter;

import java.util.Scanner;

public class MyText {

    public static void main(String[] args) {

        System.out.println("type something :)");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();


        Counter textCounter = new Counter();

        while (!(text.equals("stop") || text.equals("Stop"))) {
            textCounter.setText(text);
            System.out.println("type something again or type stop to finish:)");
            text = scan.nextLine();

        }
        System.out.println("du har skrivit: " + textCounter.getRowCount() + " rader, använt " + textCounter.getWordCount() + " ord och skrivit " + textCounter.getSignCount() + " tecken totalt! Det längsta ordet du skrivit är: " + textCounter.gettheLongestWord());


    }
}

