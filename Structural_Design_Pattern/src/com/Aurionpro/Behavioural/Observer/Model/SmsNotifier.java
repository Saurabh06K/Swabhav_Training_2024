package com.Aurionpro.Behavioural.Observer.Model;

public class SmsNotifier implements INotifier {

	@Override
	public void notify(Account account) {
		System.out.println("SMS notifier -> Current Balance is: "+ account.getBalance());
	}

}
