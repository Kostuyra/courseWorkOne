public class EmployeeBook {
	final private Employee[] employees;

	public EmployeeBook() {
		this.employees = new Employee[10];
	}

	public void addNewEmployee(Employee employee) {
		for (int i = 0; i < employees.length; i++) {
			if (isNull(employees[i])) {
				employees[i] = employee;
				break;
			}
		}
	}

	public void deleteEmployee(int id, String fullName) {
		for (int i = 0; i < employees.length; i++) {
			if (isNull(employees[i])) {
				continue;
			}
			if (employees[i].getId() == id && employees[i].getFullName().equals(fullName)) {
				employees[i] = null;
				break;
			}
		}
	}

	public void changeSalaryEmployee(String fullName, double newSalary) {
		for (int i = 0; i < employees.length; i++) {
			if (isNull(employees[i])) {
				continue;
			}
			if (employees[i].getFullName().equals(fullName)) {
				employees[i].setSalary(newSalary);
				System.out.println("Зарплата сотрудника " + fullName + " изменена");
				break;
			}
		}
		System.out.println("Сотрудник не найден");
	}

	public void changePartOfficeEmployee(String fullName, int newPartOffice) {
		for (int i = 0; i < employees.length; i++) {
			if (isNull(employees[i])) {
				continue;
			}
			if (employees[i].getFullName().equals(fullName)) {
				employees[i].setPartOffice(newPartOffice);
				System.out.println("Отдел сотрудника " + fullName + " изменен");
				break;
			}
		}
		System.out.println("Сотрудник не найден");
	}

	public void getAllEmployeesFromPartOffice() {
		StringBuilder messageOne = new StringBuilder("Отдел № 1: ");
		StringBuilder messageTwo = new StringBuilder("Отдел № 2: ");
		StringBuilder messageThree = new StringBuilder("Отдел № 3: ");
		StringBuilder messageFour = new StringBuilder("Отдел № 4: ");
		StringBuilder messageFive = new StringBuilder("Отдел № 5: ");

		for (int i = 0; i < employees.length; i++) {
			if (isNull(employees[i])){
				continue;
			}
			if (employees[i].getPartOffice() == 1) {
				messageOne.append(" " + employees[i].getFullName() + ", ");
				continue;
			}
			if (employees[i].getPartOffice() == 2) {
				messageTwo.append(" " + employees[i].getFullName() + ", ");
				continue;
			}
			if (employees[i].getPartOffice() == 3) {
				messageThree.append(" " + employees[i].getFullName() + ", ");
				continue;
			}
			if (employees[i].getPartOffice() == 4) {
				messageFour.append(" " + employees[i].getFullName() + ", ");
				continue;
			}
			if (employees[i].getPartOffice() == 5) {
				messageFive.append(" " + employees[i].getFullName() + ", ");
			}

		}
		System.out.println(messageOne.append("\n").append(messageTwo).append("\n").append(messageThree).append("\n").append(messageFour).append("\n").append(messageFive));

	}


	public void allEmployees() {
		for (Employee i : employees) {
			if (isNull(i)) {
				continue;
			}
			System.out.println(i.toString());
		}
	}

	public double getSumSalaries() {
		double sum = 0.0;
		for (Employee employee : employees) {
			if (isNull(employee)) {
				continue;
			}
			sum += employee.getSalary();
		}
		return sum;
	}

	private int getCountEmployees() {
		int count = 0;
		for (Employee employee : employees) {
			if (isNull(employee)) {
				continue;
			}
			count++;
		}
		return count;
	}

	public Employee getEmployeeWithMinSalary() {
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

	public Employee getEmployeeWithMaxSalary() {
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

	public double getAvrSalary() {
		double avr = 0.0;
		int countEmployees = getCountEmployees();
		if (countEmployees != 0) {
			avr = getSumSalaries() / countEmployees;
		}
		return avr;
	}

	public void getNameAllEmployees() {
		for (Employee employee : employees) {
			if (isNull(employee)) {
				continue;
			}
			System.out.println(employee.getFullName());
		}
	}

	private boolean isNull(Employee employee) {
		return employee == null;
	}

	public void increaseSalary(int increase) {
		for (Employee employee : employees) {
			if (isNull(employee)) {
				continue;
			}
			employee.setSalary(employee.getSalary() * (1.0 + increase / 100.0));
		}
	}

	public Employee getEmployeeWithMinSalaryFromPartOffice(int numberPartOffice) {
		double salary = 999_999_999_999.0;
		Employee employeeWithMinSal = null;
		for (Employee employee : employees) {
			if (isNull(employee) || employee.getPartOffice() != numberPartOffice) {
				continue;
			}
			if (salary > employee.getSalary()) {
				salary = employee.getSalary();
				employeeWithMinSal = employee;
			}
		}
		return employeeWithMinSal;
	}

	public Employee getEmployeeWithMaxSalaryFromPartOffice(int numberPartOffice) {
		double salary = 0.0;
		Employee employeeWithMaxSal = null;
		for (Employee employee : employees) {
			if (isNull(employee) || employee.getPartOffice() != numberPartOffice) {
				continue;
			}
			if (salary < employee.getSalary()) {
				salary = employee.getSalary();
				employeeWithMaxSal = employee;
			}
		}
		return employeeWithMaxSal;
	}

	public double getSumSalariesInPartOffice(int numberPartOffice) {
		double sum = 0.0;
		for (Employee employee : employees) {
			if (isNull(employee) || employee.getPartOffice() != numberPartOffice) {
				continue;
			}
			sum += employee.getSalary();
		}
		return sum;
	}

	private int getCountEmployeesInPartOffice(int numberPartOffice) {
		int count = 0;
		for (Employee employee : employees) {
			if (isNull(employee) || employee.getPartOffice() != numberPartOffice) {
				continue;
			}
			count++;
		}
		return count;
	}

	public double getAvrSalaryInPartOffice(int numberPartOffice) {
		double avr = 0.0;
		int countEmployees = getCountEmployeesInPartOffice(numberPartOffice);
		if (countEmployees != 0) {
			avr = getSumSalariesInPartOffice(numberPartOffice) / countEmployees;
		}
		return avr;
	}

	public void increaseSalaryInPartOffice(int increase, int numberPartOffice) {
		for (Employee employee : employees) {
			if (isNull(employee) || employee.getPartOffice() != numberPartOffice) {
				continue;
			}
			employee.setSalary(employee.getSalary() * (1.0 + increase / 100.0));
		}
	}

	public void allEmployeesDataFromPartOffice(int numberPartOffice) {
		for (Employee employee : employees) {
			if (isNull(employee) || employee.getPartOffice() != numberPartOffice) {
				continue;
			}
			System.out.println("id: " + employee.getId() + " ФИО: " + employee.getFullName() +
					" Зарплата: " + employee.getSalary());
		}
	}

	public void allNameEmployeesWithSalarySmallerThen(double limit) {
		for (Employee employee : employees) {
			if (isNull(employee) || employee.getSalary() >= limit) {
				continue;
			}
			System.out.println("id: " + employee.getId() + " ФИО: " + employee.getFullName() +
					" Зарплата: " + employee.getSalary());
		}
	}

	public void allNameEmployeesWithSalaryBiggerOrEquallyThen(double limit) {
		for (Employee employee : employees) {
			if (isNull(employee) || employee.getSalary() < limit) {
				continue;
			}
			System.out.println("id: " + employee.getId() + " ФИО: " + employee.getFullName() +
					" Зарплата: " + employee.getSalary());
		}
	}
}
