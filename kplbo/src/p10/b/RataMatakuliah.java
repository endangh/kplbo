package p10.b;

import p10.a.ContohArrayList;
import p9.b.MataKuliah;

import java.util.ArrayList;
import java.util.List;

public class RataMatakuliah {
	private List<MataKuliah> listMk;
	
	public RataMatakuliah(){
		listMk = new ArrayList<MataKuliah>();
	}
	
	public void addMatakuliah(MataKuliah mk){
		listMk.add(mk);
	}
	
	public double hitungRata2Nilai(){
		return (double)hitungPembilang()/hitungPenyebut();
	}

	public int hitungPembilang(){
		int jumlah = 0;
		for (MataKuliah mk : listMk) {
			jumlah+=mk.getIndeksNilai();
		}
		return jumlah;
	}
	
	public int hitungPenyebut(){
		return listMk.size();
	}
	
	public void tampilMatakuliah(){
		for (MataKuliah mk : listMk) {
			System.out.println("Kode : "+mk.getKode());
			System.out.println("Matkul : "+mk.getNama());
			System.out.println("SKS : "+mk.getSks());
			System.out.println("Index : "+mk.getNilaiIndeks());
		}
	}
	
	public int size(){
		return listMk.size();
	}
	
}
