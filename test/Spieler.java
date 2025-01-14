/**
**Verantwortlich für:**

**Die Daten beschreiben:**

**Funktionalität der Methoden:**

**Zusammenarbeit mit anderen Klassen:**

*/
class Spieler {
	
	boolean gewonnen;
    char eingabe;
    Spielfeld meinspielfeld;

    /**
    *cunstructor : setzt figur für den jeweiligen Spieler-Object
    *@param _figur wird beim erzeugen des Spielers übergegeben X/O
    */
    public Spieler(char _figur, Spielfeld _feld){
        this.eingabe=_figur;
        this.meinspielfeld = _feld;
    }
	
}
