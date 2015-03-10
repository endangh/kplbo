package p6.a;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MatakuliahMain {

	Scanner sc = new Scanner(System.in);
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		MatakuliahMain mkn = new MatakuliahMain();
		mkn.latihan2();
	}

	public void latihan1() {
		Mahasiswa mhs = new Mahasiswa("1203040100", "Asep Supriatna");
		Matakuliah matkul = new Matakuliah("IT405", "KPLBO", 3);
		matkul.setNilaiMatakuliah(80, 90, 60, 55, 70);

		mhs.setMataKuliah(matkul);
		System.out.println(mhs.keteranganMatakuliah());
	}

	public void latihan2() {
		Mahasiswa mhs = new Mahasiswa();
		inputMhs(mhs);
		Matakuliah matkul = new Matakuliah("IT405", "KPLBO", 3);
		inputNilai(matkul);
		mhs.setMataKuliah(matkul);
		System.out.println("=======================================\n");
		System.out.println(mhs.keteranganMatakuliah());
		System.out.println("Index : "
				+ matkul.getNilaimk().getIndex(matkul.hitungNilai()));
	}

	public void inputMhs(Mahasiswa mahasiswa) {
		System.out.print("Masukkan nrp : ");
		String nrp = sc.next();
		mahasiswa.setNomorMahasiswa(nrp);
		System.out.print("Masukkan nama : ");
		mahasiswa.setNama(sc.next());
	}

	public void inputNilai(Matakuliah mk) {
		System.out.print("Nilai Tugas : ");
		double tugas = sc.nextDouble();
		System.out.print("Nilai Kuis : ");
		double kuis = sc.nextDouble();
		System.out.print("Nilai UTS : ");
		double uts = sc.nextDouble();
		System.out.print("Nilai UAS : ");
		double uas = sc.nextDouble();
		System.out.print("Nilai Praktikum : ");
		double prak = sc.nextDouble();
		mk.setNilaiMatakuliah(tugas, kuis, uts, uas, prak);
	}

}
