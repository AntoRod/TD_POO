package datas;

public interface Phonebook_Interface {
	
	public void addContact(Contact addContact);
	public void addContact(String name, String number, String mail);
	public Boolean searchByName(String name);
	public Boolean searchByNumber(String number);
	
	
}
