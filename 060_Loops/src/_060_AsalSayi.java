public class _060_AsalSayi {

	public static void main(String[] args) {
		int sayi = 13;
		boolean AsalMi = true;
		
		if (sayi < 2) {
			AsalMi = false;
		}
		else

		for(int sayac = 2; sayac < sayi; sayac++) {
			if(sayi % sayac == 0) { // sayi sayaca tam bölündüyse
				AsalMi = false;
				break;
			}
			System.out.println(sayac);
		}
		System.out.println(AsalMi);
	}
	}
