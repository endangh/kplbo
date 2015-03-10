package p6.a;

public class Nilai {

	private double nilaiTugas;
	private double nilaiKuis;
	private double nilaiUTS;
	private double nilaiUAS;
	private double nilaiPraktikum;

	public Nilai() {
		super();
	}

	public Nilai(double nilaiTugas, double nilaiKuis, double nilaiUTS,
			double nilaiUAS, double nilaiPraktikum) {
		super();
		this.nilaiTugas = nilaiTugas;
		this.nilaiKuis = nilaiKuis;
		this.nilaiUTS = nilaiUTS;
		this.nilaiUAS = nilaiUAS;
		this.nilaiPraktikum = nilaiPraktikum;
	}

	public double getNilaiTugas() {
		return nilaiTugas;
	}

	public void setNilaiTugas(double nilaiTugas) {
		this.nilaiTugas = nilaiTugas;
	}

	public double getNilaiKuis() {
		return nilaiKuis;
	}

	public void setNilaiKuis(double nilaiKuis) {
		this.nilaiKuis = nilaiKuis;
	}

	public double getNilaiUTS() {
		return nilaiUTS;
	}

	public void setNilaiUTS(double nilaiUTS) {
		this.nilaiUTS = nilaiUTS;
	}

	public double getNilaiUAS() {
		return nilaiUAS;
	}

	public void setNilaiUAS(double nilaiUAS) {
		this.nilaiUAS = nilaiUAS;
	}

	public double getNilaiPraktikum() {
		return nilaiPraktikum;
	}

	public void setNilaiPraktikum(double nilaiPraktikum) {
		this.nilaiPraktikum = nilaiPraktikum;
	}

	public double hitung() {
		double ntugas = getNilaiTugas() * 0.1;// 10%
		double nkuis = getNilaiKuis() * 0.1;// 10%
		double nuts = getNilaiUTS() * 0.2;// 20%
		double nuas = getNilaiUAS() * 0.3;// 30%
		double nprak = getNilaiPraktikum() * 0.3;// 30%

		return ntugas + nkuis + nuts + nuas + nprak;
	}

	public String getIndex(double nilai) {
		String idx = "";
		if (nilai >= 85) {
			idx = "A";
		} else if (nilai >= 65) {
			idx = "B";
		} else if (nilai >= 45) {
			idx = "C";
		} else if (nilai >= 35) {
			idx = "D";
		} else {
			idx = "E";
		}
		return idx;
	}

}
