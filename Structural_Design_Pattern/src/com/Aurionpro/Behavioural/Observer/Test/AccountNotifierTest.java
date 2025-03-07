package com.Aurionpro.Behavioural.Observer.Test;

import java.util.Scanner;

import com.Aurionpro.Behavioural.Observer.Exceptions.InsufficientFundsException;
import com.Aurionpro.Behavioural.Observer.Model.Account;
import com.Aurionpro.Behavioural.Observer.Model.EmailNotifier;
import com.Aurionpro.Behavioural.Observer.Model.INotifier;
import com.Aurionpro.Behavioural.Observer.Model.SmsNotifier;
import com.Aurionpro.Behavioural.Observer.Model.WhatsappNotifier;

public class AccountNotifierTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Account account = new Account("1234", "Saurabh", 1000);

		int notification = 1;
		while (notification != 4) {
			System.out.println("Choose your notifiers: ");
			System.out.println("1. Sms Notifier \n2. Email Notifier \n3.Whatsapp Notifier \n4.Exit");
			notification = scanner.nextInt();
			if(notification == 1)
				account.registerNotifier(new SmsNotifier());
			if(notification == 2)
				account.registerNotifier(new EmailNotifier());
			if(notification == 3)
				account.registerNotifier(new WhatsappNotifier());
		}
		try {
			System.out.println("Enter amount to be deposited: ");
			double depositAmount = scanner.nextDouble();
			account.deposit(depositAmount);
			System.out.println("Enter amount to be withdrawn: ");
			double withdrawAmount = scanner.nextDouble();
			account.withdraw(withdrawAmount);
		} catch (InsufficientFundsException e) {
			System.out.println(e.getMessage());
			for(INotifier notifyException : account.getNotifiers()) {
			     notifyException.notify(account);
			}
		}

	}
}
