import java.util.Locale;

public class _030_Subs_2 {

	public static void main(String[] args) {
		String yazi = "    Eğitim     ";
		
		yazi = yazi.trim();
		
		System.out.println(yazi);
		System.out.println();
		System.out.println(yazi.toUpperCase());
		System.out.println();
		System.out.println(yazi.toUpperCase(new Locale("en-UK")));
		System.out.println();
		System.out.println(yazi.toUpperCase(new Locale("tr", "TR")));
		System.out.println();
		System.out.println();
		System.out.println(yazi.toLowerCase());

	}

}
