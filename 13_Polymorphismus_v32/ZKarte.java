/**
**Verantwortlich für:**

**Die Daten beschreiben:**

**Funktionalität der Methoden:**

**Zusammenarbeit mit anderen Klassen:**

*/
class ZKarte extends Karte{
	
	public static void main(String[] args) {
		
	}
    public ZKarte(int _zeile,int _spalte, Spielfeld _spielfeld){
            super(_zeile,_spalte, "ZZ",_spielfeld);
	}
     /**
     * ZKartenobjekt wird aud die Konsole ausgegeben
     * eine neue zufällige Farbe übernehmen
    */
	void klickReaktion(){
        super.klickReaktion();
        this.farbeAendern();
    }   
}

