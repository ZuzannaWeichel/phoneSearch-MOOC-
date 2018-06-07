package PhoneSearch;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Collections;
import java.util.TreeSet;

/**
 *
 * @author Zu
 */
public class PhoneSearch {

    private Map<String, Set<String>> phoneNumbers;
    private Map<String, String> addresses;

    public PhoneSearch() {
        this.phoneNumbers = new HashMap<String, Set<String>>();
        this.addresses = new HashMap<String, String>();
    }

    public void addNumber(String name, String number) {
        if (!phoneNumbers.containsKey(name)) {
            phoneNumbers.put(name, new HashSet<String>());
        }
        phoneNumbers.get(name).add(number);
    }

    public Set<String> numberByName(String name) {
        return phoneNumbers.get(name);
    }

    public String nameByNumber(String number) {

        for (String name : phoneNumbers.keySet()) {
            if (phoneNumbers.get(name).contains(number)) {
                return name;
            }
        }
        return null;
    }

    public void addAddress(String name, String address) {
        addresses.put(name, address);
    }

    public String getAddress(String name) {
        return addresses.get(name);
    }

    public void removeInfo(String name) {
        phoneNumbers.remove(name);
        addresses.remove(name);
    }

    public Set<String> phoneKeys() {
       return phoneNumbers.keySet();
    }

    public Set<String> addressKeys() {
        return addresses.keySet();
    }
    
    public Set<String> merger(){
        Set<String>allKeys = new TreeSet<String>();
        for(String name: phoneNumbers.keySet()){
            allKeys.add(name);
        }
        for(String name : addresses.keySet()){
            allKeys.add(name);
        }
        return allKeys;
    }
}
