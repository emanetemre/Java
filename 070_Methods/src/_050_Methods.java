public class _050_Methods {

	public static void main(String[] args) {
		Saydirma();
	}

	public static void Saydirma() {

		for (int sayi = 0; sayi <= 10; sayi++) {
			System.out.print(sayi);
			System.out.print("\t");

			System.out.print(Kare(sayi));
			if (CiftMi(sayi) == true) {
				System.out.print("*");
			}
			System.out.print("\t");

			System.out.print(Kup(sayi));
			if (CiftMi(sayi) == true) {
				System.out.print("*");
			}
			System.out.print("\t");

			
			System.out.print(KuvvetiniAlma(sayi, 4));
			System.out.print("\t");

			System.out.print(KuvvetiniAlma(sayi, 5));
			System.out.print("\t");
			
			System.out.println("\t");
		}
	}

	public static int Kare(int x) {
		int kareAlma = x * x;
		return kareAlma;
	}

	public static int Kup(int c) {
		int kupunuAlma = c * c * c;
		return kupunuAlma;
	}

	public static boolean CiftMi(int sayi) {
		if (sayi % 2 == 0)
			return true;
		else
			return false;
	}

	public static int KuvvetiniAlma(int sayi2, int kuvveti) {
		int sonuc = sayi2;
		for (int i = 0; i <= kuvveti; i++) {
			sonuc = sonuc * sayi2;
		}
		return sonuc;
	}

}
