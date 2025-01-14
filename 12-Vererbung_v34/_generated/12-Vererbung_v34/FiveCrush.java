/**<br>
<strong>Verantwortlich f&uuml;r:</strong><br>
<br>
<strong>Die Daten beschreiben:</strong><br>
<br>
<strong>Funktionalit&auml;t der Methoden:</strong><br>
<br>
<strong>Zusammenarbeit mit anderen Klassen:</strong><br>
<br>
<br>*/
class FiveCrush {
	
	public static void main(String[] args) {
		
	
//		System.out.println("///  1.1.2 Hauptklasse FiveCrush");
//		System.out.println("Test Ausgabe");
//
//		System.out.println("/// ➤ 2.2.3 Spielfeld auf die Text-Konsole ausgeben");
//		Spielfeld test=new Spielfeld(2,3);
//        test.spielFeldAusgeben();
//		System.out.println("///  2.4.1 Prüfen, ob die Position im Spielfeld gültig ist");
//		test.istpositiongueltig(1,2); //true
//        test.istpositiongueltig(5,6); //false
//        System.out.println(test.istpositiongueltig(1,2) + "," + test.istpositiongueltig(5,6));
//
//
//		System.out.println("///  2.4.4 Testen der Positionierung");
//		Karte k1 = new Karte (1,2,"k1", test);
//        test.spielFeldAusgeben();
//
//		System.out.println("///  ");
//		Karte k2 = new Karte (2,4,"k2", test);
//
//		System.out.println("///  2.5 Setzen der ID setzt auch die Reaktion des Buttons");
//        String eingabe = Konsole.eingabeString();
//        System.out.println(eingabe);
//
//		System.out.println("///  3.1 Einfacher Ablauf ");
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
//		System.out.println("///  3.2.1 Ende-Button definieren");
//		Button endeButton = new Button(100, 190,Grafik.RED, "ENDE", Grafik.BLACK, "ENDE");
		
        System.out.println("///  2.1.2 Methode zur Identifizierung testen");
		GrafikKonsole.clearGrafik();
        Spielfeld _spielfeld = new Spielfeld(3,4);
        _spielfeld.fuellen();
//        String eingabe = Konsole.eingabeString();
//        System.out.println(_spielfeld.findeKarte(eingabe));
//        
		System.out.println("///  2.2.2 Test der Klick-Reaktion");
//		_spielfeld.klickReaktion();

		System.out.println("///  3.1.2 Methode zum Ermitteln der Nachbar-Karte in der Klasse Spielfeld");
		System.out.println(_spielfeld.nachbarsKarte(1, 1, "oben"));
        System.out.println(_spielfeld.nachbarsKarte(1, 1, "unten"));
		System.out.println(_spielfeld.nachbarsKarte(1, 1, "links"));
        System.out.println(_spielfeld.nachbarsKarte(1, 1, "rechts"));

		System.out.println("///  3.1.3 Methode zum Ermitteln der Nachbar-Karte in der Klasse Karte");
//        _spielfeld.findeKarte("1,2").nachbarsKarte("unten");
//        _spielfeld.findeKarte("1,2").nachbarsKarte("oben");   		
//
		System.out.println("///  4.1.3 Test der RKarte");
		//RKarte rkarte1 = new RKarte(1,1,_spielfeld);
        
		System.out.println("///  4.3 Test von unterschiedlichen Karten ");
		//GrafikKonsole.clearGrafik();
//
//        Karte karte1 = new Karte(1,1,"",_spielfeld);
//        OKarte okarte1 = new OKarte(1,1,_spielfeld);
//
//        karte1=okarte1;
//        karte1=rkarte1;
//        //rkarte1=karte1;
//        karte1=okarte1;

		System.out.println("///  5.2.1 Erzeugen eines Objekts einer zufälligen Klasse");
//		System.out.println(_spielfeld.zufallskarte(1, 1));
//        System.out.println(_spielfeld.zufallskarte(1, 2));
//        System.out.println(_spielfeld.zufallskarte(1, 3));
//
//		System.out.println("///  5.2.2 Array mit zufälligen Karten-Arten füllen");
//		Spielfeld spielfeldtest = new Spielfeld (4,3);
//        spielfeldtest.zufaelligeKartenFuellen();
//
	}
	
	
}
