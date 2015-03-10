package test2;

public class TransaksiMataKuliah {

	private Mahasiswa mhs;
	private Matakuliah mk;
	private String nilai;

	public Mahasiswa getMhs() {
		return mhs;
	}

	public void setMhs(Mahasiswa mhs) {
		this.mhs = mhs;
	}

	public Matakuliah getMk() {
		return mk;
	}

	public void setMk(Matakuliah mk) {
		this.mk = mk;
	}

	public String getNilai() {
		return nilai;
	}

	public void setNilai(String nilai) {
		this.nilai = nilai;
	}

	public int hitungIP() {
		int ip = 0;
		if (nilai.equals("A")) {
			ip = 4;
		} else if (nilai.equals("B")) {
			ip = 3;
		} else if (nilai.equals("C")) {
			ip = 2;
		} else if (nilai.equals("D")) {
			ip = 1;
		} else
			ip = 0;
		return ip;
	}

}
