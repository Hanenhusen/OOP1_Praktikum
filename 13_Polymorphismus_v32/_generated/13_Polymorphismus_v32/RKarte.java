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
class RKarte extends Karte {
	
	public static void main(String[] args) {
		
	}
	
	/**  4.1.2 Definition des Konstruktors von RKarte	<br>
	 * @param <br>
	 * @return <br>
	 <br>*/
	public RKarte(int _zeile,int _spalte, Spielfeld _spielfeld){
        super(_zeile,_spalte, ">>",_spielfeld);
    }

	/**  P13) 2.1.1 Reaktion von RKarte	<br>
	 * OKartenobjekt wird aud die Konsole ausgegeben<br>
     * position mit rechten Nachbar umtauschen<br>
     * Punktstand um 1 erh&ouml;hen<br>
	 <br>*/
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
