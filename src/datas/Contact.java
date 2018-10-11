package datas;

public class Contact {
	
	private String name;
	private String firstName;
	private String phone;
	private String homePhone;
	private String mail;

	/*CONSTRUCTEURS*/
	public Contact() {
		this(null, null, null, null, null);
	}
	public Contact(String startName, String startFirstName, String startPhone, String startHomePhone, String startMail) {
		setName(startName);
		setFirstName(startFirstName);
		setPhone(startPhone);
		setHomePhone(startHomePhone);
		setMail(startMail);
	}
	/*FIN CONSTRUCTEURS*/
	/*GETTERS*/
	public String getName() {
		return name;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getPhone() {
		return phone;
	}
	public String getHomePhone() {
		return homePhone;
	}
	public String getMail() {
		return mail;
	}
	/*FIN GETTERS*/
	/*SETTERS*/
	public void setName(String newName) {
		name = newName;
	}
	public void setFirstName(String newFirstName) {
		firstName = newFirstName;
	}
	public void setPhone(String newPhone) {
		if(newPhone.startsWith("0") && newPhone.length() == 10) phone = newPhone;
		else System.out.println("Wrong phone number\n");
	}
	public void setHomePhone(String newHomePhone) {
		if(newHomePhone.startsWith("0") && newHomePhone.length() == 10) homePhone = newHomePhone;
		else System.out.println("Wrong phone number\n");
	}
	public void setMail(String newMail) {
		mail = newMail;
	}
	/*FIN SETTERS*/
	/*MUTATEURS*/
	public String toString() {
		return "Name: "+getName()+", First Name: "+getFirstName()+", Phone: "+getPhone()+", Home Phone: "+getHomePhone()+", Mail: "+getMail();
	}
	/*FIN MUTATEURS*/
	
}
