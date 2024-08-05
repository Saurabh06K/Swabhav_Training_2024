package com.Aurionpro.Test;

import com.Aurionpro.Model.Task;

public class TaskDemo {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(new Task());
			thread.start();
		}
	}
}
