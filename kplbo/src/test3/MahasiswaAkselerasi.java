package test3;

public class MahasiswaAkselerasi extends Mahasiswa {

	public void registrasiMatakuliah(Matakuliah matakuliah) {
		System.out.println(super.getNama()
				+ " berhasil melakukan registrasi untuk matakuliah "
				+ matakuliah.getKode() + " " + matakuliah.getNama());
	}

}
