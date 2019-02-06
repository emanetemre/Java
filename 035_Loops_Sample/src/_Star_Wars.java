public class _Star_Wars {

	public static void main(String[] args) {
		int girilenSayi = 5;
		for (int satir = 0; satir < girilenSayi; satir++) {
			for (int bosluk = 0; bosluk < satir; bosluk++) {
				System.out.print(" ");
			}
			for (int yildiz = 0; yildiz <= girilenSayi - satir; yildiz++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}