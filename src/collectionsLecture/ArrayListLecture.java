package collectionsLecture;
import java.util.*;

public class ArrayListLecture {
    public static void main(String[] args) {
//        Creating ArrayLists
        ArrayList<String> instructors = new ArrayList<>();

//        int[] threeNumbers = {10,2,6};
        List<String> randomList = new ArrayList<>();
        List<Integer> threeNumbers = Arrays.asList(10,2,6);
        List<Integer> numbers = new ArrayList<>(threeNumbers);
        System.out.println(numbers);
//        Person bob = new Person("test","test");
        ArrayList<Person> people = new ArrayList<>();

//        Adding elements to ArrayLists
        instructors.add("Justin");
        instructors.add("Sophie");
        instructors.add("Casey");
        instructors.add("Vivian");
        instructors.add(0,"David");
        System.out.println(instructors);
        System.out.println(instructors.size());

        numbers.add(10);
        numbers.add(2);
        numbers.add(6);
        numbers.add(10);
        numbers.add(10);
        System.out.println(numbers.indexOf(10));
        System.out.println(numbers.indexOf(8));
        System.out.println(numbers.lastIndexOf(10));

        System.out.println(numbers.get(1));

        people.add(new Person("bob", "ross"));
        people.add(new Person("jane","doe"));
        people.add(0,new Person("john","smith"));
        System.out.println(people.get(1));
        System.out.println(people);

        for(Person x : people){
            System.out.println(x.getFirstName());
        }

        System.out.println(instructors.contains("Justin"));
        System.out.println(instructors.contains("justin"));

        System.out.println(instructors.isEmpty());
        System.out.println(randomList.isEmpty());

//        Removing an element from an ArrayList
//        this would remove the first instance of "David"
        instructors.remove("David");
//        instructors.remove(0);
        System.out.println(instructors);
    }
}