package p8.a;

public class MainB {
	
	public static void main(String[] args) {
		B b = new B();
		b.setN1(4);
		System.out.println(b.hitung(10));
		
		//latihan2
		B b2 = new B(4);
		System.out.println(b2.hitung(10));
	}

}
