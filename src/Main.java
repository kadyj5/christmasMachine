import pattern.Person;
import pattern.PersonWithEmail;

import java.io.IOException;
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

        Person[] arr = new Person[number];
        for (int i = 0; i < arr.length; i++) {
            arr[i].addCards();
        }
        // printing the array:
        System.out.println("Cards to be created: ");
        for (int i = 0, j = 1; i < arr.length; i++, j++) {
            System.out.println(j + ". " + arr[i].toString());
        }

        try {
            arr[0].sendCards(arr);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}