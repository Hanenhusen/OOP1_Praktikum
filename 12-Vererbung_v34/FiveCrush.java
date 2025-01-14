/**
**Verantwortlich für:**

**Die Daten beschreiben:**

**Funktionalität der Methoden:**

**Zusammenarbeit mit anderen Klassen:**

*/
class FiveCrush {
	
	public static void main(String[] args) {
		
	
//		/// Δe_gyum6t Δ 1.1.2 Hauptklasse FiveCrush
//		System.out.println("Test Ausgabe");
//
//		/// ➤ 2.2.3 Spielfeld auf die Text-Konsole ausgeben
//		Spielfeld test=new Spielfeld(2,3);
//        test.spielFeldAusgeben();
//		/// Δe_f6ydx7 Δ 2.4.1 Prüfen, ob die Position im Spielfeld gültig ist
//		test.istpositiongueltig(1,2); //true
//        test.istpositiongueltig(5,6); //false
//        System.out.println(test.istpositiongueltig(1,2) + "," + test.istpositiongueltig(5,6));
//
//
//		/// Δe_lfyqzh Δ 2.4.4 Testen der Positionierung
//		Karte k1 = new Karte (1,2,"k1", test);
//        test.spielFeldAusgeben();
//
//		/// Δe_16a7eu Δ 
//		Karte k2 = new Karte (2,4,"k2", test);
//
//		/// Δe_o6dx76 Δ 2.5 Setzen der ID setzt auch die Reaktion des Buttons
//        String eingabe = Konsole.eingabeString();
//        System.out.println(eingabe);
//
//		/// Δe_egh0hq Δ 3.1 Einfacher Ablauf 
//		GrafikKonsole.clearGrafik();
//        Spielfeld ablauf = new Spielfeld(3,4);
//        ablauf.fuellen();
//        for (int i=0; i<3 && !eingabe.equals("ENDE") ; i++)
//        { 
//            eingabe = Konsole.eingabeString();
//            System.out.println(eingabe);
//            ablauf.punktezaelen(10);
//        } //durchläuft 3 mal
//        
//
//		/// Δe_fslqdy Δ 3.2.1 Ende-Button definieren
//		Button endeButton = new Button(100, 190,Grafik.RED, "ENDE", Grafik.BLACK, "ENDE");
		
        /// Δe_gos6j8 Δ 2.1.2 Methode zur Identifizierung testen
		GrafikKonsole.clearGrafik();
        Spielfeld _spielfeld = new Spielfeld(3,4);
        _spielfeld.fuellen();
//        String eingabe = Konsole.eingabeString();
//        System.out.println(_spielfeld.findeKarte(eingabe));
//        
		/// Δe_cnak9o Δ 2.2.2 Test der Klick-Reaktion
//		_spielfeld.klickReaktion();

		/// Δe_a1lsw1 Δ 3.1.2 Methode zum Ermitteln der Nachbar-Karte in der Klasse Spielfeld
		System.out.println(_spielfeld.nachbarsKarte(1, 1, "oben"));
        System.out.println(_spielfeld.nachbarsKarte(1, 1, "unten"));
		System.out.println(_spielfeld.nachbarsKarte(1, 1, "links"));
        System.out.println(_spielfeld.nachbarsKarte(1, 1, "rechts"));

		/// Δe_tw36wx Δ 3.1.3 Methode zum Ermitteln der Nachbar-Karte in der Klasse Karte
//        _spielfeld.findeKarte("1,2").nachbarsKarte("unten");
//        _spielfeld.findeKarte("1,2").nachbarsKarte("oben");   		
//
		/// Δe_obf1ce Δ 4.1.3 Test der RKarte
		//RKarte rkarte1 = new RKarte(1,1,_spielfeld);
        
		/// Δe_rthfgn Δ 4.3 Test von unterschiedlichen Karten 
		//GrafikKonsole.clearGrafik();
//
//        Karte karte1 = new Karte(1,1,"",_spielfeld);
//        OKarte okarte1 = new OKarte(1,1,_spielfeld);
//
//        karte1=okarte1;
//        karte1=rkarte1;
//        //rkarte1=karte1;
//        karte1=okarte1;

		/// Δe_3sqbgw Δ 5.2.1 Erzeugen eines Objekts einer zufälligen Klasse
//		System.out.println(_spielfeld.zufallskarte(1, 1));
//        System.out.println(_spielfeld.zufallskarte(1, 2));
//        System.out.println(_spielfeld.zufallskarte(1, 3));
//
//		/// Δe_z45sd5 Δ 5.2.2 Array mit zufälligen Karten-Arten füllen
//		Spielfeld spielfeldtest = new Spielfeld (4,3);
//        spielfeldtest.zufaelligeKartenFuellen();
//
	}
	
	
}
