//Omar Shoubaki 1230329
// Lab section:11 /lecture section:6
package project1;

public class Doctor implements Comparable<Doctor>{
	private String doctorId;
	private String name;
	private String speciality;
	private String degree;
	private double baseSalary;
	private double overtimeHours;
	private double overtimeRate;
	private Department department;
	public Doctor(String doctorId,String name, String speciality , String degree, double baseSalary,double overtimeHours,double overtimeRate, Department department) {
		this.doctorId= doctorId;
		this.name= name;
		this.speciality= speciality;
		this.degree= degree;
		this.baseSalary= baseSalary;
		this.overtimeHours= overtimeHours;
		this.overtimeRate= overtimeRate;
		this.department= department;
	}
	public String getName() {
		return name;
	}
	public double calculateSalary() {
		double res;
		switch(degree.toLowerCase()) {
		case "bachelor": res= 1.1*baseSalary;
		break;
		case "master": res= 1.2* baseSalary;
		break;
		case "phd": res= 1.3* baseSalary;
		break;
		default: res= baseSalary;
		break;
		}
		return res+calculateOvertimePay();
	}
	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", name=" + name + ", speciality=" + speciality + ", degree=" + degree
				+ ", baseSalary=" + baseSalary + ", overtimeHours=" + overtimeHours + ", overtimeRate=" + overtimeRate
				+ ", department=" + department + "]";
	}
	private double calculateOvertimePay() {
		return overtimeHours* overtimeRate;
	}
	@Override
	public int compareTo(Doctor o) {
		return Double.compare(calculateSalary(), o.calculateSalary());
	}
}
