package com.Aurionpro.Isp.Solution.Test;

import com.Aurionpro.Isp.Solution.Model.IWorkable;
import com.Aurionpro.Isp.Solution.Model.Labour;
import com.Aurionpro.Isp.Solution.Model.Robot;

public class WorkerTest {
	public static void main(String[] args) {
		Labour labour = new Labour();
		labour.startWork();
		labour.drink();
		labour.eat();
		
		IWorkable robot = new Robot();
//		robot.drink();
		robot.stopWork();
		robot.stopWork();
	}
}
