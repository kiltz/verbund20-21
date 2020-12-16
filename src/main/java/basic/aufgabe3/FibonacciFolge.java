package basic.aufgabe3;

import java.util.ArrayList;

public class FibonacciFolge {
    public static void main(String[] args) {
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        for (int i = 0;;i++) {
            if (i == 0) {
                listOfNumbers.add(0);
            } else if (i == 1) {
                listOfNumbers.add(1);
            } else {
                if (listOfNumbers.get(i - 1) + listOfNumbers.get(i - 2) >= 100) {
                    System.out.println(listOfNumbers);
                    break;
                } else {
                    listOfNumbers.add(listOfNumbers.get(i - 1) + listOfNumbers.get(i - 2));
                }
            }
        }
    }
}
