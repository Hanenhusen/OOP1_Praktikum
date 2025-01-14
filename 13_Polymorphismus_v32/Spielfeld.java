/**
**Verantwortlich für:**

**Die Daten beschreiben:**

**Funktionalität der Methoden:**

**Zusammenarbeit mit anderen Klassen:**

*/
class Spielfeld {
	
	public static void main(String[] args) {
		
	}
	
	/** Δe_wqrppg Δ 2.2.1 Instanz-Variable für das Feld	
	 * IV feld der typ array von Karte defenieren
	 */

    public Karte[][] feld;
	

	/** Δe_gxjqx7 Δ 2.2.2 Feld im Konstruktor allokieren	
	 * beim aufruf von Konstuktur wird Speicherplatz für das Array allokiert
     * @param _anzahlZeile wird übergeben
     * @param _anzahlspalte wird übergeben
	 */
	Spielfeld(int _anzahlZeile, int _anzahlSpalte){
        feld= new Karte[_anzahlZeile][_anzahlSpalte];
        this.punkteButton = new Button(0, 190, Grafik.GREEN, "0 Punkte", Grafik.BLACK, "!"); 
        this.punkte = 0;
    }

	/** Δe_kh67nl Δ 2.2.3 Spielfeld auf die Text-Konsole ausgeben	
	 * 2D Array auf die Konsole ausgeben
	 */
    
    void spielFeldAusgeben(){
        for(int zeile=0; zeile<this.feld.length; zeile++){
            for(int spalte=0; spalte<this.feld[zeile].length; spalte++){
                System.out.println(zeile + "/" + spalte + ":" + feld[zeile][spalte]);
            }
            System.out.println("  ");
        }
    }
	

	/** Δe_5g5c1c Δ 2.4.1 Prüfen, ob die Position im Spielfeld gültig ist	
	 * @param zeile wird übergeben
     * @param spalte wird übergeben
	 * @return true wenn zeile und splate größer null und kleiner als des Arrays
	 */
       public boolean istpositiongueltig (int zeile, int spalte)
        {
            if (this.feld !=null) //2D Array(tthis.feld) prüfen, !=gegenteil
            {
                return (spalte >=0 && zeile >=0 && zeile<this.feld.length && spalte<this.feld[zeile].length);
             }
            return false;
         }
	 
	/** Δe_r6ov0d Δ 2.4.2 Eintragen der Karte an Position im Spielfeld	
	 * @param zeile wird übergeben und ist erste index in feld array
	 * @param spalte wird übergeben und ist zweite index in feld array
	 * @param karte 
	 */
    public void kartePosition(int zeile, int spalte, Karte karte)
    {
        this.feld[zeile][spalte] = karte;
    }	

           

	/** Δe_qlz9p5 Δ 2.6.1 Methode für das Füllen definieren	
	 * Spielfeld mit Karten füllen 
	 */
	 public void fuellen()
     {
    	for(int zeile=0;zeile<this.feld.length;zeile++)
        {
            for (int spalte=0; spalte<this.feld[zeile].length; spalte++)
            {
                this.feld[zeile][spalte] = new Karte(zeile, spalte, zeile + "/" + spalte, this);
            }
        }

      }
	/** Δe_erjc0d Δ 4.1.1 Eigenschaften zum Punktezählen	
	 * IV Punkte für den Punktstand
	 */
	private int punkte; 

	/** Δe_7tcho8 Δ 	
	 * IV punkteButton  
	 */
	private Button punkteButton;


	/** Δe_6xuwma Δ 4.1.3 Punkte zählen und darstellen	
	 * @param 
	 * @return 
	 */
	public void punktezaelen (int punkteaddieren) 
    {
        this.punkte += punkteaddieren;
        this.punkteButton.setText(this.punkte + "");
    }

