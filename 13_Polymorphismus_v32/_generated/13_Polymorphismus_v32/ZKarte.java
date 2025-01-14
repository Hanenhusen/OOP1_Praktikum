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
class ZKarte extends Karte{
	
	public static void main(String[] args) {
		
	}
    public ZKarte(int _zeile,int _spalte, Spielfeld _spielfeld){
            super(_zeile,_spalte, "ZZ",_spielfeld);
	}
     /**<br>
     * ZKartenobjekt wird aud die Konsole ausgegeben<br>
     * eine neue zuf&auml;llige Farbe &uuml;bernehmen<br>
    <br>*/
	void klickReaktion(){
        super.klickReaktion();
        this.farbeAendern();
    }   
}

