//Omar Shoubaki 1230329
// Lab section:11 /lecture section:6
package project1;
import java.util.*;
public class Driver {


	public static void main(String[] args) {
		Department dep1= new Department("1", "Intensive Care");
		Department dep2= new Department("2", "Laboratory");
		Department dep3 = new Department("3", "Scans");
		ArrayList<PatientBase>patients= new ArrayList<>();
		patients.add(new EmergencyPatient("123","Bob Marley",66, "Asthma", dep2,9350.9));
		patients.add(new EmergencyPatient("148"," Ashley Young", 55,"None", dep3, 4450.5));
		patients.add(new LongTermPatient("255","Cole Palmer",23, "Scabies", dep1, 150,30));
		ArrayList<Doctor>doctors= new ArrayList<>();
		Doctor doc1 = new Doctor("12","Mohammad Ahmad", "Pathologist", "Bachelor", 7200, 30, 65.5,dep2);
		Doctor doc2= new Doctor ("3","Asad Mustafa", "Critical Care Specialist","PhD",11000,15,130,dep1);
		doctors.add(doc1);
		doctors.add(doc2);
		ArrayList<HospitalService>services1 = new ArrayList<>();
		services1.add(new HospitalService("MRI", 1100, patients.get(1)));
		services1.add(new HospitalService("X-Ray", 450, patients.get(1)));
		ArrayList<HospitalService>services2 = new ArrayList<>();
		services2.add(new HospitalService("Lab Tests",500, patients.get(0)));
		ArrayList<HospitalService>services3 = new ArrayList<>();
		services3.add(new HospitalService("Intensive Care Monitoring", 7500,patients.get(2)));
		services3.add(new HospitalService("Room Service", 4000, patients.get(2)));
		patients.get(0).setServices(services2);
		patients.get(1).setServices(services1);
		patients.get(2).setServices(services3);
		generateBill(patients.get(2),2);
		sortPatientsByBill(patients);
		sortDoctorsBySalary(doctors);
		System.out.println("\nList of doctors ordered by salary(ascending): \n");
		for(int i=0;i<doctors.size();i++) {
			System.out.println("Doctor: "+ doctors.get(i).getName()+", Salary: "+ doctors.get(i).calculateSalary()+"\n");
		}
		System.out.println("\nList of patients ordered by Bill(ascending): \n");
		for(int i=0;i<patients.size();i++) {
			System.out.println("Patient: "+ patients.get(i).getName()+", Age: "+ patients.get(i).getAge()+ "\n");
		}
		System.out.println("Total Bill for all patients: $"+ calculateTotalpatientsBill(patients));
		

	}
	
	public static void sortDoctorsBySalary(ArrayList<Doctor>doctors) {
		 Collections.sort(doctors);
	}
	
	public static void sortPatientsByBill(ArrayList<PatientBase>patient) {
		Collections.sort(patient);
	}
	
	public static double calculateTotalpatientsBill(ArrayList<PatientBase>patients) {
		double res=0;
		for(int i=0;i<patients.size();i++) {
			res+= patients.get(i).calculateBill();
		}
		return res;
	}
	
	public static void generateBill(PatientBase p, int num) {
		System.out.printf("Info for patient number %d : \n", num+1);
		System.out.printf("Patient name: %s , Patient ID: %s , Total bill: $%.1f \n", p.getName(),p.getPatientId(),p.calculateBill());
	}
}
