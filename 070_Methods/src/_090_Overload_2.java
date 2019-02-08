
public class _090_Overload_2 {

	public static void main(String[] args) {
		
		System.out.println("1..10  (+1) = " + ArdasikSayiTopla(10));
		System.out.println("1..10  (+1) = " + ArdasikSayiTopla(10, 20));
		System.out.println("1..10  (+1) = " + ArdasikSayiTopla(20, 100, 5));
		
	}
	public static int ArdasikSayiTopla(int max) {
		return ArdasikSayiTopla(1, max, 1);
	}
	
	public static int ArdasikSayiTopla(int basla, int bitir) {
		return ArdasikSayiTopla(basla, bitir, 1);
	}
	
	public static int ArdasikSayiTopla(int basla, int bitir, int artim) {
		int sonuc = 0;
		for (int sayac = basla; sayac <= bitir; sayac += artim) {
			sonuc += sayac;
		}
		return sonuc;
	}

}
