package utils;

import java.io.*;
import java.util.stream.Collectors;

public class FileManager {
	public String path;
	
	public FileManager(String path) {
		this.path = path;
	}
	
	public boolean write(String content, boolean append) {
		BufferedWriter writer;
		
		try {
			writer = new BufferedWriter(new FileWriter(path, append));
			writer.write(content);
			writer.close();
			
			return true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public String read() {
		BufferedReader reader;
		
		try {
			reader = new BufferedReader(new FileReader(path));
			String content = reader.lines().collect(Collectors.joining());
			reader.close();
			
			return content;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
