package com.Aurionpro.Isp.Violation.Test;

import com.Aurionpro.Isp.Violation.Model.IWorker;
import com.Aurionpro.Isp.Violation.Model.Labour;
import com.Aurionpro.Isp.Violation.Model.Robot;

public class WorkerTest {
	public static void main(String[] args) {
		IWorker labour = new Labour();
		labour.startWork();
		labour.drink();
		labour.eat();
		
		IWorker robot = new Robot();
		robot.drink();
		robot.stopWork();
	}
}
