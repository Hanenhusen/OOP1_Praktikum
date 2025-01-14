class _1_Referenz_Datentypen {
	public static void main(String[] args) {
// 
// /// Δe_jbeio5 Δ 1.1.1 Vorgegebener Fehlerfall
// /* Fehlerfall
// 
//     zahl 3zaehler == fuenf
//     System.out.println(zahl)
// */
// 
// 
// 
// /// Δe_y8z6j7 Δ 1.2.1 Fehlerfall: Initialisierung wird vom Compiler erzwungen
// /* Fehlerfall
// 
//    String fehler;
//    System.out.println(fehler);
// */
// 
// /// Δe_h0jplj Δ 1.2.2 Initialisieren mit null 
String vorname = null;
String nachname = null;

System.out.println(vorname + nachname);

/// Δe_js1xol Δ 1.4 String-Literale
vorname = "Max";
nachname = "Muster";

System.out.println(vorname + " " + nachname);

/// Δe_d0d190 Δ 1.5 Zuweisung ist nicht Kopieren des referenzierten Werts 
nachname = vorname;
System.out.println(vorname + " " + nachname);

vorname = "Heinz";
System.out.println(vorname + " " + nachname);
// 
// 
// /// Δe_bx73b0 Δ 1.6 Konkatenieren von Strings
// vorname = "Vorname";
// nachname = "Nachname";
// String name = vorname + nachname;
// System.out.println(name);
// 
// 
// /// Δe_ar6r5m Δ 1.7 Automatische Umwandlung in Strings
// System.out.println("Neue Ausgabe " + name + 12.4
// + (5 > 3) );
	}
}