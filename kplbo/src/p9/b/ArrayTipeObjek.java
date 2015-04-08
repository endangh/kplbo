package p9.b;

public class ArrayTipeObjek {
	
	public static int MAX_ELEMEN=10;
	
	public static void main(String[] args) {
		MataKuliah[] arrMK;
		arrMK = new MataKuliah[MAX_ELEMEN];
		
		for (int i = 0; i < arrMK.length; i++) {
			MataKuliah mk = new MataKuliah(""+(i+1),"Matakuliah"+i,3,'A');
			arrMK[i] = mk;
		}
		
		for (int i = 0; i < arrMK.length; i++) {
			MataKuliah mk = arrMK[i];
			System.out.println(""+mk.getKode()+","+mk.getNama()+","+mk.getSks());
			System.out.println();
		}
	}

}
