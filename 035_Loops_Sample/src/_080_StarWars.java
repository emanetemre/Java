public class _080_StarWars {
	public static void main(String[] args) {
		int sayi = 7;

		for (int satir = 0; satir < sayi; satir++) {

			for (int sutun = 0; sutun < sayi; sutun++) {
				if (sutun == satir)
					System.out.print("X ");
				else
					System.out.print("- ");
			}
			System.out.println();
		}
	}
}