package tests;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;

import datas.*;
import exception.ElementAlreadyExistsException;
import interfaces.Phonebook_Interface;

public interface TestArrayPhonebook_Interface {
	public static void main(String[] args) {
		try {
			Phonebook_Interface arrayPhonebook = new ArrayPhonebook();
			System.out.print(arrayPhonebook);
			arrayPhonebook.addContact(new Contact("Duran", "Kevin","0923456789", "0654985623", "Kevin-Duran@test.fr"));
			arrayPhonebook.addContact(new Contact("Dupont", "Pierre", "0987654321", "0452169853","Pierre-Dupont@test.fr"));
			arrayPhonebook.addContact(new Contact("Truc", "Vincent", "0691564020", "0965123658","Vincent-Truc@test.fr"));
			//Test AlreadyExistsException
//T			arrayPhonebook.addContact(new Contact("Truc", "Vincent", "0691564020", "0965123658","Vincent-Truc@test.fr"));
			System.out.print(arrayPhonebook);
			Boolean search = arrayPhonebook.searchByName("Duran");
			System.out.println("search name duran: "+ search);
			search = arrayPhonebook.searchByFirstName("Kevin");
			System.out.println("search first kevin: "+ search);
			search = arrayPhonebook.searchFullName("Dupont", "Pierre");
			System.out.println("search full dupont pierre: "+ search);
			search = arrayPhonebook.searchByNumber("0923456789");
			System.out.println("search number 0923456789: "+ search);
			//Test NoSuchElementException
//T			search = arrayPhonebook.searchByNumber("0123056886");
			System.out.println("search number 0123056886: "+ search);
			File file = new File("arrayPhonebook.txt");
			arrayPhonebook.savePhonebookTXT(file);
			FileManagement fileManagement = new FileManagement();
			fileManagement.readFile(file);
			
			arrayPhonebook.backupFromTXT(file);
			System.out.print(arrayPhonebook);
		} catch (NoSuchElementException|ElementAlreadyExistsException e) {e.printStackTrace();} 
			catch (IOException e) {e.printStackTrace();}

	}
}
