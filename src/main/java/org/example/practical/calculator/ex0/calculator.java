package org.example.practical.calculator.ex0;

import java.text.DecimalFormat;

public class calculator {
    public static class Main {


        public static int toggleBit(int n, int k) {
            return n ^ (1 << k);
        }


        public static void swap(int[] nums, int i, int j) {
            nums[i] = nums[i] ^ nums[j];
            nums[j] = nums[i] ^ nums[j];
            nums[i] = nums[i] ^ nums[j];
        }


        public static double sequenceSum(int terms) {
            double sum = 1.0;
            double current = 1.0;

            for (int n = 1; n < terms; n++) {
                current += (double) n / (n + 1);
                sum += current;
            }

            return sum;
        }

        public static void main(String[] args) {

            int number = 29;
            int bitPosition = 3;
            int toggledNumber = toggleBit(number, bitPosition);
            System.out.println("Number before toggling: " + number);
            System.out.println("Number after toggling bit " + bitPosition + ": " + toggledNumber);


            int[] nums = {5, 10};
            System.out.println("Before swapping: a = " + nums[0] + ", b = " + nums[1]);
            swap(nums, 0, 1);
            System.out.println("After swapping: a = " + nums[0] + ", b = " + nums[1]);


            int terms = 10;
            double sum = sequenceSum(terms);


            DecimalFormat df = new DecimalFormat("#.#");
            String roundedSum = df.format(sum);

            System.out.println("Sum of the first " + terms + " terms of the sequence: " + roundedSum);
        }
    }
}
