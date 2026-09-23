package org.ritik.security;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Descryption {

	public void descryptfile(String path) {

		FileInputStream read_filestream = null;
		FileOutputStream write_filestream = null;

		int key = 8;

		try {

			File file_path = new File(path);

			// File exists or not
			if (file_path.exists())
				System.out.println("Input file is present.");
			else {
				System.out.println("Input file does not exist. Creating a new file.");
				file_path.createNewFile();
			}

			// Read data
			read_filestream = new FileInputStream(file_path);

			byte[] arrInput = read_filestream.readAllBytes();

			// Decrypt data
			for (int iTmp = 0; iTmp < arrInput.length; iTmp++) {
				arrInput[iTmp] = (byte) (arrInput[iTmp] - key);
			}

			// Decrypt file
			String fileName = file_path.getName();
			String newFileName = fileName.replace("_enc.txt", "_dec.txt");
			File descrypt_file = new File(file_path.getParent(),newFileName);

			if (descrypt_file.exists())
				System.out.println("Decrypted file is already present.");
			else {
				System.out.println("Decrypted file does not exist. Creating a new file.");
				descrypt_file.createNewFile();
			}

			// Store decrypted file
			write_filestream = new FileOutputStream(descrypt_file);
			write_filestream.write(arrInput);

			System.out.println("Decrypted file created successfully.");

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (read_filestream != null || write_filestream != null)
					read_filestream.close();

				write_filestream.close();

			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}
}