package pattern;

import java.io.IOException;
import java.util.*;

public class Person {
    private String name;

    public Person(){}
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' +
                '}';
    }

    public static Person addCards(){
        Scanner sc = new Scanner(System.in);
        Person person = new Person();
        System.out.println("Give the name on a card:");
        person.setName(sc.nextLine());
        return person;
    }

    public static void sendCards(Person[] arr) throws IOException {
        // List of numbers to be shuffled
        List<Integer> numbers = DrawingCards.listOfNumbers(arr);
        FilesMethods.newDirectory();
        for (int i = 0; i < arr.length; i++) {
            FilesMethods.newFile(arr,i, numbers);
            numbers.remove(0);
        }
    }


}