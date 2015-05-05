package p11;

public class Student {

	private String nrp;
	private String nama;
	private int umur;

	public Student() {
		super();
	}

	public Student(String nrp, String nama, int umur) {
		super();
		this.nrp = nrp;
		this.nama = nama;
		this.umur = umur;
	}

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

	public int getUmur() {
		return umur;
	}

	public void setUmur(int umur) {
		this.umur = umur;
	}

	 
}
