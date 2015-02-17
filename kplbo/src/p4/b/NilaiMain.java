package p4.b;

import p4.a.Matakuliah;

public class NilaiMain {

	public static void main(String[] args) {
		Mahasiswa mhs = new Mahasiswa("123040100", "Jayakarta", "Teknik Informatika");
		
		Matakuliah matkul = new Matakuliah("IT502", "Vispro", 3);
		
		Nilai nilai = new Nilai(mhs, matkul);
		nilai.setNilaiUTS(75.5);
		nilai.setNilaiUAS(90);
		System.out.println(nilai);
	}
}
