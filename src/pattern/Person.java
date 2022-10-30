package pattern;

import java.io.FileWriter;
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
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static Person addCards(){
        Scanner sc = new Scanner(System.in);
        Person person = new Person();
        System.out.println("Give the name on a card:");
        person.setName(sc.nextLine());
        return person;
    }

    public static void sendCards(Person[] arr) throws IOException {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            numbers.add(i);
        }


        Collections.shuffle(numbers);
        for (int i = 0; i < arr.length; i++) {
//            FileWriter file = new FileWriter(new StringBuilder().append("C:\\Users\\Karolina\\Desktop\\").append(arr[i].getName()).append(".txt").toString());
            while(arr[i].getName() == arr[numbers.get(0)].getName()){
                Collections.shuffle(numbers);
            }
//            System.out.println(numbers);
            System.out.println(arr[i].name + " --->" + arr[numbers.get(0)].getName());
//            file.write(arr[numbers.get(i)].getName());
//            file.close();
            numbers.remove(0);
        }
    }


}