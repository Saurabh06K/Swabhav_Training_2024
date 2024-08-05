package com.Aurionpro.StreamsApp;

import java.io.File;
import java.io.IOException;

public class FilePOC {
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\\\AURIONPRO\\\\StreamsApp\\\\src\\\\com\\\\Aurionpro\\\\StreamsApp\\\\myFile");
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.createNewFile());
		System.out.println(file.exists());
		System.out.println(file.length());
		System.out.println(file.getName());
		System.out.println(file.list());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getFreeSpace());
		System.out.println(file.getParent());
		System.out.println(file.isAbsolute());
		System.out.println(file.isHidden());
	}
}
