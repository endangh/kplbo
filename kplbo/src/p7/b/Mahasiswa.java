package p7.b;

public class Mahasiswa {
	
	private String nrp;
	private String nama;
	
	
	private Transkrip transkrip;
	
	public Mahasiswa() {
		super();
	}

	public Mahasiswa(String nrp, String nama) {
		super();
		this.nrp = nrp;
		this.nama = nama;
	}

	public Mahasiswa(String nrp, String nama, Transkrip transkrip) {
		super();
		this.nrp = nrp;
		this.nama = nama;
		this.transkrip = transkrip;
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

	public Transkrip getTranskrip() {
		return transkrip;
	}

	public void setTranskrip(Transkrip transkrip) {
		this.transkrip = transkrip;
	}
	
	public String display(){
		StringBuffer sb = new StringBuffer();
		sb.append("== Perspektif Kelas Mahasiswa ==\n");
		sb.append("NRP : "+this.getNrp());
		sb.append("Nama : "+this.getNama());
		sb.append("IPK : "+getTranskrip().getIpk());
		sb.append("Keterangan : "+getTranskrip().getKeterangan());
		return sb.toString();
	}
	

}
