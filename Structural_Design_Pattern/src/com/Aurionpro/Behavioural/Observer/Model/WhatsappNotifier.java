package com.Aurionpro.Behavioural.Observer.Model;

public class WhatsappNotifier implements INotifier {

	@Override
	public void notify(Account account) {
		System.out.println("Whatsapp Notifier -> Current Balance is: "+account.getBalance());
	}

}
