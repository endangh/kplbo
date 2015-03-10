package p7.a;

public class OneToOneFromMahasiswa {
	
	public static void main(String[] args) {
		Transkrip transkrip = new Transkrip();
		transkrip.setIpk(3.4f);
		
		//@Kontruktor 1
		Mahasiswa mhs = new Mahasiswa();
		mhs.setNrp("113040100");
		mhs.setNama("Iwan");
		mhs.setTranskrip(transkrip);
		
		System.out.println(mhs.display());
		
		//@Konstruktor 2
//		Mahasiswa mhs = new Mahasiswa("113040100", "Iwan");
//		mhs.setTranskrip(transkrip);
//		System.out.println(mhs.display());
		
		//@Kontruktor 3
//		Mahasiswa mhs = new Mahasiswa("113040100", "Iwan", transkrip);
//		System.out.println(mhs.display());
		
	}

}
