public class _050_Loops {

	public static void main(String[] args) {
		int sayi = 8;
		int sonuc = 1;
		
		for (int sayac = 1; sayac <= sayi; sayac+=1) { // faktöriyel almak için sayiyi bir artir sayiya kadar
			sonuc = sayac*sonuc; // artan sayiyi çarparak artır
			System.out.println(sayac + "! = "+ sonuc);
		}
	}
}