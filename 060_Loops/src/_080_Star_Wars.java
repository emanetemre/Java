public class _080_Star_Wars {

	public static void main(String[] args) {
		int sayi = 5;
		for (int satir = sayi; satir >= 1; satir--) {
			for (int sutun = 1; sutun <= satir; sutun++) {
				System.out.print("X");
			}
			System.out.println("");
		}

		System.out.println("___________");

		for (int satir = 0; satir <= sayi; satir++) {
			for (int sutun = 1; sutun <= sayi - satir; sutun++) {
				System.out.print("x");

			}
			System.out.println("");
		}

	}
}