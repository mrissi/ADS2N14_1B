package com.senac.login;

public interface Account {

	boolean passwordMatches(String candidatePassword);

	void setLoggedIn(boolean logged);

	void setBlocked(boolean blocked);

	boolean isLoggedIn();


}
