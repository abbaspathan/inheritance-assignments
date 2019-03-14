package com.capgemini.employeeapp.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.capgemini.employeeapp.model.SavingBankAccount;

class SavingBankAccountTest {
	
	
	@Test
	public void testWithdrawSavingBankAccountForSalaryAccountSufficeantAmount() {
		SavingBankAccount account=new SavingBankAccount(101,"John Deo",35000,true);
		assertEquals(25000,account.withdraw(10000));
	}
	
	@Test
	public void testWithdrawSavingBankAccountForSalaryAccountInSufficeantAmount() {
		SavingBankAccount account=new SavingBankAccount(101,"John Deo",35000,true);
		assertEquals(35000,account.withdraw(36000));
	}
	
	@Test
	public void testWithdrawSavingBankAccountForSavingAccountSufficeantAmount() {
		SavingBankAccount account=new SavingBankAccount(101,"John Deo",35000,false);
		assertEquals(15000,account.withdraw(20000));
	}
	
	@Test
	public void testWithdrawSavingBankAccountForSavingAccountInSufficeantAmount() {
		SavingBankAccount account=new SavingBankAccount(101,"John Deo",35000,false);
		assertEquals(35000,account.withdraw(40000));
	}
	
	@Test
	public void testDepositForSavingBabnkAccountInSalaryAccount() {
		SavingBankAccount account=new SavingBankAccount(101,"John Deo",35000,true);
		assertEquals(45000,account.deposit(10000));
	}
}
