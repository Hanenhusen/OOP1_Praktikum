/**
Beispiele für die Verwendung von Grafik-Objekten auf der Grafik-Konsole.
*/
class _Grafik_Beispiele {
	
	public static void main(String[] args) {
		
		/// Δe_s2wmy0 Δ 4.1 Initialisierung und Löschen der Grafik-Konsole
		        GrafikKonsole.clearGrafik();

		/// Δe_d637xm Δ 4.2.1 Button
        /** Mögliche Parameter: 
        @param x x-Koordinate der oberen linken Ecke des Grafikobjekts, 0 ist dabei ganz links
        @param y y-Koordinate der oberen linken Ecke des Grafikobjekts, 0 ist dabei ganz oben
        @param b Breite des Buttons
        @param h Höhe des Buttons
        @param fuellFarbe die Füllfarbe des Buttons
        @param text Text-Label des Buttons
        @param textColor Text-Farbe
        @param fontsize Text-Größe
        @param borderRadius Rundung der Ecken des Buttons
        @param reaktion der String, der eingelesen wird, wenn auf das Grafikobjekt geklickt wird
        */

        // ganz einfach: nur Position und Text        
        Button grafikbutton1 = 
            new Button(10, 10, "Einfacher Button");

        // Plus: 
        // Die Farben für Hintergrund und Schrift werden angegeben
        // außerdem der Reaktions-String, der später im Programm eingelesen wird, wenn auf das Grafikobjekt geklickt wird
        Button grafikbutton2  =
            new Button(10, 70, Grafik.BLUE, "+ Farben und Reaktion", 
                               Grafik.YELLOW, "geklickt");



        // Plus: 
        // Die Schriftgröße und der Eckenradius 
        Button grafikbutton3  =
            new Button(10, 170, Grafik.BLUE, "+ Schrift-Größe und Radius angeben", 
                                Grafik.YELLOW, 40, 20, "click3");

        // Plus: 
        // Höhe und Breite angeben
        Button grafikbutton4 =
            new Button(300, 10, 300, 80, Grafik.BLACK, "Volle Kontrolle", 
                                         Grafik.WHITE, 20, 5, "click4");
        
               
		/// Δe_uh0wro Δ 4.2.2 Text
		/** erzeugt ein Text-Grafikobjekt und stellt es auf der Grafik-Konsole dar
        @param x  x-Koordinate der oberen linken Ecke des Grafikobjekts, 0 ist dabei ganz links
        @param y  y-Koordinate der oberen linken Ecke des Grafikobjekts, 0 ist dabei ganz oben
        @param text dieser Text wird angezeigt
        @param farbe die Farbe des Texts, erlaubte Werte stehen unten
        @param s Schriftgröße des Texts in Pixeln. 
        @param reaktion der String, der eingelesen wird, wenn auf das Grafikobjekt geklickt wird
        */

        Text grafikText1 = new Text(220, 100, "Text", Grafik.BLUE, 34, null);

        // Variante: Der Text wird aus einem Zahlenwert bestimmt 
        // (durch Konkatenation der Zahl mit einem leeren String)
        int zahl = 45;
        Text grafikText2 = new Text(340, 100, ""+zahl, Grafik.BLUE, 34, "1");
        
        
		/// Δe_d3ysfh Δ 4.2.3 Rechteck
		/** erzeugt ein Rechteck-Grafikobjekt und stellt es auf der Grafik-Konsole dar
        @param x  x-Koordinate der oberen linken Ecke des Grafikobjekts, 0 ist dabei ganz links
        @param y  y-Koordinate der oberen linken Ecke des Grafikobjekts, 0 ist dabei ganz oben
        @param b breite des Rechtecks
        @param h höhe des Rechtecks
        @param fuellFarbe die Füllfarbe des Rechtecks
        @param randFarbe die Randfarbe des Rechtecks
        @param randBreite die Randbreite des Rechtecks
        @param reaktion der String, der eingelesen wird, wenn auf das Grafikobjekt geklickt wird
        */
            
        Rechteck grafikRechteck = 
                new Rechteck(20, 100, 100, 30, Grafik.BLUE, Grafik.BLACK, 3, "2");
        
        
		/// Δe_k7vr2h Δ 4.2.4 Kreis
		/** erzeugt ein Rechteck-Grafikobjekt und stellt es auf der Grafik-Konsole dar
        @param x  x-Koordinate der oberen linken Ecke des Grafikobjekts, 0 ist dabei ganz links
        @param y  y-Koordinate der oberen linken Ecke des Grafikobjekts, 0 ist dabei ganz oben
        @param b breite des Rechtecks
        @param h höhe des Rechtecks
        @param fuellFarbe die Füllfarbe des Rechtecks
        @param randFarbe die Randfarbe des Rechtecks
        @param randBreite die Randbreite des Rechtecks
        @param reaktion der String, der eingelesen wird, wenn auf das Grafikobjekt geklickt wird
        */
            
        Kreis grafikKreis = 
                new Kreis(0, 0, 100, 100, Grafik.YELLOW, Grafik.RED, 3, "3");
        grafikKreis.moveTo(100, 100);
        

		/// Δe_32krrs Δ 4.2.5 Linie
		/** erzeugt ein Linien-Grafikobjekt und stellt es auf der Grafik-Konsole dar
        @param xs  x-Koordinate der Startpunkts der Linie, 0 ist dabei ganz links
        @param ys  y-Koordinate der Startpunkts der Linie, 0 ist dabei ganz oben
        @param xs  x-Koordinate der Startpunkts der Linie, 0 ist dabei ganz links
        @param ys  y-Koordinate der Startpunkts der Linie, 0 ist dabei ganz oben
        @param farbe die Farbe der Linie
        @param randBreite die Breite der Linie
        @param reaktion der String, der eingelesen wird, wenn auf das Grafikobjekt geklickt wird
        */
            
        Linie grafikLinie = 
                new Linie(10, 10, 100, 100, Grafik.GREEN, 3, "4");
        

		/// Δe_e4kkph Δ 4.2.6 Farben
		// Grafik.BLACK
        // Grafik.WHITE  
        // Grafik.RED
        // Grafik.BLUE
        // Grafik.GREEN
        // Grafik.YELLOW
        // Grafik.MAGENTA
        // Grafik.CYAN
        

		/// Δe_3vqf0c Δ 4.3 Löschen eines Grafikobjekts
		// zuerst wird eine Linie erzeugt, die dann wieder gelöscht wird.
        Linie weg = 
                new Linie(40, 50, 100, 100, Grafik.MAGENTA, 3, "4");
        // löschen
        weg.delete();


	}
	

    /** 1.5 Eingabe von der Tastatur holen Δe_ulkfhc Δ 
     * Wartet bis Return gedrückt wird und 
     * gibt dann die in der Konsole eingegebene Zahl zurück.
     * oder -1, wenn es keine gültige int-Zahl war.
 	 * @author Dahm, Markus
	 * @return die eingegebene Zahl.
     */
    static int eingabeZahl() {
		String input;
        int zahl = -1;
        System.out.println(">>>> Bitte Zahl eingeben:");
        try { input = bufferedReader.readLine();
        	   zahl = Integer.parseInt(input); 
            } catch (Exception e) {
        }
	    return zahl;
    }

    /** Vorgegebene Variable für die Eingabe, 
     **NICHT ÄNDERN** */
    static java.io.BufferedReader bufferedReader = 
	      new java.io.BufferedReader(new java.io.InputStreamReader(System.in));



}
