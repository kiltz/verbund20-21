package basic.aufgabe2;

public class WuerfelStatistik {
	public static void main(String[] args) {
		int[] anzahl = {0,0,0,0,0,0};
		int max = 6;
		int min = 1;
		int zahl = 1;
		int range = max - min + 1;
		int durchlaeufe = 150000;

		for (int i = 0; i < durchlaeufe; i++) {

			int zufall = (int)(Math.random() * range) + min;
			anzahl[zufall-1] = anzahl[zufall-1]+1;
		}
		for (int j : anzahl) {
			System.out.println("Die Zahl " + zahl + " wurde " + j + " gewuerfelt");
			++zahl;
		}
		System.out.println("Der Computer hat fuer die Aufgabe " + System.currentTimeMillis() + "ms gebraucht");

	}
}
