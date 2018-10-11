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
	public void addContact(String name, String firstName, String number, String homeNumber, String mail) {
		addContact(new Contact(name, firstName, number, homeNumber, mail));
	}
	
	public Boolean searchByName(String name) {
		Iterator<Contact> iterator = phonebook.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().getName().equals(name)) return true;
		}
		return false;
	}
	public Boolean searchByFirstName(String firstName) {
		Iterator<Contact> iterator = phonebook.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().getFirstName().equals(firstName)) return true;
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
	public Boolean searchFullName(String name, String firstName) {
		for(int i=0;i<phonebook.size();i++) {
			if(phonebook.get(i).getName().equals(name)) {
				if(phonebook.get(i).getFirstName().equals(firstName)) return true;
			}
		}
		return false;
	}
	public String toString() {
		String string = "Phonebook (ArrayList): \n";
		Iterator<Contact> iterator = phonebook.iterator();
		while(iterator.hasNext()) {
			string+= "{"+iterator.next().toString()+"}\n";
		}
		string+="\n";
		return string;
	}

}
