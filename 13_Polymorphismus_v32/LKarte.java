/**
**Verantwortlich für:**

**Die Daten beschreiben:**

**Funktionalität der Methoden:**

**Zusammenarbeit mit anderen Klassen:**

*/
class LKarte extends Karte{
	
	public static void main(String[] args) {
		
    }
        public LKarte(int _zeile,int _spalte, Spielfeld _spielfeld){
            super(_zeile,_spalte, "<<",_spielfeld);
	}
	
	/** Δe_313iq3 Δ P13) 2.1.2 Reaktion von LKarte	
	 * LKartenobjekt wird aud die Konsole ausgegeben
     * position mit linken Nachbar umtauschen
     * Punktstand um 1 erhöhen
	 */
	void klickReaktion(){
        super.klickReaktion();
        Karte nachbarkarte = this.nachbarsKarte("links");
        if(nachbarkarte != null){
            this.tauschePosition(nachbarkarte); 
            this.meinSpielfeld.punktezaelen(1);
        }
    }
    
     void keineRedefintion(){
        System.out.println("test");
    }
       
}
