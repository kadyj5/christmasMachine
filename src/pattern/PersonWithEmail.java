package pattern;

public class PersonWithEmail extends Person {

    private String email;
    private PersonWithEmail personWithEmail[];
    public PersonWithEmail() {}

    public PersonWithEmail(String name, String email) {
        super(name);
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







}

