//Name:				Abdul Ghaffar kalhoro
//Reg_No:			194699
//Class:			BSCS-6C
//Lab #3_Task3. 


 public class Task_3 {
	 int year;
	 int month;
	 int day;

 public Task_3(int y , int m , int d){
	 if(y>=0){
		 year = y;		//year condition
	 }
	 else{
		 year = 1998;
	 }
	 if(m>0 && m<=12){
		 month = m;			//month condition
	 }
	 else{ 
		 month = 8;
	 }
	 if(d>0 && d<=30){
		 day = d;			//day condition
	 }
	 else {
		 day = 1;
	 }
 	}

 public int getYear(){
	 return year;
 }
 public void setYear(int y){
	 if(y>=0){
		 year = y;
	 }
	 else{
		 year = 1998;
	 }
 	}
 public int getMonth(){
	 return month;
 }

 public void setMonth(int m){
	 if(m>0 && m<=12){
		 month = m;
	 }
	 else{
		 month = 8;
	 }
 }
 public int getDay(){
	 return day;
 }
 public void setDay(int d){
	 if(d>0 && d<=30){
		 day = d;
	 }
	 else {
		 day = 1;
	 }
 }
 public void displayDate(){
	 System.out.printf("%d/%d/%d\n",day,month,year);
 	}
 }
