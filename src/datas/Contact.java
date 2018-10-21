package datas;

public class Contact {
	
	//ATTRIBUTS
	//Contact utilisant 5 String (nom, pr�nom, mail, t�l�phone, t�l�phone fix)
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
		//V�rification de la validit� du num�ro (partielle)
		if(newPhone.startsWith("0") && newPhone.length() == 10) phone = newPhone;
		else System.out.println("Wrong phone number\n");
	}
	public void setHomePhone(String newHomePhone) {
		//V�rification de la validit� du num�ro (partielle)
		if(newHomePhone.startsWith("0") && newHomePhone.length() == 10) homePhone = newHomePhone;
		else System.out.println("Wrong phone number\n");
	}
	public void setMail(String newMail) {
		mail = newMail;
	}
	/*FIN SETTERS*/
	/*TOSTRING*/
	public String toString() {
		return "{Name: "+getName()+", First Name: "+getFirstName()+", Phone: "+getPhone()+", Home Phone: "+getHomePhone()+", Mail: "+getMail()+"}";
	}
	//Tostring avec s�parateur, sert pour le stockage des contacts dans des fichiers
	public String toString(String separator) {
		return getName()+separator+getFirstName()+separator+getPhone()+separator+getHomePhone()+separator+getMail();
	}
	/*FIN TOSTRING*/
	/*AUTRES METHODES*/
	//Red�finition de la m�thode equals (ne prend en compte QUE les attributs, pas les autres informations)
	public Boolean equals(Contact newContact) {
		//Stockage du contact � analyser dans une variable
		Contact contact = newContact;
		//Analyse de chaque attribut un par un
		if(name == contact.getName()) {
			if(firstName == contact.getFirstName()) {
				if(mail == contact.getMail()) {
					if(phone == contact.getPhone()) {
						//Si tout correspond, retourner vrai
						if(homePhone == contact.getHomePhone()) return true;
						//Sinon retourner faux � chaque fois
						else return false;
					}
					else return false;
				}
				else return false;
			}
			else return false;
		}
		else return false;
	}
	/*FIN AUTRES METHODES*/
}
