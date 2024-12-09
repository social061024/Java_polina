package org.example.individual.Array.SortingArrays.Words.ex1;

public class Main {

    public static String searchWordInSentences(String[] arr, String word) {
        for (String sentence : arr) {
            String[] words = sentence.split(" ");
            for (String w : words) {
                if (w.equals(word)) {
                    return sentence;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {

        String[] arr = {"This is a test", "I love java ", "I love programming"};

        String word = "java";


        String result = searchWordInSentences(arr, word);
        if (result != null) {
            System.out.println("Речення з словом: " + result);
        } else {
            System.out.println("Слово не знайдено.");
        }
    }
}
