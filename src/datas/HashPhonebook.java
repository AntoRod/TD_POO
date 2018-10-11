package datas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class HashPhonebook implements Phonebook_Interface{
	
	//2 types de recherche (nom/numéro) donc 2 HASHMAP !
	private HashMap<String, Contact> namePhonebook;
	private HashMap<String, Contact> numberPhonebook;
	
	public HashPhonebook() {
		namePhonebook = new HashMap<String, Contact>();
		numberPhonebook = new HashMap<String, Contact>();
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
		numberPhonebook.put(newContact.getPhone(), newContact);
	}
	public void addContact(String name, String number, String mail) {
		addContact(new Contact(name, number, mail));
	}
	
	public Boolean searchByName(String name) {
		if(namePhonebook.containsKey(name)) return true;
		else return false;
	}
	public Boolean searchByNumber(String number) {
		if(numberPhonebook.containsKey(number)) return true;
		else return false;
	}
	
	public String toString() {
		String string = "Phonebook (HashMap): \n";
		string+=namePhonebook.values();
		string+="\n";
		return string;
	}
}
