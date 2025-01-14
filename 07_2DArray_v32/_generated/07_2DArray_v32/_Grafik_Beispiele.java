/**<br>
Beispiele f&uuml;r die Verwendung von Grafik-Objekten auf der Grafik-Konsole.<br>
<br>*/
class _Grafik_Beispiele {
	
	public static void main(String[] args) {
		
		System.out.println("///  4.1 Initialisierung und Löschen der Grafik-Konsole");
		        GrafikKonsole.clearGrafik();

		System.out.println("///  4.2.1 Button");
        /** M&ouml;gliche Parameter: <br>
        @param x x-Koordinate der oberen linken Ecke des Grafikobjekts, 0 ist dabei ganz links<br>
        @param y y-Koordinate der oberen linken Ecke des Grafikobjekts, 0 ist dabei ganz oben<br>
        @param b Breite des Buttons<br>
        @param h H&ouml;he des Buttons<br>
        @param fuellFarbe die F&uuml;llfarbe des Buttons<br>
        @param text Text-Label des Buttons<br>
        @param textColor Text-Farbe<br>
        @param fontsize Text-Gr&ouml;&szlig;e<br>
        @param borderRadius Rundung der Ecken des Buttons<br>
        @param reaktion der String, der eingelesen wird, wenn auf das Grafikobjekt geklickt wird<br>
        <br>*/

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
        
               
		System.out.println("///  4.2.2 Text");
		/** erzeugt ein Text-Grafikobjekt und stellt es auf der Grafik-Konsole dar<br>
        @param x  x-Koordinate der oberen linken Ecke des Grafikobjekts, 0 ist dabei ganz links<br>
        @param y  y-Koordinate der oberen linken Ecke des Grafikobjekts, 0 ist dabei ganz oben<br>
        @param text dieser Text wird angezeigt<br>
        @param farbe die Farbe des Texts, erlaubte Werte stehen unten<br>
        @param s Schriftgr&ouml;&szlig;e des Texts in Pixeln. <br>
        @param reaktion der String, der eingelesen wird, wenn auf das Grafikobjekt geklickt wird<br>
        <br>*/

        Text grafikText1 = new Text(220, 100, "Text", Grafik.BLUE, 34, null);

        // Variante: Der Text wird aus einem Zahlenwert bestimmt 
        // (durch Konkatenation der Zahl mit einem leeren String)
        int zahl = 45;
        Text grafikText2 = new Text(340, 100, ""+zahl, Grafik.BLUE, 34, "1");
        
        
		System.out.println("///  4.2.3 Rechteck");
		/** erzeugt ein Rechteck-Grafikobjekt und stellt es auf der Grafik-Konsole dar<br>
        @param x  x-Koordinate der oberen linken Ecke des Grafikobjekts, 0 ist dabei ganz links<br>
        @param y  y-Koordinate der oberen linken Ecke des Grafikobjekts, 0 ist dabei ganz oben<br>
        @param b breite des Rechtecks<br>
        @param h h&ouml;he des Rechtecks<br>
        @param fuellFarbe die F&uuml;llfarbe des Rechtecks<br>
        @param randFarbe die Randfarbe des Rechtecks<br>
        @param randBreite die Randbreite des Rechtecks<br>
        @param reaktion der String, der eingelesen wird, wenn auf das Grafikobjekt geklickt wird<br>
        <br>*/
            
        Rechteck grafikRechteck = 
                new Rechteck(20, 100, 100, 30, Grafik.BLUE, Grafik.BLACK, 3, "2");
        
        
		System.out.println("///  4.2.4 Kreis");
		/** erzeugt ein Rechteck-Grafikobjekt und stellt es auf der Grafik-Konsole dar<br>
        @param x  x-Koordinate der oberen linken Ecke des Grafikobjekts, 0 ist dabei ganz links<br>
        @param y  y-Koordinate der oberen linken Ecke des Grafikobjekts, 0 ist dabei ganz oben<br>
        @param b breite des Rechtecks<br>
        @param h h&ouml;he des Rechtecks<br>
        @param fuellFarbe die F&uuml;llfarbe des Rechtecks<br>
        @param randFarbe die Randfarbe des Rechtecks<br>
        @param randBreite die Randbreite des Rechtecks<br>
        @param reaktion der String, der eingelesen wird, wenn auf das Grafikobjekt geklickt wird<br>
        <br>*/
            
        Kreis grafikKreis = 
                new Kreis(0, 0, 100, 100, Grafik.YELLOW, Grafik.RED, 3, "3");
        grafikKreis.moveTo(100, 100);
        

		System.out.println("///  4.2.5 Linie");
		/** erzeugt ein Linien-Grafikobjekt und stellt es auf der Grafik-Konsole dar<br>
        @param xs  x-Koordinate der Startpunkts der Linie, 0 ist dabei ganz links<br>
        @param ys  y-Koordinate der Startpunkts der Linie, 0 ist dabei ganz oben<br>
        @param xs  x-Koordinate der Startpunkts der Linie, 0 ist dabei ganz links<br>
        @param ys  y-Koordinate der Startpunkts der Linie, 0 ist dabei ganz oben<br>
        @param farbe die Farbe der Linie<br>
        @param randBreite die Breite der Linie<br>
        @param reaktion der String, der eingelesen wird, wenn auf das Grafikobjekt geklickt wird<br>
        <br>*/
            
        Linie grafikLinie = 
                new Linie(10, 10, 100, 100, Grafik.GREEN, 3, "4");
        

		System.out.println("///  4.2.6 Farben");
		// Grafik.BLACK
        // Grafik.WHITE  
        // Grafik.RED
        // Grafik.BLUE
        // Grafik.GREEN
        // Grafik.YELLOW
        // Grafik.MAGENTA
        // Grafik.CYAN
        

		System.out.println("///  4.3 Löschen eines Grafikobjekts");
		// zuerst wird eine Linie erzeugt, die dann wieder gelöscht wird.
        Linie weg = 
                new Linie(40, 50, 100, 100, Grafik.MAGENTA, 3, "4");
        // löschen
        weg.delete();


	}
	

    /** 1.5 Eingabe von der Tastatur holen  <br>
     * Wartet bis Return gedr&uuml;ckt wird und <br>
     * gibt dann die in der Konsole eingegebene Zahl zur&uuml;ck.<br>
     * oder -1, wenn es keine g&uuml;ltige int-Zahl war.<br>
 	 * @author Dahm, Markus<br>
	 * @return die eingegebene Zahl.<br>
     <br>*/
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

    /** Vorgegebene Variable f&uuml;r die Eingabe, <br>
     <strong>NICHT &Auml;NDERN</strong> <br>*/
    static java.io.BufferedReader bufferedReader = 
	      new java.io.BufferedReader(new java.io.InputStreamReader(System.in));



}
