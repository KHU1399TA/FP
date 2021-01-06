package main;

import utils.FileManager;

public class Example {
	public static void main(String[] args) {
		FileManager fileManager = new FileManager("src/resources/data.txt");
		
		fileManager.write("This is a simple test!", false);
		
		String content = fileManager.read();
		System.out.println("Content: " + content);
	}
}
