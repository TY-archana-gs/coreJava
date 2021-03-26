package com.tyy.statics;

public class NonStaticBlock {
	
	int id;
	String name;

	 {
	   id=101;
		System.out.println("this is frst nblock"+id);
	}
	 {
		 name="Archuu";
		System.out.println("this is second nblock"+"="+name);
	}
	 {
		System.out.println("this is third nblock");
	}
    {
		System.out.println("this is fourth nblock");
	}
    public static void main(String[] args) {
          System.out.println("this is main block");

	
	new NonStaticBlock();
	new NonStaticBlock();

	NonStaticBlock n= new NonStaticBlock();
    System.out.println(n.id);
    System.out.println(n.name);

}
	
}
