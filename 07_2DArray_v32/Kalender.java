/**
 * Ein interaktiver Adventskalender.
 * 
 * Es werden zwei fortgeschrittene Funktionen vorgegeben, die Sie benutzen. 
 */
 
class Kalender {
	
   /** Haupt-Prozedur, wird beim Programmstart aufgerufen
    * Beim Aufruf des Programms können Parameter mitgegeben werden
    * Wie die verwendet werden, behandeln wir später.
    * @param args Das sind die Kommandozeilen-Parameter
    */
    public static void main(String[] args) { 



		/// Δe_et3pcp Δ 1.2.3 Variable für den Kalender 
		int [][] aktuellerKalender = {		//4Spalten 6Reihen
            {1,2,3,4,5,6},
            {7,8,9,10,11,12},
            {13,14,15,16,17,18},
            {19,20,21,22,23,24}, 
       }; 
       
        int [][] advent = new int[4][6];

		/// Δe_ytbd4i Δ 1.2.4 Kalender anzeigen
		kalenderAusgeben(aktuellerKalender);

		/// Δe_8zu148 Δ 1.3.1 Füllen mit ungeprüften Zufallszahlen
		ausgeben(aktuellerKalender);

		/// Δe_xyppaq Δ 1.3.2 Ist eine Zahl bereits im Kalender vorhanden?
        System.out.println(zahlPruefen(aktuellerKalender,30));
		/// Δe_c7xgb3 Δ 1.3.3 Eine geprüfte Zufallszahl erzeugen
		int [][] gepruefteZufallsZahl	=	{
            {1,2,3,4,5,6},
            {7,8,9,10,12},
            {13,14,15,16,17,18},
            {19,20,21,22,23,24},
        };

		/// Δe_nk8izx Δ 
        System.out.println(gepruefteZahl(gepruefteZufallsZahl));

		/// Δe_vb8cse Δ 1.3.4 Füllen mit geprüften Zufallszahlen
		int [][] testArray = new int [4][6];
		kalenderFuellen(testArray);
 		kalenderAusgeben(testArray);

		/// Δe_yts6kj Δ 1.4 Eine Tür öffnen
		tuerOffnen(testArray, 10);
        kalenderAusgeben(testArray);

		/// Δe_k0idck Δ 1.5 Eingabe von der Tastatur holen
        System.out.println("Die Zahl lautet " + eingabeZahl());	
	
        /// Δe_ie8dbf Δ 1.6.1 Erste Version - Beliebige Reihenfolge
		//ersteVersion(testArray);

		/// Δe_vgjfhs Δ 1.6.2 Fertige Version - Richtige Reihenfolge einhalten
		//fertigeVersion(testArray);

		/// Δe_m24daz Δ 1.7.1 2D-Array im Programm erzeugen
		kalenderAusgeben(array(4,6));
        

		/// Δe_apxkx0 Δ 1.7.2 Kalender hochkant komplett
		int [][] neuerKalender = array(4,6);
        tuerOffnen(neuerKalender, 10);
        kalenderAusgeben(neuerKalender);
    }


     /** Δe_pajg9k Δ 1.2.4 Kalender anzeigen	
    *@param 2d array feld, gibt die kalender felder oder auch tage auf der Konsole wieder
    */
     static void kalenderAusgeben(int[][] feld) {
		for(int zeile = 0; zeile < feld.length; zeile++) {
			for(int spalte = 0; spalte < feld[zeile].length; spalte++) {
				System.out.print(feld[zeile][spalte] + "\t");
			}            
			System.out.println("");
		}   
	}

	/** Δe_arf4vx Δ 1.3.1 Füllen mit ungeprüften Zufallszahlen	
	 *@param 2d feld, gibt die kalender felder oder auch tage auf der Konsole wieder
    */
    static void ausgeben(int[][] feld) {
		for(int zeile = 0; zeile < feld.length; zeile++) {
			for(int spalte = 0; spalte < feld[zeile].length; spalte++) {
				System.out.print(zufallsZahl(zeile) + zufallsZahl(spalte) +  feld[zeile][spalte] + "\t");
			}            
			System.out.println("");
		}
	}

	/** Δe_r6tzvs Δ Aufgabe 1.3.1 Füllen mit ungeprüften Zufallszahlen 
	 * Gibt eine Zufallszahl zwischen 1 und max zurück. 
     * Wenn max <1 angegeben wird, wird max=1 verwendet. 
	 * @author Dahm, Markus
     * @param _max maximaler Wert der Zufallszahl, muss grösser als 1 sein 
     * @return Zufallszahl zwischen 1 und max
	 */
	static int zufallsZahl(int _max) {
		if(_max < 1) {
            _max = 1;
        }
    	return 1+((int)(Math.random()*_max));
	}

