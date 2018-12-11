package basics;


import junit.runner.Version;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class Tabela {

    @Test
    public void sumaTabeli() {

        TableData dataSource = new TableData();
        int[] numbers = dataSource.table;
        int sum = 0;

        for (int i : numbers) {
            if (i>0) {
                sum += i;
            }
        }
        System.out.println(sum);
        Assert.assertNotEquals(21, sum);
        Assert.assertTrue(17 == sum);
        System.out.println("JUnit version is: " + Version.id());
    }

    @Test
    public void sumaListy() {

        TableData dataSource = new TableData();
        List<Integer> numbers = dataSource.list;
        int sum = 0;

        for (int i : numbers) {
            if (i > 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
        Assert.assertEquals(17, sum);
    }

    @Test
    public void lista() {

        TableData dataSource = new TableData();
        dataSource.list3.add("mama");
        for (String i: dataSource.list2) {
            System.out.println(i);
        }
        System.out.println(dajTabele());
    }

    @Test
    public int[] dajTabele() {

        int[] tabelka = {-23, 3, 4, -9, 0, 10};
        return tabelka;
    }
}