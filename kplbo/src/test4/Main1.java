package test4;

import java.util.ArrayList;
import java.util.List;

public class Main1 {
	
	public static void main(String[] args) {
		List<Mahasiswa> list = new ArrayList<>();
		Mahasiswa mhs1 = new Mahasiswa("133040001", "Asep");
		Mahasiswa mhs2 = new Mahasiswa("133040002", "Budi");
		Mahasiswa mhs3 = new Mahasiswa("133040003", "Candra");
		Mahasiswa mhs4 = new Mahasiswa("133040004", "Deni");
		Mahasiswa mhs5 = new Mahasiswa("133040005", "Eka");
		
		list.add(mhs1);
		list.add(mhs2);
		list.add(mhs3);
		list.add(mhs4);
		list.add(mhs5);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Nrp\t: "+list.get(i).getNrp());
			System.out.println("Nama\t: "+list.get(i).getNama());
		}
	}

}
