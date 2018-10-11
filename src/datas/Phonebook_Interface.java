package datas;

public interface Phonebook_Interface {
	
	public void addContact(Contact addContact);
	public void addContact(String name, String firstName, String number, String homeNumber, String mail);
	public Boolean searchFullName(String name, String firstName);
	public Boolean searchByName(String name);
	public Boolean searchByFirstName(String firstName);
	public Boolean searchByNumber(String number);
	
	
}
