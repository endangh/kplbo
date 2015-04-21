package test4;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {
		
		Mahasiswa mhs1 = new Mahasiswa("133040001", "Asep");
		Mahasiswa mhs2 = new Mahasiswa("133040002", "Budi");
		Mahasiswa mhs3 = new Mahasiswa("133040003", "Candra");
		Mahasiswa mhs4 = new Mahasiswa("133040004", "Deni");
		Mahasiswa mhs5 = new Mahasiswa("133040005", "Eka");
		Mahasiswa mhs6 = new Mahasiswa("133040006", "Febri");
		Mahasiswa mhs7 = new Mahasiswa("133040007", "Gina");
		Mahasiswa mhs8 = new Mahasiswa("133040008", "Hana");
		Mahasiswa mhs9 = new Mahasiswa("133040009", "Ika");
		Mahasiswa mhs10 = new Mahasiswa("133040010", "Januar");
		List<Mahasiswa> listMhs1 = new ArrayList<Mahasiswa>();
		List<Mahasiswa> listMhs2 = new ArrayList<Mahasiswa>();
		listMhs1.add(mhs1);
		listMhs1.add(mhs2);
		listMhs1.add(mhs3);
		listMhs1.add(mhs4);
		listMhs1.add(mhs5);
		listMhs2.add(mhs6);
		listMhs2.add(mhs7);
		listMhs2.add(mhs8);
		listMhs2.add(mhs9);
		listMhs2.add(mhs10);
		
		List<Dosen> listDosen = new ArrayList<Dosen>();
		Dosen dsn1 = new Dosen("IF12345", "Hendra Komara, S.T", listMhs1);
		Dosen dsn2 = new Dosen("IF12346", "Dr.Ayi Purbasari, S.T, M.T", listMhs2);
		listDosen.add(dsn1);
		listDosen.add(dsn2);
		
		for (Dosen dosen : listDosen) {
			System.out.println("NIP\t: "+dosen.getNip());
			System.out.println("Nama\t: "+dosen.getNama());
			System.out.println("============================");
			for (Mahasiswa mhs : dosen.getAnakWalis()) {
				System.out.println("NRP\t: "+mhs.getNrp());
				System.out.println("Nama\t: "+mhs.getNama());
			}
			System.out.println("============================");
		}
		
	}

}
