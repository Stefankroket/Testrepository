package Miniopdrachtenjava;

public class miniopdracht7 {
	public static void main(String[] args) {
		
		String r = reverse("Tis een andere wortel");
		System.out.println(r);
		
		
	}
	
	public static String reverse(String sentence) { 			//omdat ik iets moet returnen heeft deze method geen void, maar moet ik het type field dat wordt teruggegeven benoemen, dat in dit geval String is.
		char[] letters = new char[sentence.length()]; 			//ik maak een character array genaamd letters waarin elke character van "sentence" komt.
		
		int letterIndex = 0;									//de opgeslagen letters uit de onderstaande loop moeten we herindexeren. de eerste increment van i is de laatste letter van "sentence", maar deze moet index 0 worden als we
																//hem als eerste letter willen gebruiken in de omgedraaide sentence. 
		
		for(int i = sentence.length() - 1; i >= 0; i--) {		//ipv een normale for loop verander je de parameters. je wil dat de laatste letter van de "sentence" wordt opgeslagen
																//dus begin je door te zeggen dat i de lengte van de "sentence" is en meteen te zeggen dat i begint bij index -1, wat gelijk staat aan de laatste index (letter in dit geval)
																//vervolgens zeg je dat de loop moet blijven loopen tot index 0 is bereikt (i >= 0) en dat doet door de loop elke keer 1 te laten aftrekken. 
																//Zo zou bij een "sentence" van 8 karakters de i beginnen bij het laatste (zevende) character, dan de 6e, dan de 6e, tot je bij het nulste karakter komt.
																//nu heb je elke char opgeslagen van achter naar voren.
			
		letters[letterIndex] = sentence.charAt(i);				//hier zeggen we werkelijk dat de char op i, op 0 moet komen ipv -1. 
		letterIndex++;											//dat doen we voor elke char, tot we door alle chars die toegekend zijn aan i heen zijn. Dus de eennalaatste word index 1 etc etc
		}
		
		String reverse = "";									//Hier maken we de nieuwe zin aan en die noemen we reverse. Deze is leeg.
		for(int i = 0; i < sentence.length(); i++) {			//we gaan de gehele lengte van de "sentence" plaatsen, 1 voor 1 tot de "sentence" af is.
			reverse = reverse + letters[i];						//de String reverse wordt de huidige string (die dus leeg is "") + de letters die we hebben omgedraaid op regel 17-24. 
		}	
		
		return reverse;											//De string reverse moet worden getoond. Deze is door alles wat in de public static String reverse staat veranderd naar de omgedraaide zin van regel 5. 
	}
}
