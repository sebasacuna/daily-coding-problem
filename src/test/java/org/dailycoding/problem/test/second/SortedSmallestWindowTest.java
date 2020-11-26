package org.dailycoding.problem.test.second;

import org.dailycoding.problem.second.SortedSmallestWindow;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortedSmallestWindowTest {

    private SortedSmallestWindow sortedSmallestWindow;

    @BeforeEach
    public void setup() throws Exception {
        sortedSmallestWindow = new SortedSmallestWindow();
    }

    @Test
    public void find_shouldReturnTheCorrectSize() throws Exception {
        ArrayList<Integer> listOfNumbers = sortedSmallestWindow.find(new ArrayList<>(Arrays.asList(
                3, 7, 5, 6, 9)));

        assertEquals(2, listOfNumbers.size(), 0.0);
    }

    @Test
    public void find_shouldReturnTheArray() throws Exception {

        ArrayList<Integer> expectedList = new ArrayList<>(Arrays.asList(
                1, 3));

        ArrayList<Integer> smallestWindow = sortedSmallestWindow.find(new ArrayList<>(Arrays.asList(
                3, 7, 5, 6, 9)));

        assertThat(smallestWindow, is(expectedList));
    }

}
