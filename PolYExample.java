package EntityClasses;

public class PolYExample {
	
	
	    public static void main(String[] args) {
	    	Main abc = new Main();  //create a class object
	        abc.addition_func (3,4);        //calls 1st method
	        abc.addition_func ("Hello" , "World!");     //calls 2nd method
	         
	    }
	}
	    class Main{
	//method to add two integers
    void addition_func(int num1,int num2){
      System.out.println("ABC::addition_func:" + (num1+num2));
    }
    //overloaded method to add two strings
    void addition_func(String str1, String str2){
        String result = str1 + " " + str2;
        System.out.println("XYZ::addition_func:" + result);
    }
}
