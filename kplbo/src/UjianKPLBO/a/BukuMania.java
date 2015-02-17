/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UjianKPLBO.a;
import java.util.ArrayList;
import java.util.Scanner;

import UjianKPLBO.b.Buku;
import UjianKPLBO.b.Member;
public class BukuMania {
	/*
	 * buat variabel list buku dan list member
	 * gunakan arraylist
	 */
	
	Scanner sc = new Scanner(System.in);

	public int menuAdministrasi() {
		System.out.println("====Menu====");
		System.out.println("1. Tampil semua data buku");
		System.out.println("2. Tampil semua data member");
		System.out.println("3. Tambah Buku");
		System.out.println("4. Sewa Buku");
		System.out.println("5. Jual Buku");
		System.out.println("6. Exit");
		System.out.print("Pilihan anda :");
		return sc.nextInt();
	}

	public void tampilBuku() {
		/*
		 * Menampilkan semua data Buku dari list Gunakan iterator
		 */
	}

	public void tampilMember() {
		/*
		 * Menampilkan semua data Member dari list Gunakan iterator
		 */
	}

	public void tambahBuku() {
		/*
		 * Masukkan data buku inputan keyboard 
		 * idBuku tergenerate otomatis
		 * tambahkan ke dalam list buku
		 */
	}

	public void prosesAdministrasi() {

		int pilih = menuAdministrasi();
		while (pilih != 6) {
			switch (pilih) {
			case 1:
				tampilBuku();
				break;
			case 2:
				tampilMember();
				break;
			case 3:
				tambahBuku();
				break;
			case 4:
				Sewa sewa = new Sewa();
				sewa.pesanBuku();
				break;
			case 5:
				Penjualan pj = new Penjualan();
				//pj.pesanBuku();
				break;
			default:
				System.out.println("Tidak ada pilihan");
				break;
			}
			pilih = menuAdministrasi();

		}

	}

	public void initDataBuku() {
//		listAllBuku.add(new Buku("0001", "Naruto", "Ayoma", "Komik", 2, 17500));
//		listAllBuku
//				.add(new Buku("0002", "D.Conan", "Ghoso", "Komik", 3, 17500));
//		listAllBuku.add(new Buku("0003", "Alpro", "Khaerul", "Komputer", 10,
//				17500));
//		listAllBuku
//				.add(new Buku("0004", "Java", "Rizky", "Komputer", 15, 17500));
//		listAllBuku.add(new Buku("0005", "Photoshop", "Erik", "Design", 5,
//				17500));
	}

	public void initDataMember() {
//		listAllMember.add(new Member("1405001", "Adung", "Setiabudi"));
//		listAllMember.add(new Member("1405002", "Adul", "Gg Hj rido"));
//		listAllMember.add(new Member("1405003", "Samsons", "buah batu"));
//		listAllMember.add(new Member("1405004", "Roby", "Supratman"));
	}

	public static void main(String[] args) {
		BukuMania bukuMania = new BukuMania();
		bukuMania.initDataBuku();
		bukuMania.initDataMember();
		bukuMania.prosesAdministrasi();
	}
}
