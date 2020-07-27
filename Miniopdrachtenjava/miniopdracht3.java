package Miniopdrachtenjava;
import java.util.Scanner;
public class miniopdracht3 {
	public static void main(String[] args) {
		
		int x = 6;
		Scanner scanner1 = new Scanner(System.in);
		int y = scanner1.nextInt();
		
		
		if (y > 6) {
			System.out.println(y + " is hoger dan " + x);
		} else if (y < 6){
			System.out.println(y + " is lager dan " + x);
		} else {
			System.out.println(y + " is gelijk aan " + x);
		}
		System.out.println("einde programma");
		
	}
}
/*
 1-3: Hoger of lager dan 6


Opdracht:

Vergelijk de variabele die in de code cijfer heet met het getal 6.

Indien cijfer > 6 print “hoger”,

Indien cijfer = 6 print “gelijk”,

Indien cijfer < 6 print “lager”.


Geef variabele cijfer verschillende waardes om je programma te testen



Moeilijke variant:

Lees cijfer als input m.b.v. Scanner.
 */
