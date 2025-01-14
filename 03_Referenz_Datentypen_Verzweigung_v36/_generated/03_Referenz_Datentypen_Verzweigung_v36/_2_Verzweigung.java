class _2_Verzweigung {
	public static void main(String[] args) {


/// Δe_qng2rp Δ 2.1.1 Geschwindigkeiten
double geschwindigkeit = 100;
double HoechstGeschwindigkeit = 70;

System.out.println( geschwindigkeit + " " + HoechstGeschwindigkeit);

/// Δe_3ot1bq Δ 2.1.2 Fahre ich zu schnell?
boolean Schnell_gefahren = geschwindigkeit > HoechstGeschwindigkeit;
System.out.println( Schnell_gefahren);

/// Δe_45hxes Δ 2.1.3 Verzweigung
if(geschwindigkeit > HoechstGeschwindigkeit)
   System.out.println("zu schnell"); 
else
    System.out.println("OK");

/// Δe_vfoys7 Δ 2.2.1 Fehlerfall: Ein ; an der falschen Stelle
/*
if(2>1);

    System.out.println("bedingung ist erfüllt");

*/

/// Δe_mnq2i5 Δ 2.2.2 Dangling else
/*
if(2>1);
    System.out.println("bedingung ist erfüllt");
else
    System.out.println("bedingung ist nicht erfüllt");
*/

/// Δe_179s47 Δ 2.3 Verschachtelte Verzweigung
double differenz = geschwindigkeit - HoechstGeschwindigkeit;
if(geschwindigkeit > HoechstGeschwindigkeit)
{
    //Wenn die Differenz kleiner oder gleich null ist, gibt es natürlich keine Strafe
    if(differenz <= 0)
    {   System.out.println("In Ordnung");} 
    //sonst: Wenn die Differenz kleiner als 10 km/h ist, ist die Strafe 10 Euro
    else if(differenz < 10)
    {  System.out.println("Sie sind " + differenz +
        " km/h zu schnell gefahren. Die Strafe dafür ist 10 €");}
    //sonst: Wenn die Differenz kleiner als 50 km/h ist, ist die Strafe 300 Euro, 1 Strafpunkt  
    else if(differenz < 50)
    {   System.out.println("Sie sind " + differenz +
        " km/h zu schnell gefahren. Die Strafe dafür ist 300€ und ein Strafpunkt");}
    //sonst: Wenn die Differenz kleiner als 70 km/h ist, ist die Strafe 500 Euro, 3 Strafpunkte und ein Führerscheinentzug auf 1 Jahr 
    else if(differenz < 70 && differenz > 50 )
    {  System.out.println("Sie sind " + differenz +
        " km/h zu schnell gefahren. Die Strafe dafür ist 500 €, 3 Strafpunkte und ein Führerscheinentzug auf 1 Jahr");}
    //Ansonsten ist der Führerschein für immer weg  
    else
    {   System.out.println("Deiner Führerschein ist für immer weg");}
}
else
{   System.out.println("OK");}

/// Δe_tx8xqq Δ 2.4.1 Auswertung von einzelnen Werten
String buchstabe = "Q";
switch(buchstabe)
{
    case "q","Q":  System.out.println("Programm wird beendet"); break; 
    case "s","S":  System.out.println("Daten werden gespeichert"); break;
    case "r","R":  System.out.println("Daten werden berechnet"); break;
    default :  System.out.println("Nur q,Q, s, S, r und R sind erlaubt"); 
}
	}
}