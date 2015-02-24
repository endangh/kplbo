package p5.a;

public class Transkrip {

	private double ipk;

	public Transkrip(double ipk) {
		setIpk(ipk);
	}

	public double getIpk() {
		return ipk;
	}

	public void setIpk(double ipk) {
		this.ipk = ipk;
	}

	// latihan 2 menambahkankan method validitas ipk
	public static boolean validasiIPK(double nIpk) {
		if (nIpk >= 0 && nIpk <= 4) {
			return true;
		} else {
			return false;
		}
	}

	// latihan 3 menambahkan method keterangan ipk

	public String keteranganIPK() {
		if (ipk >= 3.6) {
			return "Cumlaude";
		} else if (ipk >= 3.0) {
			return "Baik Sekali";
		} else if (ipk >= 2.75) {
			return "Baik";
		} else if (ipk >= 2.0) {
			return "Cukup Baik";
		} else {
			return "Kurang Sekali";
		}
	}
}

