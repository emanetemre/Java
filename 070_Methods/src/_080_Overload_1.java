
public class _080_Overload_1 {

	public static void main(String[] args) {
		System.out.println(Topla(2,5));
		System.out.println(Topla(2,5,7));
		System.out.println(Topla(2,5,7,10));
		
		}
	
	public static int Topla(int a, int b) {
		return a+b;
	}
	
	public static int Topla(int a, int b, int c) {
		return a+b+c;
	}
	
	public static int Topla(int a, int b, int c, int d) {
		return a+b+c+d;
	}


}
