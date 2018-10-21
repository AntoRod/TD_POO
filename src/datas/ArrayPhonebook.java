package datas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayPhonebook implements Phonebook_Interface{
	
	//ATTRIBUTS
	//Une ArrayList pour stocker les contacts dans le r�pertoire
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
	//Ajouter un contact au r�pertoire
	public void addContact(Contact newContact) throws ElementAlreadyExistsException {
		//Si le contact n'existe pas, l'ajouter
		if(!exists(newContact)) {
			phonebook.add(newContact);
		}
		//Sinon lancer l'erreur "le contact existe d�j�"
		else throw new ElementAlreadyExistsException("Contact "+newContact+" Already Exists\n");
	}
	//Aouter un contact au r�pertoire (attribut par attribut)
	public void addContact(String name, String firstName, String number, String homeNumber, String mail) throws ElementAlreadyExistsException{
		//Utilisation de la m�thode addContact en cr�ant le nouveau contact dedans
		addContact(new Contact(name, firstName, number, homeNumber, mail));
	}
	//V�rifie l'existence d'un contact dans le r�pertoire
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
	//Rechercher un contact par son pr�nom
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
	//Rechercher un contact par num�ro de t�l�phone
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
	//Rechercher un contact par nom + pr�nom
	public Boolean searchFullName(String name, String firstName) throws NoSuchElementException {
		//Utilisation d'Iterator (while hasNext: next)
		Iterator<Contact> iterator = phonebook.iterator();
		//On stock le contact dans une variable temporaire
		Contact temp;
		while(iterator.hasNext()) {
			//On stock le contact suivant dans la variable
			temp = iterator.next();
			//Si le nom existe, on v�rifie le pr�nom
			if(temp.getName().equals(name)) {
				//Si le pr�nom est le bon, retourner vrai
				if(temp.getFirstName().equals(firstName)) return true;
			}
		}
		//Sinon lancer l'exception "le contact n'existe pas"
		throw new NoSuchElementException("There is no "+name+ " "+firstName+" in the Phonebook");
	}
	//Sauvegarde des contacts dans un fichier TXT
	public void savePhonebookTXT() throws IOException {
		savePhonebookTXT(new File("phonebook.txt"));
	}
	//Sauvegarde des contacts dans un fichier TXT en sp�cifiant son nom
	public void savePhonebookTXT(String fileName) throws IOException {
		savePhonebookTXT(new File(fileName));
	}
	//Sauvegarde des contacts dans un fichier TXT sp�cifique
	public void savePhonebookTXT(File file) throws IOException {
		//On peut pr�ciser qu'on sauvegarde dans un fichier texte
		System.out.println("Saving phonebook in "+file.getName()+"\n");
		//On utilise un BufferedWriter
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		//Si le fichier existe d�j�, on l'overwrite
		if(file.exists()) file.delete();
		//On utilise un iterator pour enregistrer les contacts
		Iterator<Contact> iterator = phonebook.iterator();
		Contact temp;
		while(iterator.hasNext()) {
			//On utilise la m�thode de toString avec s�parateur pour �crire dans le fichier
			temp = iterator.next();
			bw.append(temp.toString(";")+"\r\n");
		}
		//On oublie pas de flush/close le BufferedWriter
		bw.flush();
		bw.close();
	}
	//Permet de supprimer les contacts du r�pertoire
	public void deleteContacts() {
		if(!phonebook.isEmpty()) {
			phonebook.removeAll(phonebook);
			System.out.print("ALL Contacts deleted...\n");
		}
	}
	//R�cup�ration des contacts � partir d'un fichier TXT
	public void backupFromTXT() throws IOException {
		backupFromTXT(new File("arrayPhonebook.txt"));
	}
	//R�cup�ration des contacts � partir d'un fichier TXT en sp�cifiant son nom
	public void backupFromTXT(String fileName) throws IOException {
		backupFromTXT(new File(fileName));
	}
	//R�cup�ration des contacts � partir d'un fichier TXT sp�cifique
	public void backupFromTXT(File file) throws IOException {
		deleteContacts();
		System.out.println("Recovering contacts from a backup file: "+file.getName()+"\n");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = br.readLine();
		while(line != null) {
			String[] s = line.split(";");
			phonebook.add(new Contact(s[0], s[1], s[2], s[3], s[4]));
			line = br.readLine();
		}
		
		br.close();
	}
	/*FIN AUTRES METHODES*/
}
