
//Name:				Abdul Ghaffar kalhoro
//Reg_No:			194699
//Class:			BSCS-6C
//Lab #3_Task1.


public class TestRectangle {

	public static void main(String args[]){
		
		Rectangle object1 = new Rectangle(4,40);
		Rectangle object2 = new Rectangle(3.5,35.9);
		
		System.out.println("For object one:");
		System.out.println("Width =  " + object1.width);
		System.out.println("Height =  " + object1.height);
		System.out.printf("Area = %.2f\nperimeter = %.2f\n",object1.getArea(),object1.getPerimeter());
		
		System.out.println("************");
		System.out.println("For object two:");
		System.out.println("Width =  " + object2.width);
		System.out.println("Height =  " + object2.height);
		System.out.printf("Area = %.2f\nperimeter = %.2f",object2.getArea(),object2.getPerimeter());
		
		
	}
}
