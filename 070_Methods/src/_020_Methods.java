//Bir metod bir işi ve o işin tamamı yapar
//void metodu geri dönüş vermeyen bir metoddur
public class _020_Methods {
	
	public static void main(String[] args) {
		int sayi1, sayi2;
		sayi1 = 7;
		sayi2 = 5;
		
		BaslikYaz("Matematik Islemleri");
		System.out.println("Sayi 1: " + sayi1);
		System.out.println("Sayi 2: " + sayi2);
		CizgiCiz();
		System.out.println(Topla(sayi1, sayi2));
		CizgiCiz();
		System.out.println("Sayi1'in Karesi: "+Kare(sayi1));
		CizgiCiz();
		System.out.println("Sayi1'in Kupu: " + Kup(sayi1));
	
	}
	public static int Topla(int a, int b) {
		int toplam = a + b;
		return toplam;
	}
	
	public static int Kare(int x) {
		int kareAlma = x * x;
		return kareAlma;
	}
	public static int Kup(int c) {
		int kupunuAlma = c * c * c;
		return kupunuAlma;
	}
	public static void BaslikYaz(String label) {
		CizgiCiz();
		System.out.println("   " + label);
		CizgiCiz();
	}
	public static void CizgiCiz() {
		System.out.println("----------------------------");
	}
}