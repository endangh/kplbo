package p6.a;

public class Mahasiswa {

	private String nomorMahasiswa;
	private String nama;
	private String jurusan;

	private Matakuliah mataKuliah = new Matakuliah();

	public Mahasiswa() {
		super();
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

	public String keteranganMatakuliah() {
		String desc = "NRP : " + nomorMahasiswa + "\n" + "Nama : " + nama
				+ "\n" + "Matakuliah : " + mataKuliah.getNama() + "\n"
				+ "Total Nilai : " + mataKuliah.hitungNilai();
		return desc;
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

	public Matakuliah getMataKuliah() {
		return mataKuliah;
	}

	public void setMataKuliah(Matakuliah mataKuliah) {
		this.mataKuliah = mataKuliah;
	}

}
