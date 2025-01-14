/**
**Verantwortlich für:**

**Die Daten beschreiben:**

**Funktionalität der Methoden:**

**Zusammenarbeit mit anderen Klassen:**

*/
class FKarte  extends Karte{
    
	
	public static void main(String[] args) {
		
    }
        public FKarte(int _zeile,int _spalte, Spielfeld _spielfeld){
            super(_zeile,_spalte, "FF",_spielfeld);
	}

    /**
	 * FKartenobjekt wird aud die Konsole ausgegeben
     * eigene Farbe an der nachbarkarten übergeben
     * Punktstand um 3 verringern
    */
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
