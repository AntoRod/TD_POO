package tests;

import datas.*;

public class TestContact {
	public static void main(String[] args) {
		Contact contact = new Contact();
		System.out.println(contact);
		contact.setName("Murphy");
		System.out.println(contact);
		contact.setPhone("0677885456");
		System.out.println(contact);
		contact.setMail("Murphy@gmail.com");
		System.out.println(contact);
	}
}
