package basic.liste;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class EineMap {
    public static void main(String[] args) {
        // Erzeugung
        Map<Integer, String> monate = new HashMap<>();
        // füttern
        monate.put(1, "Jan");
        monate.put(2, "Feb");
        monate.put(3, "Mär");
        monate.put(3, "Maerz");

        System.out.println(monate.get(3));
        System.out.println(monate.get(4));
        // durchlaufen
        for (Map.Entry<Integer, String> e : monate.entrySet()) {
            System.out.println(e.getKey()+": "+e.getValue());
        }

        Properties props = System.getProperties();
        for (Map.Entry<Object, Object> e : props.entrySet()) {
            System.out.println(e.getKey()+": "+e.getValue());
        }
        System.out.println("----------------------------");
        System.out.println(System.getProperty("user.dir"));
    }
}
