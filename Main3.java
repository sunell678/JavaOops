package EntityClasses;

public class Main3 {
	public static void main(String args[])
	   {
	      OverloadDemo obj2= new OverloadDemo();
	      obj2.myMethod1(10,10);
	      obj2.myMethod1(20,12);
	   }
}
class OverloadDemo{
	 public double myMethod1(int num1, int num2)    {
	     System.out.println("OverloadDemo::myMethod returns double");
	     return num1+num2;
	   }
	   public int myMethod(int var1, int var2)    {
	      System.out.println("OverloadDemo::myMethod returns int");
	      return var1-var2;
	   }
}
