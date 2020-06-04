import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("if you want to talk to bo, say hi");

        String userInput;
        Boolean greeting;

        do{
            userInput = sc.next();
            greeting = (!userInput.equals("bye"));

            if(userInput.endsWith("?")){
                System.out.println("Sure.");
                } else if(userInput.equals("!")){
                System.out.println("Whoa, chill out!");;
                } else if(userInput.equals("")){
                    System.out.println("Fine, Be that way");
                } else {
                System.out.println("Whatever!");
            }
        }while(greeting);
    }
}
