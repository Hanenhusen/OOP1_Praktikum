/**
**Verantwortlich für:** Karte mit Eigenschaften definieren 

**Die Daten beschreiben:**

**Funktionalität der Methoden:**

**Zusammenarbeit mit anderen Klassen:**

*/
class Karte {
	
	public static void main(String[] args) {
        GrafikKonsole.clearGrafik();

		
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
	

	/** Δe_57263z Δ 2.5.2 Farbe der Karte ändern	
	 * @param _farbe für die Karte übergeben
	 * @return _farbe
	 */
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

	/** Δe_svmy4r Δ 2.5.3 Farbe und Text der Karte ändern	
	 * @param _farbe der Karte übergeben
     * @param _text der Karte übergebn
	 * @return _farbe und _text
	 */
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
	/** Δe_4x974o Δ 2.7.2 Aussehen einer anderen Karte übernehmen	
	 * Aussehen einer Karte übernimmt Aussehen der anderen Karte	
	 * @param _k1 Kartenobjekt übergebn, das neu Aussehen bekommt
     * @param _k2 Kartenobjekt übergebn, das sein Aussehen übergibt
	 */
	void uebernehmeAussehen(Karte _k){
        this.aendereAussehen(_k.farbe);
    }

	/** Δe_swdzql Δ 2.7.3 Mit einer anderen Karte vergleichen 	
	 * Farbe von zwei Karten vergleichen 
     * @param _k1 Kartenobjekt
	 * @param _k2 Kartenobjekt
	 * @return gleich, ob die Karten gleiche Farbe haben oder nicht
	 */
    boolean kartePasst(Karte _k1, Karte _k2){
        
        return _k1.farbe.equals(_k2.farbe);
           
    }

	/** Δe_zca5i6 Δ 2.8.1 ID als Eigenschaft einer Karte	
	 * Definition string ID Instanz-Variable
	 */
	String id;

	/** Δe_slcg7v Δ 2.8.3 ID einer Karte erzeugen	
	 * eindeutige ID aus zeile und Spalte zusammengesetzt
	 */
	String erzeugeID (){
        this.id = String.valueOf((this.zeile)+","+(this.spalte));
        this.meinButton.setCallback(this.id); 
        return this.id;
}

	/** Δe_1b6q3n Δ 2.8.4 Prüfen der ID einer Karte	
     * @param _id übergeben, welche mit objekt_id geprüft wird
	 * @return 
	 */
	boolean pruefeID(String _id ){
        return _id.equals(this.id);
    }

	/** Δe_bx9uv0 Δ 2.2.1 Instanz-Variablen für das Grafik-Raster	
	 * zeilen und spaltenbreite für Grafik-Raster definieren 
	 */
     int zeilenhoehe = 50;
     int spaltenbreite = 50;   

	/** Δe_6vvjcg Δ 2.2.2 x,y-Koordinaten aus zeile/spalte-Position ermitteln	
	 * x,y-Koordinaten 
     * @param _karte objekt übergeben, für den die x,y-koordinaten berechenen
	 * @return x,y werte für die grafik
	 */
	 public int x_Koordinaten(){
        int x = this.zeile * zeilenhoehe;
        return x;
    }

    public int y_Koordinaten(){
        int y = this.spalte * spaltenbreite;
        return y;
    }

	/** Δe_pseyae Δ 3.2.1 Konstruktor mit Parametern definieren	
	 * @param _zeile Position beim Erstellen des Objekts eingeben
	 * @param _spalte Position beim Erstellen des Objekts eingeben
	 * @param  _text beim Erstellen des Objekts eingeben
	 * @param  _farbe beim Erstellen des Objekts eingeben 
	 */
	Karte(int _zeile, int _spalte, String _text, String _farbe, Spielfeld spielfeld){
        this.meinSpielfeld= spielfeld;
        this.meinButton = new Button(0,0,"42");
        this.position(_zeile,_spalte);
        this.aendereAussehen(_farbe, _text);
        this.erzeugeID();
    }

	/** Δe_ymsc5v Δ 3.3.1 Eintragen einer Zufallsfarbe	
	 * @param _max 
	 * @return ZufallsZahl zwischen 0 und 8
	 */
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
	/** Δe_xyz0rw Δ 3.3.2 Konstruktor definieren
     * Konstruktor definieren, alten Konstkruktor und die Methode farbeAendern aufrufen 
	 * @param _zeile, _spalte, _text  beim Erstellen des Objekts übergeben 
	 */
	Karte(int _zeile, int _spalte, String _text,Spielfeld spielfeld){
        this(_zeile,_spalte,_text, Grafik.BLUE, spielfeld);
        this.farbeAendern();
    }

	
//
	/** Δe_mzg9w0 Δ 1.3 Ein Button für jede Karte	
	 * IV meinButton von typ Button 
	 */
	Button meinButton;

	/** Δe_fopzgd Δ 2.3.1 Verweis auf das Spielfeld	
	 * IV meinSpielfeld Referenz für die Karte
	 */
	protected Spielfeld meinSpielfeld;

     /** Δe_xyyal7 Δ 2.2.1 Einfache Methode für die Klick-Reaktion	
         *Einfache Methode für die Klick-Reaktion	
         */
     void klickReaktion(){ 
          System.out.println(this);
     }

    /** Δe_1rve37 Δ 3.1.3 Methode zum Ermitteln der Nachbar-Karte in der Klasse Karte	
	  *@param richtung, gibt die richtung an 
      *@return gibt die nachbarskarte zurück
     */

	public Karte nachbarsKarte(String richtung){
        return meinSpielfeld.nachbarsKarte(this.zeile,this.spalte,richtung);
    }

}//end class Karte
