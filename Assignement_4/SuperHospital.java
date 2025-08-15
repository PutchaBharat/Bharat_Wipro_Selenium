package Assignement_4;


class Hospitall{
	String hospName="City Care hospital";
	String location="Hyderabad";
	
	void getHospDetails() {
		System.out.println("Hospital Name: "+hospName);
		System.out.println("Location: "+location);
	}
}
class Patient extends Hospitall{
	String patientName="Nikhil";
	int age=33;
	void getPatientDetails() {
		System.out.println("Patient Name: "+patientName);
		System.out.println("Patient Age: "+age);
	}
}
public class SuperHospital {

	public static void main(String[] args) {
		System.out.println("Patient Details....");
		Patient p=new Patient();
		p.getHospDetails();
		p.getPatientDetails();
	}

}