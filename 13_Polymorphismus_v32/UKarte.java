/**
**Verantwortlich für:**

**Die Daten beschreiben:**

**Funktionalität der Methoden:**

**Zusammenarbeit mit anderen Klassen:**

*/
class UKarte extends Karte{
	
	public static void main(String[] args) {
		
	}
	 public UKarte(int _zeile,int _spalte, Spielfeld _spielfeld){
            super(_zeile,_spalte, "<<",_spielfeld);
	}
	/** Δe_b55qe8 Δ P13) 2.2.3 Reaktion von UKarte	
	 * UKartenobjekt wird aud die Konsole ausgegeben
     * Farbe mit unteren Nachbar umtauschen
     * Punktstand um 2 erhöhen	 
    */
	void klickReaktion(){
        super.klickReaktion();
        Karte nachbarkarte = this.nachbarsKarte("unten");
        if(nachbarkarte != null){
            nachbarkarte.uebernehmeAussehen(this);
            this.meinSpielfeld.punktezaelen(2);
        }
    }
     void keineRedefintion(){
        System.out.println("test");
    }
       

}
