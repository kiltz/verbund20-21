package oop.basic.aufgabeFibonacci;

import java.util.ArrayList;
import java.util.List;

public class FibonacciFolge {
    public static void main(String[] args) {
        ermittleWert(100);
    }

    public static void ermittleWert(int zahl){
        long number1=0;
        long number2=1;
        long number3;

        while(number2<=zahl){
            number3=number1+number2;
            number1=number2;
            number2=number3;
            System.out.println(number2);
        }

    }


}
