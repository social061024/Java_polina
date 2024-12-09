package org.example.individual.Array.SortingArrays.Numbers;

import org.example.individual.Array.SortingArrays.Words.ex1.Main;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainNumbersTest {

    @Test
    public void testSearchWordInSentences_wordFound() {
        String[] arr = {"This is a test", "I love java", "I love programming"};
        String word = "java";

        // Очікуваний результат
        String expected = "I love java";

        // Перевіряємо, що функція повертає правильне речення
        String result = Main.searchWordInSentences(arr, word);
        assertEquals(expected, result, "Речення з словом 'java' повинно бути знайдено.");
    }

    @Test
    public void testSearchWordInSentences_wordNotFound() {
        String[] arr = {"This is a test", "I love java", "I love programming"};
        String word = "python";

        // Перевіряємо, що функція повертає null, якщо слово не знайдено
        String result = Main.searchWordInSentences(arr, word);
        assertNull(result, "Якщо слово не знайдено, має бути повернуто null.");
    }
}

