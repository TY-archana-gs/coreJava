package com.tyy.assignment;

public class ThisClass {
	
		String name="Archna";
		int a=23;
		String adress="Hassan";
		public ThisClass(String name, int a, String adress) {
			super();
			this.name = name;
			this.a = a;
			this.adress = adress;
		}
		public void show() {
			System.out.println(name);
			System.out.println(a);
            System.out.println(adress);

			
		}
			public static void main(String[] args) {
				
				ThisClass clas=new ThisClass("Archna", 23, "Hassan");
				clas.show();
				System.out.println();
			}	
	}


