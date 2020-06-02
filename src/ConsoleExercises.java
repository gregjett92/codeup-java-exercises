import java.sql.SQLOutput;
import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;

        Scanner scanner = new Scanner(System.in);
//        prompt user for integer
        System.out.println("Enter a integer:");
        int num  = scanner.nextInt();

//        prompt user for 3 words
        System.out.print("Please enter 3 words");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();

        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
    }
}
