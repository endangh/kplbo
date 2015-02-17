package p4.b;

import p4.a.Matakuliah;

public class Nilai {

	private Mahasiswa mahasiswa;
	private Matakuliah matakuliah;
	private double nilaiUTS;
	private double nilaiUAS;

	public Nilai() {
		super();
	}

	public Nilai(Mahasiswa mahasiswa, Matakuliah matakuliah) {
		super();
		this.mahasiswa = mahasiswa;
		this.matakuliah = matakuliah;
	}

	public Nilai(Mahasiswa mahasiswa, Matakuliah matakuliah, double nilaiUTS,
			double nilaiUAS) {
		super();
		this.mahasiswa = mahasiswa;
		this.matakuliah = matakuliah;
		this.nilaiUTS = nilaiUTS;
		this.nilaiUAS = nilaiUAS;
	}

	public Mahasiswa getMahasiswa() {
		return mahasiswa;
	}

	public void setMahasiswa(Mahasiswa mahasiswa) {
		this.mahasiswa = mahasiswa;
	}

	public Matakuliah getMatakuliah() {
		return matakuliah;
	}

	public void setMatakuliah(Matakuliah matakuliah) {
		this.matakuliah = matakuliah;
	}

	public double getNilaiUTS() {
		return nilaiUTS;
	}

	public void setNilaiUTS(double nilaiUTS) {
		this.nilaiUTS = nilaiUTS;
	}

	public double getNilaiUAS() {
		return nilaiUAS;
	}

	public void setNilaiUAS(double nilaiUAS) {
		this.nilaiUAS = nilaiUAS;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return mahasiswa.getNomorMahasiswa() + ", " + matakuliah.getNama()
				+ ", " + nilaiUTS + ", " + nilaiUAS;
	}

}
