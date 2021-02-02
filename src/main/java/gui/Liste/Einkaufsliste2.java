package gui.Liste;

import java.util.ArrayList;
import java.util.List;

public class Einkaufsliste2 {

        private List<String> liste;

        public Einkaufsliste2() {
            liste = new ArrayList<>();
        }

        public void add(String element) {
            liste.add(element);
        }

        public String print() {
            String ret = "";
            for (String s : liste) {
                ret += s + "\n";
            }
            return ret;
        }
    }



