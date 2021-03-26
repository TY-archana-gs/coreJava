package com.tyy.abstractasgn;

public class Saving extends Account{

	@Override
	public boolean deposite(int amnt) {
		if(amnt>0) {
			bal=bal+amnt;
			return true;
		}
		return false;
	}

	@Override
	public boolean withdraw(int amnt) {
		if(amnt>0 && amnt<bal) {
			
			bal=bal-amnt;
			return true;
		}
		return false;
	}

}
