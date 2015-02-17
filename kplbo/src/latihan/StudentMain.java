package latihan;

public class StudentMain {

	public static void main(String[] args) {
		Student budi = new Student("133040001");
		Professor henkom = new Professor("P01", "Hendra Komara");
		budi.setAdvisor(henkom);
		
		System.out.println(henkom.getName());
		
		System.out.println(budi.getNrp());
		System.out.println(budi.getAdvisor().getName());
		
	}
}
