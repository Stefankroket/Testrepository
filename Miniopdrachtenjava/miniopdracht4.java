package Miniopdrachtenjava;

public class miniopdracht4 {
	public static void main(String[] args) {
		
		String org = "Hey hoe gaat het ermee?";
		int count = 0;
		char deletterE = 'e';
		
			for (int i = 0; i < org.length(); i++) {
				if (org.charAt(i) == deletterE) {  //charAt kijkt naar iedere waarde in de string "org" (i) en kijkt of deze waarde overeenkomt met char "e".
				count ++; 
				}
			}
			System.out.println(count);
	}
}

/*
1-4: Letter count


Opdracht:

Tel het aantal keer dat de letter “e” in een gegeven string voorkomt.

Voorbeeld: “regenen” heeft 3 keer de letter “e”.



public class LetterCount {

   public static void main(String[] args) {

       String org = "Deze regel heeft best wel veel eees.";

       int res;


       // Tel hoe vaak de letter "e" voorkomt in string org


       // Print aantal "e"-s in org


   }

}
*/