package EntityClasses;

public class Main2 {
	public static void main(String args[])
	   {
	MethodOverload obj = new MethodOverload();
	obj.printParam('A');     //call overloaded method (1 )
	obj.printParam('A',10);  //call overloaded method (2 )
	   }
}
	class MethodOverload{

		 //overloaded method - 1 parameter
		public void printParam(char ch)
		    {
		System.out.println(ch);
		    }
		    //overloaded method - 2 parameters
		    public void printParam(char ch, int num)  
		    {
		System.out.println("Character: " + ch + " ; "+ "Number:" +num);
		    }
		
	}

