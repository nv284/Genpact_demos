package com.org.gen.day3;
class Car1{
	String carName; String carType;

	
	public Car1(String carName, String carType) {
	
		this.carName = carName;
		this.carType = carType;
	}
	private String getCarName() {
		return this.carName;
	}
	//inner class 
	class Engin{
		String enginType;
		void setEngin() {
			//access the cartype of car 
			if(Car1.this.carType.equals("4WD")) {
				//invoking method getcarName()of car 
				if(Car1.this.getCarName().equals("Crysler")) {
					this.enginType="Smaller" ;
				}else {
					this.enginType ="Bigger";
				}
			}else {
				this.enginType ="Bigger";
			}
			
		}String getEnginType() {
			return this.enginType;
		}
	}
}
public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Car1 car = new Car1("Mazda" ,"8WD");
      Car1.Engin eng = car.new Engin();
      eng.setEngin();
      System.out.println(" Engine type for 8WD = "+eng.getEnginType());
      
      Car1 c = new  Car1("Crysler", "4WD");
      Car1.Engin en = c.new Engin();
      en.setEngin();
      System.out.println(" Engin type for 4wd "+ en.getEnginType());
	}

}
