public class _020_Lambs {

	public static void main(String[] args) {
		boolean lamb1 = false;
		boolean lamb2 = false;

		if (lamb1)
			System.out.println("lamba1 yaniyor");
		else
			System.out.println("lamba1 yanmiyor");

		if (lamb2)
			System.out.println("lamba1 yaniyor");
		else
			System.out.println("lamba1 yanmiyor");

		System.out.println("---------------");

		if (lamb1 && lamb2)
			System.out.println("lambalarin ikiside acik");
		else if (lamb1 || lamb2)
			System.out.println("lambalarin bir tanesi acik");
		else
			System.out.println("lambalar kapali");
		
		System.out.println("------------------");
		
		if(!lamb1 && !lamb2)
		System.out.println("ikisi birden kapali");
		
	}

}
