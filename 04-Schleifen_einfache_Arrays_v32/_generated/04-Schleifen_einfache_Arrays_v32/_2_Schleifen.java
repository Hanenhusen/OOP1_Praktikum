class _2_Schleifen {
	public static void main(String[] args) {
// /// ➤ 2.1 Einfache Schleifen
// for(int i=0; i<10; i++) {
//     System.out.println("i = " + i);
// }
// 
// //GrafikKonsole.init();
// 
// /// Δe_j73ev7 Δ 2.1 Einfache Schleifen
// System.out.println("2.1 Einfache Schleifen");
// 
// int i =0;
// while(i<=10)
// {
//     System.out.println("i = " + i++);
// }
// 
// int j =20;
// while(j>10)
// {
//     System.out.println("j = " + j--);
// }
// 
// 
// /// Δe_4r0cpo Δ 2.2.1 for-Schleife mit Schrittweite
// System.out.println("2.2 Andere Schrittweiten");
// 
// for(int i=0; i<10; i+=3) {
//     System.out.println("i = " + i);
// }
// 
// /// Δe_ha9jxv Δ 2.2.2 do-while-Schleife mit Schrittweite
// int z = 0;
// do
// { System.out.println("z = " + z++);}
// while(z<10);
// 
// /// Δe_bqbz2f Δ 2.3 Fehlermöglichkeiten
// /*
// System.out.println("///2.3 Fehlermöglichkeiten:")
// 
// int i = 0;
// for(int i=0; i<10; i+=1) {
//     System.out.println("i = " + i);
// }
// 
// System.out.println(i);
// */
// 
// /// Δe_vrcamf Δ 2.4 Verschachtelte Schleife
// System.out.println("2.4 Verschachtelte Schleife");
// 
// for(int i=1; i<=10; i++)
// {
//     for(int j=1; j<=10; j++)
//     {
//         int Ergebniss = i*j;
//         System.out.print(Ergebniss + "\t");
//     }
//     System.out.print("\n");   
// }
// 
// /// Δe_qmjx6c Δ 2.5 Einmaleins mit Überschriften
System.out.println("\t" + 1+ "\t"+ 2+ "\t"+ 3);
for(int i=1; i<=3; i++)
{
    System.out.print(i + "\t" );
    for(int j=1; j<=3; j++)
    {
        int Ergebniss = i*j;
        System.out.print(Ergebniss + "\t");
    }

    System.out.print("\n");   
}
	}
}