package p4.a;

public class MatakuliahMain {

	public static void main(String[] args) {
		
		 Matakuliah matkul1 = new Matakuliah();
		
		 matkul1.setKode("IT405");
		 matkul1.setNama("KPLBO");
		 matkul1.setSks(3);
		
		 Matakuliah matkul2 = new Matakuliah("IT502", "Vispro", 3);
		
		 System.out.println("@Sebelum di copy reference");
		 viewAttribute(matkul1, matkul2);
		
		 matkul2 = matkul1;
		
		 System.out.println("\n\n@setelah di copy reference");
		 viewAttribute(matkul1, matkul2);
		 
		 //latihan2
		latihan();
	}

	private static void viewAttribute(Matakuliah matkul1, Matakuliah matkul2) {
		System.out.println("@matkul1");
		System.out.println(matkul1);
		System.out.println("@matkul2");
		System.out.println(matkul2);
	}

	private static void latihan() {
		Matakuliah matkul1 = new Matakuliah();

		matkul1.setKode("IT405");
		matkul1.setNama("KPLBO");
		matkul1.setSks(3);

		Matakuliah matkul2 = new Matakuliah("IT102", "Alpro1", 4);
		
		Matakuliah matkul3 = matkul1;//copy reference
		
		System.out.println("\n@latihan 2");
		System.out.println("-------------");
		System.out.println("@matukul1");
		System.out.println(matkul1);
		System.out.println("@matukul2");
		System.out.println(matkul2);
		System.out.println("@matukul3");
		System.out.println(matkul3);

	}
}
