package test3;

public class RegistrasiMain {

	public static void main(String[] args) {
		Matakuliah m1 = new Matakuliah();
		m1.setKode("IT101");
		m1.setNama("Pengenalan Informatika");
		m1.setUmum(true);
		
		Matakuliah m2 = new Matakuliah();
		m2.setKode("IT102");
		m2.setNama("Algoritma dan Pemrograman");
		m2.setUmum(true);
		
		Matakuliah m3 = new Matakuliah();
		m3.setKode("IT222");
		m3.setNama("Kalkulus");
		m3.setUmum(false);
		
		Mahasiswa mh1 = new Mahasiswa();
		mh1.setNrp("153040001");
		mh1.setNama("Budi");
		mh1.registrasiMatakuliah(m1);
		mh1.registrasiMatakuliah(m2);
		mh1.registrasiMatakuliah(m3);
		
		Mahasiswa mh2 = new MahasiswaAkselerasi();
		mh2.setNrp("153040002");
		mh2.setNama("Rudi");
		mh2.registrasiMatakuliah(m1);
		mh2.registrasiMatakuliah(m2);
		mh2.registrasiMatakuliah(m3);
		
		MahasiswaAkselerasi mh3 = new MahasiswaAkselerasi();
		mh3.setNrp("153040003");
		mh3.setNama("Yudi");
		mh3.registrasiMatakuliah(m1);
		mh3.registrasiMatakuliah(m2);
		mh3.registrasiMatakuliah(m3);
	}

}
