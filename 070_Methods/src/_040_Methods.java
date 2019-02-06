public class _040_Methods {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.print(i);
			System.out.print(" " + Ciftmi(1));

			if (Ciftmi(i) == true)
				System.out.print(" çift");
			else
				System.out.print(" Tek");
			System.out.println();

		}

	}

	public static boolean Ciftmi(int sayi) {
		boolean ciftTekKontrol = false;
		if (sayi % 2 == 0)
			ciftTekKontrol = true;
		else
			ciftTekKontrol = false;
		return ciftTekKontrol;
	}

	public static boolean Ciftmi2(int sayi) {
		if (sayi % 2 == 0)
			return true;
		else
			return false;
	}

	public static boolean Ciftmi3(int sayi) {
		return (sayi % 2 == 0);
	}
}