public class _040_Loops {

	public static void main(String[] args) {
		for(int sayi = 1; sayi < 10; sayi+=1) {
			System.out.print(sayi);
			System.out.print("  ");
		if(sayi % 2 == 0) // sayi tek mi cift mi kontrol et
			System.out.println("sayi cift");
			else
			System.out.println("sayi tek");
	}
}
}