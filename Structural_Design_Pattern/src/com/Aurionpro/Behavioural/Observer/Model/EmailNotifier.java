package com.Aurionpro.Behavioural.Observer.Model;

public class EmailNotifier implements INotifier {

	@Override
	public void notify(Account account) {
		System.out.println("Email notifier -> Current Balance is: "+ account.getBalance());
	}

}
