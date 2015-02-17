package latihan;

public class Student {
	
	private String nrp;
	Professor advisor;

	public Student() {
		super();
	}
	
	public Student(String nrp) {
		super();
		this.nrp = nrp;
	}
	
	public Student(String nrp, Professor advisor) {
		super();
		this.nrp = nrp;
		this.advisor = advisor;
	}

	public Professor getAdvisor() {
		return advisor;
	}

	public void setAdvisor(Professor advisor) {
		this.advisor = advisor;
	}

	public String getNrp() {
		return nrp;
	}

	public void setNrp(String nrp) {
		this.nrp = nrp;
	}
	
	

	
	
	

}
