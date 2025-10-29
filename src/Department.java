//Omar Shoubaki 1230329
// Lab section:11 /lecture section:6
package project1;
import java.util.*;
public class Department {
	private String departmentId;
	private String name;
	private ArrayList<Doctor>doctors;
	private ArrayList<PatientBase>patients;
	public Department(String departmentId, String name ) {
		this.departmentId= departmentId;
		this.name= name;
	}
	public void addDoctor(Doctor doc) {
		doctors.add(doc);
	}
	public void addPatient(PatientBase patient) {
		patients.add(patient);
	}
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", name=" + name + ", doctors=" + doctors + ", patients="
				+ patients + "]";
	}

}
