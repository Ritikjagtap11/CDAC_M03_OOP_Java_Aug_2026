package org.ritik.security;

import org.ritik.consoleinput.ConsoleInput;

public class main {

	public static void main(String[] args) {

		final int ENCRYPTE_FILE = 1;
		final int DECRYPTE_FILE = 2;
		int choice;

		do {
			System.out.println();
			System.out.println("=================================");
			System.out.println("       FILE SECURITY SYSTEM       ");
			System.out.println("=================================");
			System.out.println("1. Encrypt the file");
			System.out.println("2. Decrypt the file");
			System.out.println("3. Exit");
			System.out.println("=================================");
			System.out.print("Enter your choice: ");

			choice = ConsoleInput.getInt();

			if (choice == ENCRYPTE_FILE) {

				System.out.println();
				System.out.println("Enter the file path (e.g., C:\\Java\\....)");
				String file_path = ConsoleInput.getString();

				Encryption encrypt = new Encryption();

				encrypt.encryptfile(file_path);

				System.out.println("File encryption completed.");

			} else if (choice == DECRYPTE_FILE) {

				System.out.println();
				System.out.println("Enter the file path (e.g., C:\\Java\\....)");
				String file_path = ConsoleInput.getString();

				Descryption descrypt = new Descryption();

				descrypt.descryptfile(file_path);

				System.out.println("File decryption completed.");

			} else if (choice == 3) {

				System.out.println();
				System.out.println("Exiting from the menu...");
				break;

			} else {

				System.out.println();
				System.out.println("Invalid choice. Please enter 1, 2, or 3.");
			}

		} while (choice != 3);
	}
}