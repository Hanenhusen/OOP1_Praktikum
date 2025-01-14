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
class FKarte  extends Karte{
    
	
	public static void main(String[] args) {
		
    }
        public FKarte(int _zeile,int _spalte, Spielfeld _spielfeld){
            super(_zeile,_spalte, "FF",_spielfeld);
	}

    /**<br>
	 * FKartenobjekt wird aud die Konsole ausgegeben<br>
     * eigene Farbe an der nachbarkarten &uuml;bergeben<br>
     * Punktstand um 3 verringern<br>
    <br>*/
	void klickReaktion(){
        super.klickReaktion();
        String nachbarArray[] ={
            "links","rechts","unten","oben"
        };

        for(String nachbar : nachbarArray){
            Karte nachbarkarte = this.nachbarsKarte(nachbar);
            if(nachbarkarte != null){
                nachbarkarte.uebernehmeAussehen(this);
            }
        }
        this.meinSpielfeld.punktezaelen(-3);
    }
}
