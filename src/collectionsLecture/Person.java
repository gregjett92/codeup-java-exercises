package collectionsLecture;

public class Person {
    String firstName;
    String lastName;

    public Person(String first, String last){
        this.firstName = first;
        this.lastName = last;
    }

    public String getFirstName(){
        return this.firstName;
    }
}