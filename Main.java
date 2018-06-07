
import PhoneSearch.Searcher;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
       Scanner reader = new Scanner (System.in);
       Searcher s = new Searcher(reader);
       
       s.start();
       
    }
}
