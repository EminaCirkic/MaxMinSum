package com.company;

/**
 * Created by Emina on 9/12/2016.
 */
public class MaxandMinForAll {


    int[] input = new int[]{1, 4, 5, 7, 20000, -511, 100, -200, 400};
    //initiating private variables
    private int max = 0;
    private int min = 0;
    private int sum = 0;

    public void result() {
    //calling private methods
    forEachIterable();
    forIterate();

    }


    private void forEachIterable() {
        // for each loop doesn't have a counter so we make a temporary one
        int i = 0;
        //here we take each "item" thats in the input array and do whatever
        for (int item : input) {

            //If the max is less than the item(element) in "i" location of array,
            //  make this element max
            if (max < input[i]) {
                max = input[i];
            }

            //If the min is greater than the item(element) in "i" location of array,
            //  make this element min
            if (min > input[i]) {
                min = input[i];
            }

            //add up the item to sum
            sum += item;
            //increase the counter by 1
            i++;
        }

        //Print the max, min and sum by putting the values in %d. Make new line using \n
        System.out.printf("For Each Loop \n "+"The max for this array is %d \n " +
                "The min in this array is %d \n "+ "The sum of all elements in this array is %d \n", max,min,sum);
    }

    private void forIterate() {
        /*creating a temporary variable sum1
        otherwise if we use constant variable sum
         it will continue addaing up from last loop*/
        int sum1=0;

        //in this loop we start at 0, end at arrays length and increase for every loop by 1
        for (int i = 0; i < input.length; i++) {

            //same logic as in for each loop
            if (max < input[i]) {
                max = input[i];
            }
            if (min > input[i]) {
                min = input[i];
            }

            sum1+=input[i];

        }
        //same here too, yes its a waste of time but it will do for now
        System.out.printf("For Loop \n "+"The max for this array is %d \n " +
                "The min in this array is %d \n "+ "The sum of all elements in this array is %d \n", max,min,sum1);

    }



}
