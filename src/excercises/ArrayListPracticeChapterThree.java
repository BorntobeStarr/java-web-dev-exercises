package excercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListPracticeChapterThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the word length for the search:");
        String userInput = input.nextLine();

    }
        public static int sunOfAllEvenNums (ArrayList<Integer> arr){
            int total = 0;
            for (int integer : arr) {
                if (integer % 2 == 0) {
                    total += integer;
                }
            }
            return total;
        }

    public static String[] stringToArrayList (String[] args){
        String exerciseString = " I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String str[] = exerciseString.split(",");
        List<String> al = new ArrayList<String>();
        al = Arrays.asList(str);
        for(String s: al){
            System.out.println(s);
    }
        return str;
    }
}

