import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    public PhoneBook (String phoneBookName){
        this.phoneBookName = phoneBookName;
    }

    public String getPhoneBookName() {
        return phoneBookName;
    }

    private String phoneBookName;
    Map<String,List<Contact>> groupBase = new HashMap<String,List<Contact>>();

    public void addContact (Contact contact){
        List<Contact> defaultContactList = new ArrayList<Contact>();
        defaultContactList.add(contact);
        if (groupBase.containsKey("defaultGroup")){
            groupBase.get("defaultGroup").add(contact);
        }
        else{
            groupBase.put("defaultGroup", defaultContactList );
            groupBase.get("defaultGroup").add(contact);
        }
    }

    public void addContact (Contact contact, String groupName){
        List<Contact> contactList = new ArrayList<Contact>();
        if (groupBase.containsKey(groupName)){
            groupBase.get(groupName).add(contact);
        }
        else{
            groupBase.put(groupName, contactList);
            groupBase.get(groupName).add(contact);
        }
    }

    public void addGroup (String groupName, ArrayList<Contact> contactList){
        groupBase.put(groupName, contactList);
    }

    public void addGroup (String groupName){
        List<Contact> contactList = new ArrayList<Contact>();
        groupBase.put(groupName, contactList);
    }
}
