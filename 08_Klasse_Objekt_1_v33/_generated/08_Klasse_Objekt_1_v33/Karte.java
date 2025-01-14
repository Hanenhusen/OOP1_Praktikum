/**<br>
<strong>Verantwortlich f&uuml;r:</strong> Karte mit Eigenschaften definieren <br>
<br>
<strong>Die Daten beschreiben:</strong><br>
<br>
<strong>Funktionalit&auml;t der Methoden:</strong><br>
<br>
<strong>Zusammenarbeit mit anderen Klassen:</strong><br>
<br>
<br>*/
class Karte {
	
	public static void main(String[] args) {
		
		System.out.println("///  2.6.2 Objekte erzeugen");
		Karte ersteKarte = new Karte();
    	Karte zweiteKarte = new Karte();
		Karte dritteKarte = new Karte();

		System.out.println("///  2.6.3  Instanz-Methoden für Objekte aufrufen");
		ersteKarte.position(1,5);
		ersteKarte.aendereAussehen("#FF0000","K1");
        System.out.println("Erste Karte :: " + ersteKarte.toString());

        zweiteKarte.position(3,8);
		zweiteKarte.aendereAussehen("#00FF00","K2");
        System.out.println("Zweite Karte :: " + zweiteKarte.toString());

		dritteKarte.position(5,9);
		dritteKarte.aendereAussehen("#0000FF","K3");
        System.out.println("Dritte Karte :: " + dritteKarte.toString());
		
		System.out.println("///  2.7.1 Mit einer anderen Karte tauschen.");
		tauschePosition(ersteKarte, zweiteKarte);
        System.out.println("Erste Karte :: " + ersteKarte.toString());
        System.out.println("Zweite Karte :: " + zweiteKarte.toString());

		System.out.println("///  2.7.2 Aussehen einer anderen Karte übernehmen");
		uebernehmeAussehen(zweiteKarte, dritteKarte);
        System.out.println("Zweite Karte :: " + zweiteKarte.toString());
        System.out.println("Dritte Karte :: " + dritteKarte.toString());

		System.out.println("///  2.7.3 Mit einer anderen Karte vergleichen ");
		System.out.println("Karten haben gleiche Farbe : " +kartePasst(zweiteKarte, dritteKarte));
		System.out.println("Karten haben gleiche Farbe : " +kartePasst(ersteKarte, zweiteKarte));

		System.out.println("///  2.8.3 ID einer Karte erzeugen");
		ersteKarte.erzeugeID();
        zweiteKarte.erzeugeID();
        dritteKarte.erzeugeID();
        System.out.println("Erste Karte :: " + ersteKarte.toString());
        System.out.println("Zweite Karte :: " + zweiteKarte.toString());
        System.out.println("Dritte Karte :: " + dritteKarte.toString());

		System.out.println("///  2.8.4 Prüfen der ID einer Karte");
		System.out.println("ID ist : " + ersteKarte.pruefeID("3,8"));
		System.out.println("ID ist : " + zweiteKarte.pruefeID("3,8"));


	}//end method main
	
	/**  2.4 Daten als Instanz-Variable implementieren	<br>
	 * Zeile definiert position der karte auf dem Spielfeld, ist 0 f&uuml;r die obereste zeile<br>
     * Spalte ist 0 f&uuml;r die Spalte am linken Rand<br>
     * text wird auf die karte gezeigt<br>
     * farbe des Hintergrunds der karte<br>
	 <br>*/
    
    int zeile ;
    int spalte ;

    String text;
	String farbe;

	/**  2.5.1 Karte auf dem Spielfeld positionieren	<br>
	 * Position der Karte &uuml;bernehemn<br>
     * @param x definiert zeilenposition <br>
     * @param y definiert spaltenposition<br>
	 <br>*/
    void position(int x, int y){
        if(x >= 0 && y >=0){
           this.zeile = x;
           this.spalte = y;  
        }
        else{
            System.out.println("Position kann nicht geändert werden");
        }
    }
	

	/**  2.5.2 Farbe der Karte &auml;ndern	<br>
	 * @param _farbe f&uuml;r die Karte übergeben<br>
	 * @return _farbe<br>
	 <br>*/
    void aendereAussehen( String _farbe){
        this.farbe = _farbe;
    }
	

	/**  2.5.3 Farbe und Text der Karte &auml;ndern	<br>
	 * @param _farbe der Karte &uuml;bergeben<br>
     * @param _text der Karte &uuml;bergebn<br>
	 * @return _farbe und _text<br>
	 <br>*/
	void aendereAussehen( String _farbe, String _text){
        this.farbe =_farbe;
        
        if(_text.length() <=3){
            this.text = _text;
    	}
        else{
            System.out.println("Text kann nicht geändert werden");
        }    
    }

	/**  2.5.4 Einen String zur Beschreibung einer Karte erzeugen 	<br>
	 * Beschreibung der Karte durch IV <br>
	 <br>*/
	public String toString(){
        String karte = "Zeile = " + this.zeile + " ,Spalte = " + this.spalte
                       + " ,Farbe: " + this.farbe + ", Text: " + this.text
                       + " ,ID: " + this.id;
        return karte;
    }

	/**  2.5.5 Optional: Lesbare Farbe erzeugen	<br>
	 * @param <br>
	 * @return <br>
	 <br>*/
	

	/**  2.7.1 Mit einer anderen Karte tauschen.<br>
     * Position einer Karte mit Position der anderen Karte tauschen<br>
	 * @param _k1 Kartenobjekt &uuml;bergebn, das bekommt Position von _k2<br>
     * @param _k2 Kartenobjekt &uuml;bergebn, das bekommt Position von _k1<br>
	 <br>*/
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
	/**  2.7.2 Aussehen einer anderen Karte &uuml;bernehmen	<br>
	 * Aussehen einer Karte &uuml;bernimmt Aussehen der anderen Karte	<br>
	 * @param _k1 Kartenobjekt &uuml;bergebn, das neu Aussehen bekommt<br>
     * @param _k2 Kartenobjekt &uuml;bergebn, das sein Aussehen übergibt<br>
	 <br>*/
	static void uebernehmeAussehen(Karte _k1, Karte _k2){
        _k1.text = _k2.text;
        _k1.farbe = _k2.farbe;
    }

	/**  2.7.3 Mit einer anderen Karte vergleichen 	<br>
	 * Farbe von zwei Karten vergleichen <br>
     * @param _k1 Kartenobjekt<br>
	 * @param _k2 Kartenobjekt<br>
	 * @return gleich, ob die Karten gleiche Farbe haben oder nicht<br>
	 <br>*/
	static boolean kartePasst(Karte _k1, Karte _k2){
        
        return _k1.farbe.equals(_k2.farbe);
           
    }

	/**  2.8.1 ID als Eigenschaft einer Karte	<br>
	 * Definition string ID Instanz-Variable<br>
	 <br>*/
	String id;

	/**  2.8.3 ID einer Karte erzeugen	<br>
	 * eindeutige ID aus zeile und Spalte zusammengesetzt<br>
	 <br>*/
	void erzeugeID (){
    this.id = String.valueOf((this.zeile)+","+(this.spalte));    
}

	/**  2.8.4 Pr&uuml;fen der ID einer Karte	<br>
     * @param _id &uuml;bergeben, welche mit objekt_id geprüft wird<br>
	 * @return <br>
	 <br>*/
	boolean pruefeID(String _id ){
        return _id.equals(this.id);
    }

}//end class Karte
