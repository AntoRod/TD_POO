package datas;

public interface Phonebook_Interface {
	
	public Contact getContact(int indice);
	public void addContact(Contact addContact);
	public void addContact(String name, String number, String mail);
	public Boolean searchByName(String name);
	public Boolean searchByNumber(String number);
	
	
}
