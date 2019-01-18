//Create: Emre EMANET
//Date: 1/18/2019
//Name: Operators
package javaogrenme1;

public class Main {
	public static void main(String args[]) {
		//Operators
		
		//---Toplama
		int x = 8; // x = 8
		System.out.println(x);
		x = x+1; // x e 1 ekle
		System.out.println(x);
		x++; // x e 1 ekle yukarıdaki x = x+1; koduyla aynı işi yapıyor
		System.out.println(x);
		
		//--Çıkarma
		int y = 5; // y = 5
		System.out.println(y);
		y = y-1; // y'den 1 çıkar
		System.out.println(y);
		y--; // y'den 1 çıkar yukarıdaki y = y-1; koduyla aynı işi yapıyor
		System.out.println(y);
		
		//Eşit mi kontrolü
		System.out.println(x==y); // x değişkeni y değişkenine eşit mi?
		
		//Eşitleme 
		System.out.println(x=y); // bu kodda x değişkenini y değişkenine eşitle diyor
		
		//Eşit değil demek için
		System.out.println(x!=y); // x değişkeni y değişkenine eşit değil
		
		System.out.println(x>y); // X büyüktür y'den doğru değeri verir (true)
		System.out.println(x<y); // Y büyüktür x'den yanlış değeri verir (false)
		System.out.println(x<=y); //false
		System.out.println(x>=y); // true
		
		//or  || veya
		//and && ve

	}
}
