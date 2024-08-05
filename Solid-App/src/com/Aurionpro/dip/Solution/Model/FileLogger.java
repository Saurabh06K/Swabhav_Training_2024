package com.Aurionpro.dip.Solution.Model;

public class FileLogger implements ILogger {

	@Override
	public void log(String err) {
		// TODO Auto-generated method stub
		System.out.println("File Logger: "+err);
	}

}
