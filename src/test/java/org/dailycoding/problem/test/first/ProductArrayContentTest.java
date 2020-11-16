package org.dailycoding.problem.test.first;

import org.dailycoding.problem.first.ProductArrayContent;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class ProductArrayContentTest {

    ProductArrayContent productArrayContent;

    @Before
    public void setup() throws Exception {
        productArrayContent = new ProductArrayContent();
    }


    @Test
    public void proccesContent_shouldReturnAnArray() {
        List<Integer> listOfNumbers = productArrayContent.proccesContent(Arrays.asList(
                1, 2, 3, 4, 5));
        assertEquals(5, listOfNumbers.size(),0.0);
    }

}
