package com.senac.login.test;

public class AccountLoginLimitReachedException extends Exception {
	public AccountLoginLimitReachedException(){
		super("Limite m�ximo de Login permitido.");
	}

}
