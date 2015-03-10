package p7.b;

public class OneToManyFromTranskrip {
	
	public static void main(String[] args) {
		Mahasiswa mhs = new Mahasiswa("113040100", "Iwan");
		
		Transkrip transkrip = new Transkrip();
		transkrip.setMahasiswa(mhs);
		
		Matakuliah mk1 = new Matakuliah("1", "KPLBO", 3, 'A');
		Matakuliah mk2 = new Matakuliah("1", "Alpro", 3, 'A');
		Matakuliah mk3 = new Matakuliah("1", "Vispro", 3, 'B');
		transkrip.addMatakuliah(mk1);
		transkrip.addMatakuliah(mk2);
		transkrip.addMatakuliah(mk3);
		
		transkrip.hitungIpk();
		System.out.println(transkrip.display());
				
	}

}
