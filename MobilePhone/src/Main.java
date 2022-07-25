public class Main {
    public static void main(String[] args) {

        MobilePhone phone = new MobilePhone("123456789");

        Contact con1=Contact.createContact("John","111222333");
        Contact con2=Contact.createContact("Steve","444555666");
        Contact con3=Contact.createContact("Adam","123321123");
        phone.addNewContact(con1);
        phone.addNewContact(con2);
        phone.updateContact(con2,con1);
        phone.printContacts();

    }


}
