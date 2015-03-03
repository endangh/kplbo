package p6.d.paket2;

import p6.d.paket1.X;

public class XMain {
	
	public static void main(String[] args) {
		X x = new X(4);
		x.x2 = 5;
		System.out.println(x.getX2());
				
		System.out.println(x.setX1(5));
		System.out.println(x.getX1());
	}

}
