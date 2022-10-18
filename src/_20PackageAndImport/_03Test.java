package _20PackageAndImport;

public class _03Test {
    public static void main(String[] args) {
        // 为什么要这样写
        // _03Test类和Scanner类不在同一个包下
        // java.util就是Scanner类的包名
        //可以在package下方使用import java.util.Scanner/import java.lang.*
        //lang包下的类不需要导, 直接用(System和String等都在lang包下)
        java.util.Scanner s = new java.util.Scanner(System.in);
        String str = s.next();
        System.out.println("String you input is " + str);
    }
}
