package com.Aurionpro.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.Aurionpro.Model.Task;

public class CallableDemo {
	public static void main(String[] args) {
		ExecutorService service = Executors.newCachedThreadPool();
		// Future<Integer> future = service.submit(new Task());
		List<Task> tasks = new ArrayList<Task>();
		tasks.add(new Task());
		tasks.add(new Task());
		tasks.add(new Task());
		tasks.add(new Task());
		tasks.add(new Task());

		try {
			// System.out.println(future.get());
			List<Future<Integer>> futures = service.invokeAll(tasks);
			for (Future<Integer> future : futures)
				System.out.println(future.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}
}
