import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %f.2.", pi);

        Scanner scanner = new Scanner(System.in);
//        prompt user for integer
        System.out.print("Enter a integer: ");
        int num  = scanner.nextInt();
        System.out.println("The user enter" + num);

//        prompt user for 3 words
        System.out.print("Please enter 3 words ");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();

        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);

//        prompt user for sentence
        System.out.print("Please enter sentence:");
        String sentence = scanner.nextLine();
        System.out.println("sentence");


//        prompt user for length and width
        System.out.println("Please enter the length of the room:");
        String length = scanner.nextLine();
        System.out.println("Please enter the width of the room:");
        String width = scanner.nextLine();
        int area = Integer.parseInt(length) * Integer.parseInt(width);
        int perimeter = (Integer.parseInt(length) * Integer.parseInt(width)) * 2;
        System.out.printf("The area pf the room is %d%nThe permeter of the the room is %d ", area, perimeter);





    }
}
