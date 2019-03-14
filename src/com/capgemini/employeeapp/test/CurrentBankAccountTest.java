package com.capgemini.employeeapp.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.capgemini.employeeapp.model.CurrentBankAccount;

class CurrentBankAccountTest {

	@Test
	public void testWithdrawAmountForCurrentAccountSufficeantBalance() {
		CurrentBankAccount account = new CurrentBankAccount(102, "John Doe", 45000, 20000);
		assertEquals(30000, account.withdraw(15000));
	}
	
	@Test
	public void testWithdrawAmountForCurrentAccountInSufficeantBalanceUsingDebitAmount() {
		CurrentBankAccount account = new CurrentBankAccount(102, "John Doe", 45000, 20000);
		assertEquals(0, account.withdraw(50000));
		assertEquals(5000,account.getBorrowedAmount());
	}
	
	@Test
	public void testWithdrawAmountForCurrentAccountInSufficeantBalanceUsingDebitAmountExceed() {
		CurrentBankAccount account = new CurrentBankAccount(102, "John Doe", 45000, 20000);
		account.withdraw(50000);
		assertEquals(0, account.withdraw(20000));
	}
	
	@Test
	public void testDepositCurrentAccountWithZeroDebitAmount() {
		CurrentBankAccount account = new CurrentBankAccount(102, "John Doe", 45000, 20000);
		assertEquals(50000, account.deposit(5000));
	}
	
	@Test
	public void testDepositCurrentAccountWithSomeDebitAmount() {
		CurrentBankAccount account = new CurrentBankAccount(102, "John Doe", 45000, 20000);
		account.withdraw(50000);
		assertEquals(1000, account.deposit(6000));
	}
	
	@Test
	public void testDepositCurrentAccountWithDebitAmountExceed() {
		CurrentBankAccount account = new CurrentBankAccount(102, "John Doe", 30000, 20000);
		account.withdraw(50000);
		assertEquals(0, account.deposit(6000));
	}
}
