package employeeManagement;

public class Employee {
	private int age;
	private String name;
	private String eno = "0";
	private double salary;

	public Employee() {

		// TODO Auto-generated constructor stub

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEno() {
		return eno;
	}

	public void setEno(String eno) {
		this.eno = eno;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [ name=" + name + ",age=" + age + ", eno=" + eno + ", salary=" + salary + "]";
	}

	public Employee(String name, int age, String eno, double salary) {
		super();
		this.age = age;
		this.name = name;
		this.eno = eno;
		this.salary = salary;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		if (obj instanceof Employee) {
			Employee obj1 = (Employee) obj;
			if (obj1.getEno() == this.getEno()) {
				return true;
			} else {
				return false;
			}
		}
		return false;

	}

//	@Override
//	public int hashCode() {
//
//		return (name + age).hashCode();
//
//	}
}