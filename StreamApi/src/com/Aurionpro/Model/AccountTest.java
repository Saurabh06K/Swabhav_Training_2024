package com.Aurionpro.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AccountTest {
	public static void main(String[] args) {
		List<Account> accounts = new ArrayList<Account>();
		accounts.add(new Account(1234, "Saurabh", 5000));
		accounts.add(new Account(4534, "Rohit", 50000));
		accounts.add(new Account(6785, "Virat", 120000));

		accounts.stream().forEach((account) -> System.out.println(account));

		System.out.println("Accounts with Maximum balance: ");
		Optional<Account> maxBalanceAccount = accounts.stream()
				.max((number1, number2) -> (int) (number1.getBalance() - number2.getBalance()));
		if (maxBalanceAccount.isPresent())
			System.out.println(maxBalanceAccount.get());

		System.out.println("Accounts with Minimum balance: ");
		Optional<Account> minBalanceAccount = accounts.stream()
				.min((number1, number2) -> (int) (number1.getBalance() - number2.getBalance()));
		if (minBalanceAccount.isPresent())
			System.out.println(minBalanceAccount.get());

		System.out.println("Names greater then 6 characters: ");
		List<Account> accountsWithSixCharacters = accounts.stream()
				.filter((account) -> (account.getName().length() >= 6)).collect(Collectors.toList());
		System.out.println(accountsWithSixCharacters);

		System.out.println("Sum of balances: ");
		Double sum = accounts.stream().map((account) -> (account.getBalance())).reduce(0.0,
				(balance1, balance2) -> (balance1 + balance2));

		System.out.println("The sum is: " + sum);
	}
}
