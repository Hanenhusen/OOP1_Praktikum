/**<br>
 * Dies ist das Java-File f&uuml;r eine "Klasse" namens Aufgabe_05.<br>
 * In dieser Datei erg&auml;nzen Sie nun Ihre L&ouml;sungen f&uuml;r diese Aufgaben.<br>
 <br>*/
public class Aufgabe_05 {
	
    /** <br>
     * Diese Prozedur wird beim Compilieren und Ausf&uuml;hren dieser .java-Datei ausgeführt.<br>
     * @param args hier k&ouml;nnen beim Aufruf auf der Kommandozeile oder in der IDE<br>
     * zus&auml;tzliche Angaben gemacht werden.<br>
     <br>*/
    public static void main(String[] args) {

//		System.out.println("///  2.1.2 Ausführbarer Code in der Prozedur main()");
//        System.out.println("Beginn Termin 05");
//		
//
//		System.out.println("///  2.3 Aufruf von Prozeduren und Funktionen");
//		begruessung();
//
//		System.out.println("///  2.4.3 Aufruf von überladenen Prozeduren");
//		begruessung("Max");
//        begruessung("Max", 2);
//
//		System.out.println("///  2.5.2 Aktiver Kommentar /// ");
//    	System.out.println("/// Hier ist ein aktiver Kommentar");
//
//		System.out.println("///  3.1 Titel anzeigen");
//		einmaleins();
//
//		System.out.println("///  3.2 Infos anzeigen");
//		einmaleins("Autor", 3.5);
//		System.out.println("///  3.3 Spaltenüberschriften anzeigen");
//		spaltenUeberschriftrn(5);
//
//		System.out.println("///  3.4 Eine einzelne Zeile anzeigen");
//		zeileAnzeigen(3);
//
//		System.out.println("///  4.2.1 Quadrat berechnen");
//        quadrat(2);
//
//		System.out.println("///  4.2.2 Summe von Quadraten berechnen ");
//		quadraten_Summe(2, 3);
//
//		System.out.println("///  4.2.3 Mit Pythagoras prüfen");
//		ueberpruefen(2,3,5.6);
//
//		System.out.println("///  4.2.4 Alles zusammenfassen");
//		pythagoras(2,3,4);
//
//		System.out.println("///  4.3.1 Falsche Verwendung des Funktions-Datentyps");
//		//quadraten_Summe(true);
//
//		System.out.println("///  3.7.2 Falsche Anzahl von Parametern");
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

	/**  2.2.1 Prozedur static void begruessung()<br>*/
	static void begruessung()
    {
        System.out.println("Wellcome ");
    }

	/**  2.4.1 Definition von &uuml;berladener Prozedur mit Namen<br>*/
	static void begruessung(String name)
    {
        System.out.println("Wellcome "+ name);
    }

	/**  2.4.2 Definition von &uuml;berladener Prozedur mit Namen und Anzahl<br>
    * @param name in der console dr&uuml;ckt, aufrufAnzahl: wie viel soll die Name ausgegeben werden<br>
    <br>*/
	static void begruessung(String name, int aufrufAnzahl)
    {
        for(int i= 0; i<aufrufAnzahl; i++)
        {
        System.out.println("Wellcome "+ name);
        }
    }


	/**  3.1 Titel anzeigen<br>*/
    static void einmaleins()
    {
        System.out.println("Ein mal eins");
    }

	

	/**  3.2 Infos anzeigen<br>*/
	static void einmaleins(String autor, double version)
    {
        System.out.println("Ein mal eins");
        System.out.println(autor + " " + version);
    }

	/**  3.3 Spalten&uuml;berschriften anzeigen<br>*/
	static void spaltenUeberschriftrn(int max)
    {
        for(int i=1; i<= max; i++)
            {
                System.out.print("\t" + i );
            }
    }

	/**  3.4 Eine einzelne Zeile anzeigen	<br>
	 * @param max<br>
	 * @return <br>
	 <br>*/
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

	/**  3.5 Alle Zeilen anzeigen 	<br>
	 * @param <br>
	 * @return <br>
	 <br>*/
	

	/**  4.2.1 Quadrat berechnen	<br>
	 * @param <br>
	 * @return ergebnis von quadrat <br>
	 <br>*/

    static double quadrat(int zahl)
    {
       double zahl_Quadrat = zahl * zahl;
       System.out.println("Ergebnis = " +zahl_Quadrat);
       return zahl_Quadrat;
    }
	

	/**  4.2.2 Summe von Quadraten berechnen 	<br>
	 * @param <br>
	 * @return <br>
	 <br>*/
	static double quadraten_Summe(int a, int b)
    {
        double c;
        c = (a*a) + (b*b);
        System.out.println("Ergebnis = " + c);
        return c;
    }

	/**  4.2.3 Mit Pythagoras pr&uuml;fen	<br>
	 * @param <br>
	 * @return <br>
	 <br>*/
	static boolean ueberpruefen(int a, int b, double c)
    {
        boolean erg;
        erg =(c*c == (a*a) + (b*b));
        System.out.println("Ergebnis = " + erg);
        return erg;
    }

	/**  4.2.4 Alles zusammenfassen	<br>
	 * @param <br>
	 * @return <br>
	 <br>*/
	static void pythagoras(int a, int b , int c)
    {
        if(ueberpruefen(a, b, c) == true)
            System.out.println("Das Dreieck mit einer Hypothenuse der Länge" +c+ "und zwei Katheten der Länge "+ a + " und " +b +" ist rechtwinklig");
        else
            System.out.println("Stimmt nicht");
        
    }

	/**  4.3.2 Falsche R&uuml;ckgabe in der Funktion	<br>
	 * @param <br>
	 * @return <br>
	 <br>*/
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