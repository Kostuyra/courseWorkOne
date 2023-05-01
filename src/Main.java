public class Main {


	public static void main(String[] args) {

		EmployeeBook emplBook1 = new EmployeeBook();
		emplBook1.addNewEmployee( new Employee("Sidorov Petr Ivanovich", 1, 50000.0));
		emplBook1.addNewEmployee(new Employee("Petrov Vasiliy Ivanovich", 2, 40000.0));
		emplBook1.addNewEmployee(new Employee("Kozlov Viktor Andreevich", 3, 60000.0));
		emplBook1.addNewEmployee(new Employee("Ignatov Alexandr Alexandrovich", 4, 80000.0));
		emplBook1.addNewEmployee(new Employee("Malahov Dmitry Alekseevich", 5, 90000.0));
		emplBook1.addNewEmployee(new Employee("Kotov Mark Michailovich", 1, 95000.0));

		System.out.println(emplBook1.getEmployeeWithMaxSalaryFromPartOffice(1));
		emplBook1.getAllEmployeesFromPartOffice();


	}


}