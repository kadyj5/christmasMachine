package pattern;

import java.util.Scanner;

public class PersonWithEmail extends Person {

    private String email;
    private int number;
    public PersonWithEmail() {}

    public PersonWithEmail(String name, String email, int number) {
        super(name);
        this.number = number;
        this.email = email;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonWithEmail{");
        sb.append("name='").append(getName()).append('\'');
        sb.append("email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
    public PersonWithEmail addCards() {
        Scanner sc = new Scanner(System.in);
        PersonWithEmail personWithEmail = new PersonWithEmail();
        personWithEmail = new PersonWithEmail();
        System.out.println("Give the name on card:");
        personWithEmail.setName(sc.nextLine());
        System.out.println("Give the email of the person number ");
        personWithEmail.setEmail(sc.nextLine());

        return personWithEmail;
    }
}

