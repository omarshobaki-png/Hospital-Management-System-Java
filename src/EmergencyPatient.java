//Omar Shoubaki 1230329
// Lab section:11 /lecture section:6
package project1;

public class EmergencyPatient extends PatientBase{
	private double emergencyFees;
	public EmergencyPatient(String patientId, String name, int age, String medicalHistory, Department department, double emergancyFees ) {
		super(patientId,name,age,medicalHistory,department);
		this.emergencyFees= emergancyFees;
	}
	@Override
	public double calculateBill() {
		double totalServiceCosts = 0;
		if (getServices() != null) { 
			for (int i=0 ; i< getServices().size();i++) {
				totalServiceCosts +=getServices().get(i).getServiceCost();
			}
		}
		return (emergencyFees+totalServiceCosts)*(1+taxRate);
	}
}
