package OfficeDetails;
class Employee{
	private String name,dept;
	private int age;
	private double salary;
	public Employee(String name, String dept, int age, double salary) {
		this.name = name;
		this.dept = dept;
		this.age = age;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String toString() {
		return "Employee [name=" + name + ", Department=" + dept + ", age=" + age + ", salary=" + salary + "]";
	}
}