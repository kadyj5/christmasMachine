import pattern.Person;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("***Christmas Machine***\n");
        System.out.print("Give the number of cards: ");
        int number = 0;
        try {
            number = myObj.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(e);
            System.out.println("Given argument is not a number!");
            return;
        }
        Person[] arr = new Person[number];  // array of persons to be created.
        myObj.nextLine();                   // clean the input stream.

        //setting the names and emails:
        for (int i = 0, j = 1; i < arr.length; i++, j++) {
            arr[i] = new Person();
            System.out.println("Give the " + j + " name on card:");
            arr[i].setName(myObj.nextLine());
            System.out.println("Give the email of the person number " + j);
            arr[i].seteMail(myObj.nextLine());
        }

        // printing the array:
        System.out.println("Cards to be created: ");
        for (int i = 0, j = 1; i < arr.length; i++, j++) {
            System.out.println(j + ". " + arr[i].toString());
        }


    }
}