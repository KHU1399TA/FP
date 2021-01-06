package main;

import utils.FileManager;

public class Example {
	public static void main(String[] args) {
		FileManager fileManager = new FileManager("src/resources/data.txt");
		
		fileManager.write("Reza\n", true);
		
		String content = fileManager.read();
		System.out.println("Content: " + content);
	}
}
