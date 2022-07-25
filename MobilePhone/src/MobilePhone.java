
import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber){
        this.myNumber=myNumber;
        myContacts =new ArrayList<Contact>();
    }
    public void printContacts(){
        System.out.println("Contact List:");
        for(int i = 0; i< myContacts.size(); i++){
            System.out.println(i+1+". "+ myContacts.get(i).getName()+" -> "+ myContacts.get(i).getPhoneNumber());
        }
    }

    public boolean addNewContact(Contact newContact){
        if(findContact(newContact.getName())<0){
            myContacts.add(newContact);
            return true;    //contact added
        } else {
            return false;  //contact already exists;
        }
    }

    public boolean updateContact(Contact oldContact,Contact newContact){
        if(findContact(newContact.getName())>=0) return false;
        int indexOfContact=findContact(oldContact);
        if(indexOfContact>=0){
            myContacts.set(indexOfContact,newContact);
            return true;    //contact modified
        }else{
            return false;   //contacted not modified
        }
    }

    public boolean removeContact(Contact newContact){
        if(findContact(newContact)>=0){
            myContacts.remove(findContact(newContact));
            return true;
        }else {
            return false;
        }
    }

    private int findContact(Contact item){
        return myContacts.indexOf(item);
    }

    private int findContact(String name){
        for(int i = 0; i<this.myContacts.size(); i++){
            if(myContacts.get(i).getName()==name) return i;
        }
        return -1;
    }


    public Contact queryContact(String name){
        int position=findContact(name);
        return myContacts.get(position);
    }

}
