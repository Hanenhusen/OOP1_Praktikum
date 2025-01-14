/**
    Code und Prozedur zum Test des Debuggers
    
    Belassen Sie diesen Code, wie er ist, 
    er entspricht der Anleitung im Kapitel "Debugger".

*/
class _DebuggerTest {
	
	public static void main(String[] args) {
        		
		/// Δe_lem6p5 Δ 6.1.2 Programm im Debug-Modus starten        
  
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

    /** zeichnet eine Linie
    * @param laenge ist die Anzahl der Zeichen
    * @param zeichen wird verwendet zum zeichnen
    * @param aktiv ist ein flag, es wird nur gezeichnet, wenn aktiv true ist
    */
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
