package org.example.individual.Array.SortingArrays.Numbers.ex1;

public class Main {

        public static int searchNumber(int[] arr, int target) {

            for (int i = 0; i < arr.length; i++) {

                if (arr[i] == target) {
                    return i;
                }
            }
            return -1;
        }

        public static void main(String[] args) {

            int[] arr = {10, 20, 30, 40, 50};

            int target = 30;


            int result = searchNumber(arr, target);
            if (result != -1) {
                System.out.println("Число знайдено на індексі: " + result);
            } else {
                System.out.println("Число не знайдено.");
            }
        }
    }

