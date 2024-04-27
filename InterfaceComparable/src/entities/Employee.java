package entities;

public class Employee implements Comparable<Employee>{

	private String name;
	private Double salary;

	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	//Ordem alfabetica
	@Override
	public int compareTo(Employee other) {
	return name.compareTo(other.getName());
	}
	
	/*Do menor salario para o maior
	  @Override
	public int compareTo(Employee other) {
	return salary.compareTo(other.getSalary());
	
	Do maior para o menor
	@Override
	public int compareTo(Employee other) {
	return -salary.compareTo(other.getSalary());
	}*/
	
}
