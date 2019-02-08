public class _070_ArdasikToplam {

	public static void main(String[] args) {
		int toplam = 0, max = 10;
		System.out.println(Toplam(10));
		System.out.println(Toplam(10, 20));
		System.out.print(Toplam(10, 20, 5));
		System.out.println("\t");
	}
	public static int Toplam(int max) {
		int toplama = 0;
		for(int i = 1; i <= max; i++) {
			toplama += i;
		}
		return toplama;
	}
	
	public static int Toplam(int sayi1, int sayi2) {
		int toplama = 0;
		for(int i = sayi1; i <= sayi2; i++) {
			toplama += i;
		}
		return toplama;
	}
	
	public static int Toplam(int basla, int bitis, int adim) {
		int toplama = 0;
		for(int i = basla; i <= bitis; i += adim) {
			toplama += i;
		}
		return toplama;
	}
}
