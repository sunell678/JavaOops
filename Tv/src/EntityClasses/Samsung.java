package EntityClasses;

public class Samsung {

	
		// TODO Auto-generated method stub
		String Brand;
		String ModelName;
		Integer Screensize;
		Integer Price;
		String Color;
		String DisplayType;

	void insertData(String B,String Mn,Integer ss,Integer p, String c,String dt) {
		Brand = B;
		ModelName = Mn;
		Screensize = ss;
		Price = p;
		Color = c;
		DisplayType= dt;
	}
	void display() {
		System.out.println(Brand+""+ModelName);
	}
	public static void main(String[] args) {
		Samsung lgOled = new Samsung();
		Samsung samsungFrame = new Samsung();
		lgOled.Brand = "Lg";
		lgOled.ModelName = "4k oled 75' tv";
		lgOled.Screensize = 76;
		lgOled.Price = 344666;
		lgOled.Color = "white";
		lgOled.DisplayType = "OLED";
		samsungFrame.insertData("", "", 98, 10, "kjjj", "");
		samsungFrame.display();
		System.out.println(lgOled.Brand +""+lgOled.ModelName);
		
		
		
		

	}

}

