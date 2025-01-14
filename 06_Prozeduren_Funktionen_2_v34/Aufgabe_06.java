/**
 * Dies ist das Java-File für eine Klasse namens Aufgabe_06.
 * In dieser Datei ergänzen wir nun unsere Lösungen für diese Aufgaben.
 */
public class Aufgabe_06 {
	
    /** 
     * Diese Startprozedur wird beim Compilieren und Ausführen 
     * dieser .java-Datei ausgeführt.
     * @param args sind die Argumente, die beim Aufruf des Programms übergeben wurden.
     */
    public static void main(String[] args) {



		/// Δe_0x7y5j Δ 1.2.2 Zahlen formatiert ausgeben
		System.out.println(formatierterBetrag(3256.5266));
		System.out.println(formatierterBetrag(789.369));

		/// Δe_6dt3bo Δ 1.2.3 Prüfen, ob das Einkommen zwischen zwei Grenzen liegt
		System.out.println(grenzePruefen(12000.0,2200.00,10000.0));

		/// Δe_g68k4n Δ 1.3.1 Abschnittssteuer1 - unterhalb der Grenze1
		System.out.println(keinSteuer());

		/// Δe_pxpyp9 Δ 1.3.2 Abschnittssteuer2 - zwischen Grenze1 und Grenze2
		System.out.println(abschnittssteuer_2(12000));

		/// Δe_ht8jgq Δ 1.3.3 Abschnittssteuer3 - zwischen Grenze2 und Grenze3
		System.out.println(abschnittssteuer_3(16000));

		/// Δe_2ikfgp Δ 1.3.4 Abschnittssteuer4 - zwischen Grenze3 und Grenze4
		System.out.println(abschnittssteuer_4(80000));

		/// Δe_r2y9a0 Δ 1.3.5 Abschnittssteuer5 - ab Grenze4
		System.out.println(abschnittssteuer_5(400000));

		/// Δe_reiibd Δ 1.4 Gesamte Steuer
		System.out.println(gesamteSteuer(400000));

		/// Δe_8hhakg Δ 1.5 Durchschnittlicher Steuersatz in Prozent
		System.out.println(steuersatz_Prozent(400000));

		/// Δe_84rr7g Δ 1.6.1 Ausgeben der Überschrift
		ueberschrift();

		/// Δe_s3xzru Δ 1.6.2 Ausgeben einer einzelnen Tabellen-Zeile
		zeile_Ausgabe(2000);

		/// Δe_g4tr9k Δ 1.6.4 Array mit beispielhaften Einkommens-Werten füllen
		array_fuellen();
        for(int i=0; i<einkommensWerte.length; i++)
        {
            System.out.println(einkommensWerte[i]);
        }
 

    } // Ende public static void main
    
    	
		

	/** Δe_4vi050 Δ 1.2.1 Variablen für die Grenzen definieren	
	 * @param 
	 * @return 
	 */
	static double grenze1 = 9744.0;
	static double grenze2 = 14753.0;
	static double grenze3 = 57918.0;
	static double grenze4 = 274613.0;


	/** Δe_5t0ivj Δ 1.2.2 Zahlen formatiert ausgeben	
	 * @param betrag soll formatiert ausgegeben werden  €öäü
	 * @return der Wert von betrag als String, ohne Nachkommastellen
	 */
    static String formatierterBetrag(double betrag) {
    
        // Die Formatierte Umwandlung in einen String verwendet eine 
        // von Java bereitgestellte Funktion:
        return String.format("%.0f",betrag);

        // Warum man diese Funktion so aufruft, lernen Sie später kennen. 

        // Mehr zu dieser Funktion finden Sie in der API-Dokumentation 
        // von Java. Die Information in der API-Dokumentation stammt 
        // übrigens ausschließlich aus der *javadoc*-Beschreibung dieser 
        // Funktionen. Ohne diese Beschreibung könnten Sie Java, 
        // oder jede andere Code-Library gar nicht nutzen.
        
    }



	/** Δe_bckg3e Δ 1.2.3 Prüfen, ob das Einkommen zwischen zwei Grenzen liegt	
	 * @param 
	 * @return 
	 */
	static boolean grenzePruefen (double einkommen, double unteregrenze, double oberegrenze)
    {
        return einkommen >= unteregrenze && einkommen < oberegrenze;
    }

	/** Δe_nza86q Δ 1.3.1 Abschnittssteuer1 - unterhalb der Grenze1	
	 * @param 
	 * @return 
	 */
	static double keinSteuer()
    {
        double abschnittsSteuer1 = 0.0;
        return abschnittsSteuer1;
    }

