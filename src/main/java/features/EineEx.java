package features;

public class EineEx {
    public static void main(String[] args) {
        int[] zahlen = {1, 2, 3};
        //
        try {
            System.out.println("Ergebnis: "+zahlen[3]);
            System.out.println("alles gut");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Fehler: "+e.getMessage());
        } finally {
            System.out.println("Fertig");
        }

        //
    }
}
