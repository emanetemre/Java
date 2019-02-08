public class _020_Subs {

	public static void main(String[] args) {
		String str = "Emre ile temel programlama eğitimi";

		System.out.println(str);
		System.out.println(str.length() + " karakter uzunluğunda");
		
		System.out.println();
		String str1 = str.substring(9, 14);
		
		System.out.println(str1);
		System.out.println(str1.length() + " karakter uzunluğunda");
	}

}
