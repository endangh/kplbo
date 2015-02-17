package p3.a;

public class Dosen {

	private String nomorDosen;
	private String nama;
	
	public Dosen(){	
		nama = "Rian";
	}
	
	public Dosen(String nomorDosen){
		this.nomorDosen = nomorDosen;
	}
		
	public Dosen(String nomorDosen, String nama) {
		this.nomorDosen = nomorDosen;
		this.nama = nama;
	}

	public String getNomorDosen() {
		return nomorDosen;
	}

	public void setNomorDosen(String nomorDosen) {
		this.nomorDosen = nomorDosen;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nomorDosen+", "+nama;
	}
}
