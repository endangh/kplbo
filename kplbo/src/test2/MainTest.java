package test2;

public class MainTest {

	public static void main(String[] args) {
		Mahasiswa mhsBadu = new Mahasiswa("123040001", "Badu");
		Mahasiswa mhsTuti = new Mahasiswa("123040002", "Tuti");
		Matakuliah mkKPLBO = new Matakuliah("IT405", "KPLBO");
		Matakuliah mkPSBO = new Matakuliah("IT505", "PSBO");

		// set objek
		TransaksiMataKuliah trans1 = new TransaksiMataKuliah();
		trans1.setMhs(mhsBadu);
		trans1.setMk(mkKPLBO);

		TransaksiMataKuliah trans2 = new TransaksiMataKuliah();
		trans2.setMhs(mhsTuti);
		trans2.setMk(mkPSBO);

		// Tampil ke layar
		System.out.println("Transaksi MK 1");
		System.out.println("NRP : " + trans1.getMhs().getNrp());
		System.out.println("Nama : " + trans1.getMhs().getNama());
		System.out.println("Kode MK : " + trans1.getMk().getKodeMK());
		System.out.println("Nama MK : " + trans1.getMk().getNamaMK());
		System.out.println("===========================================");
		System.out.println("Transaksi MK 2");
		System.out.println("NRP : " + trans2.getMhs().getNrp());
		System.out.println("Nama : " + trans2.getMhs().getNama());
		System.out.println("Kode MK : " + trans2.getMk().getKodeMK());
		System.out.println("Nama MK : " + trans2.getMk().getNamaMK());
		System.out.println("===========================================");

		// Tambah nilai
		// badu - KPLBO
		trans1.setNilai("C");
		// badu - PSBO
		TransaksiMataKuliah trans3 = new TransaksiMataKuliah();
		trans3.setMhs(mhsBadu);
		trans3.setMk(mkPSBO);
		trans3.setNilai("B");

		// Tuti - KPLBO
		TransaksiMataKuliah trans4 = new TransaksiMataKuliah();
		trans4.setMhs(mhsTuti);
		trans4.setMk(mkPSBO);
		trans4.setNilai("A");

		// Tuti - PSBO
		trans2.setNilai("B");

		// tampil ip
		System.out.println("Transaksi BADU");
		System.out.println("NRP : " + trans1.getMhs().getNrp());
		System.out.println("Nama : " + trans1.getMhs().getNama());
		System.out.println("Kode MK : " + trans1.getMk().getKodeMK());
		System.out.println("Nama MK : " + trans1.getMk().getNamaMK());
		System.out.println("IP : " + trans1.hitungIP());
		System.out.println("Kode MK : " + trans3.getMk().getKodeMK());
		System.out.println("Nama MK : " + trans3.getMk().getNamaMK());
		System.out.println("IP : " + trans3.hitungIP());
		System.out.println("===========================================");
		System.out.println("Transaksi TUTI");
		System.out.println("NRP : " + trans2.getMhs().getNrp());
		System.out.println("Nama : " + trans2.getMhs().getNama());
		System.out.println("Kode MK : " + trans2.getMk().getKodeMK());
		System.out.println("Nama MK : " + trans2.getMk().getNamaMK());
		System.out.println("IP : " + trans2.hitungIP());
		System.out.println("Kode MK : " + trans4.getMk().getKodeMK());
		System.out.println("Nama MK : " + trans4.getMk().getNamaMK());
		System.out.println("IP : " + trans4.hitungIP());

		System.out.println("===========================================");

	}

}
