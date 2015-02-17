package p4.e;

public class XYMain {
	
	public static void main(String[] args) {
		XY xy1 = new XY(2, 3);
		XY xy2 = xy1;
		System.out.println("@CopyReference");
		System.out.println(xy1);
		System.out.println(xy2);
		
		xy2.setX(5);
		
		System.out.println("@Pengubahan 1");
		System.out.println(xy1);
		System.out.println(xy2);
		
		xy1.setX(7);
		xy1.setY(6);
		
		System.out.println("@Pengubahan 2");
		System.out.println(xy1);
		System.out.println(xy2);
		
		
	}

}
