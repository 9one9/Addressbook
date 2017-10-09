/**
 * Created by Rayson on 9/23/17.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Contact<T> {

    private String firstname;
    private String lastname;
    private long number;


    //Long type literals end with an "L"-> 342434234234L

    public Contact(String fulln,long numb){
        firstname=fulln;
        number=numb;
    }

    public void setContact(String fullname, long number){
        this.firstname = fullname;
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
