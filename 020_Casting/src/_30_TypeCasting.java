
public class _30_TypeCasting {
	public static void main(String[] args) {
		
		int Sayi1 = 123;
		float Sayi2 = 3.14f; //Verdiğimiz değişkenin sonuna f ekliyoruz.
		//Çünkü Java kayan noktalı sayıları default olarak double anlıyor.
		double Sayi3 = 22.4;
		
		String str1, str2, str3;
		
		str1=Integer.toString(Sayi1);
		str2=Float.toString(Sayi2);
		str3=Double.toString(Sayi3);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
	}

}
