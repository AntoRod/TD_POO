package datas;

public class Phonebook implements Phonebook_Interface{
	
	//ATTRIBUTS
	//Tableau de contact et un nombre max de contact
	private Contact[] phonebook;
	private int maxContact;
	
	/*CONSTRUCTEURS*/
	public Phonebook() {
		this(20);
	}
	public Phonebook(int contactMax) {
		maxContact = contactMax;
		phonebook = new Contact[20];
	}
	/*FIN CONSTRUCTEURS*/
	/*GETTERS*/
	public Contact getContact(int indice) {
		return phonebook[indice];
	}
	public Contact[] getPhoneBook() {
		return phonebook;
	}
	/*FIN GETTERS*/
	/*SETTERS*/
	private void setContact(int indice, Contact newContact) {
		if(indice >= 0 && indice < maxContact) phonebook[indice] = newContact;
	}
	/*FIN SETTERS*/
	/*TOSTRING*/
	public String toString() {
		String string = "Phonebook: \n";
		for(int i=0;i<maxContact;i++) {
			string+="{"+phonebook[i]+"}\n";
		}
		string+="\n";
		return string;
	}
	/*FIN TOSTRING*/
	/*AUTRES METHODES*/
	//Ajouter un contact au r�pertoire
	public void addContact(Contact newContact) {
		int i=0;
		while(phonebook[i] != null) i++;
		setContact(i, newContact);
	}
	//Ajouter un contact au r�pertoire (attribut par attribut)
	public void addContact(String name, String firstName, String number, String homeNumber, String mail) {
		//Utilisation de la m�thode addContact en cr�ant le nouveau contact dedans
		addContact(new Contact(name, firstName, number, homeNumber, mail));
	}
	//Rechercher un contact par nom
	public Boolean searchByName(String name) {
		//Utilisation d'une boucle for pour rechercher dans le tableau
		for(int i=0;i<maxContact;i++) {
			//Si la variable est non nulle
			if(phonebook[i] != null) {
				//Si le contact a le m�me nom, returner vrai
				if(phonebook[i].getName() == name) return true;
				//Ne rien faire sinon
			}
		}
		//Sinon retourner faux
		return false;
	}
	//Rechercher un contact par pr�nom
	public Boolean searchByFirstName(String firstName) {
		//Utilisation d'une boucle for pour rechercher dans le tableau
		for(int i=0;i<maxContact;i++) {
			//Si la variable est non nulle
			if(phonebook[i] != null) {
				//Si le contact a le m�me pr�nom, returner vrai
				if(phonebook[i].getFirstName() == firstName) return true;
				//Ne rien faire sinon
			}
		}
		//Sinon retourner faux
		return false;
	}
	//Rechercher un contact par nom et pr�nom
	public Boolean searchFullName(String name, String firstName) {
		//Utilisation d'une boucle for pour rechercher dans le tableau
		for(int i=0;i<maxContact;i++) {
			//Si la variable est non nulle
			if(phonebook[i] != null) {
				//Si le contact a le m�me pr�nom et nom, returner vrai
				if(phonebook[i].getName() == name) {
					if(phonebook[i].getFirstName() == firstName) return true;
					//Ne rien faire sinon
				}
			}
		}
		//Sinon retourner faux
		return false;
	}
	//Rechercher un contact par num�ro
	public Boolean searchByNumber(String number) {
		//Utilisation d'une boucle for pour rechercher dans le tableau
		for(int i=0;i<maxContact;i++) {
			//Si la variable est non nulle
			if(phonebook[i] != null) {
				//Si le contact a le m�me num�ro, returner vrai
				if(phonebook[i].getPhone() == number) return true;
				//Ne rien faire sinon
			}
		}
		//Sinon retourner faux
		return false;
	}
	/*FIN AUTRES METHODES*/
}
