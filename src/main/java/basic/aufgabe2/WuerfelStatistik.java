package basic.aufgabe2;

public class WuerfelStatistik {

	public String wuerfeln(int amountOfRolls){

		int[] arrayOfNumbers = new int[amountOfRolls];
		int anzahl1 = 0;
		int anzahl2 = 0;
		int anzahl3 = 0;
		int anzahl4 = 0;
		int anzahl5 = 0;
		int anzahl6 = 0;

		for (int i = 0; i < amountOfRolls; i++) {
			int zufall = (int) (Math.random() * 6 + 1);
			if (zufall == 1) {
				anzahl1 += 1;
			} else if (zufall == 2) {
				anzahl2 += 1;
			} else if (zufall == 3) {
				anzahl3 += 1;
			} else if (zufall == 4) {
				anzahl4 += 1;
			} else if (zufall == 5) {
				anzahl5 += 1;
			} else if (zufall == 6) {
				anzahl6 += 1;
			}
			arrayOfNumbers[i] = zufall;
		}

		return("1: " + anzahl1+ ", 2: " + anzahl2+ ", 3: " + anzahl3+ ", 4: " + anzahl4+ ", 5: " + anzahl5+ ", 6: " + anzahl6);

	}
}
