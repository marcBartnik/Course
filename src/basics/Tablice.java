package basics;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class Tablice {

    @Test
    public void sumaTablicy(Data data) {

        int sum = 0;

        for (int i = 0; i < data.getArray().length; i++) {
            if (i > 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }




//    @Test
//    public void sumaListy() {
//
//        Data dataSource = new Data();
//        List<Integer> numbers = dataSource.list;
//        int sum = 0;
//
//        for (int i : numbers) {
//            if (i > 0) {
//                sum = sum + i;
//            }
//        }
//        System.out.println(sum);
//        Assert.assertEquals(17, sum);
//    }

//    @Test
//    public void lista() {
//
//        Data dataSource = new Data();
//        dataSource.list3.add("mama");
//        for (String i: dataSource.list2) {
//            System.out.println(i);
//        }
//        System.out.println(dajTabele());
//    }

//    @Test
//    public int[] dajTabele() {
//
//        int[] tabelka = {-23, 3, 4, -9, 0, 10};
//        return tabelka;
//    }
}