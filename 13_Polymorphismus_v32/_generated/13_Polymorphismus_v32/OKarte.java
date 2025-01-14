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
class OKarte extends Karte{
	
	public static void main(String[] args) {
		
	}
    
	public OKarte(int _zeile,int _spalte, Spielfeld _spielfeld){
            super(_zeile,_spalte, "^^",_spielfeld);
	}
	/**  P13) 2.2.2 Reaktion von OKarte	<br>
	 * OKartenobjekt wird aud die Konsole ausgegeben<br>
     * Farbe mit oberen Nachbar umtauschen<br>
     * Punktstand um 2 erh&ouml;hen<br>
	 <br>*/
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
