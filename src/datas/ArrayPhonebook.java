package datas;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayPhonebook implements Phonebook_Interface{
	
	private ArrayList<Contact> phonebook;
	
	public ArrayPhonebook() {
		phonebook = new ArrayList<Contact>();
	}
	public Contact getContact(int indice) {
		return phonebook.get(indice);
	}
	public ArrayList<Contact> getPhoneBook() {
		return phonebook;
	}
	/* DEVENU INUTILE
	private void setContact(int indice, Contact newContact) {
		phonebook.add(indice, newContact);
	}
	*/
	public void addContact(Contact newContact) {
		phonebook.add(newContact);
	}
	public void addContact(String name, String number, String mail) {
		addContact(new Contact(name, number, mail));
	}
	
	public Boolean searchByName(String name) {
		Iterator<Contact> iterator = phonebook.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().getName().equals(name)) return true;
		}
		return false;
	}
	public Boolean searchByNumber(String number) {
		Iterator<Contact> iterator = phonebook.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().getPhone().equals(number)) return true;
		}
		return false;
	}
	
	public String toString() {
		String string = "Phonebook (ArrayList): \n";
		Iterator<Contact> iterator = phonebook.iterator();
		while(iterator.hasNext()) {
			string+= "{"+iterator.next().toString()+"}";
		}
		string+="\n";
		return string;
	}

}
