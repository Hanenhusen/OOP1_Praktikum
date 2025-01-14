/**<br>
    Code und Prozedur zum Test des Debuggers<br>
    <br>
    Belassen Sie diesen Code, wie er ist, <br>
    er entspricht der Anleitung im Kapitel "Debugger".<br>
<br>
<br>*/
class _DebuggerTest {
	
	public static void main(String[] args) {
        		
		System.out.println("///  6.1.2 Programm im Debug-Modus starten        ");
  
        System.out.println("los geht's");
        
        // Variable
        int punkte = 78;
        int grenze = 50;
        System.out.println("Du hast " + punkte + ", die Grenze ist " + grenze);
        
        punkte = 82;
        System.out.println("Du hast " + punkte + ", die Grenze ist " + grenze);
        
        // Test Verzweigung
        if(punkte >= grenze) {
            System.out.println("bestanden");
        } else {
            System.out.println("nochmal versuchen");
        }
        
        System.out.println("Verzweigung beendet");
        
        // Test Schleife
        for(int i=0; i<3; i++) {
            punkte = punkte +i;
        }
        System.out.println("Du hast " + punkte + ", die Grenze ist " + grenze);
                
        // Test Prozedur-Aufruf
        zeichneLinie(2,'#',true);      // ausführen
        zeichneLinie(2,'X',true);      // in Code der Prozedur hineingehen

        System.out.println("Aufruf beendet");
		
	}

    /** zeichnet eine Linie<br>
    * @param laenge ist die Anzahl der Zeichen<br>
    * @param zeichen wird verwendet zum zeichnen<br>
    * @param aktiv ist ein flag, es wird nur gezeichnet, wenn aktiv true ist<br>
    <br>*/
    static void zeichneLinie(int laenge, char zeichen, boolean aktiv) {
        
        if(aktiv) {
            String linie = "";
            for(int i=0; i<laenge; i++) {
                linie = linie + zeichen;
            }
            System.out.println(linie);
        }
    }
	
}
