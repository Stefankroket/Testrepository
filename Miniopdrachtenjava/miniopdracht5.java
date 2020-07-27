package Miniopdrachtenjava;
import java.util.Scanner;
public class miniopdracht5 {
	public static void main(String[] args) {
	
		String wachtwoord = "abc";
		Scanner scan1 = new Scanner(System.in);	
		String invul = scan1.nextLine();
		
		if (wachtwoord.equals(invul)) {
			System.out.println("klopt");
			
		} else {
			System.out.println("klopt niet");
		}
	}
}
/*
1-5: Check wachtwoord


Opdracht:

Check of een ingevoerd wachtwoord correct is.

Indien het wachtwoord gelijk is, dan is de output:

Wachtwoord is OK: <wachtwoord>

Indien het wachtwoord ongelijk is, dan is de output:

Wachtwoord is fout: <wachtwoord>


Tip:

Gebruik de juiste manier om variabelen van type String te vergelijken.



import java.util.Scanner;


public class CheckWachtwoord {

   public static void main(String[] args) {

       String wachtwoord = "java";


       // define Scanner

       Scanner sc = new Scanner(System.in);


       // read input

       String input;

       input = sc.nextLine();


       // check wachtwoord


   }

}
*/