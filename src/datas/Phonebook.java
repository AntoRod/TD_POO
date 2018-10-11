package datas;

public class Phonebook {
	
	private Contact[] phonebook;
	private int maxContact;
	
	public Phonebook() {
		this(20);
	}
	public Phonebook(int contactMax) {
		maxContact = contactMax;
		phonebook = new Contact[20];
	}
	
	public Contact getContact(int indice) {
		return phonebook[indice];
	}
	public Contact[] getPhoneBook() {
		return phonebook;
	}
	
	private void setContact(int indice, Contact newContact) {
		if(indice >= 0 && indice < maxContact) phonebook[indice] = newContact;
	}
	public void addContact(Contact newContact) {
		int i=0;
		while(phonebook[i] != null) i++;
		setContact(i, newContact);
	}
	public void addContact(String name, String firstName, String number, String homeNumber, String mail) {
		addContact(new Contact(name, firstName, number, homeNumber, mail));
	}
	
	public Boolean searchByName(String name) {
		for(int i=0;i<maxContact;i++) {
			if(phonebook[i] != null) {
				if(phonebook[i].getName() == name) return true;
			}
		}
		return false;
	}
	public Boolean searchByNumber(String number) {
		for(int i=0;i<maxContact;i++) {
			if(phonebook[i] != null) {
				if(phonebook[i].getPhone() == number) return true;
			}
		}
		return false;
	}
	
	
	public String toString() {
		String string = "Phonebook: \n";
		for(int i=0;i<maxContact;i++) {
			string+="{"+phonebook[i]+"}\n";
		}
		string+="\n";
		return string;
	}

}
