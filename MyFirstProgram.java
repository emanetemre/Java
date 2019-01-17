//Bu bir yorum satırıdır.
/*
 * Bu çok satırlı bir yorum
 * satırıdır.
 */
package javaogrenme1;

public class Main {
	public static void main(String args[]) {

//--------------------------------------------------------------------------------//
	//Dizi Array Tanımlama
	String[] dizim = new String[5];

		
		
//--------------------------------------------------------------------------------//		
	//Sabit Tanımlama
	final int sabit = 25;
//--------------------------------------------------------------------------------//
	int sayi1 = 15;
	int sayi2 = 17;
	int toplama = 0;
	toplama = sayi1 + sayi2;

	System.out.println(toplama);
//--------------------------------------------------------------------------------//
		//Tam Sayı Değişken Tanımlama
		int a = 1;//Değişken tanımlama int veri tipinde
		//Double-Float
		double pi = 3.14;
		float kusur = (float) 5.27;
		//String Text saklar
		String name = "Emre";
		String surname = "Emanet";
		//Boolean True or false
		boolean IsAlive = true; // Değişken ilk değeri doğru olarak tanımladık.
		IsAlive = false;		// Değişkenin değerini değiştirebiliyoruz.
				
		System.out.println(a + " " + "değişkeni");
		System.out.println(pi +" " +"sayısı");
		System.out.println(kusur + " " + "küsüratlı sayı");
		System.out.println(name + " " + surname);
		System.out.println(IsAlive);
	}
}
