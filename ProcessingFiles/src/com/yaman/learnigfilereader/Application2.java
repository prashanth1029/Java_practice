package com.yaman.learnigfilereader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application2 {

	public static void main(String[] args) {

		File file = new File("myFileChanged.txt");

		try (FileReader filereader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(filereader);) {

			String line = bufferedReader.readLine();

			while (line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		} catch (IOException e) {
			System.out.println("problem reading the file" + file.getName());
		}

	}
}
