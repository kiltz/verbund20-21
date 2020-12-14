package basic.aufgabe2;

public class KaffeeAutomat {

	public static void main(String[] args) {
		// Angenommen: Ein Kaffee kostet 30 Cent,

		// wir werfen eine 2-Euro Münze in den Automat

		// Welche Münzen bekommen wir als Rückgeld?

		// 1. definiere den Preis und das gezahlte Geld am Anfang der Methode

		// 2. Ermittle mit Hilfe von Modulo die Anzahl der einzelnen
		// 		Münzen und arbeite mit dem Rest weiter.

		// 3. Vereinfache die Lösung mit Schleifen


		int kostenKaffee = 30;
		int geldGegeben = 200;

		int rest = geldGegeben - kostenKaffee;
		System.out.println(rest + "ct");

		int rest2 = rest % 100;
		System.out.println(rest2 + "ct");

		int rest5 = rest % 80;
		System.out.println(rest5 + "ct");

		int rest3 = rest % 50;
		System.out.println(rest3 + "ct");

		int rest4 = rest % 40;
		System.out.println(rest4 + "ct");


	}

}
