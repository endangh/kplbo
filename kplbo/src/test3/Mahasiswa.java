package test3;

public class Mahasiswa {
	private String nrp;
	private String nama;

	public String getNrp() {
		return nrp;
	}

	public void setNrp(String nrp) {
		this.nrp = nrp;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public void registrasiMatakuliah(Matakuliah matakuliah) {
		if (matakuliah.isUmum()) {
			System.out.println(nama
					+ " berhasil melakukan registrasi untuk matakuliah "
					+ matakuliah.getKode() + " " + matakuliah.getNama());
		} else {
			System.out.println(nama
					+ " tidak dapat melakukan registrasi untuk matakuliah "
					+ matakuliah.getKode() + " " + matakuliah.getNama());
		}
	}
}
