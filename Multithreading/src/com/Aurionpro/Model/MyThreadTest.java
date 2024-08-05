package com.Aurionpro.Model;

public class MyThreadTest {
	public static void main(String[] args) {
		MyThread thread1 = new MyThread("Thread1");
		MyThread thread2 = new MyThread("Thread2");
		MyThread thread3 = new MyThread("Thread3");

		System.out.println(thread1.isAlive());
		System.out.println(thread2.isAlive());
		System.out.println(thread3.isAlive());
		
		thread1.setPriority(10);
		thread2.setPriority(1);
		thread3.setPriority(5);

		for (int i = 5; i > 0; i--) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException exception) {
				System.out.println(exception);
			}

			try {
				thread1.join();
				thread2.join();
				thread3.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println(thread1.isAlive());
		System.out.println(thread2.isAlive());
		System.out.println(thread3.isAlive());
	}
}
