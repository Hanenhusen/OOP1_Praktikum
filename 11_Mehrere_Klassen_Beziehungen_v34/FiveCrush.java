/**
**Verantwortlich für:**

**Die Daten beschreiben:**

**Funktionalität der Methoden:**

**Zusammenarbeit mit anderen Klassen:**

*/
class FiveCrush {
	
	public static void main(String[] args) {
		
	
		/// Δe_gyum6t Δ 1.1.2 Hauptklasse FiveCrush
		System.out.println("Test Ausgabe");

		/// ➤ 2.2.3 Spielfeld auf die Text-Konsole ausgeben
		Spielfeld test=new Spielfeld(2,3);
        test.spielFeldAusgeben();
		/// Δe_f6ydx7 Δ 2.4.1 Prüfen, ob die Position im Spielfeld gültig ist
		test.istpositiongueltig(1,2); //true
        test.istpositiongueltig(5,6); //false
        System.out.println(test.istpositiongueltig(1,2) + "," + test.istpositiongueltig(5,6));


		/// Δe_lfyqzh Δ 2.4.4 Testen der Positionierung
		Karte k1 = new Karte (1,2,"k1", test);
        test.spielFeldAusgeben();

		/// Δe_16a7eu Δ 
		Karte k2 = new Karte (2,4,"k2", test);

		/// Δe_o6dx76 Δ 2.5 Setzen der ID setzt auch die Reaktion des Buttons
        String eingabe = Konsole.eingabeString();
        System.out.println(eingabe);

		/// Δe_egh0hq Δ 3.1 Einfacher Ablauf 
		GrafikKonsole.clearGrafik();
        Spielfeld ablauf = new Spielfeld(3,4);
        ablauf.fuellen();
        for (int i=0; i<3 && !eingabe.equals("ENDE") ; i++)
        { 
            eingabe = Konsole.eingabeString();
            System.out.println(eingabe);
            ablauf.punktezaelen(10);
        } //durchläuft 3 mal
        

		/// Δe_fslqdy Δ 3.2.1 Ende-Button definieren
		Button endeButton = new Button(100, 190,Grafik.RED, "ENDE", Grafik.BLACK, "ENDE");
	}
	
}
