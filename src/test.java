import java.util.*;

public class test {
    public static void main(String[] args) {
        ArrayList<Double> arr = new ArrayList<Double>();
        arr.add(1.0);
        arr.add(2.0);
        arr.add(3.0);
        arr.add(4.0);

        int len = arr.size();

        arr.add(1, 5.0);
        ArrayList<Double> arr1 = arr;
        for(Double d : arr1) {
            System.out.println(d);
        }
        System.out.println("=======");

        arr.set(2, 6.0);
        ArrayList<Double> arr2 = arr1;
        for(Double d : arr2) {
            System.out.println(d);
        }
        System.out.println("=======");

        arr.remove(2);
        ArrayList<Double> arr3 = arr2;
        for(Double d : arr3) {
            System.out.println(d);
        }
        System.out.println("=======");

        double m1 = arr.get(0);
        double m2 = arr.get(1);
        double m3 = arr.get(2);
        System.out.println(m1 + "  " + m2 + "  " + m3);
    }

}