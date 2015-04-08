package p9.c;

import p9.b.MataKuliah;

public class ArraysMatakuliah {

	public final static int MAX_ELEMEN = 10;

	private MataKuliah[] arr;

	public ArraysMatakuliah() {
		super();
		arr = new MataKuliah[MAX_ELEMEN];
	}

	public ArraysMatakuliah(int maxElemen) {
		super();
		this.arr = new MataKuliah[maxElemen];
	}

	public void add(MataKuliah mk, int indeks) {
		arr[indeks] = mk;
	}

	// delete by matakuliah
	public boolean delete(MataKuliah mk) {
		int indeks = -1;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getKode());
			System.out.println(mk.getKode());
			if (arr[i].getKode().equals(mk.getKode())) {
				indeks = i;break;
			}
		}
		if (indeks < 0) {
			return false;
		} else {
			arr[indeks] = null;
			return true;
		}

	}

	public void deleteByIndeks(int indeks) {
		MataKuliah mk = arr[indeks];
		if (mk != null) {
			arr[indeks] = null;
		}
	}

	public MataKuliah find(MataKuliah mk) {
		int indeks = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getKode().equals(mk.getKode())) {
				indeks = i;
			}
		}
		if (indeks < 0) {
			return null;
		} else {
			MataKuliah mk2 = arr[indeks];
			return mk2;
		}
	}

	public void show() {
		for (int i = 0; i < arr.length; i++) {
			MataKuliah mk = arr[i];
			if (mk != null) {
				System.out.print(mk.getKode() + "," + mk.getNama() + ","
						+ mk.getSks());
				System.out.println();
			}
		}
	}

	public MataKuliah get(int indeks) {
		return arr[indeks];
	}
	
	public int findIndeks(MataKuliah mk){
		int indeks = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getKode().equals(mk.getKode())) {
				indeks = i;break;
			}
		}
		return indeks;
	}
	
	public void showMK(MataKuliah mk){
		if (mk != null) {
			System.out.println("Kode : "+mk.getKode()+"-"+"Nama : "+mk.getNama()+"-"+"SKS : "+mk.getSks());			
		}else
			System.out.println("Data Matakuliah Tidak Ditemukan");

	}

}
