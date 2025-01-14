/**<br>
Beispiele f&uuml;r die Verwendung von Grafik-Objekten auf der Grafik-Konsole.<br>
<br>*/
class _Grafik_Beispiele {
	
	public static void main(String[] args) {
		

		System.out.println("///  1.1.2 Initialisierung und Löschen der Grafik-Konsole");
		GrafikKonsole.clearGrafik();
		

		System.out.println("///  1.2.2 Einen einfachen Button erzeugen");
        /* Mögliche Parameter: 
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
        // ganz einfach: nur Position und Text angeben      
        Button grafikbutton1 = 
            new Button(10, 10, "Einfach");


		System.out.println("///  1.2.3 Button mit überladenen Konstruktoren erzeugen");
        // Überladener Konstruktor - Wie der Konstruktor oben, 
        // plus: Die Farben für Hintergrund und Schrift werden angegeben
        // außerdem der Reaktions-String, der später im Programm eingelesen wird, wenn auf das Grafikobjekt geklickt wird
        Button grafikbutton2  =
            new Button(10, 70, Grafik.BLUE, "+ Farben und Reaktion", 
                               Grafik.YELLOW, "geklickt");



        // Überladener Konstruktor - Wie der Konstruktor oben,
        // plus: Die Schriftgröße und der Eckenradius 
        Button grafikbutton3  =
            new Button(10, 170, Grafik.BLUE, "+ Schrift-Größe und Radius angeben", 
                                Grafik.YELLOW, 40, 20, "click3");

        // Überladener Konstruktor - Wie der Konstruktor oben,
        // plus: Höhe und Breite angeben
        Button grafikbutton4 =
            new Button(300, 10, 300, 80, Grafik.BLACK, "Volle Kontrolle", 
                                         Grafik.WHITE, 20, 5, "click4");
        

		System.out.println("///  1.2.4 Position und Farbe des Buttons setzen");
        
        // Normaler Button: Position (x,y), Hintergrund-Farbe, 
        // Text, Text-Farbe und Reaktion angeben: 
        Button moveButton = new Button (10, 10, Grafik.GREEN, 
                                        "Move It", Grafik.BLACK, "huhu");
        moveButton.moveTo(200, 100);
        moveButton.setFillcolor(Grafik.BLUE);

		System.out.println("///  Erlaubte Farb-Ausdrücke für ein Grafik-Objekt");
		// Grafik.BLACK
        // Grafik.WHITE  
        // Grafik.RED
        // Grafik.BLUE
        // Grafik.GREEN
        // Grafik.YELLOW
        // Grafik.MAGENTA
        // Grafik.CYAN

		System.out.println("///  2.3 Farben für die Grafik-Konsole ermitteln");
        System.out.println("\nFarben von Karten-Objekte:");
        System.out.println( "rot" + "\t" + "gelb  "  + "\t" +  "gruen"  + "\t" +
                            "blau" + "\t" +  "schwarz" + "\t" +  "cyan" + "\t" +  
                            "magenta" + "\t" + "grau" + "\t" +  "weiss");
        System.out.println("\nErlaubte Farb-Ausdrücke: z.B. \"schwarz\" -> Grafik.BLACK");
        System.out.println( "RED" + "\t" + "YELLOW"  + "\t" +  "GREEN"  + "\t" +
                            "BLUE" + "\t" +  "BLACK" + "\t" +  "CYAN" + "\t" +  
                            "MAGENTA" + "\t" + "GREY" + "\t" +  "WHITE");
        System.out.println("\nDie erlaubten Farb-Ausdrücke für Grafik-Objekte haben diese String-Werte:");
        System.out.println(Grafik.RED + " " + Grafik.YELLOW  + " " +  
                           Grafik.GREEN  + " " +  Grafik.BLUE + " " +  
                           Grafik.BLACK + " " +  Grafik.CYAN + " " +  
                           Grafik.MAGENTA + " " + Grafik.GREY + " " +  Grafik.WHITE);
        String buttonFarbe = Grafik.BLUE;
        System.out.println("\nBeispielFarbe = " + buttonFarbe);


        System.out.println("///  1.2.5 Eingabe von der Tastatur einlesen");
        System.out.println(">>> Geben Sie einen Text ein und drücken Sie return");
        String eingabe1 = Konsole.eingabeString();  // liest den Text von der Tastatur ein
        System.out.println("Dieser String wurde als Eingabe gelesen: " + eingabe1);


		System.out.println("///  1.2.6 Auf einen Button klicken");
        // Normaler Button: new Button(x, y, Hintergrund-Farbe, Text, Text-Farbe, Reaktion): 
        Button normalButton = new Button (160, 20, Grafik.GREEN, "Normal", Grafik.BLACK, "Normal geklickt");
        System.out.println(">>> Klicken Sie auf den grünen Normal-Button");        
        String eingabe = Konsole.eingabeString();  // liest den Text von der Tastatur ein
        System.out.println("Dieser String wurde als Eingabe gelesen: " + eingabe);


		

		System.out.println("///  1.4.1 Text");
		/* erzeugt ein Text-Grafikobjekt und stellt es auf der Grafik-Konsole dar
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
        
        
		
		System.out.println("///  1.4.2 Rechteck");
		/* erzeugt ein Rechteck-Grafikobjekt und stellt es auf der Grafik-Konsole dar
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
        
        
		
		System.out.println("///  1.4.3 Kreis");
		/* erzeugt ein Rechteck-Grafikobjekt und stellt es auf der Grafik-Konsole dar
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
        

		System.out.println("///  1.4.4 Linie");
		/* erzeugt ein Linien-Grafikobjekt und stellt es auf der Grafik-Konsole dar
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
        

 
		System.out.println("///  1.5 Löschen eines Grafikobjekts");
		// zuerst wird eine Linie erzeugt, die dann wieder gelöscht wird.
        Linie weg = 
                new Linie(40, 50, 100, 100, Grafik.MAGENTA, 3, "4");
        // löschen
        weg.delete();

	}
	

	/** Gibt eine Zufallszahl zwischen 1 und max zur&uuml;ck. <br>
     * Wenn max &lt;1 angegeben wird, wird max=1 verwendet. <br>
	 * @author Dahm, Markus<br>
     * @param _max maximaler Wert der Zufallszahl, muss gr&ouml;sser als 1 sein <br>
     * @return Zufallszahl zwischen 1 und max<br>
	 <br>*/
	static int zufallsZahl(int _max) {
		if(_max < 1) {
            _max = 1;
        }
    	return 1+((int)(Math.random()*_max));
	}


    /** Eingabe von der Tastatur holen  <br>
     * Wartet bis Return gedr&uuml;ckt wird und <br>
     * gibt dann die in der Konsole eingegebene Zahl zur&uuml;ck.<br>
     * oder -1, wenn es keine g&uuml;ltige int-Zahl war.<br>
 	 * @author Dahm, Markus<br>
	 * @return die eingegebene Zahl.<br>
     <br>*/
    static int eingabeZahl() {
		String input="";
        int zahl = -1;
        System.out.println(">>>> Bitte Zahl eingeben:");
        try { input = bufferedReader.readLine();
        	   zahl = Integer.parseInt(input); 
            } catch (Exception e) {
        }
	    return zahl;
    }

    /** Eingabe von der Tastatur holen  <br>
     * Wartet bis Return gedr&uuml;ckt wird und <br>
     * gibt dann den in der Konsole eingegebenen Text zur&uuml;ck.<br>
 	 * @author Dahm, Markus<br>
	 * @return der eingegebene Text.<br>
     <br>*/
    static String eingabeText() {
		String input="";
        int zahl = -1;
        System.out.println(">>>> Bitte Text eingeben:");
        try { input = bufferedReader.readLine();
            } catch (Exception e) {
        }
	    return input;
    }

    /** Vorgegebene Variable f&uuml;r die Eingabe, <br>
     <strong>NICHT &Auml;NDERN</strong> <br>*/
    static java.io.BufferedReader bufferedReader = 
	      new java.io.BufferedReader(new java.io.InputStreamReader(System.in));




}
