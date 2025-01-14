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
class UKarte extends Karte{
	
	public static void main(String[] args) {
		
	}
	 public UKarte(int _zeile,int _spalte, Spielfeld _spielfeld){
            super(_zeile,_spalte, "<<",_spielfeld);
	}
	/**  P13) 2.2.3 Reaktion von UKarte	<br>
	 * UKartenobjekt wird aud die Konsole ausgegeben<br>
     * Farbe mit unteren Nachbar umtauschen<br>
     * Punktstand um 2 erh&ouml;hen	 <br>
    <br>*/
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
