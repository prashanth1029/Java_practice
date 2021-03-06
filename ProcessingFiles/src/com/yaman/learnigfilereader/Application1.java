package com.yaman.learnigfilereader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application1 {

	public static void main(String[] args) {

		File file = new File("myFileChanged.txt");
		BufferedReader bufferedReader = null;
		FileReader filereader = null;
		try {
			filereader = new FileReader(file);
			bufferedReader = new BufferedReader(filereader);

			String line = bufferedReader.readLine();

			while (line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		} catch (IOException e) {
			System.out.println("problem reading the file" + file.getName());
		} finally {
// whatever happens whether exception is there are this block will exicute always
			try {
				if(bufferedReader != null) {
					bufferedReader.close();
				}
				if(filereader != null) {
					filereader.close();
				}
			} catch (IOException e) {
				System.out.println("unable to close file" + file.getName());
			}
		}

	}


}
