package p6.c;

public class NilaiMahasiswaMain {
	
	public static void main(String[] args) {
		Mahasiswa mhs = new Mahasiswa("123040100", "Asep Supriatna");
		Nilai nilai = new Nilai(60, 80);
		mhs.setNilai(nilai);
		
		System.out.println(mhs.hitungNilai());
		
		System.out.println();
		
		System.out.println(mhs.hitungNilai(0.3, 0.7));
	}

}
