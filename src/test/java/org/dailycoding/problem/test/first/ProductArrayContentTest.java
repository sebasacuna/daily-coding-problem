package org.dailycoding.problem.test.first;

import org.dailycoding.problem.first.Exception.IndexNotExistInList;
import org.dailycoding.problem.first.ProductArrayContent;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public final class ProductArrayContentTest {

    private ProductArrayContent productArrayContent;

    @BeforeEach
    public void setup() throws Exception {
        productArrayContent = new ProductArrayContent();
    }


    @Test
    public void processContent_shouldReturnAnArray() throws IndexNotExistInList {
        List<Integer> listOfNumbers = productArrayContent.processContent(Arrays.asList(
                1, 2, 3, 4, 5));

        assertEquals(5, listOfNumbers.size(), 0.0);
    }

    @Test
    public void getLisWithOutIndex_shouldReturnListWithOutIndexTwo() throws IndexNotExistInList {
        List<Integer> listOfNumbers = productArrayContent.getListWithOutIndex(new ArrayList(Arrays.asList(
                1, 2, 3, 4, 5)) , 2);

        assertEquals(4, listOfNumbers.size(), 0.0);
    }

    @Test
    public void getLisWithOutIndex_shouldReturnListWithOutIndexOne() throws IndexNotExistInList {
        List<Integer> listOfNumbers = productArrayContent.getListWithOutIndex(new ArrayList(Arrays.asList(
                1, 2, 3, 4, 5)) , 1);

        assertEquals(4, listOfNumbers.size(), 0.0);
    }

    @Test
    public void getLisWithOutIndex_shouldReturnListWithOutIndexZero() throws IndexNotExistInList {
        List<Integer> testNumbers = new ArrayList(Arrays.asList(
                1, 2, 3, 4, 5));

        List<Integer> listOfNumbers = productArrayContent.getListWithOutIndex(new ArrayList(testNumbers) , 0);
        Integer numberToFind = testNumbers.get(0);
        Optional<Integer> numberToFilter = listOfNumbers.parallelStream().filter( number -> number.equals(numberToFind)).findFirst();

        assertEquals(numberToFilter.isPresent(), false);
    }

    @Test
    public void getProductOfList_shouldReturnAnSingleIntegerWithTheProductOfTheList() {
        List<Integer> testNumbers = new ArrayList(Arrays.asList(
                1, 2, 3, 4, 5));

        Integer productOfList = productArrayContent.getProductOfList(new ArrayList(testNumbers));

        assertEquals(productOfList, 120);
    }



    @Test
    public void processContent_shouldReturnCorrectArray() throws IndexNotExistInList {
        List<Integer> testNumbers = new ArrayList(Arrays.asList(
                1, 2, 3, 4, 5));

        List<Integer> listOfNumbers = productArrayContent.processContent(testNumbers);

        List<Integer> resultNumbers = Arrays.asList(
                120, 60, 40, 30, 24);

        assertEquals(listOfNumbers, resultNumbers);
    }

    @Test
    public void processContent_shouldReturnCorrectArrayForSecondTestList() throws IndexNotExistInList {
        List<Integer> testNumbers = new ArrayList(Arrays.asList(
                3, 2, 1));

        List<Integer> listOfNumbers = productArrayContent.processContent(testNumbers);

        List<Integer> resultNumbers = Arrays.asList(
                2, 3 , 6);

        assertEquals(listOfNumbers, resultNumbers);
    }

    @Test()
    public void getLisWithOutIndex_shouldThrowExceptionWhenTryToGetIndexOutOfBound() {

        List<Integer> testNumbers = new ArrayList(Arrays.asList(
                1, 2, 3, 4, 5));

        Integer notExistingIndex = 50;

        Exception exception = assertThrows(IndexNotExistInList.class, () -> {

            List<Integer> listOfNumbers = productArrayContent.getListWithOutIndex(new ArrayList(testNumbers) , notExistingIndex);
        });

        String expectedMessage = "Index not exist int the list";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }



}
