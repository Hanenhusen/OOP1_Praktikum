/**<br>
<strong>Verantwortlich f&uuml;r:</strong><br>
<br>
<strong>Die Daten beschreiben:</strong><br>
<br>
<strong>Funktionalit&auml;t der Methoden:</strong><br>
<br>
<strong>Zusammenarbeit mit anderen Klassen:</strong><br>
<br>
<br>*/
class Spielfeld {
	
	public static void main(String[] args) {
		
	}
	
	/**  2.2.1 Instanz-Variable f&uuml;r das Feld	<br>
	 * IV feld der typ array von Karte defenieren<br>
	 <br>*/

    public Karte[][] feld;
	

	/**  2.2.2 Feld im Konstruktor allokieren	<br>
	 * beim aufruf von Konstuktur wird Speicherplatz f&uuml;r das Array allokiert<br>
     * @param _anzahlZeile wird &uuml;bergeben<br>
     * @param _anzahlspalte wird &uuml;bergeben<br>
	 <br>*/
	Spielfeld(int _anzahlZeile, int _anzahlSpalte){
        feld= new Karte[_anzahlZeile][_anzahlSpalte];
        this.punkteButton = new Button(0, 190, Grafik.GREEN, "0 Punkte", Grafik.BLACK, "!"); 
        this.punkte = 0;
    }

	/**  2.2.3 Spielfeld auf die Text-Konsole ausgeben	<br>
	 * 2D Array auf die Konsole ausgeben<br>
	 <br>*/
    
    void spielFeldAusgeben(){
        for(int zeile=0; zeile<this.feld.length; zeile++){
            for(int spalte=0; spalte<this.feld[zeile].length; spalte++){
                System.out.println(zeile + "/" + spalte + ":" + feld[zeile][spalte]);
            }
            System.out.println("  ");
        }
    }
	

	/**  2.4.1 Pr&uuml;fen, ob die Position im Spielfeld gültig ist	<br>
	 * @param zeile wird &uuml;bergeben<br>
     * @param spalte wird &uuml;bergeben<br>
	 * @return true wenn zeile und splate gr&ouml;&szlig;er null und kleiner als des Arrays<br>
	 <br>*/
       public boolean istpositiongueltig (int zeile, int spalte)
        {
            if (this.feld !=null) //2D Array(tthis.feld) prüfen, !=gegenteil
            {
                return (spalte >=0 && zeile >=0 && zeile<this.feld.length && spalte<this.feld[zeile].length);
             }
            return false;
         }
	 
	/**  2.4.2 Eintragen der Karte an Position im Spielfeld	<br>
	 * @param zeile wird &uuml;bergeben und ist erste index in feld array<br>
	 * @param spalte wird &uuml;bergeben und ist zweite index in feld array<br>
	 * @param karte <br>
	 <br>*/
    public void kartePosition(int zeile, int spalte, Karte karte)
    {
        this.feld[zeile][spalte] = karte;
    }	

           

	/**  2.6.1 Methode f&uuml;r das Füllen definieren	<br>
	 * Spielfeld mit Karten f&uuml;llen <br>
	 <br>*/
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
	/**  4.1.1 Eigenschaften zum Punktez&auml;hlen	<br>
	 * IV Punkte f&uuml;r den Punktstand<br>
	 <br>*/
	private int punkte; 

	/**  	<br>
	 * IV punkteButton  <br>
	 <br>*/
	private Button punkteButton;


	/**  4.1.3 Punkte z&auml;hlen und darstellen	<br>
	 * @param <br>
	 * @return <br>
	 <br>*/
	public void punktezaelen (int punkteaddieren) 
    {
        this.punkte += punkteaddieren;
        this.punkteButton.setText(this.punkte + "");
    }

}