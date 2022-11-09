package EntityClasses;

 class Dev  {

	Integer BeseSalary = 45000;
	}
public class Emploee extends Dev{
	Integer Bonus=656555;
	Integer total = Bonus+BeseSalary ;
	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
		Emploee mdev = new Emploee();
System.out.println("Total salary of Employee is "+mdev.total);
	}

}
