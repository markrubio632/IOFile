package com.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MainService {
	
	Path path = Paths.get("test.txt");

	File textFile = new File(path.toString());

	Charset charset = Charset.forName("US-ASCII");

	public void FileCreator() {

		String s = "This is just a test for the Writer";

		if (!textFile.exists()) {

			try (BufferedWriter writer = Files.newBufferedWriter(path.toAbsolutePath(), charset)) {

				writer.write(s, 0, s.length());

				System.out.println("the file is created");

			} catch (IOException e) {
				System.err.format("IOException: %s%n", e);
			}
		}
	}

	public void Reader() throws IOException {
		
		try (BufferedReader reader = Files.newBufferedReader(path.toAbsolutePath(), charset)) {
			
			String line = null;
			
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.err.format("IOException: %s%n", e);
		}

	}
	
	public void Writer(String input) {
		
		if (textFile.exists()) {

			try (BufferedWriter writer = Files.newBufferedWriter(path.toAbsolutePath(), charset)) {

				writer.write(input, 0, input.length());

			} catch (IOException e) {
				System.err.format("IOException: %s%n", e);
			}
		}
		else {
			System.out.println("Issue with writing to file");
		}
		
	}


}