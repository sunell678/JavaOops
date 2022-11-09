package EntityClasses;

public class Sales  extends Employee2 {

	
		// TODO Auto-generated method stub
		Integer Bonus = 45000;
		Integer insentive ;
		void working() {
			System.out.println("Employeess is working as a part of sales Department");
		}
		public static void main(String[] args) {
			Sales sunil = new Sales();
				sunil.insentive = 30000;
			sunil.toTalSalary(sunil.baseSalary, sunil.Bonus, sunil.insentive);
			sunil.toTalSalary(sunil.baseSalary, sunil.insentive);
			sunil.working();
					
		}
		

	

}
