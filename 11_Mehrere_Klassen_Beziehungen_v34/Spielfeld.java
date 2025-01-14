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

}