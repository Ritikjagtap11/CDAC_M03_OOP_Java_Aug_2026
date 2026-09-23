package org.ritik.security;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Encryption {

	public void encryptfile(String path) {

		FileInputStream Input_filestream = null;
		FileOutputStream output_filestream = null;

		int key = 8;

		try {

			File file_path = new File(path);

			// File exists or not
			if (file_path.exists())
				System.out.println("Input file is already present.");
			else {
				System.out.println("Input file does not exist. Creating a new file.");
				file_path.createNewFile();
			}

			// Read data from file
			Input_filestream = new FileInputStream(file_path);

			byte[] arrInput = Input_filestream.readAllBytes();

			// Encrypt data
			for (int iTmp = 0; iTmp < arrInput.length; iTmp++) {
				arrInput[iTmp] = (byte) (arrInput[iTmp] + key);
			}

			// Encrypt data stored in test_enc file
			String fileName = file_path.getName();
			String newFileName = fileName.replace(".txt", "_enc.txt");
			File encrypt_file = new File(file_path.getParent(),newFileName);

			if (encrypt_file.exists())
				System.out.println("Encrypted file is already present.");
			else {
				System.out.println("Encrypted file does not exist. Creating a new file.");
				encrypt_file.createNewFile();
			}

			// Write encrypted data
			output_filestream = new FileOutputStream(encrypt_file);
			output_filestream.write(arrInput);

			System.out.println("Encrypted file created successfully.");

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (Input_filestream != null || output_filestream != null)
					Input_filestream.close();

				output_filestream.close();

			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}
}