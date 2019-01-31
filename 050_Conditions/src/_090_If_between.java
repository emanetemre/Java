public class _090_If_between {

	public static void main(String[] args) {
		String bugun = "Pazartesi";
		int saat = 14;
		
		if (bugun == "Pazartesi" || bugun == "Carsamba" || bugun == "Cuma") {
			System.out.println(bugun + " gunu dersimiz var");
			
			if (saat < 14)
				System.out.println("Dersimiz henuz baslamadi");
			else if (saat >= 14 && saat < 18)
				System.out.println("Dersteyiz");
			else
				System.out.println("Dersimiz bitti");
		}
		else
			System.out.println(bugun + " gunu dersimiz yok");
	}
	
}
