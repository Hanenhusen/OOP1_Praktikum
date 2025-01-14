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
class Spielfeld {
	
//	public static void main(String[] args) {
//		
//	}
    
    char[][] spielfeld1 = {
        {'-','-','-'},
        {'-','-','-'},
        {'-','-','-'}};

    /**<br>
    * spielfeld darstellen, man nimmt das 2d array und wird f&uuml;r zeile und spalte eingelesen<br>
    *<br>*/

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
