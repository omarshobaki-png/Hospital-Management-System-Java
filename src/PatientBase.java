//Omar Shoubaki 1230329
// Lab section:11 /lecture section:6
package project1;

import java.util.ArrayList;

public abstract class PatientBase implements Billable,Comparable<PatientBase> {
	private String patientId;
	private String name;
	private int age;
	private String medicalHistory;
	private Department department;
	private ArrayList<HospitalService> services;
	public PatientBase(String patientId, String name, int age, String medicalHistory, Department department ) {
		this.patientId= patientId;
		this.name= name;
		this.age= age;
		this.medicalHistory= medicalHistory;
		this.department= department;
	}
	public ArrayList<HospitalService> getServices() {
		return services;
	}
	public String getPatientId() {
		return patientId;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setServices(ArrayList<HospitalService> services) {
		this.services = services;
	}
	@Override
	public int compareTo(PatientBase o) {
		return Double.compare(this.calculateBill(), o.calculateBill());
	}

	public abstract double calculateBill() ;
	@Override
	public String toString() {
		return "patientId=" + patientId + ", name=" + name + ", age=" + age + ", medicalHistory="
				+ medicalHistory + "department: "+ department;
	}



}
