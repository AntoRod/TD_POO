package tests;

import datas.*;

public class TestPhonebook {
	public static void main(String[] args) {
		Phonebook phonebook = new Phonebook(20);
		System.out.print(phonebook);
		phonebook.addContact(new Contact("Duran", "Kevin","0923456789", "0654985623", "Kevin-Duran@test.fr"));
		phonebook.addContact(new Contact("Dupont", "Pierre", "0987654321", "0452169853","Pierre-Dupont@test.fr"));
		phonebook.addContact(new Contact("Truc", "Vincent", "0691564020", "0965123658","Vincent-Truc@test.fr"));
		System.out.print(phonebook);
		Boolean search = phonebook.searchByName("Duran");
		System.out.println(search);
		search = phonebook.searchByName("Krousti");
		System.out.println(search);
		search = phonebook.searchByNumber("0923456789");
		System.out.println(search);
		search = phonebook.searchByNumber("0123056886");
		System.out.println(search);
	}
}
