package com.Aurionpro.Model;

public class MyThread extends Thread {

	public MyThread(String name) {
		super(name);
		start();
	}

	public void run() {
		for (int i = 5; i > 0; i--) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException exception) {
				System.out.println(exception);
			}
		}
	}
}
