package HW5;
import java.util.Scanner;

import javax.print.attribute.IntegerSyntax;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPlayground {
    public static void main(String[] args) {
    // Question 1
    // Write Java statements that do the following:
    // a) Declare an arrayList nums of 15 elements of type int.
    // b) Output the value of the tenth element of the array nums.
    // c) Set the value of the 5th element of the array alpha to 99.
    // d) Set the value of the 9th element of the array alpha to the sum of the 6th and 13th elements of the array nums.
        int[] Array = new int[15];
        System.out.println(Array[9]);
        Array[4] = 35;
        Array[8] = Array[5] + Array[12];
        Sums();
    }


    // Question 2
    // a) create an arrayList of Strings that contain each day of the week.(starting on monday)
    // b) output each of the days of the week
    // c) output the days of the week we have class
    // d) output the days of the week that we have class 
    // e) change the arrayList to start on Sunday
    public static void Days(){
        String[] Week = new String[]{"Monday", "Tueday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(Week[0]);
        System.out.println(Week[1]);
        System.out.println(Week[2]);
        System.out.println(Week[3]);
        System.out.println(Week[4]);
        System.out.println(Week[5]);
        System.out.println(Week[6]);
        
        System.out.println("We have class on " + Week[1] + "and " + Week[3]);

        String[] newWeek = new String[]{"Sunday", "Monday", "Tueday", "Wednesday", "Thursday", "Friday", "Saturday"};
    }


    // Question 3 
    // a) create an ArrayList and prompt the user for numbers to add to it until the number 0 is selected
    // b) return the largest and smallest number
    // c) return the ArrayList sorted smallest to largest
    // d) take that ArrayList see if its size is divisable by 3 and then output the ArrayList in a matrix format
    // NOTE: make the matrix n X 3 so it can be n rows by 3 columns 
    // EX. ArrayList [1,2,3,4,5,6,7,8,9]
    // 1 2 3
    // 4 5 6
    // 7 8 9
    // NOTE: If the ArrayList is NOT divisable by 3 ask the user for more numbers and add them until it is
    // ArrayList Size: 7
    // Please enter 2 more numbers to create the matrix...
    // 
    public static void Sums(){
        //A
        Scanner input = new Scanner(System.in);
        // int[] Sum = new int[n * 3];
        // int[] Sum = new int[3];
        ArrayList<Integer> userInputArray = new ArrayList<Integer>();
        int data = input.nextInt();
        while(data != 0){
            userInputArray.add(data);
            System.out.println("number: ");
            data = input.nextInt();
        }
        System.out.println(userInputArray);

        //B
        System.out.println(Collections.max(userInputArray));
        System.out.println(Collections.min(userInputArray));

        //C
        Collections.sort(userInputArray);
        System.out.println(userInputArray);
        System.out.println(userInputArray.size());
        //D
        if(userInputArray.size()%3 == 1){ 
            System.out.println("Please enter another number: ");
            userInputArray.add(input.nextInt()); 
            System.out.println("Please enter another number: ");
            userInputArray.add(input.nextInt());        
        }
        else if(userInputArray.size()%3 == 2){
            System.out.println("You reached me");
            System.out.println("Please enter another number: ");
            userInputArray.add(input.nextInt());
        }

        for(int i = 0;i < userInputArray.size(); i++)
        {
            System.out.print(userInputArray.get(i) + " ");
            if((i + 1)%3 == 0)
            {
                System.out.println();
            }

    }
}
}
