package com.senac.login.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.senac.login.Account;
import com.senac.login.AccountRepository;
import com.senac.login.LoginService;

import static org.mockito.Mockito.*;

public class LoginServiceTeste {
	
	private Account account;
	private AccountRepository accountDB;
	private LoginService service;
	
	@Before
	public void setup(){
		//Preparar ambiente de teste
		account = mock(Account.class);
				
		accountDB = mock(AccountRepository.class);
		when(accountDB.find(anyString())).thenReturn(account);
		service = new LoginService(accountDB);

	}
	
	private void setPasswordMatches(boolean matches){
		when(account.passwordMatches(anyString())).thenReturn(matches);
	}

	@Test
	public void testUsuarioAcessaSistemaQuandoSenhaEstaCorreta() {	
		//Prepara ambiente
		setPasswordMatches(true);
		//Executa operacoes
		service.login("steve", "SenhaCorreta");
		//Verificar resultado do teste
		verify(account, times(1)).setLoggedIn(true);
	}
	
	@Test
	public void testContaDeveSerBloqueadaDepoisDeTresLoginsErrados(){
		//Prepara ambiente
		setPasswordMatches(false);
		//Executa operacoes
		for(int i=0; i<3; i++)
			service.login("steve", "SenhaErrada");
		//Verifica resultado
		verify(account, times(1)).setBlocked(true);
	}
	
	@Test
	public void testLoginFalhaComSenhaErrada(){
		//Preparar ambiente
		setPasswordMatches(false);
		//Executa operacoes
		service.login("steve", "SenhaErrada");
		//Verifica resultado
		verify(account, never()).setLoggedIn(true);
	}
	
	@Test
	public void testAposDoisLoginsErradosDeUmaContaNaoDeveBloquearOutraContaDevidoAoLoginErrado(){
		setPasswordMatches(false);
		Account secondAccount = mock(Account.class);
		when(secondAccount.passwordMatches(anyString())).thenReturn(false);
		when(accountDB.find("jhon")).thenReturn(secondAccount);
		
		service.login("steve", "SenhaErrada");
		service.login("steve", "SenhaErrada");
		service.login("jhon", "SenhaErrada");
		
		verify(secondAccount, never()).setBlocked(true);	
	}
	
	@Test(expected = AccountLoginLimitReachedException.class)
	public void testNaoPodePermitirLoginDeUsuarioLogado(){
		setPasswordMatches(true);
		when(account.isLoggedIn()).thenReturn(true);
		service.login("steve", "SenhaCorreta");
	}

}
