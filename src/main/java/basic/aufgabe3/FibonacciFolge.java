package basic.aufgabe3;

import java.util.ArrayList;
import java.util.Arrays;

public class FibonacciFolge {
    public static void main(String[] args) {
        ArrayList<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(0, 1));
        for (int i = 2; ; i++) {
            if (listOfNumbers.get(i - 1) + listOfNumbers.get(i - 2) >= 100) {
                System.out.println(listOfNumbers);
                break;
            } else {
                listOfNumbers.add(listOfNumbers.get(i - 1) + listOfNumbers.get(i - 2));
            }
        }
    }
}

