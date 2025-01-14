class _1_Variable_und_Datentypen {
	public static void main(String[] args) {

/// Δe_7c2shn Δ 1.2 Kommentare schreiben

System.out.println("Hello World");   //Der Code gibt diese Srting aus

// Es gibt zwei Arten, Kommentar zu schreiben:

// 1) Ein Zeilen-Kommentar beginn mit // und geht bis zum Ende der Zeile

/* 2) Ein Block-Kommentar kann
* auch über mehrere Zeilen gehen.
* Er wird verwendet, um längere Erläuterungen zu geben.
* Er beginnt immer mit /* und endet mit */

// Diese Kommentare werden vom Compiler nicht übersetzt.
// Wenn Sie den gesamten Code ausführen wird also 
// nur Hello World ausgegeben
// Die Beschreibungen in den Kommentaren werden nicht ausgeführt.




// Der folgende Code ist bereits vorgegeben
// um Ihnen die Schreibarbeit zu ersparen, 
// wenn Sie die jeweiligen Aufgaben bearbeiten. 
// Was Sie genau tun sollen, steht in der Aufgabe.


/// Δe_dwww8f Δ 2 Variablen definieren
/// Δe_42reb2 Δ 3.1 Werte zuweisen - Literale

long einlong = 0L;
int einint = 72763 ;
short einshort =-21932;
byte einbyte = 123;
float einfloat = -132.8f;
double eindouble =  -132.8;
eindouble =  1.0e-6;
boolean einboolean = true;
einboolean = false;
char einchar = 'w';

/// Δe_bd9g2j Δ 3.2 Werte zuweisen - Variablen

einlong = einint;
eindouble = einfloat;
einshort = einbyte;
einfloat = einint;
//einshort = einlong;
eindouble = einint;
//einboolean = einint;
//einchar = einint;
//einshort = einboolean;

/* Fehlermeldung : Inkompatible Typen
*int kann nicht in boolean konvertiert werden
*Möglicher Verlust bei Konvertierung von long in short*/


/// Δe_x8rhco Δ 4 Ausgabe von Werten von Variablen

System.out.println("Das ist ein Integer: "+ einint);

/// Δe_b0ucn2 Δ 4.1.1 Variante a) Jede einzelne Ausgabe erscheint in einer eigenen Zeile:

System.out.println(einint);
System.out.println(einfloat);
System.out.println(einchar);

/// Δe_98bg4m Δ 4.1.2 Variante b) Ausgaben ohne Zeilenumbruch, d.h. mehrere Ausgaben in einer Zeile

System.out.print(einint);
System.out.print(einfloat);
System.out.print(einchar);

/// Δe_8yb9s4 Δ 4.1.3 Variante c) Den Text der Ausgabe mit + zusammensetzen

System.out.println( einint + " ist ein Integer, " + einbyte + " ist ein Byte, und " + einfloat + " ist ein Float.");


/// Δe_b4r4wp Δ 5 Initialisierung von Variablen

/* Fehlerfall
int variable1;
int variable2;
variable1 = variable2;
*/
int variable1 = 124;
int variable2 = 52;
variable1 = variable2;


/// Δe_don9p3 Δ 6.1 Einfaches Rechnen

System.out.println(einint + einfloat);
System.out.println(einint - einfloat);
System.out.println(einint * einfloat);
System.out.println(einint / einfloat);


/// Δe_nhi39c Δ 6.2.1 Post-Increment-Operator - einfach

int zaehler = 5;
System.out.println(zaehler += 1);  //Ergebnis 6


/// Δe_3r0van Δ 6.2.2 Post-Increment-Operator - tricky
int next = zaehler++;
System.out.println("Zähler = " + zaehler + " Next = " + next); //Zähler = 7Next = 6


/// Δe_2ko4dp Δ 6.2.3 Pre-Increment-Operator
int next02 = ++zaehler;
System.out.println("Zähler = " + zaehler + " Next = " + next02); //Zähler = 8 Next = 8


/// Δe_uhjr6s Δ 6.2.4 Post/Pre - DEcrement - Operator 
int next03 = --zaehler;
System.out.println("Zähler = " + zaehler + " Next = " + next02); //Zähler = 7 Next = 8

int next04 = zaehler--;
System.out.println("Zähler = " + zaehler + " Next = " + next02); //Zähler = 6 Next = 8


/// Δe_ltnk3d Δ 6.2.5 Vorsicht bei der Verwendung

// Verzwickte Anwendung von pre/post in/decrement-Operatoren
// Dokumentieren Sie die Ergebnisse unten in Ihrem Code,
// um sie beim späteren Nachschlagen sofort zur Hand zu haben. 

int i = 55; // Variable definieren und sofort auf einen Anfangswert setzen
int j = 67;
i = j+34; 

// Erwartetes Ergebnis: i = 101 j = 67 
System.out.println("i =" + i + " j =" + j );
// Erhaltenes Ergebnis: i = 101 j = 67

j = i + j + 12; 
// Erwartetes Ergebnis: i = 101 j = 180
System.out.println("i =" + i + " j =" + j );
// Erhaltenes Ergebnis: i = 101 j = 180

i = j++ + 17; 
// Erwartetes Ergebnis: i = 197 j = 181
System.out.println("i =" + i + " j =" + j );
// Erhaltenes Ergebnis: i = 197 j = 181

j = --i; 
// Erwartetes Ergebnis: i = 196 j = 197
System.out.println("i =" + i + " j =" + j );
// Erhaltenes Ergebnis: i = 196 j = 196

// Es folgt eine knifflige Kombination von Operationen.
// Sie sollte Ihnen vor allem zeigen, dass solche Operatoren
// mit Bedacht zu verwenden sind.

System.out.println("i =" + (++i) + " i =" + (i--) );
// Erwartetes Ergebnis: i = 197 j = 196
// Erhaltenes Ergebnis: i = 197 j = 196

System.out.println("Am Ende: i =" + i + " j =" + j );
// Erwartetes Ergebnis: i = 196 j = 196
// Erhaltenes Ergebnis: i = ? j = ?





/// Δe_spizxe Δ 6.3 Modulo

// Der folgende Code zeigt beispielhaft,  
// wie Sie mit LVÜAC zum Ziel kommen
// Die Überlegungen sind bereits als Kommentar geschrieben
// Sie ergänzen nun unter den Kommentarzeilen  
// Ihren Code für die ausführbare Lösung. 

// Definieren einer Variable für den Originalwert
// als Fliesskommazahl
// Diese Variable wird direkt mit einem Beispielwert initialisiert:
double originalwert = 523.34;      

// Definition einer Variable für den abgerundeten Wert, 
// das ist das gesuchte Endergebnis
double abgerundet ;

// Definition einer Variable 
// für die Differenz zwischen orginalwert und abgerundetem Wert
double differenz ;

// Die Differenz zwischen diesen beiden Variablen wird nun mittels Modulo berechnet
//   und dieser Variablen zugewiesen
differenz = originalwert % 100;

// Jetzt wird der abgerundete Wert berechnet,
// indem vom originalwert die differenz abgezogen wird
abgerundet = originalwert - differenz;

// Zum Schluss wird der abgerundete Wert auf die Konsole ausgegeben    
System.out.println("Der abgerundete Wert ist " + abgerundet);

/// Δe_s4t1ol Δ 7.1 Vergleichs-Operatoren
int a = 128;
int b = 64;
int c = 192;

boolean ergebnis01 = (a < b);
System.out.println( ergebnis01);

boolean ergebnis02 = (c > a);
System.out.println( ergebnis02);

boolean ergebnis03 = (c != b);
System.out.println( ergebnis03);

boolean ergebnis04 = (a <= b);
System.out.println( ergebnis04);

/// Δe_c5i999 Δ 7.2 Logische Verknüpfungen
boolean loesung1;
boolean loesung2;
boolean loesung3;

System.out.println(loesung1 = ergebnis01 && ergebnis02);
System.out.println(loesung2 = ergebnis01 || ergebnis02);
System.out.println(loesung3 = ergebnis01 ^ ergebnis02);
System.out.println(loesung3 = ergebnis01 &&!ergebnis02);

	}
}