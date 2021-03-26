package com.tyy.casting;

public class MainClass {
	public static void main(String[] args) {
		
		//UP-CASTING
		Demo sup=new Sample();
		
		sup.show();
		
		//Sample sam=(Sample) new Demo();
		
		
		//DOWN-CASTING
		
		Sample sam=(Sample)sup;
		sam.display();
		sam.show();
		
		//Sample su=(Sample) new Demo();
		
	}

}
