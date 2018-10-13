package datas;

import java.util.NoSuchElementException;

public interface Phonebook_Interface {
	
	public void addContact(Contact addContact) throws ElementAlreadyExistsException;
	public void addContact(String name, String firstName, String number, String homeNumber, String mail) throws ElementAlreadyExistsException;
	public Boolean searchFullName(String name, String firstName) throws NoSuchElementException;
	public Boolean searchByName(String name) throws NoSuchElementException;
	public Boolean searchByFirstName(String firstName) throws NoSuchElementException;
	public Boolean searchByNumber(String number) throws NoSuchElementException;
	
	
}
