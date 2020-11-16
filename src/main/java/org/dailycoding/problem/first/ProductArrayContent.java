package org.dailycoding.problem.first;

import org.dailycoding.problem.first.Exception.IndexNotExistInList;

import java.util.ArrayList;
import java.util.List;

public final class ProductArrayContent {


    public List<Integer> processContent(List<Integer> listOfNumbers) throws IndexNotExistInList {
        ArrayList<Integer> listOfProducts = new ArrayList<>();
        for (int i = 0; i < listOfNumbers.size(); i++) {
            List<Integer> listWithOutIndex = getListWithOutIndex(new ArrayList<>(listOfNumbers), i);
            listOfProducts.add(getProductOfList(listWithOutIndex));
        }
        return listOfProducts;
    }

    public List<Integer> getListWithOutIndex(List<Integer> listOfNumbers, int index) throws IndexNotExistInList {
        try {
            listOfNumbers.remove(index);
            return new ArrayList<Integer>(listOfNumbers);
        } catch (Exception exception) {
            throw new IndexNotExistInList();
        }
    }

    public Integer getProductOfList(List<Integer> listOfNumbers) {
        return listOfNumbers.stream().reduce(1, (subtotal, number) -> subtotal * number);
    }


}
