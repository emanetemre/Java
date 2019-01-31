
public class _095_If_Between {

	public static void main(String[] args) {
		String bugun = "Sali";
		int saat = 20;
		//bugun sali veya perşembe mi kontrol et
		if ((bugun == "Sali" || bugun == "Persembe") && (saat >= 14 && saat < 18))
			System.out.println("Dersteyiz");
		else
			System.out.println("Derste degiliz");
	}

}
