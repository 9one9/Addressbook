
import java.util.*;

/**
 * Created by Rayson on 9/22/17.
 */
public class Book {

    public static void main (String[] args){

        System.out.println("<---Your address book--->");

        List<Contact> thecontacts = new ArrayList<Contact>();

        Contact<Contact> Duo = new Contact<>("Jerry",3473473470L);
        Contact<Contact> Solo = new Contact<>("Johnny",2463473470L);

        /**
        Use create contact method rather than creating a specific contact.
        This contact is a test.
        after creating the contact, add it to array list then print array
        **/

        ContactWindow createContact = new ContactWindow();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        thecontacts.add(Duo);
        thecontacts.add(Solo);
        thecontacts.add(new Contact());

        System.out.println(thecontacts.toString()
                    .replace(",","")
                    .replace("]","")
                    .replace("[","")
                    );


        // final Process Process = new Process(); //cant run process methods without this object.

        //thecontacts.remove(Duo);
        //Prints from print C method    Duo.printC();
        //ArrayList.listToString(thecontacts.toArray());
        //Add a GUI for easy addressbook entry



    }



}
