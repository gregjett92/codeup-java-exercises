//import java.util.Scanner;
//public class MethodsExercises {
//    //    static Scanner sc = new Scanner(System.in).useDelimiter("\n");
//    public static double add(double a, double b){
//        return a+b;
//    }
//
//    public static double subtract(double a, double b){
//        return a-b;
//    }
//
//    public static double multiply(double a, double b){
//        return a*b;
//    }
//
//    public static double divide(double a, double b){
//        return a/b;
//    }
//
//    //    loop multiplication
//    public static double loopMultiply(double a, double b){
//        double result = 0;
//        for(double i = 0; i < a; i++){
//            result += b;
//        }
//        return result;
//    }
//
//    //    recursive multiplication
//    public static double recursiveMultiply(double a, double b){
//        if(a == 0 || b == 0){
//            return 0;
//        }
//        return a + recursiveMultiply(a, b-1);
//    }
//
//    public static void testArithmetic(){
//        System.out.println(add(2,3));
//        System.out.println(subtract(10,7));
//        System.out.println(multiply(4,4));
//        System.out.println(divide(100,25));
//        System.out.println(loopMultiply(3,10));
//        System.out.println(recursiveMultiply(2,5));
//    }
//
//    public static int getInteger(int min, int max){
//        Scanner sc = new Scanner(System.in).useDelimiter("\n");
//        System.out.printf("Enter a number between %d and %d: ", min, max);
//        int userInput = sc.nextInt();
//        if(userInput > max || userInput < min){
//            System.out.println("Please enter a number within the range.");
//            return getInteger(min, max);
//        }
//        System.out.println("Thanks for entering a valid number!");
//        return userInput;
//    }
//    public static void dice() {
//        Scanner sc = new Scanner(System.in);
//        String result;
//        boolean yn;
//        int die1 = (int) (8*Math.random()+1);
//        int die2 = (int) (8*Math.random()+1);
//        int sumOfDice = die1+die2;
//
//        while(true){
//            System.out.println("Would you like to roll?");
//            boolean boo = sc.nextBoolean();
//
//            System.out.println("Would you like to roll?" + boo);
//
//            switch(result){
//                case "yes":
//                    yn = false;
//                    break;
//                case "no":
//                    yn = true;
//                    break;
//                default :
//                    System.out.println("please enter again ");
//                    return default;
//                }¬
//
//        }
//
//
//
//        System.out.println("Die 1: " + die1);
//        System.out.println("Die 2: " + die2);
//        System.out.println("Total: " + sumOfDice);
//
//    }
//
//
//
//    public static void main(String[] args) {
//
////        testArithmetic();
//        dice();
//
////        System.out.println("Enter a number between 1 and 50: ");
////        int myInt = getInteger(1,50);
////        System.out.println(myInt);
//
//
//
//
//
//
//    }
//}
