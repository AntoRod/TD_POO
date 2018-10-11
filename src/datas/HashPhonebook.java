package datas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class HashPhonebook implements Phonebook_Interface{
	
	//3 types de recherche (nom/numéro) donc 3 HASHMAP !
	private HashMap<String, Contact> namePhonebook;
	private HashMap<String, Contact> firstNamePhonebook;
	private HashMap<String, Contact> numberPhonebook;
	
	public HashPhonebook() {
		namePhonebook = new HashMap<String, Contact>();
		numberPhonebook = new HashMap<String, Contact>();
		firstNamePhonebook = new HashMap<String, Contact>();
	}
	public Contact getContact(String name) {
		return namePhonebook.get(name);
	}
	public HashMap<String, Contact> getPhoneBook() {
		return namePhonebook;
	}
	/* DEVENU INUTILE
	private void setContact(int indice, Contact newContact) {
		phonebook.add(indice, newContact);
	}
	*/
	public void addContact(Contact newContact) {
		namePhonebook.put(newContact.getName(), newContact);
		firstNamePhonebook.put(newContact.getFirstName(), newContact);
		numberPhonebook.put(newContact.getPhone(), newContact);
	}
	public void addContact(String name, String firstName, String number, String homeNumber, String mail) {
		addContact(new Contact(name, firstName, number, homeNumber, mail));
	}
	
	public Boolean searchByName(String name) {
		if(namePhonebook.containsKey(name)) return true;
		else return false;
	}
	public Boolean searchByNumber(String number) {
		if(numberPhonebook.containsKey(number)) return true;
		else return false;
	}
	public Boolean searchByFirstName(String firstName) {
		if(firstNamePhonebook.containsKey(firstName)) return true;
		else return false;
	}
	public Boolean searchFullName(String name, String firstName) {
		if(searchByName(name) && searchByFirstName(firstName)) return true;
		else return false;
	}
	
	public String toString() {
		String string = "Phonebook (HashMap): \n";
		string+=namePhonebook.values();
		string+="\n";
		return string;
	}
}
