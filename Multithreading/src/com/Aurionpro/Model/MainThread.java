package com.Aurionpro.Model;

public class MainThread {
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println(thread);

		thread.setName("MyThread");
		System.out.println(thread);

		for (int i = 5; i > 0; i--) {
			System.out.println(thread.currentThread().getName() + " : " + i);
			try {
				thread.sleep(2000);
			} catch (InterruptedException exception) {
				exception.printStackTrace();
			}
		}

	}
}
