/**
**Verantwortlich für:**

**Die Daten beschreiben:**

**Funktionalität der Methoden:**

**Zusammenarbeit mit anderen Klassen:**

*/
class OKarte extends Karte{
	
	public static void main(String[] args) {
		
	}
    
	public OKarte(int _zeile,int _spalte, Spielfeld _spielfeld){
            super(_zeile,_spalte, "^^",_spielfeld);
	}
	/** Δe_vl8uw9 Δ P13) 2.2.2 Reaktion von OKarte	
	 * OKartenobjekt wird aud die Konsole ausgegeben
     * Farbe mit oberen Nachbar umtauschen
     * Punktstand um 2 erhöhen
	 */
	void klickReaktion(){
        super.klickReaktion();
        Karte nachbarkarte = this.nachbarsKarte("oben");
        if(nachbarkarte != null){
            nachbarkarte.uebernehmeAussehen(this);
            this.meinSpielfeld.punktezaelen(2);
        }
    }
     void keineRedefintion(){
        System.out.println("test");
    }
       

}
