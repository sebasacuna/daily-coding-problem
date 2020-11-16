package org.dailycoding.problem.test.first;

import org.dailycoding.problem.first.ProductArrayContent;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class ProductArrayContentTest {

    ProductArrayContent productArrayContent;

    @BeforeEach
    public void setup() throws Exception {
        productArrayContent = new ProductArrayContent();
    }


    @Test
    public void proccesContent_shouldReturnAnArray() {
        List<Integer> listOfNumbers = productArrayContent.proccesContent(Arrays.asList(
                1, 2, 3, 4, 5));

        assertEquals(5, listOfNumbers.size(), 0.0);
    }

    @Test
    public void getLisWithOutIndex_shouldReturnListWithOutIndexTwo() {
        List<Integer> listOfNumbers = productArrayContent.getLisWithOutIndex(new ArrayList(Arrays.asList(
                1, 2, 3, 4, 5)) , 2);

        assertEquals(4, listOfNumbers.size(), 0.0);
    }

    @Test
    public void getLisWithOutIndex_shouldReturnListWithOutIndexOne() {
        List<Integer> listOfNumbers = productArrayContent.getLisWithOutIndex(new ArrayList(Arrays.asList(
                1, 2, 3, 4, 5)) , 1);

        assertEquals(4, listOfNumbers.size(), 0.0);
    }

    @Test
    public void getLisWithOutIndex_shouldReturnListWithOutIndexZero() {
        List<Integer> testNumbers = new ArrayList(Arrays.asList(
                1, 2, 3, 4, 5));

        List<Integer> listOfNumbers = productArrayContent.getLisWithOutIndex(new ArrayList(testNumbers) , 0);
        Integer numberToFind = testNumbers.get(0);
        Optional<Integer> numberToFilter = listOfNumbers.parallelStream().filter( number -> number.equals(numberToFind)).findFirst();

        assertEquals(numberToFilter.isPresent(), false);
    }



}
