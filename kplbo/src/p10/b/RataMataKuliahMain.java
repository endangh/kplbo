package p10.b;

import p9.b.MataKuliah;

public class RataMataKuliahMain {
	
	public static void main(String[] args) {
		RataMatakuliah rmk = new RataMatakuliah();
		
		MataKuliah mk1 = new MataKuliah("IF123", "Alpro1", 4, 'A');
		MataKuliah mk2 = new MataKuliah("IF124", "Alpro2", 3, 'B');
		MataKuliah mk3 = new MataKuliah("IF125", "KPLBO", 3, 'B');
		MataKuliah mk4 = new MataKuliah("IF126", "RKPPL", 2, 'A');
		
		rmk.addMatakuliah(mk1);
		rmk.addMatakuliah(mk2);
		rmk.addMatakuliah(mk3);
		rmk.addMatakuliah(mk4);
		
		rmk.tampilMatakuliah();
		System.out.println(rmk.size());
		
		System.out.println("Nilai Rata-rata : "+rmk.hitungRata2Nilai());
		
	}

}
