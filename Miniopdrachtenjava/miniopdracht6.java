package Miniopdrachtenjava;

public class miniopdracht6 {
	public static void main(String[] args) {
		
		double length = 1.80;
		double weight = 70.0;
		double bmi = weight/(length*length);
		
		System.out.println(bmi);
		if (bmi <= 18) {
			System.out.println("geel");
		} else if (bmi >= 25) {
			System.out.println("rood");
		} else {
			System.out.println("groen");
		}
		
	}
}
