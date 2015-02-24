package p5.a;

public class TranskripNilai {

	public static void main(String[] args) {
		//latihan1();
		//latihan2();
		latihan3();
	}

	public static void latihan1() {
		Mahasiswa mhs = new Mahasiswa("123040100", "Asep Supriatna");
		Transkrip transkrip = new Transkrip(3.4);

		mhs.setTranskrip(transkrip);

		System.out.println(mhs.keteranganTranskrip());
	}

	public static void latihan2() {
		double ipk = 4.05;
		if (Transkrip.validasiIPK(ipk)) {
			Mahasiswa mhs = new Mahasiswa("123040100", "Asep Supriatna");
			Transkrip transkrip = new Transkrip(3.4);
			mhs.setTranskrip(transkrip);
			System.out.println(mhs.keteranganTranskrip());
		} else {
			System.out.println("Inputan tidak sesuai range nilai (0-4)");
		}
	}

	public static void latihan3() {
		double ipk = 3.0;
		if (Transkrip.validasiIPK(ipk)) {
			Mahasiswa mhs = new Mahasiswa("123040100", "Asep Supriatna");
			Transkrip transkrip = new Transkrip(3.4);

			mhs.setTranskrip(transkrip);

			System.out.println(mhs.keteranganTranskrip());
		} else {
			System.out.println("Inputan tidak sesuai range nilai (0-4)");
		}
	}

}
