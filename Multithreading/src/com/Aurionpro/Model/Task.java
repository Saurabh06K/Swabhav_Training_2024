package com.Aurionpro.Model;

import java.util.concurrent.Callable;

public class Task implements Callable<Integer> {
//
//	@Override
//	public void run() {
//		System.out.println(Thread.currentThread().getName());
//	}

	@Override
	public Integer call() throws Exception {
		return (int) (Math.random() * 1000);
	}

}
