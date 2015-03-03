package p6.a;

public class Matakuliah {

	private String kode;
	private String nama;
	private int sks;

	private Nilai nilaimk = new Nilai();

	public Matakuliah() {
		super();
	}

	public Matakuliah(String kode, String nama, int sks) {
		super();
		this.kode = kode;
		this.nama = nama;
		this.sks = sks;
	}

	public String getKode() {
		return kode;
	}

	public void setKode(String kode) {
		this.kode = kode;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public int getSks() {
		return sks;
	}

	public void setSks(int sks) {
		this.sks = sks;
	}

	public Nilai getNilaimk() {
		return nilaimk;
	}

	public void setNilaimk(Nilai nilaimk) {
		this.nilaimk = nilaimk;
	}

	public double hitungNilai() {
		return nilaimk.hitung();
	}

	public void setNilaiMatakuliah(double nilaiTugas, double nilaiKuis,
			double nilaiUTS, double nilaiUAS, double nilaiPraktikum) {
		nilaimk.setNilaiTugas(nilaiTugas);
		nilaimk.setNilaiKuis(nilaiKuis);
		nilaimk.setNilaiUTS(nilaiUTS);
		nilaimk.setNilaiUAS(nilaiUAS);
		nilaimk.setNilaiPraktikum(nilaiPraktikum);
	}

}
