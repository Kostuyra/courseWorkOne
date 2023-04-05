public class Main {
	private static Employee[] employees = new Employee[10];

	public static void main(String[] args) {

		employees[0] = new Employee("Ivanov Ivan Semenovich", 1, 25500.0);
		employees[1] = new Employee("Petrov Vasiliy Ivanovich", 2, 50000.0);

	}

	static void allEmployees() {
		for (Employee i : employees) {
			if (isNull(i)) {
				continue;
			}
			System.out.println(i.toString());
		}
	}

	static double getSumSalaries() {
		double sum = 0.0;
		for (Employee employee : employees) {
			if (isNull(employee)) {
				continue;
			}
			sum += employee.getSalary();
		}
		return sum;
	}

	static int getCountEmployees() {
		int count = 0;
		for (Employee employee : employees) {
			if (isNull(employee)) {
				continue;
			}
			count++;
		}
		return count;
	}

	static Employee getEmployeeWithMinSalary() {
		double salary = 999_999_999_999.0;
		Employee employeeWithMinSal = null;
		for (Employee employee : employees) {
			if (isNull(employee)) {
				continue;
			}
			if (salary > employee.getSalary()) {
				salary = employee.getSalary();
				employeeWithMinSal = employee;
			}
		}
		return employeeWithMinSal;
	}

	static Employee getEmployeeWithMaxSalary() {
		double salary = 0.0;
		Employee employeeWithMaxSal = null;
		for (Employee employee : employees) {
			if (isNull(employee)) {
				continue;
			}
			if (salary < employee.getSalary()) {
				salary = employee.getSalary();
				employeeWithMaxSal = employee;
			}
		}
		return employeeWithMaxSal;
	}

	static double getAvrSalary() {
		double avr = 0.0;
		int countEmployees = getCountEmployees();
		if (countEmployees != 0) {
			avr = getSumSalaries() / countEmployees;
		}
		return avr;
	}

	static void getNameAllEmployees() {
		for (Employee employee : employees) {
			if (isNull(employee)) {
				continue;
			}
			System.out.println(employee.getFullName());
		}
	}

	static boolean isNull(Employee employee) {
		return employee == null;
	}
}