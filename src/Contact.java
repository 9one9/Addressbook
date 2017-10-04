/**
 * Created by Rayson on 9/23/17.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Contact<T> {

    private String fullname;
    private long number;
    //Long type literals end with an "L"-> 342434234234L

    public Contact(String fulln,long numb){
        fullname=fulln;
        number=numb;
    }

    public void setContact(String fullname, long number){
        this.fullname = fullname;
        this.number = number;
    }

    public void printC(){
        //individual printing
        System.out.println(this.fullname + ":"+ this.number);
    }

    @Override
    public String toString() {
        return this.fullname
                +':'
                +this.number
                +"\n";

        // To print the items from the ArrayList in english
    }




}
