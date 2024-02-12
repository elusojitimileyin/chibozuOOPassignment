package chapterThree;

import java.util.ArrayList;
import java.util.Scanner;


public class ConsoleApp {
    private static ArrayList<Integer> number = new ArrayList<>();
    public static void main(String[] args) {


        int userInput = 0;
        while (userInput != 22) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter numbers from 1 to 15: ");
            userInput = scanner.nextInt();
            if (userInput >= 1 && userInput <= 15) {
                number.add(userInput);

            }


        }   for (int count = 0; count< number.size(); count++) {
            for (int index = 0; index < number.get(count); index++) {
                System.out.print('*');
            }System.out.println(" ");
        }
    }
}

//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class ConsoleApp {
//    private static final ArrayList<Integer> numbers = new ArrayList<>();
//
//    public static void main(String[] args) {
//        int userInput = 0;
//        Scanner scanner = new Scanner(System.in);
//
//        while (userInput != 22) {
//            System.out.println("Enter numbers from 1 to 15: ");
//            userInput = scanner.nextInt();
//
//            if (userInput >= 1 && userInput <= 15) {
//                numbers.add(userInput);
//
//            }
//
//        }
//
//        for (int i = 0; i <numbers.size() ; i++) {
//            for (int j = 0; j <=numbers.get(i); j++) {
//                System.out.print('*');
//            }
//            System.out.println();
//        }
//        }
//            }
//
//
//
