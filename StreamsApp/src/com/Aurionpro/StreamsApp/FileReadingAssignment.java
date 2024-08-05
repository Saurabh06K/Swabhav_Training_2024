package com.Aurionpro.StreamsApp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingAssignment {
	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
		int charCount = 0;
		int wordCount = 0;
		int lineCount = 0;

		try {
			br = new BufferedReader(
					new FileReader("D:\\AURIONPRO\\StreamsApp\\src\\com\\Aurionpro\\StreamsApp\\myFile"));
			String line = "";

			while ((line = br.readLine()) != null) {
				lineCount++;
				charCount += line.length();
				wordCount += line.split("\\s+").length;
			}

			System.out.println("Character count is: " + charCount);
			System.out.println("Word count is: " + wordCount);
			System.out.println("Lines count is: " + lineCount);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (br != null) {
			br.close();
		}
	}
}
