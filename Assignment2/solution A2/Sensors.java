/*
 	Assignment:
 	Prepaired by:
 	Abdul Ghaffar Kalhoro		(194699)
 	Hamad Nasir		(120312)
  
  */



public class Sensors {

	private String number;
	private boolean state;
	private String dateCreation;
	private String PlaceInstallation;
	
	Sensors(String number,boolean state,String dateCreation,String PlaceInstallation){
		this.number=number;
		this.state = state;
		this.dateCreation=dateCreation;
		this.PlaceInstallation = PlaceInstallation;
	}
	

	public void working(){
		System.out.println("It is working correctely");
	}
	
	
	public void reseting(){
		System.out.println("This will reset functionality.");
	}	
	
	public void sense(){
	//senses different attributes.	
	}
	
	public String toString(){
		return String.format(" number = %s\n State =  %b"
				+ "\n DateCreation = %s\n "
				+ "Place where installed = %s",number,state,dateCreation,PlaceInstallation);
	
}
}


class Smoke_Sensor extends Sensors{
	//it would have some more datafields
	
	Smoke_Sensor(String number,boolean state,String dateCreation,String PlaceInstallation){
		
		super(number, state, dateCreation, PlaceInstallation);
	}
	
	public boolean fireAlarm(){
		return true;
	}
	
	public void callFireBrigade(){
		System.out.println("calls fire bridge");
	}
		public String toString(){
			return String.format("%s",super.toString());
			
		
	}
	
}

class Sound_Sensor extends Sensors{
	//it would have some more datafields
	
	Sound_Sensor(String number,boolean state,String dateCreation,String PlaceInstallation){
		
		super(number, state, dateCreation, PlaceInstallation);
	}
	
	public void CallingPolice(){
		System.out.println("Calls the police");
	}
	public String toString(){
		return String.format("%s",super.toString());
		
	
}
	
	
}
	
	
class Motion_Sensor extends Sensors{
	//it would have some more datafields
		
		Motion_Sensor(String number,boolean state,String dateCreation,String PlaceInstallation){
			
			super(number, state, dateCreation, PlaceInstallation);
		}
		
		public void LockDoors(){
			System.out.println("This would lock the door");
		}
		
		public void AutomaticDetetion(){
			
		}
		public String toString(){
			return String.format("%s",super.toString());
			
		
	}
	
}


class Alarm{
	//it would have some more datafields
	
	public void ring(){
		System.out.println("Ringing the security system's Alarm");
	}
}


class Light{
		//it would have some more datafields
		
		public void light(){
			
			System.out.println("Lights would be ON");
		}
	}
	

	