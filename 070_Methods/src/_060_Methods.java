public class _060_Methods {

	public static void main(String[] args) {
		Saydirma();

	}

	public static void Saydirma() {
		int maxKuvvet = 7;
		for (int sayi = 0; sayi < 10; sayi++) {
			for (int kuvvet = 1; kuvvet <= maxKuvvet; kuvvet++) {
				System.out.print(KuvvetiniAlma(sayi, kuvvet));
				if (CiftMi(sayi) == true)
					System.out.print("*");

				System.out.print("\t\t\t"); // \t bir tab kadar boşluk bırakır
			}
				System.out.println();
			
		}
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
