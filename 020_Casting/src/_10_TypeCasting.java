public class _10_TypeCasting {
	public static void main(String[] args) {
		
		String Str1 = "123";
		int Sayi1;
		
		Sayi1 = Integer.valueOf(Str1); // String değeri int çevirme
		//String => Int 
		//String içerisinden sadece int bir değeri ancak int çevirebiliriz
		
		Sayi1 = Sayi1+5;
		
		System.out.println(Sayi1);
	}
}
