package xxx;

public class SalaryTest {
	public static void main(String[] args) {
		FullTimeEmployee john = new FullTimeEmployee(1001, "john", 40000);
		Manager allen = new Manager(101, "Allen", 60000, 10000);
		
		System.out.println(john.getFullTimeSalary());
		System.out.println(allen.getManagerSalary());
		
	}
}
