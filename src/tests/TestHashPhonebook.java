package tests;

import datas.*;

public interface TestHashPhonebook {
	public static void main(String[] args) {
		Phonebook_Interface hashPhonebook = new HashPhonebook();
		System.out.println(hashPhonebook);
		hashPhonebook.addContact(new Contact("Jean","0123456789","Jean@test.fr"));
		hashPhonebook.addContact(new Contact("Kevin","0987654321","Kevin@test.fr"));
		hashPhonebook.addContact(new Contact("Pierre","0691564020","Pierre@test.fr"));
		System.out.println(hashPhonebook);
		Boolean search = hashPhonebook.searchByName("Jean");
		System.out.println(search);
		search = hashPhonebook.searchByName("Jeannine");
		System.out.println(search);
		search = hashPhonebook.searchByNumber("0123456789");
		System.out.println(search);
		search = hashPhonebook.searchByNumber("0123056886");
		System.out.println(search);
	}
}
