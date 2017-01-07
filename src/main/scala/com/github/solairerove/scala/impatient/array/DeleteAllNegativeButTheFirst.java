package com.github.solairerove.scala.impatient.array;

import java.util.ArrayList;
import java.util.List;

public class DeleteAllNegativeButTheFirst {

    private List<Integer> array = new ArrayList<>();

    public DeleteAllNegativeButTheFirst() {
        initArray();
    }

    private void initArray() {
        array.add(0);
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(-1);
        array.add(-2);
        array.add(-3);
        array.add(-4);
        array.add(-5);
    }

    public void deleteAllNegative() {
        boolean isFirst = true;
        int size = array.size();
        int i = 0;

        while (i < size) {
            if (array.get(i) >= 0) {
                i++;
            } else {
                if (isFirst) {
                    isFirst = false;
                    i++;
                } else {
                    array.remove(i);
                    size -= 1;
                }
            }
        }
    }

    public List<Integer> getArray() {
        return array;
    }
}
