package datas;

public class Contact {
	
	protected String name; //Plus tard: modifier en nom/prénom
	protected String phone;
	protected String mail;

	/*CONSTRUCTEURS*/
	public Contact() {
		this(null, null, null);
	}
	public Contact(String startName, String startPhone, String startMail) {
		setName(startName);
		if(startPhone != null) setPhone(startPhone);
		setMail(startMail);
	}
	/*FIN CONSTRUCTEURS*/
	/*GETTERS*/
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	public String getMail() {
		return mail;
	}
	/*FIN GETTERS*/
	/*SETTERS*/
	public void setName(String newName) {
		name = newName;
	}
	public void setPhone(String newPhone) {
		if(newPhone.startsWith("0") && newPhone.length() == 10) phone = newPhone;
		else System.out.println("Wrong phone number\n");
	}
	public void setMail(String newMail) {
		mail = newMail;
	}
	/*FIN SETTERS*/
	/*MUTATEURS*/
	public String toString() {
		return "Name: "+getName()+", Phone: "+getPhone()+", Mail: "+getMail();
	}
	/*FIN MUTATEURS*/
	
}
