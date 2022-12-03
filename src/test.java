import java.util.*;

public class test {
    public static void main(String[] args) {
        Set<Integer> A = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> B = new HashSet<Integer>(Arrays.asList(1, 3, 5, 9, 11));
        Set<Integer> C = new HashSet<Integer>();
        C.clear();
        C.addAll(A);
        C.retainAll(B);
        System.out.println("交集: " + C);
        C.clear();
        C.addAll(A);
        C.addAll(B);
        System.out.println("并集: " + C);
        C.clear();
        C.addAll(A);
        C.removeAll(B);
        System.out.println("差集: " + C);
    }

}