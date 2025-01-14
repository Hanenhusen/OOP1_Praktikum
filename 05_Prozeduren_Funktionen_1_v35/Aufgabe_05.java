/**
 * Dies ist das Java-File für eine "Klasse" namens Aufgabe_05.
 * In dieser Datei ergänzen Sie nun Ihre Lösungen für diese Aufgaben.
 */
public class Aufgabe_05 {
	
    /** 
     * Diese Prozedur wird beim Compilieren und Ausführen dieser .java-Datei ausgeführt.
     * @param args hier können beim Aufruf auf der Kommandozeile oder in der IDE
     * zusätzliche Angaben gemacht werden.
     */
    public static void main(String[] args) {

//		/// Δe_rdmdnq Δ 2.1.2 Ausführbarer Code in der Prozedur main()
//        System.out.println("Beginn Termin 05");
//		
//
//		/// Δe_d8li2u Δ 2.3 Aufruf von Prozeduren und Funktionen
//		begruessung();
//
//		/// Δe_t5t7su Δ 2.4.3 Aufruf von überladenen Prozeduren
//		begruessung("Max");
//        begruessung("Max", 2);
//
//		/// Δe_ogzlgp Δ 2.5.2 Aktiver Kommentar /// 
//    	/// Hier ist ein aktiver Kommentar
//
//		/// Δe_n24on3 Δ 3.1 Titel anzeigen
//		einmaleins();
//
//		/// Δe_oexwij Δ 3.2 Infos anzeigen
//		einmaleins("Autor", 3.5);
//		/// Δe_larewa Δ 3.3 Spaltenüberschriften anzeigen
//		spaltenUeberschriftrn(5);
//
//		/// Δe_dids9o Δ 3.4 Eine einzelne Zeile anzeigen
//		zeileAnzeigen(3);
//
//		/// Δe_5snv47 Δ 4.2.1 Quadrat berechnen
//        quadrat(2);
//
//		/// Δe_6s6men Δ 4.2.2 Summe von Quadraten berechnen 
//		quadraten_Summe(2, 3);
//
//		/// Δe_fggryp Δ 4.2.3 Mit Pythagoras prüfen
//		ueberpruefen(2,3,5.6);
//
//		/// Δe_f5w93r Δ 4.2.4 Alles zusammenfassen
//		pythagoras(2,3,4);
//
//		/// Δe_upjmrm Δ 4.3.1 Falsche Verwendung des Funktions-Datentyps
//		//quadraten_Summe(true);
//
//		/// Δe_437gi9 Δ 3.7.2 Falsche Anzahl von Parametern
		  double[][] feld = {{1.3,3.7},{5.9,8.9},{9.0}};

        System.out.println(groessteZahl(feld));
    } // Ende public static void main
	
    static double maxi = 0.0;
    static double groessteZahl(double[][] _feld){
        for(int zeile = 0; zeile<_feld.length;zeile++){
            for(int spalte = 0; spalte<_feld[zeile].length; spalte++){
                if(_feld[zeile][spalte] >= maxi)
                    maxi = _feld[zeile][spalte];
            }
        }
        return maxi;
    }

	/** Δe_z6fj33 Δ 2.2.1 Prozedur static void begruessung()*/
	static void begruessung()
    {
        System.out.println("Wellcome ");
    }

	/** Δe_1g2ajx Δ 2.4.1 Definition von überladener Prozedur mit Namen*/
	static void begruessung(String name)
    {
        System.out.println("Wellcome "+ name);
    }

	/** Δe_742tpi Δ 2.4.2 Definition von überladener Prozedur mit Namen und Anzahl
    * @param name in der console drückt, aufrufAnzahl: wie viel soll die Name ausgegeben werden
    */
	static void begruessung(String name, int aufrufAnzahl)
    {
        for(int i= 0; i<aufrufAnzahl; i++)
        {
        System.out.println("Wellcome "+ name);
        }
    }


	/** Δe_bupfv5 Δ 3.1 Titel anzeigen*/
    static void einmaleins()
    {
        System.out.println("Ein mal eins");
    }

	

	/** Δe_ecyhvc Δ 3.2 Infos anzeigen*/
	static void einmaleins(String autor, double version)
    {
        System.out.println("Ein mal eins");
        System.out.println(autor + " " + version);
    }

	/** Δe_hecxxl Δ 3.3 Spaltenüberschriften anzeigen*/
	static void spaltenUeberschriftrn(int max)
    {
        for(int i=1; i<= max; i++)
            {
                System.out.print("\t" + i );
            }
    }

	/** Δe_7ppe8j Δ 3.4 Eine einzelne Zeile anzeigen	
	 * @param max
	 * @return 
	 */
	static void zeileAnzeigen(int max)
    {
          int i=1;
          while(i<=max)
          {
              System.out.print("\t" + i );
              int j=1;
              System.out.print(j+"\t" );

             while(j<=max)
             {
                    int erg = i*j;
                    System.out.println("\t" +erg);
                    j++;
             }

              i++;
          }        
    }

	/** Δe_xlf5s4 Δ 3.5 Alle Zeilen anzeigen 	
	 * @param 
	 * @return 
	 */
	

	/** Δe_v5b99b Δ 4.2.1 Quadrat berechnen	
	 * @param 
	 * @return ergebnis von quadrat 
	 */

    static double quadrat(int zahl)
    {
       double zahl_Quadrat = zahl * zahl;
       System.out.println("Ergebnis = " +zahl_Quadrat);
       return zahl_Quadrat;
    }
	

	/** Δe_l0c9pk Δ 4.2.2 Summe von Quadraten berechnen 	
	 * @param 
	 * @return 
	 */
	static double quadraten_Summe(int a, int b)
    {
        double c;
        c = (a*a) + (b*b);
        System.out.println("Ergebnis = " + c);
        return c;
    }

	/** Δe_w8hhjo Δ 4.2.3 Mit Pythagoras prüfen	
	 * @param 
	 * @return 
	 */
	static boolean ueberpruefen(int a, int b, double c)
    {
        boolean erg;
        erg =(c*c == (a*a) + (b*b));
        System.out.println("Ergebnis = " + erg);
        return erg;
    }

	/** Δe_s7skaw Δ 4.2.4 Alles zusammenfassen	
	 * @param 
	 * @return 
	 */
	static void pythagoras(int a, int b , int c)
    {
        if(ueberpruefen(a, b, c) == true)
            System.out.println("Das Dreieck mit einer Hypothenuse der Länge" +c+ "und zwei Katheten der Länge "+ a + " und " +b +" ist rechtwinklig");
        else
            System.out.println("Stimmt nicht");
        
    }

	/** Δe_x3vat6 Δ 4.3.2 Falsche Rückgabe in der Funktion	
	 * @param 
	 * @return 
	 */
	/* 
    static int summe(int a, int b, double c)
    {
        boolean erg;
        erg =(c*c == (a*a) + (b*b));
        System.out.println("Ergebnis = " + erg);
        return erg;
    }
    */

} // Ende public class Aufgabe_05