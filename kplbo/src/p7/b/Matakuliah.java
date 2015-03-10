package p7.b;

public class Matakuliah {

	private String kode;
	private String nama;
	private int sks;
	private char indeksNilai;

	public Matakuliah() {
		super();
	}

	public Matakuliah(String kode, String nama, int sks, char indeksNilai) {
		super();
		this.kode = kode;
		this.nama = nama;
		this.sks = sks;
		this.indeksNilai = indeksNilai;
	}

	public int getNilaiIndeks() {
		switch (indeksNilai) {
		case 'A':
			return 4;
		case 'B':
			return 3;
		case 'C':
			return 2;
		case 'D':
			return 1;
		case 'E':
			return 0;

		default:
			return -1;
		}
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

}
