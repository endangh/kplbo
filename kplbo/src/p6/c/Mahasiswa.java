package p6.c;

public class Mahasiswa {

	private String nomorMahasiswa;
	private String nama;
	private String jurusan;

	private Nilai nilai = new Nilai();

	public Mahasiswa() {
		this("", "", "");
	}

	public Mahasiswa(String nomorMahasiswa, String nama) {
		super();
		this.nomorMahasiswa = nomorMahasiswa;
		this.nama = nama;
	}

	public Mahasiswa(String nomorMahasiswa, String nama, String jurusan) {
		super();
		this.nomorMahasiswa = nomorMahasiswa;
		this.nama = nama;
		this.jurusan = jurusan;
	}

	public String getNomorMahasiswa() {
		return nomorMahasiswa;
	}

	public void setNomorMahasiswa(String nomorMahasiswa) {
		this.nomorMahasiswa = nomorMahasiswa;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getJurusan() {
		return jurusan;
	}

	public void setJurusan(String jurusan) {
		this.jurusan = jurusan;
	}
	

	public Nilai getNilai() {
		return nilai;
	}

	public void setNilai(Nilai nilai) {
		this.nilai = nilai;
	}

	public String hitungNilai() {
		String desc = "NRP : " + nomorMahasiswa + "\n" + "Nama : " + nama
				+ "\n" + "Nilai UTS : " + nilai.getNilaiUTS() + "\n"
				+ "Nilai UAS : " + nilai.getNilaiUAS() + "\n" + "Nilai : "
				+ nilai.hitung();
		return desc;
	}

	public String hitungNilai(double procUTS, double procUAS) {
		String desc = "NRP : " + nomorMahasiswa + "\n" + "Nama : " + nama
				+ "\n" + "Nilai UTS : " + nilai.getNilaiUTS() + "\n"
				+ "Nilai UAS : " + nilai.getNilaiUAS() + "\n" + "Nilai : "
				+ nilai.hitung(procUTS, procUAS);
		return desc;
	}

}
