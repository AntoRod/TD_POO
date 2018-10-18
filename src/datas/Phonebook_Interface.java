package datas;

import java.util.NoSuchElementException;

public interface Phonebook_Interface {
	
	//Ajouter un contact
	public void addContact(Contact addContact) throws ElementAlreadyExistsException;
	//Ajouter un contact (attribut par attribut)
	public void addContact(String name, String firstName, String number, String homeNumber, String mail) throws ElementAlreadyExistsException;
	//Rechercher un contact par nom et prénom
	public Boolean searchFullName(String name, String firstName) throws NoSuchElementException;
	//Rechercher un contact par nom
	public Boolean searchByName(String name) throws NoSuchElementException;
	//Rechercher un contact par prénom
	public Boolean searchByFirstName(String firstName) throws NoSuchElementException;
	//Rechercher un contact par numéro
	public Boolean searchByNumber(String number) throws NoSuchElementException;
}
