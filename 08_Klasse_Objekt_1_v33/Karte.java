/**
**Verantwortlich für:** Karte mit Eigenschaften definieren 

**Die Daten beschreiben:**

**Funktionalität der Methoden:**

**Zusammenarbeit mit anderen Klassen:**

*/
class Karte {
	
	public static void main(String[] args) {
		
		/// Δe_7h05s6 Δ 2.6.2 Objekte erzeugen
		Karte ersteKarte = new Karte();
    	Karte zweiteKarte = new Karte();
		Karte dritteKarte = new Karte();

		/// Δe_s1rvfu Δ 2.6.3  Instanz-Methoden für Objekte aufrufen
		ersteKarte.position(1,5);
		ersteKarte.aendereAussehen("#FF0000","K1");
        System.out.println("Erste Karte :: " + ersteKarte.toString());

        zweiteKarte.position(3,8);
		zweiteKarte.aendereAussehen("#00FF00","K2");
        System.out.println("Zweite Karte :: " + zweiteKarte.toString());

		dritteKarte.position(5,9);
		dritteKarte.aendereAussehen("#0000FF","K3");
        System.out.println("Dritte Karte :: " + dritteKarte.toString());
		
		/// Δe_4epe4h Δ 2.7.1 Mit einer anderen Karte tauschen.
		tauschePosition(ersteKarte, zweiteKarte);
        System.out.println("Erste Karte :: " + ersteKarte.toString());
        System.out.println("Zweite Karte :: " + zweiteKarte.toString());

		/// Δe_hvihlx Δ 2.7.2 Aussehen einer anderen Karte übernehmen
		uebernehmeAussehen(zweiteKarte, dritteKarte);
        System.out.println("Zweite Karte :: " + zweiteKarte.toString());
        System.out.println("Dritte Karte :: " + dritteKarte.toString());

		/// Δe_y4x3jx Δ 2.7.3 Mit einer anderen Karte vergleichen 
		System.out.println("Karten haben gleiche Farbe : " +kartePasst(zweiteKarte, dritteKarte));
		System.out.println("Karten haben gleiche Farbe : " +kartePasst(ersteKarte, zweiteKarte));

		/// Δe_2m74jr Δ 2.8.3 ID einer Karte erzeugen
		ersteKarte.erzeugeID();
        zweiteKarte.erzeugeID();
        dritteKarte.erzeugeID();
        System.out.println("Erste Karte :: " + ersteKarte.toString());
        System.out.println("Zweite Karte :: " + zweiteKarte.toString());
        System.out.println("Dritte Karte :: " + dritteKarte.toString());

		/// Δe_7t1tij Δ 2.8.4 Prüfen der ID einer Karte
		System.out.println("ID ist : " + ersteKarte.pruefeID("3,8"));
		System.out.println("ID ist : " + zweiteKarte.pruefeID("3,8"));


	}//end method main
	
	/** Δe_clc6wd Δ 2.4 Daten als Instanz-Variable implementieren	
	 * Zeile definiert position der karte auf dem Spielfeld, ist 0 für die obereste zeile
     * Spalte ist 0 für die Spalte am linken Rand
     * text wird auf die karte gezeigt
     * farbe des Hintergrunds der karte
	 */
    
    int zeile ;
    int spalte ;

    String text;
	String farbe;

	/** Δe_kf5e2u Δ 2.5.1 Karte auf dem Spielfeld positionieren	
	 * Position der Karte übernehemn
     * @param x definiert zeilenposition 
     * @param y definiert spaltenposition
	 */
    void position(int x, int y){
        if(x >= 0 && y >=0){
           this.zeile = x;
           this.spalte = y;  
        }
        else{
            System.out.println("Position kann nicht geändert werden");
        }
    }
	

	/** Δe_57263z Δ 2.5.2 Farbe der Karte ändern	
	 * @param _farbe für die Karte übergeben
	 * @return _farbe
	 */
    void aendereAussehen( String _farbe){
        this.farbe = _farbe;
    }
	

	/** Δe_svmy4r Δ 2.5.3 Farbe und Text der Karte ändern	
	 * @param _farbe der Karte übergeben
     * @param _text der Karte übergebn
	 * @return _farbe und _text
	 */
	void aendereAussehen( String _farbe, String _text){
        this.farbe =_farbe;
        
        if(_text.length() <=3){
            this.text = _text;
    	}
        else{
            System.out.println("Text kann nicht geändert werden");
        }    
    }

	/** Δe_272zf8 Δ 2.5.4 Einen String zur Beschreibung einer Karte erzeugen 	
	 * Beschreibung der Karte durch IV 
	 */
	public String toString(){
        String karte = "Zeile = " + this.zeile + " ,Spalte = " + this.spalte
                       + " ,Farbe: " + this.farbe + ", Text: " + this.text
                       + " ,ID: " + this.id;
        return karte;
    }

	/** Δe_5aitwo Δ 2.5.5 Optional: Lesbare Farbe erzeugen	
	 * @param 
	 * @return 
	 */
	

	/** Δe_z0zfsw Δ 2.7.1 Mit einer anderen Karte tauschen.
     * Position einer Karte mit Position der anderen Karte tauschen
	 * @param _k1 Kartenobjekt übergebn, das bekommt Position von _k2
     * @param _k2 Kartenobjekt übergebn, das bekommt Position von _k1
	 */
	static void tauschePosition(Karte _k1, Karte _k2){
        int alteZeile1 = _k1.zeile;
        int alteSpalte1 = _k1.spalte;
        int alteZeile2 =  _k2.zeile;
        int alteSpalte2=  _k2.spalte;
        _k1.zeile = alteZeile2;
        _k1.spalte =alteSpalte2;
        _k2.zeile = alteZeile1 ;
        _k2.spalte =alteSpalte1;
    }
	/** Δe_4x974o Δ 2.7.2 Aussehen einer anderen Karte übernehmen	
	 * Aussehen einer Karte übernimmt Aussehen der anderen Karte	
	 * @param _k1 Kartenobjekt übergebn, das neu Aussehen bekommt
     * @param _k2 Kartenobjekt übergebn, das sein Aussehen übergibt
	 */
	static void uebernehmeAussehen(Karte _k1, Karte _k2){
        _k1.text = _k2.text;
        _k1.farbe = _k2.farbe;
    }

	/** Δe_swdzql Δ 2.7.3 Mit einer anderen Karte vergleichen 	
	 * Farbe von zwei Karten vergleichen 
     * @param _k1 Kartenobjekt
	 * @param _k2 Kartenobjekt
	 * @return gleich, ob die Karten gleiche Farbe haben oder nicht
	 */
	static boolean kartePasst(Karte _k1, Karte _k2){
        
        return _k1.farbe.equals(_k2.farbe);
           
    }

	/** Δe_zca5i6 Δ 2.8.1 ID als Eigenschaft einer Karte	
	 * Definition string ID Instanz-Variable
	 */
	String id;

	/** Δe_slcg7v Δ 2.8.3 ID einer Karte erzeugen	
	 * eindeutige ID aus zeile und Spalte zusammengesetzt
	 */
	void erzeugeID (){
    this.id = String.valueOf((this.zeile)+","+(this.spalte));    
}

	/** Δe_1b6q3n Δ 2.8.4 Prüfen der ID einer Karte	
     * @param _id übergeben, welche mit objekt_id geprüft wird
	 * @return 
	 */
	boolean pruefeID(String _id ){
        return _id.equals(this.id);
    }

}//end class Karte
