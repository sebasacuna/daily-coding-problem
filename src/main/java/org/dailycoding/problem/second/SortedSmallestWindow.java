package org.dailycoding.problem.second;


import java.util.*;

public final class SortedSmallestWindow {

    public static ArrayList<Integer> find(ArrayList<Integer> list) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++)
                if (list.get(j) > list.get(j + 1)) {
                    addSwappingPositions(treeSet, j);
                    swapPosition(list, j);
                }
        }
        return addSmallestWindow(treeSet);
    }

    private static ArrayList<Integer> addSmallestWindow(TreeSet<Integer> treeSet) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(treeSet.pollFirst());
        result.add(treeSet.pollLast());
        return result;
    }

    private static void swapPosition(ArrayList<Integer> list, int position) {
        int temp = list.get(position);
        list.set(position, list.get(position + 1));
        list.set(position + 1, temp);
    }

    private static void addSwappingPositions(TreeSet<Integer> treeSet, int position) {
        treeSet.add(position);
        treeSet.add(position + 1);
    }

}


