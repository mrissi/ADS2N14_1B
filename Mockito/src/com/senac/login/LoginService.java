package com.senac.login;

public class LoginService {
	
	private AccountRepository accountDB;
	private int failedAttempts = 0;
	private Account previousAccount;

	public LoginService(AccountRepository accountDB) {
		this.accountDB = accountDB;
	}

	public void login(String username, String password) {
		Account account = accountDB.find(username);
		if(account.passwordMatches(password)){
			account.setLoggedIn(true);
		}
		else{
			if(previousAccount != null && previousAccount.equals(account)){
				failedAttempts++;
			}
			else{
				previousAccount = account;
				failedAttempts = 1;
			}
			if(failedAttempts == 3)
				account.setBlocked(true);
		}
	}

}
