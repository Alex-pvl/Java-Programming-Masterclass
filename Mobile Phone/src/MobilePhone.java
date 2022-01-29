import java.util.ArrayList;
import java.util.Objects;

public class MobilePhone {
	private String myNumber;
	private ArrayList<Contact> myContacts;

	public MobilePhone(String myNumber) {
		this.myNumber = myNumber;
		this.myContacts = new ArrayList<>();
	}

	public boolean addNewContact(Contact contact) {
		if (findContact(contact.getName()) == -1) {
			myContacts.add(contact);
			return true;
		} else {
			return false;
		}
	}

	public boolean updateContact(Contact oldContact, Contact newContact) {
		if (findContact(oldContact) != -1) {
			int id = findContact(oldContact);
			myContacts.remove(id);
			myContacts.add(id, newContact);
			return true;
		} else {
			return false;
		}
	}

	public boolean removeContact(Contact contact) {
		if (findContact(contact) != -1) {
			myContacts.remove(contact);
			return true;
		} else {
			return false;
		}
	}

	private int findContact(Contact contact) {
		if (myContacts.contains(contact)) {
			return myContacts.indexOf(contact);
		} else {
			return -1;
		}
	}

	private int findContact(String name) {
		for (int i = 0; i < myContacts.size(); i++) {
			if (Objects.equals(myContacts.get(i).getName(), name)) {
				return i;
			}
		}
		return -1;
	}

	public Contact queryContact(String name) {
		for (Contact myContact : myContacts) {
			if (Objects.equals(myContact.getName(), name)) {
				return myContact;
			}
		}
		return null;
	}

	public void printContacts() {
		System.out.println("Contact List:");
		for (Contact contact :
				myContacts) {
			System.out.println((myContacts.indexOf(contact) + 1) + ". " +
					contact.getName() + " -> " + contact.getPhoneNumber());
		}
	}
}
