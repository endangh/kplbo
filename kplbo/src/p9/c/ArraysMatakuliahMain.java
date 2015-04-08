package p9.c;

import p9.b.MataKuliah;

public class ArraysMatakuliahMain {

	public static void main(String[] args) {
		ArraysMatakuliah am = new ArraysMatakuliah();
		
		MataKuliah mk1 = new MataKuliah("IF123", "Alpro1", 4, 'A');
		MataKuliah mk2 = new MataKuliah("IF124", "Alpro2", 3, 'B');
		MataKuliah mk3 = new MataKuliah("IF125", "KPLBO", 3, 'B');
		MataKuliah mk4 = new MataKuliah("IF126", "RKPPL", 2, 'A');
		
		am.add(mk1, 0);
		am.add(mk2, 1);
		am.add(mk3, 2);
		am.add(mk4, 3);
		
		am.show();
		
		//delete
		System.out.println("=======DELETE=======");
		am.delete(mk2);
		am.show();
		
		//delete byIndeks
		System.out.println("======DELETE BY ID======");
		am.deleteByIndeks(0);
		am.show();
		
		//find
		MataKuliah mkCari = new MataKuliah();
		System.out.println("=====FIND IF123=====");
		mkCari.setKode("IF123");
		
		MataKuliah hasil = am.get(am.findIndeks(mkCari));
		am.showMK(hasil);
		System.out.println("=====FIND IF127=====");
		mkCari.setKode("IF127");
		hasil = am.get(am.findIndeks(mkCari));
		am.showMK(hasil);
		
	}
}
