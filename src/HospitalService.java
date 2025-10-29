//Omar Shoubaki 1230329
// Lab section:11 /lecture section:6
package project1;

public class HospitalService {
	private String serviceName;
	private double serviceCost;
	private PatientBase patient;
	public HospitalService(String serviceName, double serviceCost, PatientBase patient) {
		this.serviceName= serviceName;
		this.serviceCost= serviceCost;
		this.patient= patient;
	}
	@Override
	public String toString() {
		return "HospitalService [serviceName=" + serviceName + ", serviceCost=" + serviceCost + ", patient=" + patient
				+ "]";
	}
	public double getServiceCost() {
		return serviceCost;
	}
	public void setServiceCost(double serviceCost) {
		this.serviceCost = serviceCost;
	}

}
