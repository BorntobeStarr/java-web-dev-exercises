package excercises;

import java.util.Arrays;

public class ArrayPracticeChapterThree {
    public static void main(String[] args) {
        int[] intArray = {1, 1, 2, 3, 5, 8};
        int i;
            for (i=0; i<intArray.length; i++){
                System.out.println(intArray[i]);
            }
        String exerciseString = " I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String [] splitThePhrase =exerciseString.split(" ");
        System.out.println(Arrays.toString(splitThePhrase));

        String [] splitToSentences = exerciseString.split("\\.");
        System.out.println(Arrays.toString(splitThePhrase));
    }
}