	/** Δe_ti7ube Δ 2.1.1 Finden der angeklickten Karte im Spielfeld	
	 *@param id, die id der jeweiligen karte
     *@return karte, gibt die geprüfte karte zurück
     *@return null, wenn es die karte nicht gibt
    */
	Karte findeKarte(String _id){
        for(int zeile=0;zeile<feld.length;zeile++){
            for(int spalte=0;spalte<feld[zeile].length;spalte++){
                if(feld[zeile][spalte].pruefeID(_id)){
                    return this.feld[zeile][spalte];
                }                
            }
        }
        return null;
    }
    /** Δe_xyyal7 Δ 2.2.1 Einfache Methode für die Klick-Reaktion	
     *Einfache Methode für die Klick-Reaktion	
     */
    void klickReaktion(){
        String eingabe =Konsole.eingabeString();
        System.out.println(findeKarte(eingabe));
    }
    
	/** Δe_9f0nj7 Δ 3.1.2 Methode zum Ermitteln der Nachbar-Karte in der Klasse Spielfeld	
	 *@param int zeile, die zeile 
     *@param int spalte, die spalte
     *@param String richtung, oben unten rechts links
     *schaut nach der jeweiligen nachbarskarte 
     */
    //switch case 
	public Karte nachbarsKarte(int zeile, int spalte,String richtung){
            switch(richtung){
                    case("oben"): spalte -=1; break;
                    case("unten") :spalte +=1; break;
                    case("links") : zeile -=1; break;
                    case("rechts") : zeile +=1; break;
                    default:return null;
            }
            if (!istpositiongueltig(zeile,spalte)){
                return null;
            }
            return feld[zeile][spalte];       
    }
        /*
        if(richtung=="oben"){
            if(zeile-1 >= 0 && spalte >= 0 && zeile-1 < this.feld.length && spalte < this.feld[zeile-1].length){
                if(feld[zeile][spalte] !=null)
                    return feld[zeile-1][spalte];
        }
            }
        if(richtung == "unten")	{
        	if(zeile+1 >= 0 && spalte >= 0)
            if(feld[zeile+1][spalte] != null)
                return feld[zeile+1][spalte];
        }
        if(richtung == "rechts")	{
            if(zeile >= 0 && spalte+1 >= 0)
                if(feld[zeile][spalte+1] != null)
                    return feld[zeile][spalte+1];
        }
        if(richtung == "links")	{
            if(zeile >= 0 && spalte-1 >= 0)
                if(feld[zeile][spalte-1] != null)
                    return feld[zeile][spalte-1];
        }
        return null;
        */
        //schauen ob es kleiner als spielfeld            

	/** Δe_jwoz2h Δ 5.2.1 Erzeugen eines Objekts einer zufälligen Klasse	
	 *@param int max, die max zahl
    */
	 public int zufallsZahl(int max) {
    	if(max < 1) {
        	max = 1;
    	}
    	return 1+((int)(Math.random()*max));
	}	
    
    /*Erzeugt eine zufallskarte 
    *@param int zeile
    *@param int spalte
    */
    public Karte zufallskarte (int zeile, int spalte)	{
    	switch (zufallsZahl(6))	{
    		case 1: return new RKarte (zeile, spalte, this);
        	case 2: return new LKarte (zeile, spalte, this);
    		case 3: return new OKarte (zeile, spalte, this);
        	case 4: return new UKarte (zeile, spalte, this);
            case 5: return new FKarte (zeile, spalte, this);
        	case 6: return new ZKarte (zeile, spalte, this);
            default: return null;
    	}
    }
    
	/** Δe_wzhlll Δ 5.2.2 Array mit zufälligen Karten-Arten füllen	
	 *geht die spalten und zeilen durch und füllt es mit zufälligen karten
    */
	public void zufaelligeKartenFuellen ()	{
    	for(int zeile = 0; zeile < feld.length; zeile++) {
			for(int spalte = 0; spalte < feld[zeile].length; spalte++) {
            	this.feld[zeile][spalte] = zufallskarte (zeile, spalte);
            }
        }
    }
	

}