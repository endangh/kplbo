package p5.a;

public class Mahasiswa {

	private String nomorMahasiswa;
	private String nama;
	private String jurusan;

	private Transkrip transkrip;

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
	
	

	public Transkrip getTranskrip() {
		return transkrip;
	}

	public void setTranskrip(Transkrip transkrip) {
		this.transkrip = transkrip;
	}

	public String keteranganTranskrip() {
		String desc = "NRP\t\t: " + nomorMahasiswa + "\n" + "Nama\t\t: " + nama
				+ "\n" + "IPK\t\t: " + transkrip.getIpk() + "\n"+"Keterangan\t: "+transkrip.keteranganIPK();
		return desc;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nomorMahasiswa+" , "+nama+" , "+jurusan;
	}

}
