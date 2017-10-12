/**
 * Created by Rayson on 9/23/17.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Contact<T> {

    private String firstname;
    private String lastname;
    private long number;
    private String address;


    //Long type literals end with an "L"-> 342434234234L

    public Contact(String fulln,long numb){
        firstname=fulln;
        number=numb;
    }
    //We need a no-arg constructor so we can freely create contacts in process.java, below.

    public Contact(){}

    /*
    *
     public Contact setContact(String nameslot1, long number){
        this.firstname = nameslot1;
        this.number = number;

    }
    >>>>>> might have erasure problems
    *
    * */

    public void setContact(String nameslot1, long number){
        this.firstname = nameslot1;
        this.number = number;
    }


    public void printC(){
        //individual printing
        System.out.println(this.firstname + ":"+ this.number);
    }

    @Override
    public String toString() {
        return this.firstname
                +'|'
                +this.number
                +"\n";

        // To print the items from the ArrayList in english
    }




}
