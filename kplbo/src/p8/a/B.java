package p8.a;

public class B extends A {

	public B(){
		
	}
	//latihan2 
	public B(int n1){
		super(n1);//memanggil konstruktor A
		
	}
	
	//latihan3
	@Override
	public int hitung(int n2) {
		return super.hitung(n2)+5;
	}
}
