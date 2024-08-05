package com.Aurionpro.Model;

public class RunnableThread implements Runnable {
	private Thread thread;

	public RunnableThread(String name) {
		super();
		thread = new Thread(this, name);
		thread.start();
	}

	@Override
	public void run() {
		for (int i = 5; i > 0; i--) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException exception) {
				System.out.println(exception);
			}
		}
	}
}
