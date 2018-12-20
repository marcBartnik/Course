package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Data {

    public int[] getArray() {

        int[] array = {-23, 3, 4, -9, 0, 10};
        return array;

    }


    List<Integer> list = Arrays.asList(-23, 3, 4, -9, 0, 10);

    List<String> list2 = Arrays.asList("a", "b", "c");

    List<String> list3 = new ArrayList<>();
}