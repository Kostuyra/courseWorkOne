public class Main {
	static Employee[] Employees = new Employee[10];

	public static void main(String[] args) {

		Employee empl = new Employee("Ivanov Ivan Semenovich", 1, 25500.0);
		Employee empl2 = new Employee("Petrov Vasiliy Ivanovich", 2, 50000.0);

	}

	static void allEmployees() {
		for (Employee i : Employees) {
			if (isNull(i)) {
				continue;
			}
			System.out.println(i.toString());
		}
	}

	static double getSumSalaries() {
		double sum = 0.0;
		for (Employee i : Employees) {
			if (isNull(i)) {
				continue;
			}
			sum += i.getSalary();
		}
		return sum;
	}

	static int getCountEmployees() {
		int count = 0;
		for (Employee i : Employees) {
			if (isNull(i)) {
				continue;
			}
			count++;
		}
		return count;
	}

	static String getEmployeeWithMinSalary() {
		double salary = 999_999_999_999.0;
		String nameEmployee = "";
		for (Employee i : Employees) {
			if (isNull(i)) {
				continue;
			}
			if (salary > i.getSalary()) {
				salary = i.getSalary();
				nameEmployee = i.getFullName();
			}
		}
		return nameEmployee;
	}

	static String getEmployeeWithMaxSalary() {
		double salary = 0.0;
		String nameEmployee = "";
		for (Employee i : Employees) {
			if (isNull(i)) {
				continue;
			}
			if (salary < i.getSalary()) {
				salary = i.getSalary();
				nameEmployee = i.getFullName();
			}
		}
		return nameEmployee;
	}

	static double getAvrSalary() {
		double avr = 0.0;
		if (getCountEmployees() != 0) {
			avr = getSumSalaries() / getCountEmployees();
		}
		return avr;
	}

	static void getNameAllEmployees() {
		for (Employee i : Employees) {
			if (isNull(i)) {
				continue;
			}
			System.out.println(i.getFullName());
		}
	}

	static boolean isNull(Employee employee){
		boolean boolEmpl = false;
		if (employee == null) {
			boolEmpl = true;
		}
		return boolEmpl;
	}
}