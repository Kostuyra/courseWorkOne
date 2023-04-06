public class Employee {
	private int id;
	private static int count;
	private String fullName;
	private int partOffice;
	private double salary;

	public Employee(String fullName, int partOffice, double salary) {
		this.id = ++ count;
		this.fullName = fullName;
		this.partOffice = partOffice;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "id: " + id +" ФИО: " + fullName + " Отдел № " + partOffice + " Зарплата: " + salary;
	}

	public int getId() {
		return id;
	}

	public String getFullName() {
		return fullName;
	}


	public int getPartOffice() {
		return partOffice;
	}

	public double getSalary() {
		return salary;
	}


	public void setPartOffice(int partOffice) {
		this.partOffice = partOffice;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
