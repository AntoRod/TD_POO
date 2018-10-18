package datas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class HashPhonebook implements Phonebook_Interface{
	
	//ATTRIBUTS
	//3 types de recherche (nom/prénom/numéro) donc 3 HASHMAP !
	private HashMap<String, Contact> namePhonebook;
	private HashMap<String, Contact> firstNamePhonebook;
	private HashMap<String, Contact> numberPhonebook;
	
	/*CONSTRUCTEURS*/
	public HashPhonebook() {
		namePhonebook = new HashMap<String, Contact>();
		numberPhonebook = new HashMap<String, Contact>();
		firstNamePhonebook = new HashMap<String, Contact>();
	}
	/*FIN CONSTRUCTEURS*/
	/*GETTERS*/
	public Contact getContact(String name) {
		return namePhonebook.get(name);
	}
	public HashMap<String, Contact> getPhoneBook() {
		return namePhonebook;
	}
	/*FIN GETTERS*/
	/*PAS DE SETTERS*/
	/*TOSTRING*/
	public String toString() {
		String string = "Phonebook (HashMap): \n";
		//utilisation de la méthode native "values()" qui permet de récupérer les valeurs de la HashMap
		string+=namePhonebook.values();
		string+="\n";
		return string;
	}
	/*FIN TOSTRING*/
	/*AUTRES METHODES*/
	//Ajouter un contact au répertoire
	public void addContact(Contact newContact) {
		//Utilisation de la méthode native "put" dans les 3 HashMap avec comme clé la valeur dépendant du type de HashMap
		//(Nom, Prénom, Numéro)
		namePhonebook.put(newContact.getName(), newContact);
		firstNamePhonebook.put(newContact.getFirstName(), newContact);
		numberPhonebook.put(newContact.getPhone(), newContact);
	}
	//Aouter un contact au répertoire (attribut par attribut)
	public void addContact(String name, String firstName, String number, String homeNumber, String mail) {
		//Utilisation de la méthode addContact en créant le nouveau contact dedans
		addContact(new Contact(name, firstName, number, homeNumber, mail));
	}
	//Rechercher un contact par nom
	public Boolean searchByName(String name) {
		if(namePhonebook.containsKey(name)) return true;
		else return false;
	}
	//Rechercher un contact par numéro
	public Boolean searchByNumber(String number) {
		if(numberPhonebook.containsKey(number)) return true;
		else return false;
	}
	//Rechercher un contact par nom
	public Boolean searchByFirstName(String firstName) {
		if(firstNamePhonebook.containsKey(firstName)) return true;
		else return false;
	}
	//Rechercher un contact par nom et prénom
	public Boolean searchFullName(String name, String firstName) {
		if(searchByName(name) && searchByFirstName(firstName)) return true;
		else return false;
	}
	/*FIN AUTRES METHODES*/
}
