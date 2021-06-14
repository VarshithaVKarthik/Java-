package com.hdfc.loans.personolloans;

public class LightSpeed {
     double lightspeed=186000;
     double days=1000;
     double seconds;
     double distance;
     public void light()
     {
    	 seconds=days * 24 * 60 * 60;
    	 distance=lightspeed * seconds;
    	 System.out.println("In " + days + "light will travel about" + distance + "miles");
     }
	public static void main(String[] args) {
		LightSpeed lg=new LightSpeed();
		lg.light();

	}

}
 