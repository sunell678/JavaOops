package EntityClasses;

public class Employee2 {
Integer baseSalary = 50000;
void toTalSalary(Integer bs, Integer bonus) {
	Integer total=bs+bonus;
	System.out.println(total);
}
void toTalSalary(Integer bs, Integer bonus, Integer Incentitaves) {
	Integer toTal = bs+bonus+Incentitaves;
	System.out.println(toTal);
}
void working() {
	System.out.println("Working as Employeee");
}
}
