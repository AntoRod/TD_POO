package tests;

import datas.*;

public interface TestHashPhonebook {
	public static void main(String[] args) {
		Phonebook_Interface hashPhonebook = new HashPhonebook();
		System.out.println(hashPhonebook);
		hashPhonebook.addContact(new Contact("Duran", "Kevin","0923456789", "0654985623", "Kevin-Duran@test.fr"));
		hashPhonebook.addContact(new Contact("Dupont", "Pierre", "0987654321", "0452169853","Pierre-Dupont@test.fr"));
		hashPhonebook.addContact(new Contact("Truc", "Vincent", "0691564020", "0965123658","Vincent-Truc@test.fr"));
		System.out.println(hashPhonebook);
		Boolean search = hashPhonebook.searchByName("Duran");
		System.out.println("Duran, "+search);
		search = hashPhonebook.searchByName("Krousti");
		System.out.println("Krousti, "+search);
		search = hashPhonebook.searchByFirstName("Kevin");
		System.out.println("Kevin, "+search);
		search = hashPhonebook.searchByFirstName("Plouk");
		System.out.println("Pierre, "+search);
		search = hashPhonebook.searchFullName("Truc", "Vincent");
		System.out.println("TRUC VINCENT, "+search);
		search = hashPhonebook.searchByNumber("0923456789");
		System.out.println("0923456789, "+search);
		search = hashPhonebook.searchByNumber("0123056886");
		System.out.println("0123056886, "+search);
	}
}
