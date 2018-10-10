package tests;

import datas.*;

public interface TestArrayPhonebook_Interface {
	public static void main(String[] args) {
		Phonebook_Interface arrayPhonebook = new ArrayPhonebook();
		System.out.print(arrayPhonebook);
		arrayPhonebook.addContact(new Contact("Jean","0123456789","Jean@test.fr"));
		arrayPhonebook.addContact(new Contact("Kevin","0987654321","Kevin@test.fr"));
		arrayPhonebook.addContact(new Contact("Pierre","0691564020","Pierre@test.fr"));
		System.out.print(arrayPhonebook);
		Boolean search = arrayPhonebook.searchByName("Jean");
		System.out.println(search);
		search = arrayPhonebook.searchByName("Jeannine");
		System.out.println(search);
		search = arrayPhonebook.searchByNumber("0123456789");
		System.out.println(search);
		search = arrayPhonebook.searchByNumber("0123056886");
		System.out.println(search);
	}
}
