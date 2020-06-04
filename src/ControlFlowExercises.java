import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//     ================ WHILE ================
//       int i = 5;
//       while(i <= 15) {
//           System.out.print(i);
//           i++;
//       }

//     ================ DO WHILE LOOP ================
//        int counter = 0;
//       do {
//          System.out.println(counter++);
//          counter++;
//        }while(counter <= 100);
//
////     ======= BACKWARDS BY 5 ==========
//        int counter = 100;
//        do {
//            System.out.println(counter);
//            counter -= 5;
//        }while(counter >= -10);
//
//        long counter = 2;
//        do {
//            System.out.println(counter);
//            counter *= counter;
//        }while(counter < 1000000);



//        int n = 100;

//         fizzbuzz
//        for (int i=1; i<=n; i++)
//        {
//            if (i%15==0)
//                System.out.print("FizzBuzz");
//
//            else if (i%5==0)
//                System.out.println("Buzz";
//
//            else if (i%3==0)
//                System.out.println("Fizz");
//
//            else
//                System.out.println(i);
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Number please?");
//        int num = sc.nextInt();
//
//        System.out.println("Here is your table!");
//        System.out.println("number     | squared    | cubed");
//        System.out.println("-------    |--------    |------");
//
//        for(int y = 1; y <= num; y++){
//            System.out.printf("%d       | %d           | %d          |%d%n", y, y*y, y*y*y);
        }
        System.out.println("Would you like to take a look at your letter grades?");
        String answer = userInput.next();

        while(answer.equalsIgnoreCase("YES")){
            System.out.println("Please enter numeric grade:");
             char letterGrade;
             if(grade >= 88){
                 letterGrade = 'A';
             } else if(grade >= 80){
                 letterGrade = 'B';
             } else if(grade >= 67){
                 letterGrade = 'C';
             } else if(grade >= 60){
                 letterGrade = 'D';
             } else {
                 letterGrade = 'F';
             }
            System.out.println("Your letter grade is:  %c,%n" + letterGrade);


    }
}
