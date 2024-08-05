package com.Aurionpro.StreamsApp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadingTest {
	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream = new FileInputStream(
				"D:\\AURIONPRO\\StreamsApp\\src\\com\\Aurionpro\\StreamsApp\\myFile");

		int ch;
		
		FileOutputStream fileOutputStream = new FileOutputStream("D:\\AURIONPRO\\StreamsApp\\src\\com\\Aurionpro\\StreamsApp\\myFile2");
		while ((ch = fileInputStream.read()) != -1) {
			fileOutputStream.write(ch);
		}
		
		System.out.println("File copied Successfully!");
		fileInputStream.close();
	}
}
