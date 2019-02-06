public class _060_Asal {
	public static void main(String[] args) {
		boolean AsalMi = true;
		for (int anaSayac = 1; anaSayac <= 20; anaSayac++) {

			System.out.print(anaSayac + " ");

			if (anaSayac % 2 == 0) { // tek ve cift kontrolu
				System.out.print("cift");
			} else {
				System.out.print("tek");
			}

			if (anaSayac >= 2) { // asal sayi kontrolü
				for (int asalSayac = 2; asalSayac < anaSayac; asalSayac++) {
					if (anaSayac % asalSayac == 0) {
						AsalMi = false;
						break;
					}
				}
				if (AsalMi)
					System.out.print(", asal");
			}
			System.out.println(" ");
		}

	}
}