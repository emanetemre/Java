public class _040_ArrayMax {

	public static void main(String[] args) {
		int [] sayilar = new int[] { 5, 4, 8, 7, 25, 77 };
		int max = 0;
		
		for(int i = 0; i < sayilar.length; i++) {
			
			if(max < sayilar[i])
			max = sayilar[i];
		}
		System.out.println(max);
	}

}
