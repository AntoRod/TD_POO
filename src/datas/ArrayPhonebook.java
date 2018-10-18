package datas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayPhonebook implements Phonebook_Interface{
	
	//ATTRIBUTS
	//Une ArrayList pour stocker les contacts dans le répertoire
	private ArrayList<Contact> phonebook;
	
	/*CONSTRUCTEURS*/
	public ArrayPhonebook() {
		phonebook = new ArrayList<Contact>();
	}
	/*FIN CONSTRUCTEURS*/
	/*GETTERS*/
	public Contact getContact(int indice) {
		return phonebook.get(indice);
	}
	public ArrayList<Contact> getPhoneBook() {
		return phonebook;
	}
	/*FIN GETTERS*/
	/*PAS DE SETTERS*/
	/*TOSTRING*/
	public String toString() {
		///Variable servant de buffer
		String string = "Phonebook (ArrayList): \n";
		//Utilisation d'Iterator (while hasNext: next)
		Iterator<Contact> iterator = phonebook.iterator();
		while(iterator.hasNext()) {
			//Buffering
			string+= iterator.next().toString()+"\n";
		}
		string+="\n";
		return string;
	}
	/*FIN TOSTRING*/
	/*AUTRES METHODES*/
	//Ajouter un contact au répertoire
	public void addContact(Contact newContact) throws ElementAlreadyExistsException {
		//Si le contact n'existe pas, l'ajouter
		if(!exists(newContact)) {
			phonebook.add(newContact);
		}
		//Sinon lancer l'erreur "le contact existe déjà"
		else throw new ElementAlreadyExistsException("Contact "+newContact+" Already Exists\n");
	}
	//Aouter un contact au répertoire (attribut par attribut)
	public void addContact(String name, String firstName, String number, String homeNumber, String mail) throws ElementAlreadyExistsException{
		//Utilisation de la méthode addContact en créant le nouveau contact dedans
		addContact(new Contact(name, firstName, number, homeNumber, mail));
	}
	//Vérifie l'existence d'un contact dans le répertoire
	public Boolean exists(Contact newContact) {
		//Utilisation d'Iterator (while hasNext: next)
		Iterator<Contact> iterator = phonebook.iterator();
		while(iterator.hasNext()) {
			//Si le contact existe, retourner vrai
			if(iterator.next().equals(newContact)) return true;
		}
		//Sinon retourner faux
		return false;
	}
	//Rechercher un contact par nom
	public Boolean searchByName(String name) throws NoSuchElementException {
		Iterator<Contact> iterator = phonebook.iterator();
		//Utilisation d'Iterator (while hasNext: next)
		while(iterator.hasNext()) {
			//Si le contact existe, retourner vrai
			if(iterator.next().getName().equals(name)) return true;
		}
		//Sinon lancer l'exception "le contact n'existe pas"
		throw new NoSuchElementException("There is no "+name+" in the Phonebook");
	}
	//Rechercher un contact par son prénom
	public Boolean searchByFirstName(String firstName) throws NoSuchElementException {
		//Utilisation d'Iterator (while hasNext: next)
		Iterator<Contact> iterator = phonebook.iterator();
		while(iterator.hasNext()) {
			//Si le contact existe, retourner vrai
			if(iterator.next().getFirstName().equals(firstName)) return true;
		}
		//Sinon lancer l'exception "le contact n'existe pas"
		throw new NoSuchElementException("There is no "+firstName+" in the Phonebook");
	}
	//Rechercher un contact par numéro de téléphone
	public Boolean searchByNumber(String number) throws NoSuchElementException {
		//Utilisation d'Iterator (while hasNext: next)
		Iterator<Contact> iterator = phonebook.iterator();
		while(iterator.hasNext()) {
			//Si le contact existe, retourner vrai
			if(iterator.next().getPhone().equals(number)) return true;
		}
		//Sinon lancer l'exception "le contact n'existe pas"
		throw new NoSuchElementException("Number "+number+" is not in the Phonebook");
	}
	//Rechercher un contact par nom + prénom
	public Boolean searchFullName(String name, String firstName) throws NoSuchElementException {
		//Utilisation d'Iterator (while hasNext: next)
		Iterator<Contact> iterator = phonebook.iterator();
		//On stock le contact dans une variable temporaire
		Contact temp;
		while(iterator.hasNext()) {
			//On stock le contact suivant dans la variable
			temp = iterator.next();
			//Si le nom existe, on vérifie le prénom
			if(temp.getName().equals(name)) {
				//Si le prénom est le bon, retourner vrai
				if(temp.getFirstName().equals(firstName)) return true;
			}
		}
		//Sinon lancer l'exception "le contact n'existe pas"
		throw new NoSuchElementException("There is no "+name+ " "+firstName+" in the Phonebook");
	}
	/*FIN AUTRES METHODES*/
}
