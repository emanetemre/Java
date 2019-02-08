public class _030_ArrayMax_Method {

	public static void main(String[] args) {
		int[] sayi_listesi1 = new int[] { 5, 4, 8, 7, 25, 77 };
		int[] sayi_listesi2 = new int[] { 5, 1, 50, 7, 87, 77 };

		System.out.println(FindMax(sayi_listesi1));
		System.out.println(FindMax(sayi_listesi2));

		System.out.println(FindMin(sayi_listesi1));
		System.out.println(FindMin(sayi_listesi2));

	}

	public static int FindMax(int[] sayiDizisi) {
		int max = 0;
		for (int i = 0; i < sayiDizisi.length; i++) {
			if (max < sayiDizisi[i]) {
				max = sayiDizisi[i];
			}
		}
		return max;
	}

	public static int FindMin(int[] sayiDizisi) {
		int min = 10000;
		for (int i = 0; i < sayiDizisi.length; i++) {
			if (min > sayiDizisi[i]) {
				min = sayiDizisi[i];
			}
		}
		return min;

	}
}