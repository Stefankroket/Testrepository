package Miniopdrachtenjava;

public class miniopdracht8 {
	public static void main(String[] args) {

		String word = "hallo";
		//char[] klinkers = {'o', 'a','i','u','e'};
		
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) =='a'||word.charAt(i) =='o'||word.charAt(i) =='i'||word.charAt(i) =='u'||word.charAt(i) =='e') {
							
			System.out.println(word.charAt(i) + "*");  
			} else System.out.println(word.charAt(i));
		}
	}
}

