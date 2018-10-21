package datas;

import java.io.*;
import java.util.*;

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
	//Sauvegarde des contacts dans un fichier TXT
	public void savePhonebookTXT() throws IOException;
	//Sauvegarde des contacts dans un fichier TXT en spécifiant son nom
	public void savePhonebookTXT(String filename) throws IOException;
	//Sauvegarde des contacts dans un fichier TXT spécifique
	public void savePhonebookTXT(File file)throws IOException;
	//Récupération des contacts à partir d'un fichier TXT
	public void backupFromTXT() throws IOException;
	//Récupération des contacts à partir d'un fichier TXT en spécifiant son nom
	public void backupFromTXT(String fileName) throws IOException;
	//Récupération des contacts à partir d'un fichier TXT spécifique
	public void backupFromTXT(File file) throws IOException;
}
