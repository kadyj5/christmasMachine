public class Person {
    private String name;
    private String eMail;


    public Person(){}

    public Person(String name, String eMail) {
        this.name = name;
        this.eMail = eMail;
    }


    public String getName() {
        return name;
    }

    public String geteMail() {
        return eMail;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", eMail='" + eMail + '\'' +
                '}';
    }




}