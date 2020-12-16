package basic.aufgabe2;

class KaffeeAutomat {
	public static void main(String[] arg) {

		// preis fuer den Kaffee 30cent
		int preis = 30;

		// man hat 2Euro gegeben
		int gegeben = 200;

		// rechnung fuer das Rueckgeld
		int rest = gegeben - preis;

		int werte[] = {100, 50, 20, 10, 5};
		String name[] = {"1-Euro", "50-Cent", "20-Cent", "10-Cent", "5-Cent"};

		for (int i = 0; i < werte.length; i++) {
			int anzahl = rest / werte[i];
			rest = rest % werte[i];
			System.out.println("Du bekommst " + anzahl + ": " + name[i] + " Muenzen");
		}


	}
}
