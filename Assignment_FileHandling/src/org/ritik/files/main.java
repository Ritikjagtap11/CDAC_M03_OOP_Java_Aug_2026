package org.ritik.files;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file_path = new File("C:\\Java\\CDAC.txt");
		
//		directoryAttribute();
		
//		getFilesList();
		
//		createFile();
		
//		writeToFile(file_path);
		
//		readFromFile(file_path);
		
//		writingData();
	
//		readData(file_path);
		
//		objectWrite(file_path);
		
//		objectRead(file_path);
		
		
		
		
	}

	private static void objectRead(File file_path) {
		FileInputStream filestream = null;
		ObjectInputStream objectstream = null;
		try {
			
			filestream = new FileInputStream(file_path);
			objectstream = new ObjectInputStream(filestream);
			
			Student std = (Student) objectstream.readObject();
			
			System.out.println("Name: " + std.getName());
			System.out.println("Marks: " + std.getMarks());
			System.out.println("Roll_No: " + std.getRoll_no());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void objectWrite(File file_path) {
		FileOutputStream filestream = null;
		ObjectOutputStream objectstream = null;
		try {
		
		filestream = new FileOutputStream(file_path);
		objectstream = new ObjectOutputStream(filestream);
		
		Student std = new Student("Ritik",86,130);
		objectstream.writeObject(std);
		System.out.println("Object serialized successfully");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			
			try {
			if(filestream != null) filestream.close();
			if(objectstream != null) objectstream.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
			
		}
	}

	private static void readData(File file_path) {
		FileInputStream filestream=null;
		DataInputStream datastream=null;
		
		try {
			filestream =  new FileInputStream(file_path);
			datastream = new DataInputStream(filestream);
			
			while(true) {
			String name = datastream.readUTF();
			float salary = datastream.readFloat();
			int age = datastream.readInt();
			char gender = datastream.readChar();
			
			System.out.println(name);
			System.out.println(salary);
			System.out.println(age);
			System.out.println(gender);
			System.out.println("*****************************************");
			}
			
		}catch (EOFException e) {
			System.out.println("End of file reached.");
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		try {
			if(filestream != null)
				filestream.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void writingData(File file_path) {
		FileOutputStream filestream = null;
		DataOutputStream datastream = null;
		
		try {
			filestream = new FileOutputStream(file_path);
			datastream = new DataOutputStream(filestream);
			
			datastream.writeUTF("Manager");
			datastream.writeFloat(50000);
			datastream.writeInt(23);
			datastream.writeChar('M');
			
			System.out.println("Data written");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				if(filestream != null)
					filestream.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static void readFromFile(File file_path) {
		FileInputStream filestream = null;
		try {
			filestream = new FileInputStream(file_path);
			byte[] arrInput = filestream.readAllBytes();
			System.out.println(new String(arrInput));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
				try {
					if(filestream != null)
						filestream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
	}

	private static void writeToFile(File file_path) {
		
		FileOutputStream filestream= null;
		try {
			
			filestream  = new FileOutputStream(file_path,true);
			
			String data = "Welcome to the world of files......\n";
			filestream.write(data.getBytes());
			System.out.println("File written");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Invalid file path provided");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error writing to file, check permissions");
			e.printStackTrace();
		}
		finally {
			try {
				if(filestream != null)
					filestream.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static void createFile() {
		File rootdircetory = new File("C:\\Java\\CDAC.txt");
		
		try {
			if(rootdircetory.exists())
				System.out.println("The file is present");
			else
			{
				System.out.println("File not present,Creating a new one");
				rootdircetory.createNewFile();
				System.out.println("File is created");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void getFilesList() {
		File rootdircetory = new File("C:\\Java");
		String[] allFiles = rootdircetory.list();
		
		for(String file: allFiles)
		{
			System.out.println(file);
		}
	}

	private static void directoryAttribute() {
		File rootdircetory = new File("C:\\Java\\CDAC.txt");
		
		if(rootdircetory.exists())
			System.out.println("The path represent a file");
		else
			System.out.println("The path represent a dircetory ");
	}

}
