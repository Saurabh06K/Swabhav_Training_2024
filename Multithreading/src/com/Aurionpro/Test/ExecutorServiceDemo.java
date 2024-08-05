package com.Aurionpro.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.Aurionpro.Model.Task;

public class ExecutorServiceDemo {
	public static void main(String[] args) {
		int coreCount = Runtime.getRuntime().availableProcessors();
		System.out.println("Available resources are: " + coreCount);

		// ExecutorService service = Executors.newFixedThreadPool(10);
		ExecutorService service = Executors.newCachedThreadPool();
		for (int i = 0; i < 100; i++) {
			service.execute(new Task());
		}
	}
}
