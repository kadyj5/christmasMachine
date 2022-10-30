import pattern.Person;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("***Christmas Machine***\n");
        System.out.print("Give the number of cards: ");
        int number;
        try {
            number = myObj.nextInt();
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("Given argument is not a number!");
            return;
        }
        Person[] arr = new Person[number];
        myObj.nextLine();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Person();
            arr[i] = Person.addCards();
        }
        // printing the array:
        System.out.println("Cards to be created: ");
        for (int i = 0, j = 1; i < arr.length; i++, j++) {
            System.out.println(j + ". " + arr[i].toString());
        }

        try {
            Person.sendCards(arr);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}