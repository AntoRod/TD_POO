package tests;

import java.io.*;

import datas.*;

public class TestFileManagement {

	public static void main(String[] args) {
		FileManagement fileManagement = new FileManagement();
		File file = new File("Relecture.txt");
		if(file.exists()) file.delete();
		String sentences[] = new String[5];
		try {
			for (int i=0;i<5;i++) {
				sentences[i] = new String("Test Relecture "+i+"\r\n");
				fileManagement.writeInFile(file, sentences[i],true);
			}
			System.out.println("File Reading\n");
			fileManagement.readFile(file);
		} catch (FileNotFoundException e) {e.printStackTrace();} 
			catch (IOException e) {e.printStackTrace();}
		
		
	}

}
