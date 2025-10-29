//Omar Shoubaki 1230329
// Lab section:11 /lecture section:6
package project1;

public class LongTermPatient extends PatientBase {
	private int daysAdmitted;
	private double dailyRate;
	public LongTermPatient(String patientId, String name, int age, String medicalHistory, Department department,int daysAdmitted,double dailyRate ) {
		super(patientId,name,age,medicalHistory,department);
		this.dailyRate= dailyRate;
		this.daysAdmitted= daysAdmitted;
	}
	@Override
	public double calculateBill() {
		double totalServiceCosts = 0;
		if (getServices() != null) { 
			for (int i=0 ; i< getServices().size();i++) {
				totalServiceCosts +=getServices().get(i).getServiceCost();
			}
		}
		return ((daysAdmitted* dailyRate)+ totalServiceCosts)*(1+ taxRate);
	}


}
