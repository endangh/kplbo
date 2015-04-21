package test4;

import java.util.List;

public class Dosen {

	private String nip;
	private String nama;
	private List<Mahasiswa> anakWalis;

	public Dosen() {
		super();
	}

	public Dosen(String nip, String nama, List<Mahasiswa> anakWalis) {
		super();
		this.nip = nip;
		this.nama = nama;
		this.anakWalis = anakWalis;
	}

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public List<Mahasiswa> getAnakWalis() {
		return anakWalis;
	}

	public void setAnakWalis(List<Mahasiswa> anakWalis) {
		this.anakWalis = anakWalis;
	}

}
