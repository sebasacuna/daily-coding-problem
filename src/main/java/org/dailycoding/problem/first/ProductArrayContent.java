package org.dailycoding.problem.first;

import java.util.ArrayList;
import java.util.List;

public final class ProductArrayContent {


    public List<Integer> proccesContent(List<Integer> listOfNumbers) {
        ArrayList<Integer> listOfProducts = new ArrayList<>(listOfNumbers);
        return listOfProducts;
    }

    public List<Integer> getListWithOutIndex(List<Integer> listOfNumbers, int index) {
        listOfNumbers.remove(index);
        return new ArrayList(listOfNumbers);
    }

    public Integer getProductOfList(List<Integer> listOfNumbers) {
        return listOfNumbers.stream().reduce(1, (subtotal, number) -> subtotal * number);
    }


}
