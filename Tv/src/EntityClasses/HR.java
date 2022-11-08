package EntityClasses;


public class HR  extends Emploee
{
	Integer Bonus = 50000;
	Integer total = Bonus + BeseSalary;
	public static void main(String[] args) {
		HR Naveen = new HR();
		System.out.println("naveen's total salary is" + Naveen.total);
	}
}
