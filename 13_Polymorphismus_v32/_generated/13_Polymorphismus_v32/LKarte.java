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
class LKarte extends Karte{
	
	public static void main(String[] args) {
		
    }
        public LKarte(int _zeile,int _spalte, Spielfeld _spielfeld){
            super(_zeile,_spalte, "<<",_spielfeld);
	}
	
	/**  P13) 2.1.2 Reaktion von LKarte	<br>
	 * LKartenobjekt wird aud die Konsole ausgegeben<br>
     * position mit linken Nachbar umtauschen<br>
     * Punktstand um 1 erh&ouml;hen<br>
	 <br>*/
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
