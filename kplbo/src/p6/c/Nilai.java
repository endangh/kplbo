package p6.c;

public class Nilai {

	private double nilaiUTS;
	private double nilaiUAS;

	public Nilai() {
		super();
	}

	public Nilai(double nilaiUTS, double nilaiUAS) {
		super();
		this.nilaiUTS = nilaiUTS;
		this.nilaiUAS = nilaiUAS;
	}
	
	public double hitung(){
		return hitung(0.4,0.6);
	}
	
	public double hitung(double prosUTS,double prosUAS){
		double nuts = getNilaiUTS()*prosUTS;
		double nuas = getNilaiUAS()*prosUAS;
		
		return nuas+nuts;
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

	
}
