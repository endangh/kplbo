package p9.a;

/**
 * @author endanghidayat
 *
 */
public class ArrayTipePrimitif {
	public static final int MAX_ELEMEN = 10;
	private int angka;

	public static void main(String[] args) {
		int [] arr;
		arr = new int[MAX_ELEMEN];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i+1);
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
