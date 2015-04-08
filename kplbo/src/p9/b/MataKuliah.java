package p9.b;

public class MataKuliah {

	private String kode;
	private String nama;
	private int sks;
	private char indeksNilai;

	public MataKuliah() {
		super();
	}

	public MataKuliah(String kode, String nama, int sks, char indeksNilai) {
		super();
		this.kode = kode;
		this.nama = nama;
		this.sks = sks;
		this.indeksNilai = indeksNilai;
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

	public char getIndeksNilai() {
		return indeksNilai;
	}

	public void setIndeksNilai(char indeksNilai) {
		this.indeksNilai = indeksNilai;
	}

	public int getNilaiIndeks() {
		if (indeksNilai == 'A') {
			return 4;
		} else if (indeksNilai == 'B') {
			return 3;
		} else if (indeksNilai == 'C') {
			return 2;
		} else if (indeksNilai == 'D') {
			return 1;
		} else if (indeksNilai == 'E') {
			return 0;
		}
		return -1;
	}

}
