package p8.a;

public class A {
	protected int n1;

	public A() {
		
	}

	// latihan2
	public A(int n1) {
		this.n1 = n1;
	}

	public int hitung(int n2) {
		return n1 + n2;
	}

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

}
