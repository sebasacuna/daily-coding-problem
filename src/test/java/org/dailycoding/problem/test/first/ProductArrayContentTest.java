package org.dailycoding.problem.test.first;

import org.dailycoding.problem.first.ProductArrayContent;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;


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
    public void getLisWithOutIndex_shouldReturnStreamWithOutNumber() {
        List<Integer> listOfNumbers = productArrayContent.getLisWithOutIndex(Arrays.asList(
                1, 2, 3, 4, 5) , 2);
        assertEquals(4, listOfNumbers.size(), 0.0);
    }



}
