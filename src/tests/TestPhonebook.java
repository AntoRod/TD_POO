package tests;

import datas.*;

public class TestPhonebook {
	public static void main(String[] args) {
		Phonebook phonebook = new Phonebook(20);
		System.out.print(phonebook);
		phonebook.addContact(new Contact("Jean","0123456789","Jean@test.fr"));
		phonebook.addContact(new Contact("Kevin","0987654321","Kevin@test.fr"));
		phonebook.addContact(new Contact("Pierre","0691564020","Pierre@test.fr"));
		System.out.print(phonebook);
		Boolean search = phonebook.searchByName("Jean");
		System.out.println(search);
		search = phonebook.searchByName("Jeannine");
		System.out.println(search);
		search = phonebook.searchByNumber("0123456789");
		System.out.println(search);
		search = phonebook.searchByNumber("0123056886");
		System.out.println(search);
		System.out.print("--------------------\n");
		ArrayPhonebook arrayPhonebook = new ArrayPhonebook();
		System.out.print(arrayPhonebook);
		arrayPhonebook.addContact(new Contact("Jean","0123456789","Jean@test.fr"));
		arrayPhonebook.addContact(new Contact("Kevin","0987654321","Kevin@test.fr"));
		arrayPhonebook.addContact(new Contact("Pierre","0691564020","Pierre@test.fr"));
		System.out.print(arrayPhonebook);
		search = arrayPhonebook.searchByName("Jean");
		System.out.println(search);
		search = arrayPhonebook.searchByName("Jeannine");
		System.out.println(search);
		search = arrayPhonebook.searchByNumber("0123456789");
		System.out.println(search);
		search = arrayPhonebook.searchByNumber("0123056886");
		System.out.println(search);
	}
}
