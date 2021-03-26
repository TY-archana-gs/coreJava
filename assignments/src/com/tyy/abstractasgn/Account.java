package com.tyy.abstractasgn;

public abstract class Account {
	
	 double bal=0.0;
	 abstract public boolean deposite (int amnt);
	 abstract public boolean withdraw (int amnt);
	 public void checkBal() {
		 System.out.println(bal);
	 }

}
