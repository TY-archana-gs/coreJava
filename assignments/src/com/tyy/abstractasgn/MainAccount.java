package com.tyy.abstractasgn;

public class MainAccount {

	public static void main(String[] args) {
           
		Saving sav =new Saving();
		sav.checkBal();
		sav.deposite(200);
		sav.checkBal();
		sav.withdraw(100);
		sav.checkBal();
	}

}
