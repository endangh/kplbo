package p4.b;

/**
 * @author endanghidayat
 *
 */
public class Mahasiswa {
	
	private String nomorMahasiswa;
	private String nama;
	private String jurusan;
	
	public Mahasiswa() {
		super();
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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nomorMahasiswa+", "+nama+", "+jurusan;
	}

}
