/**
**Verantwortlich für:**

**Die Daten beschreiben:**

**Funktionalität der Methoden:**

**Zusammenarbeit mit anderen Klassen:**

*/
class RKarte extends Karte {
	
	public static void main(String[] args) {
		
	}
	
	/** Δe_n80dj5 Δ 4.1.2 Definition des Konstruktors von RKarte	
	 * @param 
	 * @return 
	 */
	public RKarte(int _zeile,int _spalte, Spielfeld _spielfeld){
        super(_zeile,_spalte, ">>",_spielfeld);
    }

	/** Δe_eesf0s Δ P13) 2.1.1 Reaktion von RKarte	
	 * OKartenobjekt wird aud die Konsole ausgegeben
     * position mit rechten Nachbar umtauschen
     * Punktstand um 1 erhöhen
	 */
	void klickReaktion(){
        super.klickReaktion();
        Karte nachbarkarte = this.nachbarsKarte("rechts");
        if(nachbarkarte != null){
            this.tauschePosition(nachbarkarte);
            this.meinSpielfeld.punktezaelen(1);
        }
    }

    void keineRedefintion(){
        System.out.println("test");
    }
        
}
