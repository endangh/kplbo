package p10.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import p9.b.MataKuliah;

public class ContohArrayList {
	
	public static void show(){
		
	}
	public static void main(String[] args) {
		//create objek arraylist
		//cara 1
		ArrayList<MataKuliah> listMatakuliah = new ArrayList<MataKuliah>();
		//cara 2
		//List<MataKuliah> listMatakuliah = new ArrayList<MataKuliah>();
		
		MataKuliah mk1 = new MataKuliah("IF123", "Alpro1", 4, 'A');
		MataKuliah mk2 = new MataKuliah("IF124", "Alpro2", 3, 'B');
		MataKuliah mk3 = new MataKuliah("IF125", "KPLBO", 3, 'B');
		MataKuliah mk4 = new MataKuliah("IF126", "RKPPL", 2, 'A');
		
		listMatakuliah.add(mk1);
		listMatakuliah.add(mk2);
		listMatakuliah.add(mk3);
		listMatakuliah.add(mk4);
		
		//tampilkan objek matakuliaj dari arraylist (cara 1)
		for (MataKuliah mk : listMatakuliah) {
			System.out.println(mk.getKode()+","+mk.getIndeksNilai());
		}
		
		//(cara 2)
		Iterator<MataKuliah> iteratorMK = listMatakuliah.iterator();
		while (iteratorMK.hasNext()) {
			MataKuliah mk = (MataKuliah) iteratorMK.next();
			System.out.println(mk.getKode()+","+mk.getIndeksNilai());
		}
	}

}
