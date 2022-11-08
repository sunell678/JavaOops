package EntityClasses;

public class Student {
	Integer id;
	String name;
	String address;
	
	void addStudent(Integer id, String name,String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	void displayStudent() {
		System.out.println(name + " " + address + " " + id);
	}
	public static void main(String[] args) {
		Student NaveenAddress = new Student();
		Student Naveen = new Student();
		Naveen.addStudent(108, "Ashoknagar", "NaveenAddress");
		Naveen.displayStudent();
	}
	
}


