
package PhoneSearch;

import java.util.Set;

/**
 *
 * @author Zu
 */
public class Person implements Comparable<Person> {
    private String name;
    private Set<String> phoneNumber;
    private String address;
    
    public Person(String name,Set<String> number){
        this.name = name;
        this.phoneNumber = number;
    }
    public Person (String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    public void addAddress(String address){
        this.address = address;
    }
    

    @Override
    public int compareTo(Person p) {
        if(this.name.equals(p.getName())){
            return 0;
        }else if(this.name.hashCode()< p.getName().hashCode()){
            return -1;
        }else{
            return 1;
        }
    }
}
