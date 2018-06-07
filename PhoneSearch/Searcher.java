package PhoneSearch;

import java.util.Scanner;
import PhoneSearch.PhoneSearch;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Zu
 */
public class Searcher {

    private PhoneSearch search;
    private Scanner reader;

    public Searcher(Scanner r) {
        this.search = new PhoneSearch();
        this.reader = r;
    }

    public void start() {
        startMenu();
        command();

    }

    void startMenu() {
        System.out.println("phone search\navailable operations:\n"
                + " 1 add a number\n"
                + " 2 search for a number\n"
                + " 3 search for a person by phone number\n"
                + " 4 add an address\n"
                + " 5 search for personal information\n"
                + " 6 delete personal information\n"
                + " 7 filtered listing\n"
                + " x quit");
    }

    void command() {

        while (true) {
            System.out.print("\ncommand: ");
            String input = reader.nextLine();
            if (input.equals("x")) {
                break;
            }
            commandHendler(input);
        }
    }

    void commandHendler(String input) {
        if (input.equals("1")) {
            System.out.print("whose number: ");
            String inputName = reader.nextLine();
            System.out.print("number: ");
            String number = reader.nextLine();
            search.addNumber(inputName, number);
        }
        if (input.equals("2")) {
            System.out.print("whose number: ");
            String inputName = reader.nextLine();
            if (search.numberByName(inputName) == null) {
                System.out.println("  not found");
            } else {
                printNumber(search.numberByName(inputName));
            }
        }
        if (input.equals("3")) {
            System.out.print("number: ");
            String inputNumber = reader.nextLine();
            if (search.nameByNumber(inputNumber) == null) {
                System.out.println(" not found");
            } else {
                System.out.println(" " + search.nameByNumber(inputNumber));
            }
        }
        if (input.equals("4")) {
            System.out.print("whose address: ");
            String inputName = reader.nextLine();
            System.out.print("street: ");
            String street = reader.nextLine();
            System.out.print("city: ");
            String city = reader.nextLine();
            String address = street;
            address += " " + city;
            search.addAddress(inputName, address);
        }
        if (input.equals("5")) {
            System.out.print("whose information: ");
            String inputName = reader.nextLine();
            printInfo(inputName);
        }
        if (input.equals("6")) {
            System.out.print("whose information: ");
            String inputName = reader.nextLine();
            search.removeInfo(inputName);
        }
        if (input.equals("7")) {
            System.out.print("keyword (if empty, all listed): ");
            String inputword = reader.nextLine();

            if (inputword.equals("")) {
                printAll();
            } else {
                infoSearch(inputword);
            }
        }
    }

    public void printNumber(Set<String> numbers) {
        for (String number : numbers) {
            System.out.println(" " + number);
        }
    }

    public void printNumberFive(Set<String> numbers) {
        for (String number : numbers) {
            System.out.println("   " + number);
        }
    }

    public void printInfo(String name) {
        String address = search.getAddress(name);
        Set<String> number = search.numberByName(name);
        if (address != null && number != null) {
            System.out.println("  address:" + address);
            System.out.println("  phone numbers: ");
            printNumberFive(number);
        } else if (address == null && number == null) {
            System.out.println("  not found");
        } else if (address == null) {
            System.out.println("  address unknown");
            System.out.println("  phone numbers: ");
            printNumberFive(number);
        } else if (number == null) {
            System.out.println("  address:" + address);
            System.out.println("  phone number not found");

        }
    }

    public void printAll() {
        for (String name : search.merger()) {
            System.out.println("\n " + name);
            printInfo(name);
        }
    }

    public void infoSearch(String keyWord) {
        Set<String> theName = new TreeSet<String>();
        for(String name : search.phoneKeys()){ 
            if (name.contains(keyWord)){
             theName.add(name);  
            }
        }  
        String address;
        for(String name : search.addressKeys()){
            address = search.getAddress(name);
            if(address.contains(keyWord)){
                theName.add(name);
            }
        }
        if(theName.isEmpty()){
            System.out.println("  not found");
        }else {
        for(String n : theName){
            System.out.println("\n " + n);
            printInfo(n);
        }
        }
    }    
}
