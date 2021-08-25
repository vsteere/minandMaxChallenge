package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//creating an arrayList to which we can append integers that are entered
        List<Integer> arr = new ArrayList<Integer>();


        //endless loop with a break if the user input is not an integer
        while(true) {
            //user input requets to enter a number
            System.out.println("Enter a number");

            //checking to see if the entry is an integer
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt) {

                //setting the input to a variable
                int number = scanner.nextInt();
                //appending the input into the array list
                arr.add(number);





            }else {
        //using Collections class to extract the minimum and maximum number from the array list
                System.out.println("the minimum number entered was " + Collections.min(arr));
                System.out.println("the maximum number entered was " + Collections.max(arr));
                //if the input is not an integer, stop the loop
                break;

            }

            scanner.nextLine(); // handle end of line (enter key)

        }






        scanner.close();
    }
}
