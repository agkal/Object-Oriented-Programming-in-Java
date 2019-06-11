//Name:				Abdul Ghaffar kalhoro
//Reg_No:			194699
//Class:			BSCS-6C
//Lab #3_Task1.


public class Rectangle {

	//data fields
	/*the width of the rectangle*/
	double width=1.0;
	/*The height of the rectangle*/
	double height=1.0;
	
	
	//constructors
	/* Construct a rectangle object */
	Rectangle(){
	}
	/* Construct a rectangle object */
Rectangle(double length, double high){
	width = length;
	height = high;
}
	
	//methods
	/* Return the area of this rectangle */
	double getArea(){
		
		return width*height;
	}
	/* Return the perimeter of this rectangle */
	double getPerimeter(){
	
		return 2*(width+height);
	}
	
	
}
