package basics;

import java.util.Scanner;

public class ArrayExamples {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] myArray = {1,3,5,7,9};
        int [] anotherArray = new int[10];
        String [] gender = {"male", "female"};
        int sum = 0;

//        for (int i = 0; i < myArray.length; i++){
//            System.out.println("insert item at: " +i);
//            myArray[i] = input.nextInt();

        for (int i = 0; i < myArray.length; i++){
            sum += myArray[sum];
            System.out.println("the sum = " +sum);

        }
    }
}
