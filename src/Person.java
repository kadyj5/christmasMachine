public class Person {
    private String name;
    private String eMail;

    private Person personArr[];


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

    void nameAndEmailInput(int a){
        for (int i = 0, j = 1; i < arr.length; i++, j++) {

            arr[i] = new Person();
            System.out.println("Give the " + j + " name on card:");
            arr[i].setName(myObj.nextLine());
            System.out.println("Give the email of the person number " + j);
            arr[i].seteMail(myObj.nextLine());
        }
    }


}