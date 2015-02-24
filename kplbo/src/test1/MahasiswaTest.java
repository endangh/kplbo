package test1;

public class MahasiswaTest {
	
	public static void main(String[] args) {
		Mahasiswa mhs1 = new Mahasiswa();
		mhs1.setNama("Badu");
		mhs1.setNrp("123040001");
		
		Mahasiswa mhs2 = new Mahasiswa();
		mhs2.setNama("Tuti");
		mhs2.setNrp("123040002");
		
		System.out.println("Nama mahasiswa 1 = "+mhs1.getNama()+"; NRP mahasiswa 1 = "+mhs1.getNrp());
		System.out.println("Nama mahasiswa 2 = "+mhs2.getNama()+"; NRP mahasiswa 2 = "+mhs2.getNrp());
	}
}