	/** Δe_s3583h Δ 1.3.2 Ist eine Zahl bereits im Kalender vorhanden?	
	*@param zahl, schaut ob die zahl schon vorhanden ist
    *@param 2d kalender, beschreibt den belieben 2d array
    *@return true wenn es vorhanden ist
    *@return false wenn es nicht vorhanden ist
    */
	static boolean zahlPruefen(int [][] kalender, int zahl)	{
       	for (int zeile = 0; zeile < kalender.length; zeile++)	{
            for(int spalte = 0; spalte < kalender[zeile].length; spalte++)	{
              	if (kalender[zeile][spalte] == zahl)	{
                    return true;
                }
            }
        }
        return false;
    }
       

    

	/** Δe_sjfzn8 Δ 1.3.3 Eine geprüfte Zufallszahl erzeugen	
	 *@param 2d array kalenderTag, beschreibt den beliebigen 2d array
    *@return gepruefteZahl, sucht weiter eine zahl die nicht vorhanden ist, teufelskreis
    *@return zufallsZahlErzeugen, gibt die zahl zurück die noch nicht vorhanden ist
    */
	static int gepruefteZahl (int[][] kalender)	{
       	int zufallsZahlErzeugen = zufallsZahl(24);
		
        /*for (int zeile = 0; zeile < kalender.length; zeile++)	{
             for(int spalte = 0; spalte < kalender[zeile].length; spalte++)	{
                 if (kalender[zeile][spalte] == zufallsZahlErzeugen)
                 return gepruefteZahl(kalender);
             }
        } */
        if (zahlPruefen(kalender, zufallsZahlErzeugen))	{
         	return gepruefteZahl(kalender);   
        }
        return zufallsZahlErzeugen;
    }
    
	/** Δe_1qbiz0 Δ 1.3.4 Füllen mit geprüften Zufallszahlen	
	*@param 2d array kalender, für den beliebigen 2d array
    */
	static void kalenderFuellen (int [][] kalender) {
    	for (int zeile = 0; zeile < kalender.length; zeile++)	{
        	
        	for (int spalte = 0; spalte < kalender[zeile].length; spalte++)	{
            	kalender[zeile][spalte] = gepruefteZahl(kalender);
            }
        }
    }

	/** Δe_wq5ed7 Δ 1.4 Eine Tür öffnen	
	 *@param 2d array kalender, für den beliebigen 2d array
    *@param tuer, beschreibt die tür die man öffnet
    */
	static void tuerOffnen ( int [][]kalender, int tuer)	{
        for (int zeile = 0; zeile < kalender.length; zeile++)	{
            
         	for (int spalte = 0; spalte < kalender[zeile].length; spalte++)	{
                
                if (kalender[zeile][spalte] == tuer)	{
                 	kalender[zeile][spalte] = 0;
                    return;		//gibt nichts zurück, bricht es ab danach
                }
        	}
    	}
    }
	/** Δe_1eysy1 Δ 1.5 Eingabe von der Tastatur holen	
     * Wartet auf eine Eingabe, bis Return gedrückt wird und 
     * gibt dann die in der Konsole eingegebene Zahl zurück.
 	 * @author Dahm, Markus
	 * @return die eingegebene Zahl, oder -1, wenn das keine gültige int-Zahl ist
     */
    static int eingabeZahl() {
		String input;
        int zahl = -1;
        System.out.println(">>>> Bitte Zahl eingeben - oder auf einen Button klicken:");
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

	
	/** Δe_wdz3dl Δ 1.6.1 Erste Version - Beliebige Reihenfolge	
	*@param 2d array kalender, beschreibt den jeweiligen 2d array
    *@return 	
    */
    static void ersteVersion (int[][] kalender)	{
    		int eingegebeneZahl = eingabeZahl();
        	if (eingegebeneZahl <= 0) 	{
             	return;
            }
            else 	{
            	tuerOffnen(kalender, eingegebeneZahl);
                kalenderAusgeben(kalender);
                ersteVersion(kalender);
            }
    }     

	/** Δe_2hknd6 Δ 1.6.2 Fertige Version - Richtige Reihenfolge einhalten	
    *@param 2d array kalender, für den jeweiligen 2d array
   	*@return 
    */
	static void fertigeVersion (int [][] kalender)	{
   		int tag = 1;
    	int eingegebeneZahl = eingabeZahl(); 
        while (eingegebeneZahl <= 0 || tag==25) {
             System.out.println("Alle Türen sind geöffnet");
            	return;
       	}	if (eingegebeneZahl == tag) 	{
                ++tag; 
            	tuerOffnen(kalender, eingegebeneZahl);
                kalenderAusgeben(kalender);
                ersteVersion(kalender); 
        	}	else {
                	System.out.println("Öffnen sie die richtige Tür bitte " + tag );
                	fertigeVersion(kalender);  
            	}
    	}
	

	/** Δe_uhnatz Δ 1.7.1 2D-Array im Programm erzeugen	
	*@param 2d array kalender, für den jeweiligen 2darray
    *@return kalendi, gibt den kalender zurück
    */
     static int[][] array (int hoehe, int breite)	{
   		int[][]array = new int[hoehe][breite];
        kalenderFuellen(array);
        return array;
  	}
	

} // Ende Java File