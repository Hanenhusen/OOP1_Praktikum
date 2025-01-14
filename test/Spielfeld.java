/**
**Verantwortlich für:**

**Die Daten beschreiben:**

**Funktionalität der Methoden:**

**Zusammenarbeit mit anderen Klassen:**

*/
class Spielfeld {
	
//	public static void main(String[] args) {
//		
//	}
    
    char[][] spielfeld1 = {
        {'-','-','-'},
        {'-','-','-'},
        {'-','-','-'}};

    /**
    * spielfeld darstellen, man nimmt das 2d array und wird für zeile und spalte eingelesen
    **/

    public String toString(){
        String ausgabe= "";
        for(int zeile=0; zeile < spielfeld1.length; zeile ++){
            for(int spalte=0; spalte < spielfeld1[zeile].length; spalte++){
               ausgabe += " " + spielfeld1[zeile][spalte]; 
            }
            ausgabe += '\n';
        }
        return ausgabe;
    }

}
