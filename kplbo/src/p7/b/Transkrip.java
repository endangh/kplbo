package p7.b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class Transkrip {

	private Float ipk;
	private Mahasiswa mahasiswa;

	private Collection<Matakuliah> listMatakuliah = new ArrayList<>();

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

	public Mahasiswa getMahasiswa() {
		return mahasiswa;
	}

	public void setMahasiswa(Mahasiswa mahasiswa) {
		this.mahasiswa = mahasiswa;
	}

	public Collection<Matakuliah> getListMatakuliah() {
		return listMatakuliah;
	}

	public void setListMatakuliah(Collection<Matakuliah> listMatakuliah) {
		this.listMatakuliah = listMatakuliah;
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
	
	public void hitungIpk(){
		ipk = (float) (hitungTotalIndeksAndSKS()/hitungTotalSKS());
	}

	private int hitungTotalIndeksAndSKS() {
		int total = 0;
		Iterator<Matakuliah> iterator = listMatakuliah.iterator();
		while (iterator.hasNext()) {
			Matakuliah matakuliah = (Matakuliah) iterator.next();
			total += (matakuliah.getSks() * matakuliah.getNilaiIndeks());

		}
		return total;
	}
	
	private int hitungTotalSKS(){
		int total = 0;
		Iterator<Matakuliah> iterator = listMatakuliah.iterator();
		while (iterator.hasNext()) {
			Matakuliah matakuliah = (Matakuliah) iterator.next();
			total +=matakuliah.getSks();
		}
		return total;
	}
	
	public void addMatakuliah(Matakuliah matakuliah) {
		listMatakuliah.add(matakuliah);
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
