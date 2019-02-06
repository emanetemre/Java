public class _030_Methods {

	public static void main(String[] args) {
		Saydirma();
	}

	public static void Saydirma() {

		for (int sayi = 0; sayi <= 10; sayi++) {
			System.out.print(sayi);
			System.out.print("   ");

			System.out.print(Kare(sayi));
			System.out.print("     ");

			System.out.print(Kup(sayi));
			System.out.println("     ");
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
}
