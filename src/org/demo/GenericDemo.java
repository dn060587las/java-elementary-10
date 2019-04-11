package org.demo;

import java.util.List;

public class GenericDemo {

    public static <T extends Comparable> T getMaxFromList (List<T> list) {
        T max = null;
        for (T elem : list) {
            if (max == null || elem.compareTo(max) > 0) {
                max = elem;
            }
        }
        return max;
    }
}
