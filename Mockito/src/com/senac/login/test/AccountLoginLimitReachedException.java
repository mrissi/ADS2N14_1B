package com.senac.login.test;

public class AccountLoginLimitReachedException extends Exception {
	public AccountLoginLimitReachedException(){
		super("Limite máximo de Login permitido.");
	}

}
