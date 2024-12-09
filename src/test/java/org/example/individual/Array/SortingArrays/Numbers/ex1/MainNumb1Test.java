package org.example.individual.Array.SortingArrays.Numbers.ex1;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainNumb1Test {

    @Test
    public void testSearchNumber_found() {

        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;


        int expected = 2;


        int result = Main.searchNumber(arr, target);
        assertEquals(expected, result, "Число 30 має бути знайдено на індексі 2.");
    }

    @Test
    public void testSearchNumber_notFound() {

        int[] arr = {10, 20, 30, 40, 50};
        int target = 60;


        int expected = -1;


        int result = Main.searchNumber(arr, target);
        assertEquals(expected, result, "Число 60 не знайдено, має бути повернуто -1.");
    }

}