package p7.a;

public class Transkrip {

	private Float ipk;
	private Mahasiswa mahasiswa;

	public Transkrip() {

		this(0.0f, null);
	}

	public Transkrip(Float ipk) {
		super();
		this.ipk = ipk;
	}

	public Transkrip(Float ipk, Mahasiswa mhs) {
		super();
		this.ipk = ipk;
		this.mahasiswa = mhs;
	}

	public Float getIpk() {
		return ipk;
	}

	public void setIpk(Float ipk) {
		this.ipk = ipk;
	}

	public Mahasiswa getMhs() {
		return mahasiswa;
	}

	public void setMhs(Mahasiswa mhs) {
		this.mahasiswa = mhs;
	}

	public String getKeterangan() {
		if (ipk <= 4 && ipk > 3.5) {
			return "Cumlaude";
		} else if (ipk > 3) {
			return "Excellent";
		} else if (ipk > 2.5) {
			return "Good";
		} else if (ipk > 0) {
			return "Not Good";
		}
		return "";
	}

	public String display(){
		StringBuffer sb = new StringBuffer();
		sb.append("== Perspektif Kelas Transkrip ==\n");
		sb.append("NRP : "+mahasiswa.getNrp());
		sb.append("Nama : "+mahasiswa.getNama());
		sb.append("IPK : "+this.getIpk());
		sb.append("Keterangan : "+this.getKeterangan());
		return sb.toString();
	}
}
