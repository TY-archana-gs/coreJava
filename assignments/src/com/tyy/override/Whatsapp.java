package com.tyy.override;

public class Whatsapp {

	public void sendReport() {
		System.out.println("show one tick");
	}
}
	class Whatsapp1 extends Whatsapp{
		
		public void sendReport() {
			
			System.out.println("show two tick");
		}
	}
		class Whatsapp2 extends Whatsapp1 {
			public void sendReport() {
				System.out.println("show three tick");
			}
		}
		
	
    class Main {
    	public static void main(String[] args) {
    		Whatsapp2 su=new Whatsapp2();
    		su.sendReport();
    		
    		Whatsapp1 sub=new Whatsapp1();
    		sub.sendReport();
    		
    		Whatsapp sup=new Whatsapp();
    		sup.sendReport();
    		
		}
    }
    	
	

