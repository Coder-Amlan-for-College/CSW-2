package Assignment_5;

import java.io.File;
import java.io.IOException;

public class H12 {
	public static void main(String[] args) {
		String directoryPath = "src";
		File directory = new File(directoryPath);
		try {
			if (!directory.exists()) {
				throw new IOException("Directory does not exist");
			}
			listAll(directory);
		} catch (IOException e) {
			// TODO: handle exception
			System.err.println(e);
		}
	}

	public static void listAll(File dir) {
		File[] files = dir.listFiles();
		if (files != null) {
			for (File file : files) {
				if (file.isDirectory()) {
					System.out.println(file.getName());
					listAll(file);
				} else {
					System.out.println(file.getName());
				}
			}
		}

	}
}
