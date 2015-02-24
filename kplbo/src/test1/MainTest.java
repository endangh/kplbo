package test1;

public class MainTest {
	
	public static String cekSemester(String kodeMK){
		String kode = kodeMK.substring(2, 3);
		return kode;
	}
	
	public static void main(String[] args) {
		Matakuliah mk1 = new Matakuliah();
		mk1.setNama("KPLBO");
		mk1.setKode("IT405");
		
		Matakuliah mk2 = new Matakuliah();
		mk2.setNama("PSBO");
		mk2.setKode("IT505");
		
		System.out.println("Nama matakuliah 1 = "+mk1.getNama()+"; Kode Matakuliah 1 = "+mk1.getKode());
		System.out.println("Semester "+cekSemester(mk1.getKode()));
		System.out.println("Nama matakuliah 2 = "+mk2.getNama()+"; Kode Matakuliah 2 = "+mk2.getKode());
		System.out.println("Semester "+cekSemester(mk2.getKode()));
		
	}

}
