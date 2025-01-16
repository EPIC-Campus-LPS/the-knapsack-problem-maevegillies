import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] profits = new int[0];
        int[] weights = new int[0];
        float[] ppw = new float[0];
        float totalProfit = 0;
        float remainingWeight = 15;
        int numElements = 0;
        float[] unsorted = new float[0];


        try {
            File file = new File("file.txt");
            Scanner sc = new Scanner(file);
            int i = 0;
            while (sc.hasNextLine()) {
                if (i == 0) {
                    numElements = sc.nextInt();
                    profits = new int[numElements];
                    weights = new int[numElements];
                    ppw = new float[numElements];
                    unsorted = new float[numElements];

                } else if (i == 1) {
                    remainingWeight = sc.nextInt();
                } else {
                    String a = sc.next();

                    String[] b = a.split(",");
                    if (i % 2 == 0) {
                        profits[(i - 2) / 2] = Integer.parseInt(b[0]);
                    } else {
                        weights[(i - 2) / 2] = Integer.parseInt(b[0]);
                    }
                }
                i++;
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < numElements; i++) {
            int ratio = profits[i] / weights[i];
            ppw[i] = ratio;
            unsorted[i] = ppw[i];
        }
        Arrays.sort(ppw);
            while (remainingWeight > 0) {
                for (int z = numElements-1; z < numElements; z--) {

                    for (int k = 0; k < numElements; k++) {
                    if (unsorted[k] == ppw[z]) {
                        remainingWeight -= weights[k];
                        totalProfit += profits[k];
                        System.out.println(remainingWeight);
                    }
                }
            }
        }
        System.out.println(remainingWeight);
        System.out.println(totalProfit);
            //go through sorted

            //find the index in the unsorted one





    }
}







        //iterate through the arr
        //compare each value, then swap if their ppw is bigger
        // subtract wight from 15



        //profits[i]/weights[i]
        //send to ppw
//
//        for (int i = 0; i < profits.length; i++) {
//            int ratio = profits[i]/weights[i];
//            ppw[i] = ratio;
//            //quicksort ppw
//







//
//
//        for (int i = 0; i < profits.length; i++) {
//            if (profits[i] < profits[i + 1]) {
//
//            }
//        }






        //read in input

        //make arr with each profit and weight

