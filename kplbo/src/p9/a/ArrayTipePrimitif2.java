package p9.a;

public class ArrayTipePrimitif2 {

	public static int MAX_ELEMEN = 10;
	
	private int[] arr;

	public ArrayTipePrimitif2(int maxElemen) {
		MAX_ELEMEN = maxElemen;
		this.arr = new int[MAX_ELEMEN];
	}

	public ArrayTipePrimitif2() {
		arr = new int[MAX_ELEMEN];
	}
	
	public void isiArray(){
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i+1);
		}
	}
	
	public void tampilArray(){
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		ArrayTipePrimitif2 atp = new ArrayTipePrimitif2();
		atp.isiArray();
		atp.tampilArray();
	}
	
}
