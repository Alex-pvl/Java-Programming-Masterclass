public class Main {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("89133862930");
        mobilePhone.addNewContact(new Contact("Kirill", "123456"));
        mobilePhone.addNewContact(new Contact("Danil", "324541"));
        mobilePhone.addNewContact(new Contact("Kirill", "152414"));
        mobilePhone.printContacts();
    }
}