	/** Δe_q10v28 Δ 1.3.2 Abschnittssteuer2 - zwischen Grenze1 und Grenze2	
	 * @param 
	 * @return 
	 */
	static double abschnittssteuer_2(double einkommen)
    {
        double Anteil;
        double Abschnittssteuer;
        if(einkommen >= grenze1 && einkommen < grenze2)
            {
                Anteil = (einkommen - grenze1) / 10000.0;
                Abschnittssteuer = (995.21 *  Anteil + 1400.0) *  Anteil;
            }
        else 
             Abschnittssteuer = 0.0;
        return Abschnittssteuer;  
    }

	/** Δe_1v42tq Δ 1.3.3 Abschnittssteuer3 - zwischen Grenze2 und Grenze3	
	 * @param 
	 * @return 
	 */
	static double abschnittssteuer_3(double einkommen)
    {
        double Anteil;
        double Abschnittssteuer;
        if(einkommen >= grenze2 && einkommen < grenze3)
            {
                Anteil = (einkommen - grenze2) / 10000.0;
                Abschnittssteuer = (208.85 *  Anteil + 2397.0) *  Anteil +950.96;
            }
        else 
             Abschnittssteuer = 0.0;
        return Abschnittssteuer;  
    }

	/** Δe_qfs8mw Δ 1.3.4 Abschnittssteuer4 - zwischen Grenze3 und Grenze4	
	 * @param 
	 * @return 
	 */
	static double abschnittssteuer_4(double einkommen)
    {
        double Abschnittssteuer;
        if(einkommen >= grenze3 && einkommen < grenze4)
           Abschnittssteuer = 0.42 * einkommen - 9136.63;
        else 
            Abschnittssteuer = 0.0;
        return Abschnittssteuer;  
    }

	/** Δe_ko9n9s Δ 1.3.5 Abschnittssteuer5 - ab Grenze4	
	 * @param 
	 * @return 
	 */
	static double abschnittssteuer_5(double einkommen)
    {
        double Abschnittssteuer;
        if(einkommen >= grenze4)
           Abschnittssteuer = 0.45 *  einkommen - 17374.99;
        else 
            Abschnittssteuer = 0.0;
        return Abschnittssteuer;  
    }


	/** Δe_x2cgxg Δ 1.4 Gesamte Steuer	
	 * @param 
	 * @return 
	 */
	static double gesamteSteuer(double einkommen)
    {
       double summe = keinSteuer() + abschnittssteuer_2(einkommen) + abschnittssteuer_3(einkommen)+abschnittssteuer_4(einkommen)+abschnittssteuer_5(einkommen);
        return summe;
    }


	/** Δe_zho483 Δ 1.5 Durchschnittlicher Steuersatz in Prozent	
	 * @param 
	 * @return 
	 */
	static double steuersatz_Prozent(double einkommen)
    {
        double steuersatz = gesamteSteuer(einkommen) / einkommen * 100;
        return steuersatz;
    }

    //1.6.1
    static void ueberschrift()
    {
        System.out.println("Eink. Absch.1 Absch.2 Absch.3 Absch.4 Absch.5 Steuer Steuersatz ");
    }

    //1.6.2
    static void zeile_Ausgabe(double einkommen)
    {
        System.out.println(einkommen + "\t" )  ;      
    }
	/** Δe_kyv4du Δ 1.6.3 Array-Variable für beispielhafte Einkommens-Werte	
	 * @param 
	 * @return 
	 */
	static double[] einkommensWerte = new double [14];

	/** Δe_dt1v8y Δ 1.6.4 Array mit beispielhaften Einkommens-Werten füllen	
	 * @param 
	 * @return 
	 */
	static void array_fuellen()
    {
        einkommensWerte[0]=5000.0;
        einkommensWerte[1]=9000.0;
        einkommensWerte[2]=10000.0;
        einkommensWerte[3]=12000.0;
        einkommensWerte[4]=14000.0;
        einkommensWerte[5]=16000.0;
        einkommensWerte[6]=18000.0;
        einkommensWerte[7]=20000.0;
        einkommensWerte[8]=40000.0;
        einkommensWerte[9]=60000.0;
        einkommensWerte[10]=80000.0;
        einkommensWerte[11]=100000.0;
        einkommensWerte[12]=200000.0;
        einkommensWerte[13]=400000.0;

    }

	/** Δe_5iidr1 Δ 1.6.5 Ausgeben aller Zeilen der Steuer-Tabelle mit Überschrift	
	 * @param 
	 * @return 
	 */
	

} // Ende public class Aufgabe