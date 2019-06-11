/*
 	Assignment:
 	Prepaired by:
 	Abdul Ghaffar Kalhoro		(194699)
 	Hamad Nasir		(120312)
  
  */



public class TestSensors {

	public static void main(String args[]){
		
		Sensors sensorObject = new Sensors("DM75-17",true,"19-march-2006","Gujrat");
		Smoke_Sensor SmokeS = new Smoke_Sensor("DM45-18",false,"19-march-2009","Larkana");
		Motion_Sensor MotionS = new Motion_Sensor("DRX-004-4",true,"19-march-2009","Lahore");
		Sound_Sensor SoundS = new Sound_Sensor("HD-50/10",false,"19-march-2009","Karachi");
		
		Alarm alarm= new Alarm();
		Light lightObj= new Light();
		
		
		System.out.println("Source class: \n"+ sensorObject);
		
		System.out.println("Smoke Sensor: \n"+ SmokeS);
	
		System.out.println("Sound Sensor: \n"+ SoundS);
		System.out.println("Motion Sensor: \n"+ MotionS);
		
		//Now if some of the functionality of Sensors true 
		//then the Alarm of the Security System rings.
		//and the lights of the system blinks
		
		if(SmokeS.fireAlarm()){
			alarm.ring();
			lightObj.light();
		}
		
	}
}