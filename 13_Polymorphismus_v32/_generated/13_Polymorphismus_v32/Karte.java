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
        GrafikKonsole.clearGrafik();

		
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
    void position(int _x, int _y){
         if (this.meinSpielfeld.istpositiongueltig(_x, _y))
         {
                if(_x >= 0 && _y >=0){
                   this.zeile = _x;
                   this.spalte = _y;
                    if (this.meinButton!=null){
                        this.meinButton.moveTo(this.x_Koordinaten(),this.y_Koordinaten());
                    }
                }
                this.meinSpielfeld.kartePosition(_x,_y,this);
        }
        else{
            System.out.println("Position nicht gültig");
        }
    }
	

	/**  2.5.2 Farbe der Karte &auml;ndern	<br>
	 * @param _farbe f&uuml;r die Karte übergeben<br>
	 * @return _farbe<br>
	 <br>*/
    void aendereAussehen( String _farbe){
        String [] auswahlFarben = {Grafik.WHITE, Grafik.BLACK, Grafik.GREY, Grafik.RED, Grafik.BLUE,
                                   Grafik.GREEN, Grafik.YELLOW, Grafik.MAGENTA,Grafik.CYAN};
            for (int i = 0; i < auswahlFarben.length; i++)
            {
                if(auswahlFarben[i].equals(_farbe))
                {
                    this.farbe = _farbe;        
                    this.meinButton.setFillcolor(_farbe);
                }
            }
	}

	/**  2.5.3 Farbe und Text der Karte &auml;ndern	<br>
	 * @param _farbe der Karte &uuml;bergeben<br>
     * @param _text der Karte &uuml;bergebn<br>
	 * @return _farbe und _text<br>
	 <br>*/
	void aendereAussehen( String _farbe, String _text){
        this.aendereAussehen(_farbe);
        if(_text.length() <=3){
            this.text = _text;
            this.meinButton.setText(_text);
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
    void tauschePosition(Karte _k){
        int _zeile;
        int _spalte;
        _zeile = this.zeile;
        _spalte = this.spalte;
        this.zeile = _k.zeile;
        this.spalte = _k.spalte;
        _k.zeile = _zeile;
        _k.spalte = _spalte;
        //position(this.zeile,this.spalte);
        //position(_k.zeile,_k.spalte);
    }
	/**  2.7.2 Aussehen einer anderen Karte &uuml;bernehmen	<br>
	 * Aussehen einer Karte &uuml;bernimmt Aussehen der anderen Karte	<br>
	 * @param _k1 Kartenobjekt &uuml;bergebn, das neu Aussehen bekommt<br>
     * @param _k2 Kartenobjekt &uuml;bergebn, das sein Aussehen übergibt<br>
	 <br>*/
	void uebernehmeAussehen(Karte _k){
        this.aendereAussehen(_k.farbe);
    }

	/**  2.7.3 Mit einer anderen Karte vergleichen 	<br>
	 * Farbe von zwei Karten vergleichen <br>
     * @param _k1 Kartenobjekt<br>
	 * @param _k2 Kartenobjekt<br>
	 * @return gleich, ob die Karten gleiche Farbe haben oder nicht<br>
	 <br>*/
    boolean kartePasst(Karte _k1, Karte _k2){
        
        return _k1.farbe.equals(_k2.farbe);
           
    }

	/**  2.8.1 ID als Eigenschaft einer Karte	<br>
	 * Definition string ID Instanz-Variable<br>
	 <br>*/
	String id;

	/**  2.8.3 ID einer Karte erzeugen	<br>
	 * eindeutige ID aus zeile und Spalte zusammengesetzt<br>
	 <br>*/
	String erzeugeID (){
        this.id = String.valueOf((this.zeile)+","+(this.spalte));
        this.meinButton.setCallback(this.id); 
        return this.id;
}

	/**  2.8.4 Pr&uuml;fen der ID einer Karte	<br>
     * @param _id &uuml;bergeben, welche mit objekt_id geprüft wird<br>
	 * @return <br>
	 <br>*/
	boolean pruefeID(String _id ){
        return _id.equals(this.id);
    }

	/**  2.2.1 Instanz-Variablen f&uuml;r das Grafik-Raster	<br>
	 * zeilen und spaltenbreite f&uuml;r Grafik-Raster definieren <br>
	 <br>*/
     int zeilenhoehe = 50;
     int spaltenbreite = 50;   

	/**  2.2.2 x,y-Koordinaten aus zeile/spalte-Position ermitteln	<br>
	 * x,y-Koordinaten <br>
     * @param _karte objekt &uuml;bergeben, für den die x,y-koordinaten berechenen<br>
	 * @return x,y werte f&uuml;r die grafik<br>
	 <br>*/
	 public int x_Koordinaten(){
        int x = this.zeile * zeilenhoehe;
        return x;
    }

    public int y_Koordinaten(){
        int y = this.spalte * spaltenbreite;
        return y;
    }

	/**  3.2.1 Konstruktor mit Parametern definieren	<br>
	 * @param _zeile Position beim Erstellen des Objekts eingeben<br>
	 * @param _spalte Position beim Erstellen des Objekts eingeben<br>
	 * @param  _text beim Erstellen des Objekts eingeben<br>
	 * @param  _farbe beim Erstellen des Objekts eingeben <br>
	 <br>*/
	Karte(int _zeile, int _spalte, String _text, String _farbe, Spielfeld spielfeld){
        this.meinSpielfeld= spielfeld;
        this.meinButton = new Button(0,0,"42");
        this.position(_zeile,_spalte);
        this.aendereAussehen(_farbe, _text);
        this.erzeugeID();
    }

	/**  3.3.1 Eintragen einer Zufallsfarbe	<br>
	 * @param _max <br>
	 * @return ZufallsZahl zwischen 0 und 8<br>
	 <br>*/
    static int zufallsZahl(int _max){
        if(_max <0){
            _max=0;
        }
        return 0 + ((int)(Math.random()*_max));
    }
    String farbeAendern(){
        String[] erlaubteFarben = { Grafik.WHITE ,Grafik.GREY,  
                                   Grafik.RED, Grafik.BLUE, Grafik.GREEN, 
                                   Grafik.YELLOW, Grafik.MAGENTA,Grafik.CYAN};
        this.meinButton.setFillcolor(erlaubteFarben[zufallsZahl(8)]);
        return this.farbe= erlaubteFarben[zufallsZahl(7)];
    }
	/**  3.3.2 Konstruktor definieren<br>
     * Konstruktor definieren, alten Konstkruktor und die Methode farbeAendern aufrufen <br>
	 * @param _zeile, _spalte, _text  beim Erstellen des Objekts &uuml;bergeben <br>
	 <br>*/
	Karte(int _zeile, int _spalte, String _text,Spielfeld spielfeld){
        this(_zeile,_spalte,_text, Grafik.BLUE, spielfeld);
        this.farbeAendern();
    }

	
//
	/**  1.3 Ein Button f&uuml;r jede Karte	<br>
	 * IV meinButton von typ Button <br>
	 <br>*/
	Button meinButton;

	/**  2.3.1 Verweis auf das Spielfeld	<br>
	 * IV meinSpielfeld Referenz f&uuml;r die Karte<br>
	 <br>*/
	protected Spielfeld meinSpielfeld;

     /**  2.2.1 Einfache Methode f&uuml;r die Klick-Reaktion	<br>
         *Einfache Methode f&uuml;r die Klick-Reaktion	<br>
         <br>*/
     void klickReaktion(){ 
          System.out.println(this);
     }

    /**  3.1.3 Methode zum Ermitteln der Nachbar-Karte in der Klasse Karte	<br>
	  *@param richtung, gibt die richtung an <br>
      *@return gibt die nachbarskarte zur&uuml;ck<br>
     <br>*/

	public Karte nachbarsKarte(String richtung){
        return meinSpielfeld.nachbarsKarte(this.zeile,this.spalte,richtung);
    }

}//end class Karte
